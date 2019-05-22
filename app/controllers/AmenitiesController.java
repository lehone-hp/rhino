package controllers;

import com.google.inject.Inject;
import models.Feature;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import utils.StringUtils;
import views.html.admin.amenities.amenities;

import java.util.ArrayList;
import java.util.List;

public class AmenitiesController extends Controller {

	private FormFactory formFactory;

	@Inject
	public AmenitiesController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	public Result getAmenities() {
		List<Feature> features = Feature.find.all();
		return ok(amenities.render(formFactory.form(Feature.class), features));
	}

	public Result create() {
		Form<Feature> createAmenityForm = formFactory.form(Feature.class).bindFromRequest();
		if (createAmenityForm.hasErrors()) {
			return badRequest(amenities.render(createAmenityForm, Feature.find.all()));
		} else {
			Feature amenity = createAmenityForm.get();

			// Check if a feature already exist
			if (Feature.find.query().where()
					.like("name", amenity.name)
					.findList().size() == 0) {
				amenity.slug = StringUtils.slug(amenity.name);
				amenity.save();
				flash("success", "Feature Successfully created");
			} else {
				flash("info", "The feature "+amenity.name+" already exists");
			}

			return redirect(routes.AmenitiesController.getAmenities());
		}
	}

	public Result delete(Long id) {
		Feature feature = Feature.find.byId(id);

		if (feature != null) {
			feature.delete();
			flash("success", "Feature successfully deleted");
		} else {
			flash("info", "Feature does not exist");
		}

		return redirect(routes.AmenitiesController.getAmenities());
	}
}

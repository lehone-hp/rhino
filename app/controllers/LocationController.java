package controllers;

import com.google.inject.Inject;
import models.location.City;
import models.location.Country;
import models.location.LocationTemplateForm;
import models.location.Region;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import utils.StringUtils;
import views.html.admin.location.*;

import java.util.ArrayList;
import java.util.List;

public class LocationController extends Controller {

	private FormFactory formFactory;

	@Inject
	public LocationController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	/*==============================================
	 * REGIONS
	 *=============================================*/
	public Result getRegions() {
		List<Country> countries = Country.find.all();
		List<Region> regions = Region.find.all();
		return ok(views.html.admin.location.regions.render(formFactory.form(LocationTemplateForm.class), regions, countries));
	}

	public Result createRegion() {
		Form<LocationTemplateForm> createForm = formFactory.form(LocationTemplateForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.location.regions.render(createForm, Region.find.all(), Country.find.all()));
		} else {
			LocationTemplateForm templateForm = createForm.get();

			Country country = Country.find.byId(templateForm.parentId);

			Region region;
			for(String name: StringUtils.locationSplit(templateForm.children)) {
				if (Region.find.query().where()
					.like("name", name)
					.findList().size() == 0) {

					region = new Region();
					region.country = country;
					region.name = name;
					region.save();
				}
			}

			flash("success", "New Regions Successfully created");
			return redirect(routes.LocationController.getRegions());
		}
	}

	public Result deleteRegion(Long id) {
		Region region = Region.find.byId(id);

		if (region != null) {
			region.delete();
			flash("success", "Region successfully deleted");
		} else {
			flash("info", "Region does not exist");
		}

		return redirect(routes.LocationController.getRegions());
	}

	/*==============================================
	 * CITY
	 *=============================================*/
	public Result getCities() {
		List<Region> regions = Region.find.all();
		List<City> cities = City.find.all();
		return ok(views.html.admin.location.cities.render(formFactory.form(LocationTemplateForm.class), cities, regions));
	}

	public Result createCity() {
		Form<LocationTemplateForm> createForm = formFactory.form(LocationTemplateForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.location.cities.render(createForm, City.find.all(), Region.find.all()));
		} else {
			LocationTemplateForm templateForm = createForm.get();

			Region region = Region.find.byId(templateForm.parentId);

			City city;
			for(String name: StringUtils.locationSplit(templateForm.children)) {
				if (City.find.query().where()
					.like("name", name)
					.findList().size() == 0) {

					city = new City();
					city.region = region;
					city.name = name;
					city.save();
				}
			}

			flash("success", "New Cities Successfully created");
			return redirect(routes.LocationController.getCities());
		}
	}

	public Result deleteCity(Long id) {
		City city = City.find.byId(id);

		if (city != null) {
			city.delete();
			flash("success", "City successfully deleted");
		} else {
			flash("info", "City does not exist");
		}

		return redirect(routes.LocationController.getCities());
	}
	/*==============================================
	 * LOCALITY
	 *=============================================*/
	public Result getLocalities() {
		return ok(views.html.admin.location.locality.render());
	}
}

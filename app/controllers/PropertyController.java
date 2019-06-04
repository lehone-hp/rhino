package controllers;

import models.PropertyType;
import models.forms.StringForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class PropertyController extends Controller {

	private FormFactory formFactory;

	@Inject
	public PropertyController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	public Result getAllProperties() {
		return ok(views.html.admin.property.allProperties.render());
	}

	/*-----------------------------------------------
	 | Upload Property Actions
	 ------------------------------------------------*/
	public Result getUpload() {
		return ok(views.html.admin.property.upload.render());
	}

	/*-----------------------------------------------
	 | Property Type Actions
	 ------------------------------------------------*/
	public Result getPropertyTypes() {
		List<PropertyType> propTypes = PropertyType.find.all();
		return ok(views.html.admin.property.propertyType.render(formFactory.form(StringForm.class), propTypes));
	}

	public Result createPropertyType() {
		Form<StringForm> createForm = formFactory.form(StringForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.property.propertyType.render(createForm, PropertyType.find.all()));
		} else {
			StringForm stringForm = createForm.get();

			PropertyType propType;

			if (PropertyType.find.query().where()
					.like("name", stringForm.name)
					.findList().size() == 0) {

				PropertyType pT = new PropertyType();
				pT.name = stringForm.name;
				pT.save();
			}

			flash("success", "New Property Type Successfully created");
			return redirect(routes.PropertyController.getPropertyTypes());
		}
	}

	public Result deletePropertyType(Long id) {
		PropertyType pT = PropertyType.find.byId(id);

		if (pT != null) {
			pT.delete();
			flash("success", "Property Type successfully deleted");
		} else {
			flash("info", "Property Type does not exist");
		}

		return redirect(routes.PropertyController.getPropertyTypes());
	}

}

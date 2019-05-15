package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class PropertyController extends Controller {

	public Result getPropertyTypes() {
		return ok(views.html.admin.property.propertyType.render());
	}
}

package controllers;

import play.mvc.*;

public class LocationController extends Controller {

	public Result getRegions() {
		return ok(views.html.admin.location.regions.render());
	}

	public Result getCities() {
		return ok(views.html.admin.location.cities.render());
	}

	public Result getLocalities() {
		return ok(views.html.admin.location.locality.render());
	}
}

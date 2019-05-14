package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class AmenitiesController extends Controller {

	public Result getAmenities() {
		return ok(views.html.admin.amenities.amenities.render());
	}

}

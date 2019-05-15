package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {

	public Result getOwners() {
		return ok(views.html.admin.users.owners.render());
	}
}

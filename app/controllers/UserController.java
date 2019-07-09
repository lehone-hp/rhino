package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

@Security.Authenticated(Secured.class)
public class UserController extends Controller {

	public Result getOwners() {
		return ok(views.html.admin.users.owners.render());
	}
}

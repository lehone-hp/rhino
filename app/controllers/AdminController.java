package controllers;

import play.mvc.*;
import views.html.admin.dashboard;

@Security.Authenticated(Secured.class)
public class AdminController extends Controller {

	public Result getDashboard() {
		return ok(dashboard.render());
	}

}

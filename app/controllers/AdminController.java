package controllers;

import play.mvc.*;
import views.html.admin.dashboard;

public class AdminController extends Controller {

	public Result getDashboard() {
		return ok(dashboard.render());
	}
}

package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

@Security.Authenticated(Secured.class)
public class PropertyContactController extends Controller {

	public Result getPropertyContacts() {
		return ok(views.html.admin.propertycontact.propertyContact.render());
	}
}

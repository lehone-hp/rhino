package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;


public class ContactController extends Controller {
	
	@Security.Authenticated(Secured.class)
	public Result getContacts() {
		return ok(views.html.admin.contact.contact.render());
	}
}

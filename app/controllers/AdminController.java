package controllers;

import models.ContactInfo;
import models.Feature;
import models.Property;
import models.PropertyType;
import models.User;
import play.mvc.*;
import views.html.admin.dashboard;

@Security.Authenticated(Secured.class)
public class AdminController extends Controller {

	public Result getDashboard() {
		return ok(dashboard.render());
	}

	public static int getPropertyCount() {
		User user = AuthController.getUser();
		if (user != null) {
			if (user.role == User.Role.USER) {
				return Property.find.query().where().eq("user", user).findCount();
			}
		}
		return Property.find.query().findCount();
	}
	
	public static int getContactCount() {
		return ContactInfo.find.query().findCount();
	}
	
	public static int getPropTypeCount() {
		return PropertyType.find.query().findCount();
	}
	
	public static int getAmenityCount() {
		return Feature.find.query().findCount();
	}
}

package controllers;

import models.Property;
import play.mvc.*;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	List<Property> propertyList =
			    Property.find.query().where().eq("status", Property.Status.ACTIVE).findList();
    	
    	return ok(views.html.index.render(propertyList));
    }
	
	public Result agents() {
		return ok(views.html.agents.render());
	}
	
	public Result getProperties() {
		List<Property> propertyList =
				Property.find.query().where().eq("status", Property.Status.ACTIVE).findList();
		
		return ok(views.html.property.render(propertyList));
    }
    
    public Result getProperty(String slug) {
    	Property property = Property.find.query().where().eq("slug", slug).findOne();
        return ok(views.html.propertydetail.render(property));
    }
    
    public Result aboutUs() {
        return ok(views.html.about.render());
    }
    
    public Result contactUs() {
        return ok(views.html.contact.render());
    }

}

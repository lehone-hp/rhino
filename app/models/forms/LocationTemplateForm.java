package models.forms;

import io.ebean.Model;
import play.data.validation.Constraints;

public class LocationTemplateForm extends Model {

	@Constraints.Required
	public Long parentId;

	@Constraints.Required
	public String children;

}

package models.forms;

import io.ebean.Model;
import play.data.validation.Constraints;

public class StringForm extends Model {

	@Constraints.Required
	public String name;

}

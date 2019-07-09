package models.forms;

import io.ebean.Model;
import play.data.validation.Constraints;

public class LoginForm extends Model {

	@Constraints.Required
	public String email = "";

	@Constraints.Required
	public String password = "";

	public LoginForm() { }
}

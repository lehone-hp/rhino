package models.forms;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.validation.Constraint;

public class RegistrationForm extends Model {

	@Constraints.Required
	public String name = "";

	@Constraints.Required
	@Constraints.Email
	public String email = "";

	@Constraints.Required
	public String phone = "";

	@Constraints.Required
	public String password = "";

	@Constraints.Required
	public String passwordConfirmation = "";

	public RegistrationForm() { }
}

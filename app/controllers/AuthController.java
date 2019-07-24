package controllers;

import models.User;
import models.forms.LoginForm;
import models.forms.RegistrationForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.auth.login;
import views.html.auth.register;

import javax.inject.Inject;

public class AuthController extends Controller {

	private FormFactory formFactory;

	@Inject
	public AuthController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	public Result getLogin() {
		return ok(views.html.auth.login.render(formFactory.form(LoginForm.class)));
	}

	public Result postLogin() {
		Form<LoginForm> formData = formFactory.form(LoginForm.class).bindFromRequest();

		if (formData.hasErrors()) {
			return badRequest(login.render(formData));
		} else {

			LoginForm loginForm = formData.get();
			User user = User.find.query().where()
					.eq("email", loginForm.email)
					.eq("password", loginForm.password)
					.findOne();

			if (user != null) {
				session().clear();
				session("email", formData.get().email);
				return redirect(routes.AdminController.getDashboard());
			} else {
				flash("login_error", "Login credentials do not match our records");
				return badRequest(login.render(formData));
			}
		}
	}

	public Result getRegister() {
		return ok(views.html.auth.register.render(formFactory.form(RegistrationForm.class)));
	}

	public Result postRegister() {
		Form<RegistrationForm> formData = formFactory.form(RegistrationForm.class).bindFromRequest();

		if (formData.hasErrors()) {
			return badRequest(register.render(formData));
		} else {

			RegistrationForm form = formData.get();

			// Check if user with email exisits
			User user = User.find.query().where()
					.eq("email", form.email)
					.findOne();
			if (user != null) {
				flash("login_error", "The Email Address has already been taken");
				return badRequest(register.render(formData));
			}

			if (!form.password.equals(form.passwordConfirmation)) {
				flash("login_error", "The Password Confirmation did not match");
				return badRequest(register.render(formData));
			}

			user = new User();
			user.name = form.name;
			user.email = form.email;
			user.password = form.password;
			user.phone = form.phone;
			user.role = User.Role.USER;
			user.status = User.Status.CREATED;
			user.save();

			session().clear();
			session("email", form.email);
			return redirect(routes.AdminController.getDashboard());
		}
	}

	@Security.Authenticated(Secured.class)
	public Result logout() {
		session().clear();
		return redirect(routes.HomeController.index());
	}

	public static Boolean isLoggedIn() {
		return Secured.isLoggedIn(ctx());
	}
	
	public static User getUser() {
		return Secured.getUserInfo(ctx());
	}
	
	public static User.Role getUserRole() {
		return getUser().role;
	}
}

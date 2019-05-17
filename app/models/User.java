package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User extends Model {

	@Id
	public Long id;

	public String name;

	public String username;

	public String email;

	public String phone;

	public String password;

	@OneToMany(cascade = CascadeType.ALL)
	public List<Property> properties;

	public static final Finder<Long, User> find = new Finder<>(User.class);

}

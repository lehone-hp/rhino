package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Used to keep track of user's who upload properties but don't create account
 */
@Entity
public class ContactInfo extends Model {

	@Id
	public Long id;

	public String name;

	public String email;

	public String phone;

	@OneToMany(cascade = CascadeType.ALL)
	public List<Property> properties;

	public static Finder<Long, ContactInfo> find = new Finder<>(ContactInfo.class);
}

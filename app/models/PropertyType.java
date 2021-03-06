package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PropertyType extends Model {

	@Id
	public Long id;

	public String name;

	public String slug;

	@OneToMany(cascade = CascadeType.ALL)
	public List<Property> properties;

	public static Finder<Long, PropertyType> find = new Finder<>(PropertyType.class);
}

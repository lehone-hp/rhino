package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Constraint;
import java.util.List;

@Entity
public class Feature extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String name;

	public String slug;

	@ManyToMany(mappedBy = "features")
	public List<Property> properties;

	public static Finder<Long, Feature> find = new Finder<>(Feature.class);
}

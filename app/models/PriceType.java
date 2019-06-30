package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PriceType extends Model {

	@Id
	public Long id;

	public String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	public List<Property> properties;

	public static Finder<Long, PriceType> find = new Finder<>(PriceType.class);
}

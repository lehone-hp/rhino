package models.location;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;
import models.Property;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Region extends Model {

	@Id
	public Long id;

	public String name;

	@ManyToOne
    @JoinColumn(name = "country_id")
	@JsonManagedReference
	public Country country;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	public List<City> cities;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	public List<Property> properties;

	public static Finder<Long, Region> find = new Finder<>(Region.class);
}

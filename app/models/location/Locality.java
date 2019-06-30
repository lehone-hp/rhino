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
public class Locality extends Model {

	@Id
	public Long id;

	public String name;

	@ManyToOne
    @JoinColumn(name = "city_id")
	@JsonManagedReference
	public City city;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	public List<Property> properties;

	public static Finder<Long, Locality> find = new Finder<>(Locality.class);
}

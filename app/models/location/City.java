package models.location;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class City extends Model {

	@Id
	public Long id;

	public String name;

	@ManyToOne
    @JoinColumn(name = "region_id")
	@JsonManagedReference
	public Region region;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	public List<Locality> localities;

	public static Finder<Long, City> find = new Finder<>(City.class);
}

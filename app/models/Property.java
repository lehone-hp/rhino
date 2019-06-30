package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;
import models.location.City;
import models.location.Country;
import models.location.Locality;
import models.location.Region;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Property extends Model {

	@Id
	public Long id;

	public String name;

	public String slug;

	@Lob
	public String description;

	public Boolean forSale;

	public Double price;

	public Double caution;

	public Double initialDeposit;

	public Double area;

	public Integer bedRooms;

	public Integer bathRooms;

	public Integer parlors;

	public Integer kitchens;

	// TODO USER

	public Status status;

	public Date createdAt = new Date();

	@ManyToOne
    @JoinColumn(name = "property_type_id")
	@JsonManagedReference
	public PropertyType propertyType;

	@ManyToOne
    @JoinColumn(name = "price_type_id")
	@JsonManagedReference
	public PriceType priceType;

	@ManyToOne
    @JoinColumn(name = "country_id")
	@JsonManagedReference
	public Country country;

	@ManyToOne
    @JoinColumn(name = "region_id")
	@JsonManagedReference
	public Region region;

	@ManyToOne
    @JoinColumn(name = "city_id")
	@JsonManagedReference
	public City city;

	@ManyToOne
    @JoinColumn(name = "locality_id")
	@JsonManagedReference
	public Locality locality;

	@ManyToOne
    @JoinColumn(name = "contact_info_id")
	@JsonManagedReference
	public ContactInfo contact; // used when there is no user assigned to the property

	@ManyToOne
    @JoinColumn(name = "user_id")
	@JsonManagedReference
	public User user;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	public List<PropertyPhoto> photos;

	@ManyToMany
	@JoinTable(name = "properties")
	@JsonBackReference
	public List<Feature> features;


	public static Finder<Long, Property> find = new Finder<>(Property.class);

	public String getImage() {
		System.out.println(photos.size());
		return (this.photos.size() > 0) ? this.photos.get(0).photo : "no-image.png";
	}

	enum Status {
		ACTIVE,
		SOLD,
		PENDING,
		VOIDED
	}
}

package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PropertyPhoto extends Model {

	@Id
	public Long id;

	public String photo;

	@ManyToOne
    @JoinColumn(name = "property_id")
	public Property property;

	public static Finder<Long, PropertyPhoto> find = new Finder<>(PropertyPhoto.class);
}

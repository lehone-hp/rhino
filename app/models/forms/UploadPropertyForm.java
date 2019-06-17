package models.forms;

import io.ebean.Model;
import play.data.validation.Constraints;

import java.util.*;

public class UploadPropertyForm extends Model {

	@Constraints.Required
	public String title;

	@Constraints.Required
	public Long propertyType;

	@Constraints.Required
	public String status;

	public Double area;

	@Constraints.Required
	public Double price;

	@Constraints.Required
	public Long interval;
	public Double caution;
	public Double initialDeposit;

	@Constraints.Required
	public Long country;

	@Constraints.Required
	public Long region;
	public Long city;
	public Long locality;

	@Constraints.Required
	public String description;
	public Integer bedRooms;
	public Integer bathRooms;
	public Integer kitchens;
	public Integer parlors;

	public List<Long> features;

}

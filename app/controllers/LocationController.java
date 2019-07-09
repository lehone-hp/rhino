package controllers;

import com.google.inject.Inject;
import models.location.City;
import models.location.Country;
import models.location.Locality;
import models.forms.LocationTemplateForm;
import models.location.Region;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import utils.StringUtils;

import java.util.List;

@Security.Authenticated(Secured.class)
public class LocationController extends Controller {

	private FormFactory formFactory;

	@Inject
	public LocationController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	/*==============================================
	 * REGIONS
	 *=============================================*/
	public Result getRegions() {
		List<Country> countries = Country.find.all();
		List<Region> regions = Region.find.all();
		return ok(views.html.admin.location.regions.render(formFactory.form(LocationTemplateForm.class), regions, countries));
	}

	public Result createRegion() {
		Form<LocationTemplateForm> createForm = formFactory.form(LocationTemplateForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.location.regions.render(createForm, Region.find.all(), Country.find.all()));
		} else {
			LocationTemplateForm templateForm = createForm.get();

			Country country = Country.find.byId(templateForm.parentId);

			Region region;
			for(String name: StringUtils.locationSplit(templateForm.children)) {
				if (Region.find.query().where()
					.like("name", name)
					.findList().size() == 0) {

					region = new Region();
					region.country = country;
					region.name = name;
					region.save();
				}
			}

			flash("success", "New Regions Successfully created");
			return redirect(routes.LocationController.getRegions());
		}
	}

	public Result deleteRegion(Long id) {
		Region region = Region.find.byId(id);

		if (region != null) {
			region.delete();
			flash("success", "Region successfully deleted");
		} else {
			flash("info", "Region does not exist");
		}

		return redirect(routes.LocationController.getRegions());
	}

	/*==============================================
	 * CITY
	 *=============================================*/
	public Result getCities() {
		List<Region> regions = Region.find.all();
		List<City> cities = City.find.all();
		return ok(views.html.admin.location.cities.render(formFactory.form(LocationTemplateForm.class), cities, regions));
	}

	public Result createCity() {
		Form<LocationTemplateForm> createForm = formFactory.form(LocationTemplateForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.location.cities.render(createForm, City.find.all(), Region.find.all()));
		} else {
			LocationTemplateForm templateForm = createForm.get();

			Region region = Region.find.byId(templateForm.parentId);

			City city;
			for(String name: StringUtils.locationSplit(templateForm.children)) {
				if (City.find.query().where()
					.like("name", name)
					.findList().size() == 0) {

					city = new City();
					city.region = region;
					city.name = name;
					city.save();
				}
			}

			flash("success", "New Cities Successfully created");
			return redirect(routes.LocationController.getCities());
		}
	}

	public Result deleteCity(Long id) {
		City city = City.find.byId(id);

		if (city != null) {
			city.delete();
			flash("success", "City successfully deleted");
		} else {
			flash("info", "City does not exist");
		}

		return redirect(routes.LocationController.getCities());
	}
	/*==============================================
	 * LOCALITY
	 *=============================================*/
	public Result getLocalities() {
		List<City> cities = City.find.all();
		List<Locality> localities = Locality.find.all();
		return ok(views.html.admin.location.locality.render(formFactory.form(LocationTemplateForm.class), localities, cities));
	}

	public Result createLocality() {
		Form<LocationTemplateForm> createForm = formFactory.form(LocationTemplateForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.location.locality.render(createForm, Locality.find.all(), City.find.all()));
		} else {
			LocationTemplateForm templateForm = createForm.get();

			City city = City.find.byId(templateForm.parentId);

			Locality locality;
			for(String name: StringUtils.locationSplit(templateForm.children)) {
				if (Locality.find.query().where()
					.like("name", name)
					.findList().size() == 0) {

					locality = new Locality();
					locality.city = city;
					locality.name = name;
					locality.save();
				}
			}

			flash("success", "New Localities Successfully created");
			return redirect(routes.LocationController.getLocalities());
		}
	}

	public Result deleteLocality(Long id) {
		Locality locality = Locality.find.byId(id);

		if (locality != null) {
			locality.delete();
			flash("success", "Locality successfully deleted");
		} else {
			flash("info", "Locality does not exist");
		}

		return redirect(routes.LocationController.getLocalities());
	}


	/*=====================================================================
	* REST ACTIONS
	* ====================================================================*/
	public Result getRegionsByCountry(Long countryId) {
		Country country = Country.find.byId(countryId);
		List<Region> regions =
				Region.find.query().where().eq("country", country).findList();

		return ok(Json.toJson(regions));
	}

	public Result getCitiesByRegion(Long regionId) {
		Region region = Region.find.byId(regionId);
		List<City> cities =
				City.find.query().where().eq("region", region).findList();

		return ok(Json.toJson(cities));
	}

	public Result getLocalitiesByCity(Long cityId) {
		City city = City.find.byId(cityId);
		List<Locality> localities =
				Locality.find.query().where().eq("city", city).findList();

		return ok(Json.toJson(localities));
	}

}

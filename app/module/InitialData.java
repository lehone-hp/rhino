package module;

import io.ebean.Ebean;
import models.Feature;
import models.PriceType;
import models.PropertyType;
import models.location.Country;
import scala.sys.Prop;
import utils.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InitialData {

	public InitialData() {
		// Price Types
		if (Ebean.find(PriceType.class).findCount() == 0) {
			String[] types = { "per hour", "per day", "per week", "per month", "per year" };
			for (String type : types) {
				PriceType pT = new PriceType();
				pT.name = type;
				pT.save();
			}
		}

		// Price Types
		if (Ebean.find(PropertyType.class).findCount() == 0) {
			String[] types = { "Apartment", "Single Room", "Studio", "Store", "Guest House", "Land" };
			for (String type : types) {
				PropertyType pT = new PropertyType();
				pT.name = type;
				pT.slug = StringUtils.slug(type);
				pT.save();
			}
		}

		// Price Types
		if (Ebean.find(Feature.class).findCount() == 0) {
			String[] types =
					{"Parking Garage", "Tiled Floors", "Balcony", "Gate", "Fence", "Shower", "Pool",
					 "Borehole", "Painted Wall" };
			for (String type : types) {
				Feature pT = new Feature();
				pT.name = type;
				pT.slug = StringUtils.slug(type);
				pT.save();
			}
		}

		// Country
		if (Ebean.find(Country.class).findCount() == 0) {

			List<String> countries = new ArrayList<>();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(new File("countries")));
				String line;
				while((line = reader.readLine()) != null){
					countries.add(line.trim());
				}

				Country country;
				for (String ctry : countries) {
					country = new Country();
					country.name = ctry;
					country.save();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

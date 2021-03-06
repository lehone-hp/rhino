package module;

import io.ebean.Ebean;
import models.PriceType;
import models.PropertyType;
import models.location.Country;
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
				PropertyType propertyType = new PropertyType();
				propertyType.name = type;
				propertyType.slug = StringUtils.slug(type);
				propertyType.save();
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

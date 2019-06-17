package controllers;

import models.Feature;
import models.PriceType;
import models.Property;
import models.PropertyPhoto;
import models.PropertyType;
import models.forms.StringForm;
import models.forms.UploadPropertyForm;
import models.location.City;
import models.location.Country;
import models.location.Locality;
import models.location.Region;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PropertyController extends Controller {

	private FormFactory formFactory;

	@Inject
	public PropertyController(FormFactory formFactory) {
		this.formFactory = formFactory;
	}

	public Result getAllProperties() {
		List<Property> properties = Property.find.all();
		return ok(views.html.admin.property.allProperties.render(properties));
	}

	/*-----------------------------------------------
	 | Upload Property Actions
	 ------------------------------------------------*/
	public Result getUpload() {
		return ok(views.html.admin.property.upload.render(formFactory.form(UploadPropertyForm.class)));
	}

	public Result postUpload() {
		Form<UploadPropertyForm> uploadForm = formFactory.form(UploadPropertyForm.class).bindFromRequest();
		if (uploadForm.hasErrors()) {
			return badRequest(views.html.admin.property.upload.render(uploadForm));
		} else {
			UploadPropertyForm form = uploadForm.get();

			Property property = new Property();
			property.name = form.title;
			property.propertyType = PropertyType.find.byId(form.propertyType);
			property.forSale = "sale".equals(form.status);
			property.area = form.area;
			property.price = form.price;
			property.priceType = PriceType.find.byId(form.interval);
			property.caution = form.caution;
			property.initialDeposit = form.initialDeposit;
			property.country = Country.find.byId(form.country);
			property.region = Region.find.byId(form.region);
			if (form.city != null)
				property.city = City.find.byId(form.city);
			if (form.locality != null)
				property.locality = Locality.find.byId(form.locality);
			property.description = form.description;
			property.bedRooms = form.bedRooms;
			property.bathRooms = form.bathRooms;
			property.parlors = form.parlors;
			property.kitchens = form.kitchens;

			if (form.features != null) {
				for (Long i : form.features) {
					property.features.add(Feature.find.byId(i));
				}
			}
			property.save();

			Http.MultipartFormData body = request().body().asMultipartFormData();
			List<Http.MultipartFormData.FilePart> fileParts = body.getFiles();
			for (Http.MultipartFormData.FilePart filePart : fileParts) {
				File file = (File) filePart.getFile();
				if (file.length() > 0) {
					try {
						String filename = UUID.randomUUID() + (Long.toString(new Date().getTime()));
						Files.write(Paths.get("public/uploads/properties/" + filename + ".png"),
								readContentIntoByteArray((File) filePart.getFile()));

						PropertyPhoto photo = new PropertyPhoto();
						photo.photo = filename;
						photo.property = property;
						photo.save();
						property.photos.add(photo);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			property.save();

		}

		flash("success", "New Property Type Successfully created");
		return redirect(routes.PropertyController.getUpload());
	}

	private static byte[] readContentIntoByteArray(File file) {
		FileInputStream fileInputStream = null;
		byte[] bFile = new byte[(int) file.length()];
		try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return bFile;
	}

	/*-----------------------------------------------
	 | Property Type Actions
	 ------------------------------------------------*/
	public Result getPropertyTypes() {
		List<PropertyType> propTypes = PropertyType.find.all();
		return ok(views.html.admin.property.propertyType.render(formFactory.form(StringForm.class), propTypes));
	}

	public Result createPropertyType() {
		Form<StringForm> createForm = formFactory.form(StringForm.class).bindFromRequest();
		if (createForm.hasErrors()) {
			return badRequest(views.html.admin.property.propertyType.render(createForm, PropertyType.find.all()));
		} else {
			StringForm stringForm = createForm.get();

			PropertyType propType;

			if (PropertyType.find.query().where()
					.like("name", stringForm.name)
					.findList().size() == 0) {

				PropertyType pT = new PropertyType();
				pT.name = stringForm.name;
				pT.save();
			}

			flash("success", "New Property Type Successfully created");
			return redirect(routes.PropertyController.getPropertyTypes());
		}
	}

	public Result deletePropertyType(Long id) {
		PropertyType pT = PropertyType.find.byId(id);

		if (pT != null) {
			pT.delete();
			flash("success", "Property Type successfully deleted");
		} else {
			flash("info", "Property Type does not exist");
		}

		return redirect(routes.PropertyController.getPropertyTypes());
	}

}

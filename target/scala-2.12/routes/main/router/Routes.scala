// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Sun Jun 30 16:09:53 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:12
  AdminController_0: controllers.AdminController,
  // @LINE:20
  AmenitiesController_4: controllers.AmenitiesController,
  // @LINE:30
  UserController_3: controllers.UserController,
  // @LINE:37
  LocationController_6: controllers.LocationController,
  // @LINE:61
  PropertyController_2: controllers.PropertyController,
  // @LINE:78
  PropertyContactController_7: controllers.PropertyContactController,
  // @LINE:85
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:12
    AdminController_0: controllers.AdminController,
    // @LINE:20
    AmenitiesController_4: controllers.AmenitiesController,
    // @LINE:30
    UserController_3: controllers.UserController,
    // @LINE:37
    LocationController_6: controllers.LocationController,
    // @LINE:61
    PropertyController_2: controllers.PropertyController,
    // @LINE:78
    PropertyContactController_7: controllers.PropertyContactController,
    // @LINE:85
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_1, AdminController_0, AmenitiesController_4, UserController_3, LocationController_6, PropertyController_2, PropertyContactController_7, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, AdminController_0, AmenitiesController_4, UserController_3, LocationController_6, PropertyController_2, PropertyContactController_7, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/dashboard""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/amenities""", """controllers.AmenitiesController.getAmenities"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/amenities""", """controllers.AmenitiesController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/amenities/delete/""" + "$" + """id<[^/]+>""", """controllers.AmenitiesController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/landlords""", """controllers.UserController.getOwners"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/regions""", """controllers.LocationController.getRegions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/regions""", """controllers.LocationController.createRegion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/regions/delete/""" + "$" + """id<[^/]+>""", """controllers.LocationController.deleteRegion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cities""", """controllers.LocationController.getCities"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cities""", """controllers.LocationController.createCity"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cities/delete/""" + "$" + """id<[^/]+>""", """controllers.LocationController.deleteCity(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/localities""", """controllers.LocationController.getLocalities"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/localities""", """controllers.LocationController.createLocality"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/localities/delete/""" + "$" + """id<[^/]+>""", """controllers.LocationController.deleteLocality(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/regions/""" + "$" + """country_id<[^/]+>""", """controllers.LocationController.getRegionsByCountry(country_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cities/""" + "$" + """region_id<[^/]+>""", """controllers.LocationController.getCitiesByRegion(region_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/localities/""" + "$" + """city_id<[^/]+>""", """controllers.LocationController.getLocalitiesByCity(city_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties""", """controllers.PropertyController.getAllProperties"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties/upload""", """controllers.PropertyController.getUpload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties/""" + "$" + """id<[^/]+>""", """controllers.PropertyController.getProperty(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties/upload""", """controllers.PropertyController.postUpload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types""", """controllers.PropertyController.getPropertyTypes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types""", """controllers.PropertyController.createPropertyType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types/delete/""" + "$" + """id<[^/]+>""", """controllers.PropertyController.deletePropertyType(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/property-contacts""", """controllers.PropertyContactController.getPropertyContacts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AdminController_getDashboard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/")))
  )
  private[this] lazy val controllers_AdminController_getDashboard1_invoker = createInvoker(
    AdminController_0.getDashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getDashboard",
      Nil,
      "GET",
      this.prefix + """admin/""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AdminController_getDashboard2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/dashboard")))
  )
  private[this] lazy val controllers_AdminController_getDashboard2_invoker = createInvoker(
    AdminController_0.getDashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getDashboard",
      Nil,
      "GET",
      this.prefix + """admin/dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AmenitiesController_getAmenities3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_getAmenities3_invoker = createInvoker(
    AmenitiesController_4.getAmenities,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AmenitiesController",
      "getAmenities",
      Nil,
      "GET",
      this.prefix + """admin/amenities""",
      """ Amenities""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AmenitiesController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_create4_invoker = createInvoker(
    AmenitiesController_4.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AmenitiesController",
      "create",
      Nil,
      "POST",
      this.prefix + """admin/amenities""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AmenitiesController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AmenitiesController_delete5_invoker = createInvoker(
    AmenitiesController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AmenitiesController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/amenities/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_getOwners6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/landlords")))
  )
  private[this] lazy val controllers_UserController_getOwners6_invoker = createInvoker(
    UserController_3.getOwners,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getOwners",
      Nil,
      "GET",
      this.prefix + """admin/landlords""",
      """ Owners / Landlords""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_LocationController_getRegions7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_getRegions7_invoker = createInvoker(
    LocationController_6.getRegions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getRegions",
      Nil,
      "GET",
      this.prefix + """admin/regions""",
      """ Location""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_LocationController_createRegion8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_createRegion8_invoker = createInvoker(
    LocationController_6.createRegion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "createRegion",
      Nil,
      "POST",
      this.prefix + """admin/regions""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:40
  private[this] lazy val controllers_LocationController_deleteRegion9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteRegion9_invoker = createInvoker(
    LocationController_6.deleteRegion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "deleteRegion",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/regions/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_LocationController_getCities10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_getCities10_invoker = createInvoker(
    LocationController_6.getCities,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getCities",
      Nil,
      "GET",
      this.prefix + """admin/cities""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_LocationController_createCity11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_createCity11_invoker = createInvoker(
    LocationController_6.createCity,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "createCity",
      Nil,
      "POST",
      this.prefix + """admin/cities""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:45
  private[this] lazy val controllers_LocationController_deleteCity12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteCity12_invoker = createInvoker(
    LocationController_6.deleteCity(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "deleteCity",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/cities/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_LocationController_getLocalities13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_getLocalities13_invoker = createInvoker(
    LocationController_6.getLocalities,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getLocalities",
      Nil,
      "GET",
      this.prefix + """admin/localities""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_LocationController_createLocality14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_createLocality14_invoker = createInvoker(
    LocationController_6.createLocality,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "createLocality",
      Nil,
      "POST",
      this.prefix + """admin/localities""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:50
  private[this] lazy val controllers_LocationController_deleteLocality15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteLocality15_invoker = createInvoker(
    LocationController_6.deleteLocality(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "deleteLocality",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/localities/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_LocationController_getRegionsByCountry16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/regions/"), DynamicPart("country_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getRegionsByCountry16_invoker = createInvoker(
    LocationController_6.getRegionsByCountry(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getRegionsByCountry",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/regions/""" + "$" + """country_id<[^/]+>""",
      """# Location API routes""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_LocationController_getCitiesByRegion17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cities/"), DynamicPart("region_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getCitiesByRegion17_invoker = createInvoker(
    LocationController_6.getCitiesByRegion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getCitiesByRegion",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/cities/""" + "$" + """region_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_LocationController_getLocalitiesByCity18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/localities/"), DynamicPart("city_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getLocalitiesByCity18_invoker = createInvoker(
    LocationController_6.getLocalitiesByCity(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "getLocalitiesByCity",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/localities/""" + "$" + """city_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_PropertyController_getAllProperties19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties")))
  )
  private[this] lazy val controllers_PropertyController_getAllProperties19_invoker = createInvoker(
    PropertyController_2.getAllProperties,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "getAllProperties",
      Nil,
      "GET",
      this.prefix + """admin/properties""",
      """ Properties""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_PropertyController_getUpload20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_getUpload20_invoker = createInvoker(
    PropertyController_2.getUpload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "getUpload",
      Nil,
      "GET",
      this.prefix + """admin/properties/upload""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_PropertyController_getProperty21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_getProperty21_invoker = createInvoker(
    PropertyController_2.getProperty(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "getProperty",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/properties/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_PropertyController_postUpload22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_postUpload22_invoker = createInvoker(
    PropertyController_2.postUpload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "postUpload",
      Nil,
      "POST",
      this.prefix + """admin/properties/upload""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:67
  private[this] lazy val controllers_PropertyController_getPropertyTypes23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_getPropertyTypes23_invoker = createInvoker(
    PropertyController_2.getPropertyTypes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "getPropertyTypes",
      Nil,
      "GET",
      this.prefix + """admin/propert-types""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_PropertyController_createPropertyType24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_createPropertyType24_invoker = createInvoker(
    PropertyController_2.createPropertyType,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "createPropertyType",
      Nil,
      "POST",
      this.prefix + """admin/propert-types""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:70
  private[this] lazy val controllers_PropertyController_deletePropertyType25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_deletePropertyType25_invoker = createInvoker(
    PropertyController_2.deletePropertyType(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "deletePropertyType",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/propert-types/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/property-contacts")))
  )
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts26_invoker = createInvoker(
    PropertyContactController_7.getPropertyContacts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyContactController",
      "getPropertyContacts",
      Nil,
      "GET",
      this.prefix + """admin/property-contacts""",
      """ Property Contacts""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Assets_versioned27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned27_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:12
    case controllers_AdminController_getDashboard1_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard1_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:13
    case controllers_AdminController_getDashboard2_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard2_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:20
    case controllers_AmenitiesController_getAmenities3_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities3_invoker.call(AmenitiesController_4.getAmenities)
      }
  
    // @LINE:22
    case controllers_AmenitiesController_create4_route(params@_) =>
      call { 
        controllers_AmenitiesController_create4_invoker.call(AmenitiesController_4.create)
      }
  
    // @LINE:23
    case controllers_AmenitiesController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AmenitiesController_delete5_invoker.call(AmenitiesController_4.delete(id))
      }
  
    // @LINE:30
    case controllers_UserController_getOwners6_route(params@_) =>
      call { 
        controllers_UserController_getOwners6_invoker.call(UserController_3.getOwners)
      }
  
    // @LINE:37
    case controllers_LocationController_getRegions7_route(params@_) =>
      call { 
        controllers_LocationController_getRegions7_invoker.call(LocationController_6.getRegions)
      }
  
    // @LINE:39
    case controllers_LocationController_createRegion8_route(params@_) =>
      call { 
        controllers_LocationController_createRegion8_invoker.call(LocationController_6.createRegion)
      }
  
    // @LINE:40
    case controllers_LocationController_deleteRegion9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteRegion9_invoker.call(LocationController_6.deleteRegion(id))
      }
  
    // @LINE:42
    case controllers_LocationController_getCities10_route(params@_) =>
      call { 
        controllers_LocationController_getCities10_invoker.call(LocationController_6.getCities)
      }
  
    // @LINE:44
    case controllers_LocationController_createCity11_route(params@_) =>
      call { 
        controllers_LocationController_createCity11_invoker.call(LocationController_6.createCity)
      }
  
    // @LINE:45
    case controllers_LocationController_deleteCity12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteCity12_invoker.call(LocationController_6.deleteCity(id))
      }
  
    // @LINE:47
    case controllers_LocationController_getLocalities13_route(params@_) =>
      call { 
        controllers_LocationController_getLocalities13_invoker.call(LocationController_6.getLocalities)
      }
  
    // @LINE:49
    case controllers_LocationController_createLocality14_route(params@_) =>
      call { 
        controllers_LocationController_createLocality14_invoker.call(LocationController_6.createLocality)
      }
  
    // @LINE:50
    case controllers_LocationController_deleteLocality15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteLocality15_invoker.call(LocationController_6.deleteLocality(id))
      }
  
    // @LINE:53
    case controllers_LocationController_getRegionsByCountry16_route(params@_) =>
      call(params.fromPath[Long]("country_id", None)) { (country_id) =>
        controllers_LocationController_getRegionsByCountry16_invoker.call(LocationController_6.getRegionsByCountry(country_id))
      }
  
    // @LINE:54
    case controllers_LocationController_getCitiesByRegion17_route(params@_) =>
      call(params.fromPath[Long]("region_id", None)) { (region_id) =>
        controllers_LocationController_getCitiesByRegion17_invoker.call(LocationController_6.getCitiesByRegion(region_id))
      }
  
    // @LINE:55
    case controllers_LocationController_getLocalitiesByCity18_route(params@_) =>
      call(params.fromPath[Long]("city_id", None)) { (city_id) =>
        controllers_LocationController_getLocalitiesByCity18_invoker.call(LocationController_6.getLocalitiesByCity(city_id))
      }
  
    // @LINE:61
    case controllers_PropertyController_getAllProperties19_route(params@_) =>
      call { 
        controllers_PropertyController_getAllProperties19_invoker.call(PropertyController_2.getAllProperties)
      }
  
    // @LINE:62
    case controllers_PropertyController_getUpload20_route(params@_) =>
      call { 
        controllers_PropertyController_getUpload20_invoker.call(PropertyController_2.getUpload)
      }
  
    // @LINE:63
    case controllers_PropertyController_getProperty21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_getProperty21_invoker.call(PropertyController_2.getProperty(id))
      }
  
    // @LINE:65
    case controllers_PropertyController_postUpload22_route(params@_) =>
      call { 
        controllers_PropertyController_postUpload22_invoker.call(PropertyController_2.postUpload)
      }
  
    // @LINE:67
    case controllers_PropertyController_getPropertyTypes23_route(params@_) =>
      call { 
        controllers_PropertyController_getPropertyTypes23_invoker.call(PropertyController_2.getPropertyTypes)
      }
  
    // @LINE:69
    case controllers_PropertyController_createPropertyType24_route(params@_) =>
      call { 
        controllers_PropertyController_createPropertyType24_invoker.call(PropertyController_2.createPropertyType)
      }
  
    // @LINE:70
    case controllers_PropertyController_deletePropertyType25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_deletePropertyType25_invoker.call(PropertyController_2.deletePropertyType(id))
      }
  
    // @LINE:78
    case controllers_PropertyContactController_getPropertyContacts26_route(params@_) =>
      call { 
        controllers_PropertyContactController_getPropertyContacts26_invoker.call(PropertyContactController_7.getPropertyContacts)
      }
  
    // @LINE:85
    case controllers_Assets_versioned27_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned27_invoker.call(Assets_5.versioned(path, file))
      }
  }
}

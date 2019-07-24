// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Fri Jul 12 04:51:26 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  HomeController_2: controllers.HomeController,
  // @LINE:20
  AuthController_1: controllers.AuthController,
  // @LINE:32
  AdminController_0: controllers.AdminController,
  // @LINE:40
  AmenitiesController_6: controllers.AmenitiesController,
  // @LINE:50
  UserController_5: controllers.UserController,
  // @LINE:57
  LocationController_8: controllers.LocationController,
  // @LINE:81
  PropertyController_4: controllers.PropertyController,
  // @LINE:98
  ContactController_3: controllers.ContactController,
  // @LINE:104
  PropertyContactController_9: controllers.PropertyContactController,
  // @LINE:111
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    HomeController_2: controllers.HomeController,
    // @LINE:20
    AuthController_1: controllers.AuthController,
    // @LINE:32
    AdminController_0: controllers.AdminController,
    // @LINE:40
    AmenitiesController_6: controllers.AmenitiesController,
    // @LINE:50
    UserController_5: controllers.UserController,
    // @LINE:57
    LocationController_8: controllers.LocationController,
    // @LINE:81
    PropertyController_4: controllers.PropertyController,
    // @LINE:98
    ContactController_3: controllers.ContactController,
    // @LINE:104
    PropertyContactController_9: controllers.PropertyContactController,
    // @LINE:111
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_2, AuthController_1, AdminController_0, AmenitiesController_6, UserController_5, LocationController_8, PropertyController_4, ContactController_3, PropertyContactController_9, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AuthController_1, AdminController_0, AmenitiesController_6, UserController_5, LocationController_8, PropertyController_4, ContactController_3, PropertyContactController_9, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agents""", """controllers.HomeController.agents"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """properties""", """controllers.HomeController.getProperties"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """properties/""" + "$" + """slug<[^/]+>""", """controllers.HomeController.getProperty(slug:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contactUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.getLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.postLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.AuthController.getRegister"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.AuthController.postRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminController.getDashboard"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties/""" + "$" + """id<[^/]+>/status/activate""", """controllers.PropertyController.activateProperty(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties/""" + "$" + """id<[^/]+>/status/void""", """controllers.PropertyController.voidProperty(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types""", """controllers.PropertyController.getPropertyTypes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types""", """controllers.PropertyController.createPropertyType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types/delete/""" + "$" + """id<[^/]+>""", """controllers.PropertyController.deletePropertyType(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/contacts""", """controllers.ContactController.getContacts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/property-contacts""", """controllers.PropertyContactController.getPropertyContacts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ =====================================================================================================================
 Routes for the public pages
 =====================================================================================================================""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_agents1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agents")))
  )
  private[this] lazy val controllers_HomeController_agents1_invoker = createInvoker(
    HomeController_2.agents,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "agents",
      Nil,
      "GET",
      this.prefix + """agents""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_getProperties2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("properties")))
  )
  private[this] lazy val controllers_HomeController_getProperties2_invoker = createInvoker(
    HomeController_2.getProperties,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProperties",
      Nil,
      "GET",
      this.prefix + """properties""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_getProperty3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("properties/"), DynamicPart("slug", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProperty3_invoker = createInvoker(
    HomeController_2.getProperty(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProperty",
      Seq(classOf[String]),
      "GET",
      this.prefix + """properties/""" + "$" + """slug<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_aboutUs4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_aboutUs4_invoker = createInvoker(
    HomeController_2.aboutUs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutUs",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_contactUs5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contactUs5_invoker = createInvoker(
    HomeController_2.contactUs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactUs",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AuthController_getLogin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_getLogin6_invoker = createInvoker(
    AuthController_1.getLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "getLogin",
      Nil,
      "GET",
      this.prefix + """login""",
      """ =====================================================================================================================
 Authentication Routes
 =====================================================================================================================""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AuthController_postLogin7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_postLogin7_invoker = createInvoker(
    AuthController_1.postLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "postLogin",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AuthController_getRegister8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_AuthController_getRegister8_invoker = createInvoker(
    AuthController_1.getRegister,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "getRegister",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AuthController_postRegister9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_AuthController_postRegister9_invoker = createInvoker(
    AuthController_1.postRegister,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "postRegister",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AuthController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout10_invoker = createInvoker(
    AuthController_1.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdminController_getDashboard11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_getDashboard11_invoker = createInvoker(
    AdminController_0.getDashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getDashboard",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AdminController_getDashboard12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/dashboard")))
  )
  private[this] lazy val controllers_AdminController_getDashboard12_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_AmenitiesController_getAmenities13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_getAmenities13_invoker = createInvoker(
    AmenitiesController_6.getAmenities,
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

  // @LINE:42
  private[this] lazy val controllers_AmenitiesController_create14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_create14_invoker = createInvoker(
    AmenitiesController_6.create,
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

  // @LINE:43
  private[this] lazy val controllers_AmenitiesController_delete15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AmenitiesController_delete15_invoker = createInvoker(
    AmenitiesController_6.delete(fakeValue[Long]),
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

  // @LINE:50
  private[this] lazy val controllers_UserController_getOwners16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/landlords")))
  )
  private[this] lazy val controllers_UserController_getOwners16_invoker = createInvoker(
    UserController_5.getOwners,
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

  // @LINE:57
  private[this] lazy val controllers_LocationController_getRegions17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_getRegions17_invoker = createInvoker(
    LocationController_8.getRegions,
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

  // @LINE:59
  private[this] lazy val controllers_LocationController_createRegion18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_createRegion18_invoker = createInvoker(
    LocationController_8.createRegion,
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

  // @LINE:60
  private[this] lazy val controllers_LocationController_deleteRegion19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteRegion19_invoker = createInvoker(
    LocationController_8.deleteRegion(fakeValue[Long]),
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

  // @LINE:62
  private[this] lazy val controllers_LocationController_getCities20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_getCities20_invoker = createInvoker(
    LocationController_8.getCities,
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

  // @LINE:64
  private[this] lazy val controllers_LocationController_createCity21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_createCity21_invoker = createInvoker(
    LocationController_8.createCity,
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

  // @LINE:65
  private[this] lazy val controllers_LocationController_deleteCity22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteCity22_invoker = createInvoker(
    LocationController_8.deleteCity(fakeValue[Long]),
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

  // @LINE:67
  private[this] lazy val controllers_LocationController_getLocalities23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_getLocalities23_invoker = createInvoker(
    LocationController_8.getLocalities,
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

  // @LINE:69
  private[this] lazy val controllers_LocationController_createLocality24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_createLocality24_invoker = createInvoker(
    LocationController_8.createLocality,
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

  // @LINE:70
  private[this] lazy val controllers_LocationController_deleteLocality25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteLocality25_invoker = createInvoker(
    LocationController_8.deleteLocality(fakeValue[Long]),
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

  // @LINE:73
  private[this] lazy val controllers_LocationController_getRegionsByCountry26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/regions/"), DynamicPart("country_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getRegionsByCountry26_invoker = createInvoker(
    LocationController_8.getRegionsByCountry(fakeValue[Long]),
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

  // @LINE:74
  private[this] lazy val controllers_LocationController_getCitiesByRegion27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cities/"), DynamicPart("region_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getCitiesByRegion27_invoker = createInvoker(
    LocationController_8.getCitiesByRegion(fakeValue[Long]),
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

  // @LINE:75
  private[this] lazy val controllers_LocationController_getLocalitiesByCity28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/localities/"), DynamicPart("city_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getLocalitiesByCity28_invoker = createInvoker(
    LocationController_8.getLocalitiesByCity(fakeValue[Long]),
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

  // @LINE:81
  private[this] lazy val controllers_PropertyController_getAllProperties29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties")))
  )
  private[this] lazy val controllers_PropertyController_getAllProperties29_invoker = createInvoker(
    PropertyController_4.getAllProperties,
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

  // @LINE:82
  private[this] lazy val controllers_PropertyController_getUpload30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_getUpload30_invoker = createInvoker(
    PropertyController_4.getUpload,
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

  // @LINE:83
  private[this] lazy val controllers_PropertyController_getProperty31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_getProperty31_invoker = createInvoker(
    PropertyController_4.getProperty(fakeValue[Long]),
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

  // @LINE:85
  private[this] lazy val controllers_PropertyController_postUpload32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_postUpload32_invoker = createInvoker(
    PropertyController_4.postUpload,
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

  // @LINE:86
  private[this] lazy val controllers_PropertyController_activateProperty33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/"), DynamicPart("id", """[^/]+""",true), StaticPart("/status/activate")))
  )
  private[this] lazy val controllers_PropertyController_activateProperty33_invoker = createInvoker(
    PropertyController_4.activateProperty(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "activateProperty",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/properties/""" + "$" + """id<[^/]+>/status/activate""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_PropertyController_voidProperty34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/"), DynamicPart("id", """[^/]+""",true), StaticPart("/status/void")))
  )
  private[this] lazy val controllers_PropertyController_voidProperty34_invoker = createInvoker(
    PropertyController_4.voidProperty(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "voidProperty",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/properties/""" + "$" + """id<[^/]+>/status/void""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_PropertyController_getPropertyTypes35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_getPropertyTypes35_invoker = createInvoker(
    PropertyController_4.getPropertyTypes,
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

  // @LINE:91
  private[this] lazy val controllers_PropertyController_createPropertyType36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_createPropertyType36_invoker = createInvoker(
    PropertyController_4.createPropertyType,
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

  // @LINE:92
  private[this] lazy val controllers_PropertyController_deletePropertyType37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_deletePropertyType37_invoker = createInvoker(
    PropertyController_4.deletePropertyType(fakeValue[Long]),
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

  // @LINE:98
  private[this] lazy val controllers_ContactController_getContacts38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/contacts")))
  )
  private[this] lazy val controllers_ContactController_getContacts38_invoker = createInvoker(
    ContactController_3.getContacts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "getContacts",
      Nil,
      "GET",
      this.prefix + """admin/contacts""",
      """ Admin Contacts""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/property-contacts")))
  )
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts39_invoker = createInvoker(
    PropertyContactController_9.getPropertyContacts,
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

  // @LINE:111
  private[this] lazy val controllers_Assets_versioned40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned40_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:10
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:11
    case controllers_HomeController_agents1_route(params@_) =>
      call { 
        controllers_HomeController_agents1_invoker.call(HomeController_2.agents)
      }
  
    // @LINE:12
    case controllers_HomeController_getProperties2_route(params@_) =>
      call { 
        controllers_HomeController_getProperties2_invoker.call(HomeController_2.getProperties)
      }
  
    // @LINE:13
    case controllers_HomeController_getProperty3_route(params@_) =>
      call(params.fromPath[String]("slug", None)) { (slug) =>
        controllers_HomeController_getProperty3_invoker.call(HomeController_2.getProperty(slug))
      }
  
    // @LINE:14
    case controllers_HomeController_aboutUs4_route(params@_) =>
      call { 
        controllers_HomeController_aboutUs4_invoker.call(HomeController_2.aboutUs)
      }
  
    // @LINE:15
    case controllers_HomeController_contactUs5_route(params@_) =>
      call { 
        controllers_HomeController_contactUs5_invoker.call(HomeController_2.contactUs)
      }
  
    // @LINE:20
    case controllers_AuthController_getLogin6_route(params@_) =>
      call { 
        controllers_AuthController_getLogin6_invoker.call(AuthController_1.getLogin)
      }
  
    // @LINE:22
    case controllers_AuthController_postLogin7_route(params@_) =>
      call { 
        controllers_AuthController_postLogin7_invoker.call(AuthController_1.postLogin)
      }
  
    // @LINE:23
    case controllers_AuthController_getRegister8_route(params@_) =>
      call { 
        controllers_AuthController_getRegister8_invoker.call(AuthController_1.getRegister)
      }
  
    // @LINE:25
    case controllers_AuthController_postRegister9_route(params@_) =>
      call { 
        controllers_AuthController_postRegister9_invoker.call(AuthController_1.postRegister)
      }
  
    // @LINE:26
    case controllers_AuthController_logout10_route(params@_) =>
      call { 
        controllers_AuthController_logout10_invoker.call(AuthController_1.logout)
      }
  
    // @LINE:32
    case controllers_AdminController_getDashboard11_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard11_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:33
    case controllers_AdminController_getDashboard12_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard12_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:40
    case controllers_AmenitiesController_getAmenities13_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities13_invoker.call(AmenitiesController_6.getAmenities)
      }
  
    // @LINE:42
    case controllers_AmenitiesController_create14_route(params@_) =>
      call { 
        controllers_AmenitiesController_create14_invoker.call(AmenitiesController_6.create)
      }
  
    // @LINE:43
    case controllers_AmenitiesController_delete15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AmenitiesController_delete15_invoker.call(AmenitiesController_6.delete(id))
      }
  
    // @LINE:50
    case controllers_UserController_getOwners16_route(params@_) =>
      call { 
        controllers_UserController_getOwners16_invoker.call(UserController_5.getOwners)
      }
  
    // @LINE:57
    case controllers_LocationController_getRegions17_route(params@_) =>
      call { 
        controllers_LocationController_getRegions17_invoker.call(LocationController_8.getRegions)
      }
  
    // @LINE:59
    case controllers_LocationController_createRegion18_route(params@_) =>
      call { 
        controllers_LocationController_createRegion18_invoker.call(LocationController_8.createRegion)
      }
  
    // @LINE:60
    case controllers_LocationController_deleteRegion19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteRegion19_invoker.call(LocationController_8.deleteRegion(id))
      }
  
    // @LINE:62
    case controllers_LocationController_getCities20_route(params@_) =>
      call { 
        controllers_LocationController_getCities20_invoker.call(LocationController_8.getCities)
      }
  
    // @LINE:64
    case controllers_LocationController_createCity21_route(params@_) =>
      call { 
        controllers_LocationController_createCity21_invoker.call(LocationController_8.createCity)
      }
  
    // @LINE:65
    case controllers_LocationController_deleteCity22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteCity22_invoker.call(LocationController_8.deleteCity(id))
      }
  
    // @LINE:67
    case controllers_LocationController_getLocalities23_route(params@_) =>
      call { 
        controllers_LocationController_getLocalities23_invoker.call(LocationController_8.getLocalities)
      }
  
    // @LINE:69
    case controllers_LocationController_createLocality24_route(params@_) =>
      call { 
        controllers_LocationController_createLocality24_invoker.call(LocationController_8.createLocality)
      }
  
    // @LINE:70
    case controllers_LocationController_deleteLocality25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteLocality25_invoker.call(LocationController_8.deleteLocality(id))
      }
  
    // @LINE:73
    case controllers_LocationController_getRegionsByCountry26_route(params@_) =>
      call(params.fromPath[Long]("country_id", None)) { (country_id) =>
        controllers_LocationController_getRegionsByCountry26_invoker.call(LocationController_8.getRegionsByCountry(country_id))
      }
  
    // @LINE:74
    case controllers_LocationController_getCitiesByRegion27_route(params@_) =>
      call(params.fromPath[Long]("region_id", None)) { (region_id) =>
        controllers_LocationController_getCitiesByRegion27_invoker.call(LocationController_8.getCitiesByRegion(region_id))
      }
  
    // @LINE:75
    case controllers_LocationController_getLocalitiesByCity28_route(params@_) =>
      call(params.fromPath[Long]("city_id", None)) { (city_id) =>
        controllers_LocationController_getLocalitiesByCity28_invoker.call(LocationController_8.getLocalitiesByCity(city_id))
      }
  
    // @LINE:81
    case controllers_PropertyController_getAllProperties29_route(params@_) =>
      call { 
        controllers_PropertyController_getAllProperties29_invoker.call(PropertyController_4.getAllProperties)
      }
  
    // @LINE:82
    case controllers_PropertyController_getUpload30_route(params@_) =>
      call { 
        controllers_PropertyController_getUpload30_invoker.call(PropertyController_4.getUpload)
      }
  
    // @LINE:83
    case controllers_PropertyController_getProperty31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_getProperty31_invoker.call(PropertyController_4.getProperty(id))
      }
  
    // @LINE:85
    case controllers_PropertyController_postUpload32_route(params@_) =>
      call { 
        controllers_PropertyController_postUpload32_invoker.call(PropertyController_4.postUpload)
      }
  
    // @LINE:86
    case controllers_PropertyController_activateProperty33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_activateProperty33_invoker.call(PropertyController_4.activateProperty(id))
      }
  
    // @LINE:87
    case controllers_PropertyController_voidProperty34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_voidProperty34_invoker.call(PropertyController_4.voidProperty(id))
      }
  
    // @LINE:89
    case controllers_PropertyController_getPropertyTypes35_route(params@_) =>
      call { 
        controllers_PropertyController_getPropertyTypes35_invoker.call(PropertyController_4.getPropertyTypes)
      }
  
    // @LINE:91
    case controllers_PropertyController_createPropertyType36_route(params@_) =>
      call { 
        controllers_PropertyController_createPropertyType36_invoker.call(PropertyController_4.createPropertyType)
      }
  
    // @LINE:92
    case controllers_PropertyController_deletePropertyType37_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_deletePropertyType37_invoker.call(PropertyController_4.deletePropertyType(id))
      }
  
    // @LINE:98
    case controllers_ContactController_getContacts38_route(params@_) =>
      call { 
        controllers_ContactController_getContacts38_invoker.call(ContactController_3.getContacts)
      }
  
    // @LINE:104
    case controllers_PropertyContactController_getPropertyContacts39_route(params@_) =>
      call { 
        controllers_PropertyContactController_getPropertyContacts39_invoker.call(PropertyContactController_9.getPropertyContacts)
      }
  
    // @LINE:111
    case controllers_Assets_versioned40_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned40_invoker.call(Assets_7.versioned(path, file))
      }
  }
}

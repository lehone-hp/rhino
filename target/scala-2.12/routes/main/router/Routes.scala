// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Tue Jul 09 13:46:49 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:12
  AuthController_1: controllers.AuthController,
  // @LINE:24
  AdminController_0: controllers.AdminController,
  // @LINE:32
  AmenitiesController_5: controllers.AmenitiesController,
  // @LINE:42
  UserController_4: controllers.UserController,
  // @LINE:49
  LocationController_7: controllers.LocationController,
  // @LINE:73
  PropertyController_3: controllers.PropertyController,
  // @LINE:90
  PropertyContactController_8: controllers.PropertyContactController,
  // @LINE:97
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:12
    AuthController_1: controllers.AuthController,
    // @LINE:24
    AdminController_0: controllers.AdminController,
    // @LINE:32
    AmenitiesController_5: controllers.AmenitiesController,
    // @LINE:42
    UserController_4: controllers.UserController,
    // @LINE:49
    LocationController_7: controllers.LocationController,
    // @LINE:73
    PropertyController_3: controllers.PropertyController,
    // @LINE:90
    PropertyContactController_8: controllers.PropertyContactController,
    // @LINE:97
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_2, AuthController_1, AdminController_0, AmenitiesController_5, UserController_4, LocationController_7, PropertyController_3, PropertyContactController_8, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AuthController_1, AdminController_0, AmenitiesController_5, UserController_4, LocationController_7, PropertyController_3, PropertyContactController_8, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
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
    HomeController_2.index,
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
  private[this] lazy val controllers_AuthController_getLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_getLogin1_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_AuthController_postLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_postLogin2_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_AuthController_getRegister3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_AuthController_getRegister3_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_AuthController_postRegister4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_AuthController_postRegister4_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_AuthController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout5_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_AdminController_getDashboard6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_getDashboard6_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_AdminController_getDashboard7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/dashboard")))
  )
  private[this] lazy val controllers_AdminController_getDashboard7_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_AmenitiesController_getAmenities8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_getAmenities8_invoker = createInvoker(
    AmenitiesController_5.getAmenities,
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

  // @LINE:34
  private[this] lazy val controllers_AmenitiesController_create9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_create9_invoker = createInvoker(
    AmenitiesController_5.create,
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

  // @LINE:35
  private[this] lazy val controllers_AmenitiesController_delete10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AmenitiesController_delete10_invoker = createInvoker(
    AmenitiesController_5.delete(fakeValue[Long]),
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

  // @LINE:42
  private[this] lazy val controllers_UserController_getOwners11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/landlords")))
  )
  private[this] lazy val controllers_UserController_getOwners11_invoker = createInvoker(
    UserController_4.getOwners,
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

  // @LINE:49
  private[this] lazy val controllers_LocationController_getRegions12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_getRegions12_invoker = createInvoker(
    LocationController_7.getRegions,
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

  // @LINE:51
  private[this] lazy val controllers_LocationController_createRegion13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_createRegion13_invoker = createInvoker(
    LocationController_7.createRegion,
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

  // @LINE:52
  private[this] lazy val controllers_LocationController_deleteRegion14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteRegion14_invoker = createInvoker(
    LocationController_7.deleteRegion(fakeValue[Long]),
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

  // @LINE:54
  private[this] lazy val controllers_LocationController_getCities15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_getCities15_invoker = createInvoker(
    LocationController_7.getCities,
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

  // @LINE:56
  private[this] lazy val controllers_LocationController_createCity16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_createCity16_invoker = createInvoker(
    LocationController_7.createCity,
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

  // @LINE:57
  private[this] lazy val controllers_LocationController_deleteCity17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteCity17_invoker = createInvoker(
    LocationController_7.deleteCity(fakeValue[Long]),
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

  // @LINE:59
  private[this] lazy val controllers_LocationController_getLocalities18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_getLocalities18_invoker = createInvoker(
    LocationController_7.getLocalities,
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

  // @LINE:61
  private[this] lazy val controllers_LocationController_createLocality19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_createLocality19_invoker = createInvoker(
    LocationController_7.createLocality,
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

  // @LINE:62
  private[this] lazy val controllers_LocationController_deleteLocality20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_deleteLocality20_invoker = createInvoker(
    LocationController_7.deleteLocality(fakeValue[Long]),
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

  // @LINE:65
  private[this] lazy val controllers_LocationController_getRegionsByCountry21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/regions/"), DynamicPart("country_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getRegionsByCountry21_invoker = createInvoker(
    LocationController_7.getRegionsByCountry(fakeValue[Long]),
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

  // @LINE:66
  private[this] lazy val controllers_LocationController_getCitiesByRegion22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cities/"), DynamicPart("region_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getCitiesByRegion22_invoker = createInvoker(
    LocationController_7.getCitiesByRegion(fakeValue[Long]),
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

  // @LINE:67
  private[this] lazy val controllers_LocationController_getLocalitiesByCity23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/localities/"), DynamicPart("city_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LocationController_getLocalitiesByCity23_invoker = createInvoker(
    LocationController_7.getLocalitiesByCity(fakeValue[Long]),
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

  // @LINE:73
  private[this] lazy val controllers_PropertyController_getAllProperties24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties")))
  )
  private[this] lazy val controllers_PropertyController_getAllProperties24_invoker = createInvoker(
    PropertyController_3.getAllProperties,
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

  // @LINE:74
  private[this] lazy val controllers_PropertyController_getUpload25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_getUpload25_invoker = createInvoker(
    PropertyController_3.getUpload,
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

  // @LINE:75
  private[this] lazy val controllers_PropertyController_getProperty26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_getProperty26_invoker = createInvoker(
    PropertyController_3.getProperty(fakeValue[Long]),
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

  // @LINE:77
  private[this] lazy val controllers_PropertyController_postUpload27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties/upload")))
  )
  private[this] lazy val controllers_PropertyController_postUpload27_invoker = createInvoker(
    PropertyController_3.postUpload,
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

  // @LINE:79
  private[this] lazy val controllers_PropertyController_getPropertyTypes28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_getPropertyTypes28_invoker = createInvoker(
    PropertyController_3.getPropertyTypes,
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

  // @LINE:81
  private[this] lazy val controllers_PropertyController_createPropertyType29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_createPropertyType29_invoker = createInvoker(
    PropertyController_3.createPropertyType,
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

  // @LINE:82
  private[this] lazy val controllers_PropertyController_deletePropertyType30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PropertyController_deletePropertyType30_invoker = createInvoker(
    PropertyController_3.deletePropertyType(fakeValue[Long]),
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

  // @LINE:90
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/property-contacts")))
  )
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts31_invoker = createInvoker(
    PropertyContactController_8.getPropertyContacts,
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

  // @LINE:97
  private[this] lazy val controllers_Assets_versioned32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned32_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:12
    case controllers_AuthController_getLogin1_route(params@_) =>
      call { 
        controllers_AuthController_getLogin1_invoker.call(AuthController_1.getLogin)
      }
  
    // @LINE:14
    case controllers_AuthController_postLogin2_route(params@_) =>
      call { 
        controllers_AuthController_postLogin2_invoker.call(AuthController_1.postLogin)
      }
  
    // @LINE:15
    case controllers_AuthController_getRegister3_route(params@_) =>
      call { 
        controllers_AuthController_getRegister3_invoker.call(AuthController_1.getRegister)
      }
  
    // @LINE:17
    case controllers_AuthController_postRegister4_route(params@_) =>
      call { 
        controllers_AuthController_postRegister4_invoker.call(AuthController_1.postRegister)
      }
  
    // @LINE:18
    case controllers_AuthController_logout5_route(params@_) =>
      call { 
        controllers_AuthController_logout5_invoker.call(AuthController_1.logout)
      }
  
    // @LINE:24
    case controllers_AdminController_getDashboard6_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard6_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:25
    case controllers_AdminController_getDashboard7_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard7_invoker.call(AdminController_0.getDashboard)
      }
  
    // @LINE:32
    case controllers_AmenitiesController_getAmenities8_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities8_invoker.call(AmenitiesController_5.getAmenities)
      }
  
    // @LINE:34
    case controllers_AmenitiesController_create9_route(params@_) =>
      call { 
        controllers_AmenitiesController_create9_invoker.call(AmenitiesController_5.create)
      }
  
    // @LINE:35
    case controllers_AmenitiesController_delete10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AmenitiesController_delete10_invoker.call(AmenitiesController_5.delete(id))
      }
  
    // @LINE:42
    case controllers_UserController_getOwners11_route(params@_) =>
      call { 
        controllers_UserController_getOwners11_invoker.call(UserController_4.getOwners)
      }
  
    // @LINE:49
    case controllers_LocationController_getRegions12_route(params@_) =>
      call { 
        controllers_LocationController_getRegions12_invoker.call(LocationController_7.getRegions)
      }
  
    // @LINE:51
    case controllers_LocationController_createRegion13_route(params@_) =>
      call { 
        controllers_LocationController_createRegion13_invoker.call(LocationController_7.createRegion)
      }
  
    // @LINE:52
    case controllers_LocationController_deleteRegion14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteRegion14_invoker.call(LocationController_7.deleteRegion(id))
      }
  
    // @LINE:54
    case controllers_LocationController_getCities15_route(params@_) =>
      call { 
        controllers_LocationController_getCities15_invoker.call(LocationController_7.getCities)
      }
  
    // @LINE:56
    case controllers_LocationController_createCity16_route(params@_) =>
      call { 
        controllers_LocationController_createCity16_invoker.call(LocationController_7.createCity)
      }
  
    // @LINE:57
    case controllers_LocationController_deleteCity17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteCity17_invoker.call(LocationController_7.deleteCity(id))
      }
  
    // @LINE:59
    case controllers_LocationController_getLocalities18_route(params@_) =>
      call { 
        controllers_LocationController_getLocalities18_invoker.call(LocationController_7.getLocalities)
      }
  
    // @LINE:61
    case controllers_LocationController_createLocality19_route(params@_) =>
      call { 
        controllers_LocationController_createLocality19_invoker.call(LocationController_7.createLocality)
      }
  
    // @LINE:62
    case controllers_LocationController_deleteLocality20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteLocality20_invoker.call(LocationController_7.deleteLocality(id))
      }
  
    // @LINE:65
    case controllers_LocationController_getRegionsByCountry21_route(params@_) =>
      call(params.fromPath[Long]("country_id", None)) { (country_id) =>
        controllers_LocationController_getRegionsByCountry21_invoker.call(LocationController_7.getRegionsByCountry(country_id))
      }
  
    // @LINE:66
    case controllers_LocationController_getCitiesByRegion22_route(params@_) =>
      call(params.fromPath[Long]("region_id", None)) { (region_id) =>
        controllers_LocationController_getCitiesByRegion22_invoker.call(LocationController_7.getCitiesByRegion(region_id))
      }
  
    // @LINE:67
    case controllers_LocationController_getLocalitiesByCity23_route(params@_) =>
      call(params.fromPath[Long]("city_id", None)) { (city_id) =>
        controllers_LocationController_getLocalitiesByCity23_invoker.call(LocationController_7.getLocalitiesByCity(city_id))
      }
  
    // @LINE:73
    case controllers_PropertyController_getAllProperties24_route(params@_) =>
      call { 
        controllers_PropertyController_getAllProperties24_invoker.call(PropertyController_3.getAllProperties)
      }
  
    // @LINE:74
    case controllers_PropertyController_getUpload25_route(params@_) =>
      call { 
        controllers_PropertyController_getUpload25_invoker.call(PropertyController_3.getUpload)
      }
  
    // @LINE:75
    case controllers_PropertyController_getProperty26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_getProperty26_invoker.call(PropertyController_3.getProperty(id))
      }
  
    // @LINE:77
    case controllers_PropertyController_postUpload27_route(params@_) =>
      call { 
        controllers_PropertyController_postUpload27_invoker.call(PropertyController_3.postUpload)
      }
  
    // @LINE:79
    case controllers_PropertyController_getPropertyTypes28_route(params@_) =>
      call { 
        controllers_PropertyController_getPropertyTypes28_invoker.call(PropertyController_3.getPropertyTypes)
      }
  
    // @LINE:81
    case controllers_PropertyController_createPropertyType29_route(params@_) =>
      call { 
        controllers_PropertyController_createPropertyType29_invoker.call(PropertyController_3.createPropertyType)
      }
  
    // @LINE:82
    case controllers_PropertyController_deletePropertyType30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PropertyController_deletePropertyType30_invoker.call(PropertyController_3.deletePropertyType(id))
      }
  
    // @LINE:90
    case controllers_PropertyContactController_getPropertyContacts31_route(params@_) =>
      call { 
        controllers_PropertyContactController_getPropertyContacts31_invoker.call(PropertyContactController_8.getPropertyContacts)
      }
  
    // @LINE:97
    case controllers_Assets_versioned32_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned32_invoker.call(Assets_6.versioned(path, file))
      }
  }
}

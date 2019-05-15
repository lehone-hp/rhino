// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Wed May 15 08:28:05 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_7: controllers.HomeController,
  // @LINE:12
  AdminController_3: controllers.AdminController,
  // @LINE:16
  AmenitiesController_1: controllers.AmenitiesController,
  // @LINE:19
  UserController_4: controllers.UserController,
  // @LINE:22
  LocationController_2: controllers.LocationController,
  // @LINE:27
  PropertyController_5: controllers.PropertyController,
  // @LINE:30
  PropertyContactController_0: controllers.PropertyContactController,
  // @LINE:37
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_7: controllers.HomeController,
    // @LINE:12
    AdminController_3: controllers.AdminController,
    // @LINE:16
    AmenitiesController_1: controllers.AmenitiesController,
    // @LINE:19
    UserController_4: controllers.UserController,
    // @LINE:22
    LocationController_2: controllers.LocationController,
    // @LINE:27
    PropertyController_5: controllers.PropertyController,
    // @LINE:30
    PropertyContactController_0: controllers.PropertyContactController,
    // @LINE:37
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_7, AdminController_3, AmenitiesController_1, UserController_4, LocationController_2, PropertyController_5, PropertyContactController_0, Assets_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, AdminController_3, AmenitiesController_1, UserController_4, LocationController_2, PropertyController_5, PropertyContactController_0, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/dashboard""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/amenities""", """controllers.AmenitiesController.getAmenities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/landlords""", """controllers.UserController.getOwners"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/regions""", """controllers.LocationController.getRegions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cities""", """controllers.LocationController.getCities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/localities""", """controllers.LocationController.getLocalities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/propert-types""", """controllers.PropertyController.getPropertyTypes"""),
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
    HomeController_7.index,
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
    AdminController_3.getDashboard,
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
    AdminController_3.getDashboard,
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

  // @LINE:16
  private[this] lazy val controllers_AmenitiesController_getAmenities3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_getAmenities3_invoker = createInvoker(
    AmenitiesController_1.getAmenities,
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

  // @LINE:19
  private[this] lazy val controllers_UserController_getOwners4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/landlords")))
  )
  private[this] lazy val controllers_UserController_getOwners4_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_LocationController_getRegions5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/regions")))
  )
  private[this] lazy val controllers_LocationController_getRegions5_invoker = createInvoker(
    LocationController_2.getRegions,
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

  // @LINE:23
  private[this] lazy val controllers_LocationController_getCities6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cities")))
  )
  private[this] lazy val controllers_LocationController_getCities6_invoker = createInvoker(
    LocationController_2.getCities,
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

  // @LINE:24
  private[this] lazy val controllers_LocationController_getLocalities7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_getLocalities7_invoker = createInvoker(
    LocationController_2.getLocalities,
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

  // @LINE:27
  private[this] lazy val controllers_PropertyController_getPropertyTypes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_getPropertyTypes8_invoker = createInvoker(
    PropertyController_5.getPropertyTypes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PropertyController",
      "getPropertyTypes",
      Nil,
      "GET",
      this.prefix + """admin/propert-types""",
      """ Properties""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/property-contacts")))
  )
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts9_invoker = createInvoker(
    PropertyContactController_0.getPropertyContacts,
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

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
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
        controllers_HomeController_index0_invoker.call(HomeController_7.index)
      }
  
    // @LINE:12
    case controllers_AdminController_getDashboard1_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard1_invoker.call(AdminController_3.getDashboard)
      }
  
    // @LINE:13
    case controllers_AdminController_getDashboard2_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard2_invoker.call(AdminController_3.getDashboard)
      }
  
    // @LINE:16
    case controllers_AmenitiesController_getAmenities3_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities3_invoker.call(AmenitiesController_1.getAmenities)
      }
  
    // @LINE:19
    case controllers_UserController_getOwners4_route(params@_) =>
      call { 
        controllers_UserController_getOwners4_invoker.call(UserController_4.getOwners)
      }
  
    // @LINE:22
    case controllers_LocationController_getRegions5_route(params@_) =>
      call { 
        controllers_LocationController_getRegions5_invoker.call(LocationController_2.getRegions)
      }
  
    // @LINE:23
    case controllers_LocationController_getCities6_route(params@_) =>
      call { 
        controllers_LocationController_getCities6_invoker.call(LocationController_2.getCities)
      }
  
    // @LINE:24
    case controllers_LocationController_getLocalities7_route(params@_) =>
      call { 
        controllers_LocationController_getLocalities7_invoker.call(LocationController_2.getLocalities)
      }
  
    // @LINE:27
    case controllers_PropertyController_getPropertyTypes8_route(params@_) =>
      call { 
        controllers_PropertyController_getPropertyTypes8_invoker.call(PropertyController_5.getPropertyTypes)
      }
  
    // @LINE:30
    case controllers_PropertyContactController_getPropertyContacts9_route(params@_) =>
      call { 
        controllers_PropertyContactController_getPropertyContacts9_invoker.call(PropertyContactController_0.getPropertyContacts)
      }
  
    // @LINE:37
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_6.versioned(path, file))
      }
  }
}

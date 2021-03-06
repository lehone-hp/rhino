// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Wed May 22 09:20:50 WAT 2019

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
  // @LINE:16
  AmenitiesController_4: controllers.AmenitiesController,
  // @LINE:22
  UserController_3: controllers.UserController,
  // @LINE:25
  LocationController_6: controllers.LocationController,
  // @LINE:34
  PropertyController_2: controllers.PropertyController,
  // @LINE:38
  PropertyContactController_7: controllers.PropertyContactController,
  // @LINE:45
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:12
    AdminController_0: controllers.AdminController,
    // @LINE:16
    AmenitiesController_4: controllers.AmenitiesController,
    // @LINE:22
    UserController_3: controllers.UserController,
    // @LINE:25
    LocationController_6: controllers.LocationController,
    // @LINE:34
    PropertyController_2: controllers.PropertyController,
    // @LINE:38
    PropertyContactController_7: controllers.PropertyContactController,
    // @LINE:45
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/localities""", """controllers.LocationController.getLocalities"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/properties""", """controllers.PropertyController.getAllProperties"""),
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

  // @LINE:16
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

  // @LINE:18
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

  // @LINE:19
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

  // @LINE:22
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

  // @LINE:25
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

  // @LINE:27
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

  // @LINE:28
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

  // @LINE:30
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

  // @LINE:31
  private[this] lazy val controllers_LocationController_getLocalities11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/localities")))
  )
  private[this] lazy val controllers_LocationController_getLocalities11_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_PropertyController_getAllProperties12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/properties")))
  )
  private[this] lazy val controllers_PropertyController_getAllProperties12_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_PropertyController_getPropertyTypes13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/propert-types")))
  )
  private[this] lazy val controllers_PropertyController_getPropertyTypes13_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/property-contacts")))
  )
  private[this] lazy val controllers_PropertyContactController_getPropertyContacts14_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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
  
    // @LINE:16
    case controllers_AmenitiesController_getAmenities3_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities3_invoker.call(AmenitiesController_4.getAmenities)
      }
  
    // @LINE:18
    case controllers_AmenitiesController_create4_route(params@_) =>
      call { 
        controllers_AmenitiesController_create4_invoker.call(AmenitiesController_4.create)
      }
  
    // @LINE:19
    case controllers_AmenitiesController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AmenitiesController_delete5_invoker.call(AmenitiesController_4.delete(id))
      }
  
    // @LINE:22
    case controllers_UserController_getOwners6_route(params@_) =>
      call { 
        controllers_UserController_getOwners6_invoker.call(UserController_3.getOwners)
      }
  
    // @LINE:25
    case controllers_LocationController_getRegions7_route(params@_) =>
      call { 
        controllers_LocationController_getRegions7_invoker.call(LocationController_6.getRegions)
      }
  
    // @LINE:27
    case controllers_LocationController_createRegion8_route(params@_) =>
      call { 
        controllers_LocationController_createRegion8_invoker.call(LocationController_6.createRegion)
      }
  
    // @LINE:28
    case controllers_LocationController_deleteRegion9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LocationController_deleteRegion9_invoker.call(LocationController_6.deleteRegion(id))
      }
  
    // @LINE:30
    case controllers_LocationController_getCities10_route(params@_) =>
      call { 
        controllers_LocationController_getCities10_invoker.call(LocationController_6.getCities)
      }
  
    // @LINE:31
    case controllers_LocationController_getLocalities11_route(params@_) =>
      call { 
        controllers_LocationController_getLocalities11_invoker.call(LocationController_6.getLocalities)
      }
  
    // @LINE:34
    case controllers_PropertyController_getAllProperties12_route(params@_) =>
      call { 
        controllers_PropertyController_getAllProperties12_invoker.call(PropertyController_2.getAllProperties)
      }
  
    // @LINE:35
    case controllers_PropertyController_getPropertyTypes13_route(params@_) =>
      call { 
        controllers_PropertyController_getPropertyTypes13_invoker.call(PropertyController_2.getPropertyTypes)
      }
  
    // @LINE:38
    case controllers_PropertyContactController_getPropertyContacts14_route(params@_) =>
      call { 
        controllers_PropertyContactController_getPropertyContacts14_invoker.call(PropertyContactController_7.getPropertyContacts)
      }
  
    // @LINE:45
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_5.versioned(path, file))
      }
  }
}

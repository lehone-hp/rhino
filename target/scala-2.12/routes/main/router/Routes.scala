// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Tue May 14 07:43:13 WAT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:11
  AdminController_1: controllers.AdminController,
  // @LINE:15
  AmenitiesController_2: controllers.AmenitiesController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:11
    AdminController_1: controllers.AdminController,
    // @LINE:15
    AmenitiesController_2: controllers.AmenitiesController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_3, AdminController_1, AmenitiesController_2, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, AdminController_1, AmenitiesController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/dashboard""", """controllers.AdminController.getDashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/amenities""", """controllers.AmenitiesController.getAmenities"""),
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
    HomeController_3.index,
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

  // @LINE:11
  private[this] lazy val controllers_AdminController_getDashboard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/")))
  )
  private[this] lazy val controllers_AdminController_getDashboard1_invoker = createInvoker(
    AdminController_1.getDashboard,
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

  // @LINE:12
  private[this] lazy val controllers_AdminController_getDashboard2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/dashboard")))
  )
  private[this] lazy val controllers_AdminController_getDashboard2_invoker = createInvoker(
    AdminController_1.getDashboard,
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

  // @LINE:15
  private[this] lazy val controllers_AmenitiesController_getAmenities3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/amenities")))
  )
  private[this] lazy val controllers_AmenitiesController_getAmenities3_invoker = createInvoker(
    AmenitiesController_2.getAmenities,
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
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:11
    case controllers_AdminController_getDashboard1_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard1_invoker.call(AdminController_1.getDashboard)
      }
  
    // @LINE:12
    case controllers_AdminController_getDashboard2_route(params@_) =>
      call { 
        controllers_AdminController_getDashboard2_invoker.call(AdminController_1.getDashboard)
      }
  
    // @LINE:15
    case controllers_AmenitiesController_getAmenities3_route(params@_) =>
      call { 
        controllers_AmenitiesController_getAmenities3_invoker.call(AmenitiesController_2.getAmenities)
      }
  
    // @LINE:22
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}

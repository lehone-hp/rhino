// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Thu Jul 11 10:38:52 WAT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.javascript {

  // @LINE:105
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getDashboard",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
          }
        
        }
      """
    )
  
  }

  // @LINE:81
  class ReversePropertyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def deletePropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.deletePropertyType",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:81
    def getAllProperties: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getAllProperties",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties"})
        }
      """
    )
  
    // @LINE:89
    def createPropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.createPropertyType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:85
    def postUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.postUpload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:87
    def getPropertyTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getPropertyTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:82
    def getUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getUpload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:83
    def getProperty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getProperty",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseLocationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def getCitiesByRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCitiesByRegion",
      """
        function(region_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cities/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("region_id", region_id0))})
        }
      """
    )
  
    // @LINE:70
    def deleteLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteLocality",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:73
    def getRegionsByCountry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegionsByCountry",
      """
        function(country_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/regions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("country_id", country_id0))})
        }
      """
    )
  
    // @LINE:69
    def createLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createLocality",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:60
    def deleteRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteRegion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def createRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createRegion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:57
    def getRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:62
    def getCities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:64
    def createCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createCity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:67
    def getLocalities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:75
    def getLocalitiesByCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalitiesByCity",
      """
        function(city_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/localities/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("city_id", city_id0))})
        }
      """
    )
  
    // @LINE:65
    def deleteCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteCity",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAmenitiesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getAmenities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.getAmenities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:42
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:43
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getOwners: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getOwners",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/landlords"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:12
    def getProperties: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProperties",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "properties"})
        }
      """
    )
  
    // @LINE:13
    def getProperty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProperty",
      """
        function(slug0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "properties/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("slug", slug0))})
        }
      """
    )
  
    // @LINE:11
    def agents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.agents",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agents"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.aboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def postRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.postRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:26
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:20
    def getLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.getLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:23
    def getRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.getRegister",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:22
    def postLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.postLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:98
  class ReversePropertyContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def getPropertyContacts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyContactController.getPropertyContacts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/property-contacts"})
        }
      """
    )
  
  }


}

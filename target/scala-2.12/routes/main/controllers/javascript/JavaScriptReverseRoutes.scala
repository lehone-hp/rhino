// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Sun Jun 30 16:09:53 WAT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:85
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getDashboard",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/"})
          }
        
        }
      """
    )
  
  }

  // @LINE:61
  class ReversePropertyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def deletePropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.deletePropertyType",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:61
    def getAllProperties: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getAllProperties",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties"})
        }
      """
    )
  
    // @LINE:69
    def createPropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.createPropertyType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:65
    def postUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.postUpload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:67
    def getPropertyTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getPropertyTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:62
    def getUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getUpload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:63
    def getProperty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getProperty",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseLocationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def getCitiesByRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCitiesByRegion",
      """
        function(region_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cities/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("region_id", region_id0))})
        }
      """
    )
  
    // @LINE:50
    def deleteLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteLocality",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:53
    def getRegionsByCountry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegionsByCountry",
      """
        function(country_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/regions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("country_id", country_id0))})
        }
      """
    )
  
    // @LINE:49
    def createLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createLocality",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:40
    def deleteRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteRegion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def createRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createRegion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:37
    def getRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:42
    def getCities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:44
    def createCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createCity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:47
    def getLocalities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:55
    def getLocalitiesByCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalitiesByCity",
      """
        function(city_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/localities/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("city_id", city_id0))})
        }
      """
    )
  
    // @LINE:45
    def deleteCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteCity",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAmenitiesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def getAmenities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.getAmenities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:22
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:23
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getOwners: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getOwners",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/landlords"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:78
  class ReversePropertyContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
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

// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Fri Jun 21 17:59:05 WAT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:60
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
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

  // @LINE:41
  class ReversePropertyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def deletePropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.deletePropertyType",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:41
    def getAllProperties: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getAllProperties",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties"})
        }
      """
    )
  
    // @LINE:49
    def createPropertyType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.createPropertyType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:45
    def postUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.postUpload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:47
    def getPropertyTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getPropertyTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
    // @LINE:42
    def getUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getUpload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/upload"})
        }
      """
    )
  
    // @LINE:43
    def getProperty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getProperty",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseLocationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def deleteLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteLocality",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:37
    def createLocality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createLocality",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:28
    def deleteRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteRegion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:27
    def createRegion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createRegion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:25
    def getRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:30
    def getCities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:32
    def createCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.createCity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:35
    def getLocalities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
        }
      """
    )
  
    // @LINE:33
    def deleteCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.deleteCity",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAmenitiesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getAmenities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.getAmenities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:18
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities"})
        }
      """
    )
  
    // @LINE:19
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AmenitiesController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/amenities/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
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

  // @LINE:53
  class ReversePropertyContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
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

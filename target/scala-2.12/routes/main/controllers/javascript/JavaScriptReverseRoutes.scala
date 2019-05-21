// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Tue May 21 09:01:20 WAT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
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

  // @LINE:30
  class ReversePropertyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def getAllProperties: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getAllProperties",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/properties"})
        }
      """
    )
  
    // @LINE:31
    def getPropertyTypes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PropertyController.getPropertyTypes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/propert-types"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseLocationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def getRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/regions"})
        }
      """
    )
  
    // @LINE:26
    def getCities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getCities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cities"})
        }
      """
    )
  
    // @LINE:27
    def getLocalities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.getLocalities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/localities"})
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

  // @LINE:34
  class ReversePropertyContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
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

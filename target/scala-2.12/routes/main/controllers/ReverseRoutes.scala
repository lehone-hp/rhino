// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Wed May 22 09:20:50 WAT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:45
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getDashboard(): Call = {
    
      () match {
      
        // @LINE:12
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "admin/")
      
      }
    
    }
  
  }

  // @LINE:34
  class ReversePropertyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getAllProperties(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties")
    }
  
    // @LINE:35
    def getPropertyTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
  }

  // @LINE:25
  class ReverseLocationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def deleteRegion(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:27
    def createRegion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:25
    def getRegions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:30
    def getCities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:31
    def getLocalities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
  }

  // @LINE:16
  class ReverseAmenitiesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getAmenities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:18
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:19
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:22
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getOwners(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/landlords")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:38
  class ReversePropertyContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getPropertyContacts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/property-contacts")
    }
  
  }


}

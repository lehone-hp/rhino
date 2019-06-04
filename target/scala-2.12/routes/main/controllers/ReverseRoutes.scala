// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Tue Jun 04 07:11:13 WAT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:57
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
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

  // @LINE:41
  class ReversePropertyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def deletePropertyType(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:41
    def getAllProperties(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties")
    }
  
    // @LINE:46
    def createPropertyType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:44
    def getPropertyTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:42
    def getUpload(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties/upload")
    }
  
  }

  // @LINE:25
  class ReverseLocationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def deleteLocality(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:37
    def createLocality(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/localities")
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
  
    // @LINE:32
    def createCity(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:35
    def getLocalities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
    // @LINE:33
    def deleteCity(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
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

  // @LINE:50
  class ReversePropertyContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getPropertyContacts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/property-contacts")
    }
  
  }


}

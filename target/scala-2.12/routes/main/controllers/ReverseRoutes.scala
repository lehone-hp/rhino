// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Sun Jun 30 16:09:53 WAT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:85
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
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

  // @LINE:61
  class ReversePropertyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def deletePropertyType(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:61
    def getAllProperties(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties")
    }
  
    // @LINE:69
    def createPropertyType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:65
    def postUpload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/properties/upload")
    }
  
    // @LINE:67
    def getPropertyTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:62
    def getUpload(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties/upload")
    }
  
    // @LINE:63
    def getProperty(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:37
  class ReverseLocationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def getCitiesByRegion(region_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cities/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("region_id", region_id)))
    }
  
    // @LINE:50
    def deleteLocality(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
    def getRegionsByCountry(country_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/regions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("country_id", country_id)))
    }
  
    // @LINE:49
    def createLocality(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
    // @LINE:40
    def deleteRegion(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def createRegion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:37
    def getRegions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:42
    def getCities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:44
    def createCity(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:47
    def getLocalities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
    // @LINE:55
    def getLocalitiesByCity(city_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/localities/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("city_id", city_id)))
    }
  
    // @LINE:45
    def deleteCity(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:20
  class ReverseAmenitiesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def getAmenities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:22
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:23
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:30
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
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

  // @LINE:78
  class ReversePropertyContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def getPropertyContacts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/property-contacts")
    }
  
  }


}

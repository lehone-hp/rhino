// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lehone/repo/github/play/rhino/conf/routes
// @DATE:Thu Jul 11 10:38:52 WAT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers {

  // @LINE:105
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:32
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getDashboard(): Call = {
    
      () match {
      
        // @LINE:32
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "admin")
      
      }
    
    }
  
  }

  // @LINE:81
  class ReversePropertyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def deletePropertyType(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:81
    def getAllProperties(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties")
    }
  
    // @LINE:89
    def createPropertyType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:85
    def postUpload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/properties/upload")
    }
  
    // @LINE:87
    def getPropertyTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/propert-types")
    }
  
    // @LINE:82
    def getUpload(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties/upload")
    }
  
    // @LINE:83
    def getProperty(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/properties/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:57
  class ReverseLocationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def getCitiesByRegion(region_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cities/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("region_id", region_id)))
    }
  
    // @LINE:70
    def deleteLocality(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:73
    def getRegionsByCountry(country_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/regions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("country_id", country_id)))
    }
  
    // @LINE:69
    def createLocality(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
    // @LINE:60
    def deleteRegion(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:59
    def createRegion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:57
    def getRegions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/regions")
    }
  
    // @LINE:62
    def getCities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:64
    def createCity(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/cities")
    }
  
    // @LINE:67
    def getLocalities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/localities")
    }
  
    // @LINE:75
    def getLocalitiesByCity(city_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/localities/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("city_id", city_id)))
    }
  
    // @LINE:65
    def deleteCity(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:40
  class ReverseAmenitiesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getAmenities(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:42
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/amenities")
    }
  
    // @LINE:43
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/amenities/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:50
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getOwners(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/landlords")
    }
  
  }

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def contactUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:12
    def getProperties(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "properties")
    }
  
    // @LINE:13
    def getProperty(slug:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "properties/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)))
    }
  
    // @LINE:11
    def agents(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agents")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def aboutUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
  }

  // @LINE:20
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def postRegister(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:26
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def getLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:23
    def getRegister(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:22
    def postLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:98
  class ReversePropertyContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def getPropertyContacts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/property-contacts")
    }
  
  }


}

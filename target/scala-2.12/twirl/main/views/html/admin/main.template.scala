
package views.html.admin

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(headerStyle: Html)(content: Html)(footerScript: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Red Rhino Admin | """),_display_(/*7.35*/title),format.raw/*7.40*/(""" """),format.raw/*7.41*/("""</title>
        <meta name="description" content="Red Rhino - Admin">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href=""""),_display_(/*11.45*/routes/*11.51*/.Assets.versioned("images/favicon.png")),format.raw/*11.90*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">

        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("css/normalize.css")),format.raw/*14.83*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*15.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*16.90*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("css/themify-icons.css")),format.raw/*17.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("css/pe-icon-7-filled.css")),format.raw/*18.90*/("""">


        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("weather/css/weather-icons.css")),format.raw/*21.78*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("calendar/fullcalendar.css")),format.raw/*22.74*/("""" rel="stylesheet" />

        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("css/style.css")),format.raw/*24.79*/("""">
        <link href=""""),_display_(/*25.22*/routes/*25.28*/.Assets.versioned("css/charts/chartist.min.css")),format.raw/*25.76*/("""" rel="stylesheet">
        <link href=""""),_display_(/*26.22*/routes/*26.28*/.Assets.versioned("css/lib/vector-map/jqvmap.min.css")),format.raw/*26.82*/("""" rel="stylesheet">

        """),_display_(/*28.10*/headerStyle),format.raw/*28.21*/("""

    """),format.raw/*30.5*/("""</head>
    <body>
            <!-- Left Panel -->
        	<aside id="left-panel" class="left-panel">
            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">


                        <li class="menu-title">Dashboard</li><!-- /.menu-title -->
                        <li """),_display_(/*40.30*/if(requestHeader.uri == routes.AdminController.getDashboard().toString)/*40.101*/ {_display_(Seq[Any](format.raw/*40.103*/("""class="active"""")))}),format.raw/*40.118*/(""">
                            <a href=""""),_display_(/*41.39*/routes/*41.45*/.AdminController.getDashboard()),format.raw/*41.76*/(""""><i class="menu-icon fa fa-tachometer"></i>Dashboard </a>
                        </li>

                        <li class="menu-title">Properties</li><!-- /.menu-title -->
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-home"></i>All Properties </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-upload"></i>Upload New </a>
                        </li>
                        <li """),_display_(/*51.30*/if(requestHeader.uri == routes.PropertyContactController.getPropertyContacts().toString)/*51.118*/ {_display_(Seq[Any](format.raw/*51.120*/("""class="active"""")))}),format.raw/*51.135*/(""">
                            <a href=""""),_display_(/*52.39*/routes/*52.45*/.PropertyContactController.getPropertyContacts()),format.raw/*52.93*/("""">
                                <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">100</span></a>
                        </li>
                        <li """),_display_(/*55.30*/if(requestHeader.uri == routes.PropertyController.getPropertyTypes().toString)/*55.108*/ {_display_(Seq[Any](format.raw/*55.110*/("""class="active"""")))}),format.raw/*55.125*/(""">
                            <a href=""""),_display_(/*56.39*/routes/*56.45*/.PropertyController.getPropertyTypes()),format.raw/*56.83*/(""""> <i class="menu-icon fa fa-cogs"></i>Property Type </a>
                        </li>


                        <li class="menu-title">Manage</li><!-- /.menu-title -->
                        <li """),_display_(/*61.30*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*61.97*/ {_display_(Seq[Any](format.raw/*61.99*/("""class="active"""")))}),format.raw/*61.114*/(""">
                            <a href=""""),_display_(/*62.39*/routes/*62.45*/.UserController.getOwners()),format.raw/*62.72*/("""">
                                <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                        </li>
                        <li class="menu-item-has-children dropdown
                                    """),_display_(/*66.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*66.110*/ {_display_(Seq[Any](format.raw/*66.112*/("""active""")))}),format.raw/*66.119*/("""
                                    """),_display_(/*67.38*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*67.109*/ {_display_(Seq[Any](format.raw/*67.111*/("""active""")))}),format.raw/*67.118*/("""
                                    """),_display_(/*68.38*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*68.113*/ {_display_(Seq[Any](format.raw/*68.115*/("""active""")))}),format.raw/*68.122*/("""">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                <i class="menu-icon fa fa-map-marker"></i>
                                Location</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-marker"></i><a href=""""),_display_(/*74.89*/routes/*74.95*/.LocationController.getRegions()),format.raw/*74.127*/("""">Region</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i><a href=""""),_display_(/*75.89*/routes/*75.95*/.LocationController.getCities()),format.raw/*75.126*/("""">City</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i><a href=""""),_display_(/*76.89*/routes/*76.95*/.LocationController.getLocalities()),format.raw/*76.130*/("""">Quarter/Locality</a></li>
                            </ul>
                        </li>
                        <li """),_display_(/*79.30*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*79.105*/ {_display_(Seq[Any](format.raw/*79.107*/("""class="active"""")))}),format.raw/*79.122*/(""">
                            <a href=""""),_display_(/*80.39*/routes/*80.45*/.AmenitiesController.getAmenities()),format.raw/*80.80*/("""">
                                <i class="menu-icon fa fa-th-list"></i>Amenities/Features </a>
                        </li>

                        <li class="menu-title">Authorization</li><!-- /.menu-title -->
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-tag"></i>Roles </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-tag"></i>Permissions </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-sign-out"></i>Logout </a>
                        </li>

                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </aside><!-- /#left-panel -->
        <!-- Left Panel -->


        <!-- Right Panel -->
        <div id="right-panel" class="right-panel">

                <!-- Header-->
            <header id="header" class="header">
                <div class="top-left">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*109.70*/routes/*109.76*/.Assets.versioned("images/logo.png")),format.raw/*109.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*110.77*/routes/*110.83*/.Assets.versioned("images/logo2.png")),format.raw/*110.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*125.31*/("""

                            """),format.raw/*127.29*/("""<div class="dropdown for-notification">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-bell"></i>
                                    <span class="count bg-danger">3</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="notification">
                                    <p class="red">You have 3 Notification</p>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-bell"></i>
                                        <p>Server #1 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-bell"></i>
                                        <p>Server #2 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-bell"></i>
                                        <p>Server #3 overloaded.</p>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*152.79*/routes/*152.85*/.Assets.versioned("images/admin.jpg")),format.raw/*152.122*/("""" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>My Profile</a>

                                <a class="nav-link" href="#"><i class="fa fa-bell-o"></i>Notifications <span class="count">
                                    13</span></a>

                                <a class="nav-link" href="#"><i class="fa fa-cog"></i>Settings</a>

                                <a class="nav-link" href="#"><i class="fa fa-power-off"></i>Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header><!-- /header -->
            <!-- Header-->


            <div class="content pb-0">

            """),_display_(/*174.14*/content),format.raw/*174.21*/("""

            """),format.raw/*176.13*/("""</div> <!-- .content -->


            <div class="clearfix"></div>

            """),format.raw/*192.24*/("""

        """),format.raw/*194.9*/("""</div><!-- /#right-panel -->


        <script src=""""),_display_(/*197.23*/routes/*197.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*197.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*198.23*/routes/*198.29*/.Assets.versioned("js/popper.min.js")),format.raw/*198.66*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*199.23*/routes/*199.29*/.Assets.versioned("js/plugins.js")),format.raw/*199.63*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*200.23*/routes/*200.29*/.Assets.versioned("js/main.js")),format.raw/*200.60*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>

        <script src=""""),_display_(/*202.23*/routes/*202.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*202.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*206.23*/routes/*206.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*206.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*207.23*/routes/*207.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*207.91*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*210.82*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*211.23*/routes/*211.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*211.86*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*212.23*/routes/*212.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*212.89*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*215.23*/routes/*215.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*215.88*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*216.23*/routes/*216.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*216.76*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*219.23*/routes/*219.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*219.73*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*220.23*/routes/*220.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*220.78*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*221.23*/routes/*221.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*221.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <div id="container">
        </div>

        <script src="https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="ff61747dd8d7db758f2acf61-|49" defer=""></script>

        """),_display_(/*229.10*/footerScript),format.raw/*229.22*/("""
    """),format.raw/*230.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,headerStyle:Html,content:Html,footerScript:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(headerStyle)(content)(footerScript)

  def f:((String) => (Html) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (headerStyle) => (content) => (footerScript) => apply(title)(headerStyle)(content)(footerScript)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 08:30:48 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: e4edf53f60813def26d431be449e7d821dc5206c
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|3875->1929|3956->2000|3997->2002|4044->2017|4111->2057|4126->2063|4178->2094|4718->2607|4816->2695|4857->2697|4904->2712|4971->2752|4986->2758|5055->2806|5273->2997|5361->3075|5402->3077|5449->3092|5516->3132|5531->3138|5590->3176|5816->3375|5892->3442|5932->3444|5979->3459|6046->3499|6061->3505|6109->3532|6366->3762|6448->3834|6489->3836|6528->3843|6593->3881|6674->3952|6715->3954|6754->3961|6819->3999|6904->4074|6945->4076|6984->4083|7458->4530|7473->4536|7527->4568|7660->4674|7675->4680|7728->4711|7859->4815|7874->4821|7931->4856|8079->4977|8164->5052|8205->5054|8252->5069|8319->5109|8334->5115|8390->5150|9563->6295|9579->6301|9638->6337|9760->6431|9776->6437|9836->6474|10190->7363|10249->7393|12001->9117|12017->9123|12077->9160|12943->9998|12972->10005|13015->10019|13125->10604|13163->10614|13244->10667|13260->10673|13332->10723|13442->10805|13458->10811|13517->10848|13627->10930|13643->10936|13699->10970|13809->11052|13825->11058|13878->11089|13989->11172|14005->11178|14079->11230|14225->11348|14241->11354|14315->11406|14425->11488|14441->11494|14525->11556|14637->11640|14653->11646|14728->11699|14838->11781|14854->11787|14933->11844|15043->11926|15059->11932|15141->11992|15253->12076|15269->12082|15350->12141|15460->12223|15476->12229|15545->12276|15657->12360|15673->12366|15739->12410|15849->12492|15865->12498|15936->12547|16046->12629|16062->12635|16134->12685|16460->12983|16494->12995|16527->13000
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|71->40|71->40|71->40|71->40|72->41|72->41|72->41|82->51|82->51|82->51|82->51|83->52|83->52|83->52|86->55|86->55|86->55|86->55|87->56|87->56|87->56|92->61|92->61|92->61|92->61|93->62|93->62|93->62|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|110->79|110->79|110->79|110->79|111->80|111->80|111->80|140->109|140->109|140->109|141->110|141->110|141->110|148->125|150->127|175->152|175->152|175->152|197->174|197->174|199->176|204->192|206->194|209->197|209->197|209->197|210->198|210->198|210->198|211->199|211->199|211->199|212->200|212->200|212->200|214->202|214->202|214->202|218->206|218->206|218->206|219->207|219->207|219->207|222->210|222->210|222->210|223->211|223->211|223->211|224->212|224->212|224->212|227->215|227->215|227->215|228->216|228->216|228->216|231->219|231->219|231->219|232->220|232->220|232->220|233->221|233->221|233->221|241->229|241->229|242->230
                  -- GENERATED --
              */
          
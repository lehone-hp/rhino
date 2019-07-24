
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
        <title>Green Home Admin - """),_display_(/*5.36*/title),format.raw/*5.41*/(""" """),format.raw/*5.42*/("""</title>
        <meta name="description" content="Green Home - Admin">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href=""""),_display_(/*9.45*/routes/*9.51*/.Assets.versioned("images/favicon.png")),format.raw/*9.90*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">

        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("css/normalize.css")),format.raw/*12.83*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*13.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*14.90*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/themify-icons.css")),format.raw/*15.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/pe-icon-7-filled.css")),format.raw/*16.90*/("""">


        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.versioned("weather/css/weather-icons.css")),format.raw/*19.78*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("calendar/fullcalendar.css")),format.raw/*20.74*/("""" rel="stylesheet" />

        <link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("owlcarousel/owl.theme.default.min.css")),format.raw/*22.103*/("""">
        <link rel="stylesheet" href=""""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("owlcarousel/owl.carousel.min.css")),format.raw/*23.98*/("""">

        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("css/style.css")),format.raw/*25.79*/("""">
        <link href=""""),_display_(/*26.22*/routes/*26.28*/.Assets.versioned("css/charts/chartist.min.css")),format.raw/*26.76*/("""" rel="stylesheet">
        <link href=""""),_display_(/*27.22*/routes/*27.28*/.Assets.versioned("css/lib/vector-map/jqvmap.min.css")),format.raw/*27.82*/("""" rel="stylesheet">


        """),_display_(/*30.10*/headerStyle),format.raw/*30.21*/("""

    """),format.raw/*32.5*/("""</head>
    <body>
            <!-- Left Panel -->
        <aside id="left-panel" class="left-panel">
            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">

                        <li class="menu-title">Dashboard</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*42.30*/if(requestHeader.uri == routes.AdminController.getDashboard().toString)/*42.101*/ {_display_(Seq[Any](format.raw/*42.103*/("""
                            """),format.raw/*43.29*/("""class="active"""")))}),format.raw/*43.44*/(""">
                            <a href=""""),_display_(/*44.39*/routes/*44.45*/.AdminController.getDashboard()),format.raw/*44.76*/(""""><i class="menu-icon fa fa-tachometer"></i>
                                Dashboard </a>
                        </li>

                        <li class="menu-title">Properties</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*50.30*/if(requestHeader.uri == routes.PropertyController.getAllProperties().toString)/*50.108*/ {_display_(Seq[Any](format.raw/*50.110*/("""
                            """),format.raw/*51.29*/("""class="active"""")))}),format.raw/*51.44*/(""">
                            <a href=""""),_display_(/*52.39*/routes/*52.45*/.PropertyController.getAllProperties()),format.raw/*52.83*/(""""> <i class="menu-icon fa fa-home"></i>
                                All Properties </a>
                        </li>

                        """),_display_(/*56.26*/if(AuthController.getUser.role == User.Role.USER)/*56.75*/ {_display_(Seq[Any](format.raw/*56.77*/("""
                            """),format.raw/*57.29*/("""<li """),_display_(/*57.34*/if(requestHeader.uri == routes.PropertyController.getUpload().toString)/*57.105*/ {_display_(Seq[Any](format.raw/*57.107*/("""
                                """),format.raw/*58.33*/("""class="active"""")))}),format.raw/*58.48*/(""">
                                <a href=""""),_display_(/*59.43*/routes/*59.49*/.PropertyController.getUpload()),format.raw/*59.80*/("""">
                                    <i class="menu-icon fa fa-upload"></i>Upload New </a>
                            </li>
                            <li """),_display_(/*62.34*/if(requestHeader.uri == routes.PropertyContactController.getPropertyContacts().toString)/*62.122*/ {_display_(Seq[Any](format.raw/*62.124*/("""
                                """),format.raw/*63.33*/("""class="active"""")))}),format.raw/*63.48*/(""">
                                <a href=""""),_display_(/*64.43*/routes/*64.49*/.PropertyContactController.getPropertyContacts()),format.raw/*64.97*/("""">
                                    <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">
                                    1</span></a>
                            </li>
                        """)))}),format.raw/*68.26*/("""

                        """),_display_(/*70.26*/if(AuthController.getUser.role == User.Role.ADMIN)/*70.76*/ {_display_(Seq[Any](format.raw/*70.78*/("""
                            """),format.raw/*71.29*/("""<li """),_display_(/*71.34*/if(requestHeader.uri == routes.PropertyController.getPropertyTypes().toString)/*71.112*/ {_display_(Seq[Any](format.raw/*71.114*/("""
                                """),format.raw/*72.33*/("""class="active"""")))}),format.raw/*72.48*/(""">
                                <a href=""""),_display_(/*73.43*/routes/*73.49*/.PropertyController.getPropertyTypes()),format.raw/*73.87*/(""""> <i class="menu-icon fa fa-cogs"></i>
                                    Property Type </a>
                            </li>
                            <li """),_display_(/*76.34*/if(requestHeader.uri == routes.ContactController.getContacts().toString)/*76.106*/ {_display_(Seq[Any](format.raw/*76.108*/("""
                                """),format.raw/*77.33*/("""class="active"""")))}),format.raw/*77.48*/(""">
                                <a href=""""),_display_(/*78.43*/routes/*78.49*/.ContactController.getContacts()),format.raw/*78.81*/("""">
                                    <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">
                                    12</span></a>
                            </li>
                        """)))}),format.raw/*82.26*/("""


                        """),_display_(/*85.26*/if(AuthController.getUser.role == User.Role.ADMIN)/*85.76*/ {_display_(Seq[Any](format.raw/*85.78*/("""
                            """),format.raw/*86.29*/("""<li class="menu-title">Manage</li>
                                <!-- /.menu-title -->
                            <li """),_display_(/*88.34*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*88.101*/ {_display_(Seq[Any](format.raw/*88.103*/("""
                                """),format.raw/*89.33*/("""class="active"""")))}),format.raw/*89.48*/(""">
                                <a href=""""),_display_(/*90.43*/routes/*90.49*/.UserController.getOwners()),format.raw/*90.76*/("""">
                                    <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                            </li>
                            <li class="menu-item-has-children dropdown
                                    """),_display_(/*94.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*94.110*/ {_display_(Seq[Any](format.raw/*94.112*/("""active""")))}),format.raw/*94.119*/("""
                                    """),_display_(/*95.38*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*95.109*/ {_display_(Seq[Any](format.raw/*95.111*/("""active""")))}),format.raw/*95.118*/("""
                                    """),_display_(/*96.38*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*96.113*/ {_display_(Seq[Any](format.raw/*96.115*/("""active""")))}),format.raw/*96.122*/("""">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                    <i class="menu-icon fa fa-map-marker"></i>
                                    Location</a>
                                <ul class="sub-menu children dropdown-menu">
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*103.51*/routes/*103.57*/.LocationController.getRegions()),format.raw/*103.89*/("""">Region</a></li>
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*105.51*/routes/*105.57*/.LocationController.getCities()),format.raw/*105.88*/("""">City</a></li>
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*107.51*/routes/*107.57*/.LocationController.getLocalities()),format.raw/*107.92*/("""">Quarter/Locality</a></li>
                                </ul>
                            </li>
                            <li """),_display_(/*110.34*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*110.109*/ {_display_(Seq[Any](format.raw/*110.111*/("""
                                """),format.raw/*111.33*/("""class="active"""")))}),format.raw/*111.48*/(""">
                                <a href=""""),_display_(/*112.43*/routes/*112.49*/.AmenitiesController.getAmenities()),format.raw/*112.84*/("""">
                                    <i class="menu-icon fa fa-th-list"></i>Amenities/Features </a>
                            </li>
                        """)))}),format.raw/*115.26*/("""

                        """),format.raw/*117.25*/("""<li class="menu-title">Account</li>
                        <li>
                            <a href="#">
                                <i class="menu-icon fa fa-user"></i>Profile </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="menu-icon fa fa-lock"></i>Change Password </a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*127.39*/routes/*127.45*/.AuthController.logout()),format.raw/*127.69*/("""">
                                <i class="menu-icon fa fa-sign-out"></i>Logout </a>
                        </li>

                    </ul>
                </div>
                    <!-- /.navbar-collapse -->
            </nav>
        </aside>
            <!-- /#left-panel -->
            <!-- Left Panel -->


            <!-- Right Panel -->
        <div id="right-panel" class="right-panel">

                <!-- Header-->
            <header id="header" class="header">
                <div class="top-left">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*147.70*/routes/*147.76*/.Assets.versioned("images/logo.png")),format.raw/*147.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*148.77*/routes/*148.83*/.Assets.versioned("images/logo2.png")),format.raw/*148.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        """),_display_(/*154.26*/if(AuthController.getUserRole == User.Role.ADMIN)/*154.75*/ {_display_(Seq[Any](format.raw/*154.77*/("""
                            """),format.raw/*155.29*/("""<div class="header-left mt-3">

                                <div class="dropdown for-notification">
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
                        """)))}),format.raw/*179.26*/("""

                        """),format.raw/*181.25*/("""<div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*183.79*/routes/*183.85*/.Assets.versioned("images/admin.jpg")),format.raw/*183.122*/("""" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>"""),_display_(/*187.89*/AuthController/*187.103*/.getUser.name),format.raw/*187.116*/("""</a>

                                <a class="nav-link" href=""""),_display_(/*189.60*/routes/*189.66*/.AuthController.logout),format.raw/*189.88*/("""">
                                    <i class="fa fa-power-off"></i>Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
                <!-- /header -->
                <!-- Header-->


            <div class="content pb-0">

                """),_display_(/*202.18*/if(flash.containsKey("success"))/*202.50*/ {_display_(Seq[Any](format.raw/*202.52*/("""
                    """),format.raw/*203.21*/("""<div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                        """),_display_(/*204.26*/flash/*204.31*/.get("success")),format.raw/*204.46*/("""
                        """),format.raw/*205.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*209.18*/("""
                """),_display_(/*210.18*/if(flash.containsKey("danger"))/*210.49*/ {_display_(Seq[Any](format.raw/*210.51*/("""
                    """),format.raw/*211.21*/("""<div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                        """),_display_(/*212.26*/flash/*212.31*/.get("danger")),format.raw/*212.45*/("""
                        """),format.raw/*213.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*217.18*/("""
                """),_display_(/*218.18*/if(flash.containsKey("info"))/*218.47*/ {_display_(Seq[Any](format.raw/*218.49*/("""
                    """),format.raw/*219.21*/("""<div class="sufee-alert alert with-close alert-info alert-dismissible fade show">
                        """),_display_(/*220.26*/flash/*220.31*/.get("info")),format.raw/*220.43*/("""
                        """),format.raw/*221.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*225.18*/("""

                """),_display_(/*227.18*/content),format.raw/*227.25*/("""

            """),format.raw/*229.13*/("""</div>
                <!-- .content -->


            <div class="clearfix"></div>
            """),format.raw/*245.24*/("""

        """),format.raw/*247.9*/("""</div>
            <!-- /#right-panel -->


        <script src=""""),_display_(/*251.23*/routes/*251.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*251.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*252.23*/routes/*252.29*/.Assets.versioned("js/popper.min.js")),format.raw/*252.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*253.23*/routes/*253.29*/.Assets.versioned("js/plugins.js")),format.raw/*253.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*254.23*/routes/*254.29*/.Assets.versioned("owlcarousel/owl.carousel.min.js")),format.raw/*254.81*/(""""></script>
        <script src=""""),_display_(/*255.23*/routes/*255.29*/.Assets.versioned("js/main.js")),format.raw/*255.60*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*257.23*/routes/*257.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*257.81*/("""" type="text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*261.23*/routes/*261.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*261.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*262.23*/routes/*262.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*262.91*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*265.23*/routes/*265.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*265.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*266.23*/routes/*266.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*266.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*267.23*/routes/*267.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*267.89*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*270.23*/routes/*270.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*270.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*271.23*/routes/*271.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*271.76*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*274.23*/routes/*274.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*274.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*275.23*/routes/*275.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*275.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*276.23*/routes/*276.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*276.79*/("""" type="text/javascript"></script>

        """),_display_(/*278.10*/footerScript),format.raw/*278.22*/("""
    """),format.raw/*279.5*/("""</body>
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
                  DATE: Fri Jul 12 06:32:04 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: aa32a2b1dd882f7802909a1a5e601417b8ffebfd
                  MATRIX: 968->1|1131->71|1158->72|1237->125|1262->130|1290->131|1510->325|1524->331|1583->370|1671->431|1686->437|1747->476|1816->518|1831->524|1890->562|1958->603|1973->609|2036->651|2104->692|2119->698|2185->743|2253->784|2268->790|2331->832|2399->873|2414->879|2480->924|2533->950|2548->956|2619->1006|2689->1049|2704->1055|2771->1101|2859->1162|2874->1168|2954->1226|3022->1267|3037->1273|3111->1326|3180->1368|3195->1374|3250->1408|3301->1432|3316->1438|3385->1486|3453->1527|3468->1533|3543->1587|3601->1618|3633->1629|3666->1635|4130->2072|4211->2143|4252->2145|4309->2174|4355->2189|4422->2229|4437->2235|4489->2266|4781->2531|4869->2609|4910->2611|4967->2640|5013->2655|5080->2695|5095->2701|5154->2739|5329->2887|5387->2936|5427->2938|5484->2967|5516->2972|5597->3043|5638->3045|5699->3078|5745->3093|5816->3137|5831->3143|5883->3174|6070->3334|6168->3422|6209->3424|6270->3457|6316->3472|6387->3516|6402->3522|6471->3570|6732->3800|6786->3827|6845->3877|6885->3879|6942->3908|6974->3913|7062->3991|7103->3993|7164->4026|7210->4041|7281->4085|7296->4091|7355->4129|7544->4291|7626->4363|7667->4365|7728->4398|7774->4413|7845->4457|7860->4463|7913->4495|8175->4726|8230->4754|8289->4804|8329->4806|8386->4835|8535->4957|8612->5024|8653->5026|8714->5059|8760->5074|8831->5118|8846->5124|8894->5151|9163->5393|9245->5465|9286->5467|9325->5474|9390->5512|9471->5583|9512->5585|9551->5592|9616->5630|9701->5705|9742->5707|9781->5714|10317->6222|10333->6228|10387->6260|10566->6411|10582->6417|10635->6448|10812->6597|10828->6603|10885->6638|11046->6771|11132->6846|11174->6848|11236->6881|11283->6896|11355->6940|11371->6946|11428->6981|11621->7142|11676->7168|12177->7641|12193->7647|12239->7671|12905->8309|12921->8315|12980->8351|13102->8445|13118->8451|13178->8488|13478->8760|13537->8809|13578->8811|13636->8840|15279->10451|15334->10477|15623->10738|15639->10744|15699->10781|15936->10990|15961->11004|15997->11017|16090->11082|16106->11088|16150->11110|16520->11452|16562->11484|16603->11486|16653->11507|16791->11617|16806->11622|16843->11637|16897->11662|17146->11879|17192->11897|17233->11928|17274->11930|17324->11951|17461->12060|17476->12065|17512->12079|17566->12104|17815->12321|17861->12339|17900->12368|17941->12370|17991->12391|18126->12498|18141->12503|18175->12515|18229->12540|18478->12757|18525->12776|18554->12783|18597->12797|18722->13294|18760->13304|18854->13370|18870->13376|18942->13426|19027->13483|19043->13489|19102->13526|19187->13583|19203->13589|19259->13623|19344->13680|19360->13686|19434->13738|19496->13772|19512->13778|19565->13809|19651->13867|19667->13873|19741->13925|19862->14018|19878->14024|19952->14076|20037->14133|20053->14139|20137->14201|20224->14260|20240->14266|20315->14319|20400->14376|20416->14382|20495->14439|20580->14496|20596->14502|20678->14562|20765->14621|20781->14627|20862->14686|20947->14743|20963->14749|21032->14796|21119->14855|21135->14861|21201->14905|21286->14962|21302->14968|21373->15017|21458->15074|21474->15080|21546->15130|21619->15175|21653->15187|21686->15192
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|63->32|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|90->59|90->59|90->59|93->62|93->62|93->62|94->63|94->63|95->64|95->64|95->64|99->68|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|104->73|104->73|104->73|107->76|107->76|107->76|108->77|108->77|109->78|109->78|109->78|113->82|116->85|116->85|116->85|117->86|119->88|119->88|119->88|120->89|120->89|121->90|121->90|121->90|125->94|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|127->96|134->103|134->103|134->103|136->105|136->105|136->105|138->107|138->107|138->107|141->110|141->110|141->110|142->111|142->111|143->112|143->112|143->112|146->115|148->117|158->127|158->127|158->127|178->147|178->147|178->147|179->148|179->148|179->148|185->154|185->154|185->154|186->155|210->179|212->181|214->183|214->183|214->183|218->187|218->187|218->187|220->189|220->189|220->189|233->202|233->202|233->202|234->203|235->204|235->204|235->204|236->205|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|244->213|248->217|249->218|249->218|249->218|250->219|251->220|251->220|251->220|252->221|256->225|258->227|258->227|260->229|265->245|267->247|271->251|271->251|271->251|272->252|272->252|272->252|273->253|273->253|273->253|274->254|274->254|274->254|275->255|275->255|275->255|277->257|277->257|277->257|281->261|281->261|281->261|282->262|282->262|282->262|285->265|285->265|285->265|286->266|286->266|286->266|287->267|287->267|287->267|290->270|290->270|290->270|291->271|291->271|291->271|294->274|294->274|294->274|295->275|295->275|295->275|296->276|296->276|296->276|298->278|298->278|299->279
                  -- GENERATED --
              */
          
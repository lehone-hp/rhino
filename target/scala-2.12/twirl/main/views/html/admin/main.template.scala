
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
        <title>Red Rhino Admin - """),_display_(/*5.35*/title),format.raw/*5.40*/(""" """),format.raw/*5.41*/("""</title>
        <meta name="description" content="Red Rhino - Admin">
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
                        """)))}),format.raw/*76.26*/("""


                        """),_display_(/*79.26*/if(AuthController.getUser.role == User.Role.ADMIN)/*79.76*/ {_display_(Seq[Any](format.raw/*79.78*/("""
                            """),format.raw/*80.29*/("""<li class="menu-title">Manage</li>
                                <!-- /.menu-title -->
                            <li """),_display_(/*82.34*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*82.101*/ {_display_(Seq[Any](format.raw/*82.103*/("""
                                """),format.raw/*83.33*/("""class="active"""")))}),format.raw/*83.48*/(""">
                                <a href=""""),_display_(/*84.43*/routes/*84.49*/.UserController.getOwners()),format.raw/*84.76*/("""">
                                    <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                            </li>
                            <li class="menu-item-has-children dropdown
                                    """),_display_(/*88.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*88.110*/ {_display_(Seq[Any](format.raw/*88.112*/("""active""")))}),format.raw/*88.119*/("""
                                """),_display_(/*89.34*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*89.105*/ {_display_(Seq[Any](format.raw/*89.107*/("""active""")))}),format.raw/*89.114*/("""
                                """),_display_(/*90.34*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*90.109*/ {_display_(Seq[Any](format.raw/*90.111*/("""active""")))}),format.raw/*90.118*/("""">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                    <i class="menu-icon fa fa-map-marker"></i>
                                    Location</a>
                                <ul class="sub-menu children dropdown-menu">
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*97.51*/routes/*97.57*/.LocationController.getRegions()),format.raw/*97.89*/("""">Region</a></li>
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*99.51*/routes/*99.57*/.LocationController.getCities()),format.raw/*99.88*/("""">City</a></li>
                                    <li><i class="menu-icon fa fa-map-marker"></i>
                                        <a href=""""),_display_(/*101.51*/routes/*101.57*/.LocationController.getLocalities()),format.raw/*101.92*/("""">Quarter/Locality</a></li>
                                </ul>
                            </li>
                            <li """),_display_(/*104.34*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*104.109*/ {_display_(Seq[Any](format.raw/*104.111*/("""
                                """),format.raw/*105.33*/("""class="active"""")))}),format.raw/*105.48*/(""">
                                <a href=""""),_display_(/*106.43*/routes/*106.49*/.AmenitiesController.getAmenities()),format.raw/*106.84*/("""">
                                    <i class="menu-icon fa fa-th-list"></i>Amenities/Features </a>
                            </li>
                        """)))}),format.raw/*109.26*/("""

                        """),format.raw/*111.25*/("""<li class="menu-title">Account</li>
                        <li>
                            <a href="#">
                                <i class="menu-icon fa fa-user"></i>Profile </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="menu-icon fa fa-lock"></i>Change Password </a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*121.39*/routes/*121.45*/.AuthController.logout()),format.raw/*121.69*/("""">
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*141.70*/routes/*141.76*/.Assets.versioned("images/logo.png")),format.raw/*141.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*142.77*/routes/*142.83*/.Assets.versioned("images/logo2.png")),format.raw/*142.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left mt-3">

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

                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*175.79*/routes/*175.85*/.Assets.versioned("images/admin.jpg")),format.raw/*175.122*/("""" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>My Profile</a>

                                <a class="nav-link" href=""""),_display_(/*181.60*/routes/*181.66*/.AuthController.logout),format.raw/*181.88*/("""">
                                    <i class="fa fa-power-off"></i>Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
                <!-- /header -->
                <!-- Header-->


            <div class="content pb-0">

                """),_display_(/*194.18*/if(flash.containsKey("success"))/*194.50*/ {_display_(Seq[Any](format.raw/*194.52*/("""
                    """),format.raw/*195.21*/("""<div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                        """),_display_(/*196.26*/flash/*196.31*/.get("success")),format.raw/*196.46*/("""
                        """),format.raw/*197.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*201.18*/("""
                """),_display_(/*202.18*/if(flash.containsKey("danger"))/*202.49*/ {_display_(Seq[Any](format.raw/*202.51*/("""
                    """),format.raw/*203.21*/("""<div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                        """),_display_(/*204.26*/flash/*204.31*/.get("danger")),format.raw/*204.45*/("""
                        """),format.raw/*205.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*209.18*/("""
                """),_display_(/*210.18*/if(flash.containsKey("info"))/*210.47*/ {_display_(Seq[Any](format.raw/*210.49*/("""
                    """),format.raw/*211.21*/("""<div class="sufee-alert alert with-close alert-info alert-dismissible fade show">
                        """),_display_(/*212.26*/flash/*212.31*/.get("info")),format.raw/*212.43*/("""
                        """),format.raw/*213.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*217.18*/("""

                """),_display_(/*219.18*/content),format.raw/*219.25*/("""

            """),format.raw/*221.13*/("""</div>
                <!-- .content -->


            <div class="clearfix"></div>
            """),format.raw/*237.24*/("""

        """),format.raw/*239.9*/("""</div>
            <!-- /#right-panel -->


        <script src=""""),_display_(/*243.23*/routes/*243.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*243.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*244.23*/routes/*244.29*/.Assets.versioned("js/popper.min.js")),format.raw/*244.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*245.23*/routes/*245.29*/.Assets.versioned("js/plugins.js")),format.raw/*245.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*246.23*/routes/*246.29*/.Assets.versioned("owlcarousel/owl.carousel.min.js")),format.raw/*246.81*/(""""></script>
        <script src=""""),_display_(/*247.23*/routes/*247.29*/.Assets.versioned("js/main.js")),format.raw/*247.60*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*249.23*/routes/*249.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*249.81*/("""" type="text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*253.23*/routes/*253.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*253.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*254.23*/routes/*254.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*254.91*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*257.23*/routes/*257.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*257.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*258.23*/routes/*258.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*258.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*259.23*/routes/*259.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*259.89*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*262.23*/routes/*262.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*262.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*263.23*/routes/*263.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*263.76*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*266.23*/routes/*266.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*266.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*267.23*/routes/*267.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*267.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*268.23*/routes/*268.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*268.79*/("""" type="text/javascript"></script>

        """),_display_(/*270.10*/footerScript),format.raw/*270.22*/("""
    """),format.raw/*271.5*/("""</body>
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
                  DATE: Tue Jul 09 15:04:39 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: 730036cf95247a051d2a61668f63afafdd26467f
                  MATRIX: 968->1|1131->71|1158->72|1236->124|1261->129|1289->130|1508->323|1522->329|1581->368|1669->429|1684->435|1745->474|1814->516|1829->522|1888->560|1956->601|1971->607|2034->649|2102->690|2117->696|2183->741|2251->782|2266->788|2329->830|2397->871|2412->877|2478->922|2531->948|2546->954|2617->1004|2687->1047|2702->1053|2769->1099|2857->1160|2872->1166|2952->1224|3020->1265|3035->1271|3109->1324|3178->1366|3193->1372|3248->1406|3299->1430|3314->1436|3383->1484|3451->1525|3466->1531|3541->1585|3599->1616|3631->1627|3664->1633|4128->2070|4209->2141|4250->2143|4307->2172|4353->2187|4420->2227|4435->2233|4487->2264|4779->2529|4867->2607|4908->2609|4965->2638|5011->2653|5078->2693|5093->2699|5152->2737|5327->2885|5385->2934|5425->2936|5482->2965|5514->2970|5595->3041|5636->3043|5697->3076|5743->3091|5814->3135|5829->3141|5881->3172|6068->3332|6166->3420|6207->3422|6268->3455|6314->3470|6385->3514|6400->3520|6469->3568|6730->3798|6784->3825|6843->3875|6883->3877|6940->3906|6972->3911|7060->3989|7101->3991|7162->4024|7208->4039|7279->4083|7294->4089|7353->4127|7538->4281|7593->4309|7652->4359|7692->4361|7749->4390|7898->4512|7975->4579|8016->4581|8077->4614|8123->4629|8194->4673|8209->4679|8257->4706|8526->4948|8608->5020|8649->5022|8688->5029|8749->5063|8830->5134|8871->5136|8910->5143|8971->5177|9056->5252|9097->5254|9136->5261|9671->5769|9686->5775|9739->5807|9917->5958|9932->5964|9984->5995|10161->6144|10177->6150|10234->6185|10395->6318|10481->6393|10523->6395|10585->6428|10632->6443|10704->6487|10720->6493|10777->6528|10970->6689|11025->6715|11526->7188|11542->7194|11588->7218|12254->7856|12270->7862|12329->7898|12451->7992|12467->7998|12527->8035|14526->10006|14542->10012|14602->10049|14913->10332|14929->10338|14973->10360|15343->10702|15385->10734|15426->10736|15476->10757|15614->10867|15629->10872|15666->10887|15720->10912|15969->11129|16015->11147|16056->11178|16097->11180|16147->11201|16284->11310|16299->11315|16335->11329|16389->11354|16638->11571|16684->11589|16723->11618|16764->11620|16814->11641|16949->11748|16964->11753|16998->11765|17052->11790|17301->12007|17348->12026|17377->12033|17420->12047|17545->12543|17583->12553|17677->12619|17693->12625|17765->12675|17850->12732|17866->12738|17925->12775|18010->12832|18026->12838|18082->12872|18167->12929|18183->12935|18257->12987|18319->13021|18335->13027|18388->13058|18474->13116|18490->13122|18564->13174|18685->13267|18701->13273|18775->13325|18860->13382|18876->13388|18960->13450|19047->13509|19063->13515|19138->13568|19223->13625|19239->13631|19318->13688|19403->13745|19419->13751|19501->13811|19588->13870|19604->13876|19685->13935|19770->13992|19786->13998|19855->14045|19942->14104|19958->14110|20024->14154|20109->14211|20125->14217|20196->14266|20281->14323|20297->14329|20369->14379|20442->14424|20476->14436|20509->14441
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|63->32|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|90->59|90->59|90->59|93->62|93->62|93->62|94->63|94->63|95->64|95->64|95->64|99->68|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|104->73|104->73|104->73|107->76|110->79|110->79|110->79|111->80|113->82|113->82|113->82|114->83|114->83|115->84|115->84|115->84|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|128->97|128->97|128->97|130->99|130->99|130->99|132->101|132->101|132->101|135->104|135->104|135->104|136->105|136->105|137->106|137->106|137->106|140->109|142->111|152->121|152->121|152->121|172->141|172->141|172->141|173->142|173->142|173->142|206->175|206->175|206->175|212->181|212->181|212->181|225->194|225->194|225->194|226->195|227->196|227->196|227->196|228->197|232->201|233->202|233->202|233->202|234->203|235->204|235->204|235->204|236->205|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|244->213|248->217|250->219|250->219|252->221|257->237|259->239|263->243|263->243|263->243|264->244|264->244|264->244|265->245|265->245|265->245|266->246|266->246|266->246|267->247|267->247|267->247|269->249|269->249|269->249|273->253|273->253|273->253|274->254|274->254|274->254|277->257|277->257|277->257|278->258|278->258|278->258|279->259|279->259|279->259|282->262|282->262|282->262|283->263|283->263|283->263|286->266|286->266|286->266|287->267|287->267|287->267|288->268|288->268|288->268|290->270|290->270|291->271
                  -- GENERATED --
              */
          
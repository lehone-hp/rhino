
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
        <title>Green House Admin - """),_display_(/*5.37*/title),format.raw/*5.42*/(""" """),format.raw/*5.43*/("""</title>
        <meta name="description" content="Green House - Admin">
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
                  DATE: Thu Jul 11 11:05:28 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: f54ca517c3e3c78697ac278a96853aeca4d3d4e2
                  MATRIX: 968->1|1131->71|1158->72|1238->126|1263->131|1291->132|1512->327|1526->333|1585->372|1673->433|1688->439|1749->478|1818->520|1833->526|1892->564|1960->605|1975->611|2038->653|2106->694|2121->700|2187->745|2255->786|2270->792|2333->834|2401->875|2416->881|2482->926|2535->952|2550->958|2621->1008|2691->1051|2706->1057|2773->1103|2861->1164|2876->1170|2956->1228|3024->1269|3039->1275|3113->1328|3182->1370|3197->1376|3252->1410|3303->1434|3318->1440|3387->1488|3455->1529|3470->1535|3545->1589|3603->1620|3635->1631|3668->1637|4132->2074|4213->2145|4254->2147|4311->2176|4357->2191|4424->2231|4439->2237|4491->2268|4783->2533|4871->2611|4912->2613|4969->2642|5015->2657|5082->2697|5097->2703|5156->2741|5331->2889|5389->2938|5429->2940|5486->2969|5518->2974|5599->3045|5640->3047|5701->3080|5747->3095|5818->3139|5833->3145|5885->3176|6072->3336|6170->3424|6211->3426|6272->3459|6318->3474|6389->3518|6404->3524|6473->3572|6734->3802|6788->3829|6847->3879|6887->3881|6944->3910|6976->3915|7064->3993|7105->3995|7166->4028|7212->4043|7283->4087|7298->4093|7357->4131|7542->4285|7597->4313|7656->4363|7696->4365|7753->4394|7902->4516|7979->4583|8020->4585|8081->4618|8127->4633|8198->4677|8213->4683|8261->4710|8530->4952|8612->5024|8653->5026|8692->5033|8753->5067|8834->5138|8875->5140|8914->5147|8975->5181|9060->5256|9101->5258|9140->5265|9675->5773|9690->5779|9743->5811|9921->5962|9936->5968|9988->5999|10165->6148|10181->6154|10238->6189|10399->6322|10485->6397|10527->6399|10589->6432|10636->6447|10708->6491|10724->6497|10781->6532|10974->6693|11029->6719|11530->7192|11546->7198|11592->7222|12258->7860|12274->7866|12333->7902|12455->7996|12471->8002|12531->8039|14530->10010|14546->10016|14606->10053|14917->10336|14933->10342|14977->10364|15347->10706|15389->10738|15430->10740|15480->10761|15618->10871|15633->10876|15670->10891|15724->10916|15973->11133|16019->11151|16060->11182|16101->11184|16151->11205|16288->11314|16303->11319|16339->11333|16393->11358|16642->11575|16688->11593|16727->11622|16768->11624|16818->11645|16953->11752|16968->11757|17002->11769|17056->11794|17305->12011|17352->12030|17381->12037|17424->12051|17549->12549|17587->12559|17681->12625|17697->12631|17769->12681|17854->12738|17870->12744|17929->12781|18014->12838|18030->12844|18086->12878|18171->12935|18187->12941|18261->12993|18323->13027|18339->13033|18392->13064|18478->13122|18494->13128|18568->13180|18689->13273|18705->13279|18779->13331|18864->13388|18880->13394|18964->13456|19051->13515|19067->13521|19142->13574|19227->13631|19243->13637|19322->13694|19407->13751|19423->13757|19505->13817|19592->13876|19608->13882|19689->13941|19774->13998|19790->14004|19859->14051|19946->14110|19962->14116|20028->14160|20113->14217|20129->14223|20200->14272|20285->14329|20301->14335|20373->14385|20446->14430|20480->14442|20513->14447
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|63->32|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|89->58|90->59|90->59|90->59|93->62|93->62|93->62|94->63|94->63|95->64|95->64|95->64|99->68|101->70|101->70|101->70|102->71|102->71|102->71|102->71|103->72|103->72|104->73|104->73|104->73|107->76|110->79|110->79|110->79|111->80|113->82|113->82|113->82|114->83|114->83|115->84|115->84|115->84|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|128->97|128->97|128->97|130->99|130->99|130->99|132->101|132->101|132->101|135->104|135->104|135->104|136->105|136->105|137->106|137->106|137->106|140->109|142->111|152->121|152->121|152->121|172->141|172->141|172->141|173->142|173->142|173->142|206->175|206->175|206->175|212->181|212->181|212->181|225->194|225->194|225->194|226->195|227->196|227->196|227->196|228->197|232->201|233->202|233->202|233->202|234->203|235->204|235->204|235->204|236->205|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|244->213|248->217|250->219|250->219|252->221|257->237|259->239|263->243|263->243|263->243|264->244|264->244|264->244|265->245|265->245|265->245|266->246|266->246|266->246|267->247|267->247|267->247|269->249|269->249|269->249|273->253|273->253|273->253|274->254|274->254|274->254|277->257|277->257|277->257|278->258|278->258|278->258|279->259|279->259|279->259|282->262|282->262|282->262|283->263|283->263|283->263|286->266|286->266|286->266|287->267|287->267|287->267|288->268|288->268|288->268|290->270|290->270|291->271
                  -- GENERATED --
              */
          
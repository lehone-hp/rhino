
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
                        <li class="active">
                            <a href=""""),_display_(/*41.39*/routes/*41.45*/.AdminController.getDashboard()),format.raw/*41.76*/(""""><i class="menu-icon fa fa-tachometer"></i>Dashboard </a>
                        </li>

                        <li class="menu-title">Properties</li><!-- /.menu-title -->
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-home"></i>All Properties </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-upload"></i>Upload New </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-envelope"></i>Contacts </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-cogs"></i>Property Type </a>
                        </li>


                        <li class="menu-title">Manage</li><!-- /.menu-title -->
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-users"></i>Users </a>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                                <i class="menu-icon fa fa-map-marker"></i>
                                Location</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-marker"></i><a href="#">Region</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i><a href="#">City</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i><a href="#">Quarter/Locality</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href=""""),_display_(/*75.39*/routes/*75.45*/.AmenitiesController.getAmenities()),format.raw/*75.80*/("""">
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*104.70*/routes/*104.76*/.Assets.versioned("images/logo.png")),format.raw/*104.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*105.77*/routes/*105.83*/.Assets.versioned("images/logo2.png")),format.raw/*105.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*120.31*/("""

                            """),format.raw/*122.29*/("""<div class="dropdown for-notification">
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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*147.79*/routes/*147.85*/.Assets.versioned("images/admin.jpg")),format.raw/*147.122*/("""" alt="User Avatar">
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

            """),_display_(/*169.14*/content),format.raw/*169.21*/("""

            """),format.raw/*171.13*/("""</div> <!-- .content -->


            <div class="clearfix"></div>

            <footer class="site-footer">
                <div class="footer-inner bg-white">
                    <div class="row">
                        <div class="col-sm-6">
                            Copyright &copy; 2019 RedRhino
                        </div>
                        <div class="col-sm-6 text-right">
                            Designed by <a href="https://colorlib.com">Colorlib</a>
                        </div>
                    </div>
                </div>
            </footer>

        </div><!-- /#right-panel -->


        <script src=""""),_display_(/*192.23*/routes/*192.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*192.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*193.23*/routes/*193.29*/.Assets.versioned("js/popper.min.js")),format.raw/*193.66*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*194.23*/routes/*194.29*/.Assets.versioned("js/plugins.js")),format.raw/*194.63*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.versioned("js/main.js")),format.raw/*195.60*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>

        <script src=""""),_display_(/*197.23*/routes/*197.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*197.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*201.23*/routes/*201.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*201.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*202.23*/routes/*202.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*202.91*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*205.23*/routes/*205.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*205.82*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*206.23*/routes/*206.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*206.86*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*207.23*/routes/*207.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*207.89*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*210.88*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*211.23*/routes/*211.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*211.76*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*214.23*/routes/*214.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*214.73*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*215.23*/routes/*215.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*215.78*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*216.23*/routes/*216.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*216.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <div id="container">
        </div>

        <script src="https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="ff61747dd8d7db758f2acf61-|49" defer=""></script>

        """),_display_(/*224.10*/footerScript),format.raw/*224.22*/("""
    """),format.raw/*225.5*/("""</body>
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
                  DATE: Tue May 14 07:44:00 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: ea3bc7f06d0a77d9e0ef141914454f391d61227a
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|3928->1982|3943->1988|3995->2019|5927->3924|5942->3930|5998->3965|7171->5110|7187->5116|7246->5152|7368->5246|7384->5252|7444->5289|7798->6178|7857->6208|9609->7932|9625->7938|9685->7975|10551->8813|10580->8820|10623->8834|11295->9478|11311->9484|11383->9534|11493->9616|11509->9622|11568->9659|11678->9741|11694->9747|11750->9781|11860->9863|11876->9869|11929->9900|12040->9983|12056->9989|12130->10041|12276->10159|12292->10165|12366->10217|12476->10299|12492->10305|12576->10367|12688->10451|12704->10457|12779->10510|12889->10592|12905->10598|12984->10655|13094->10737|13110->10743|13192->10803|13304->10887|13320->10893|13401->10952|13511->11034|13527->11040|13596->11087|13708->11171|13724->11177|13790->11221|13900->11303|13916->11309|13987->11358|14097->11440|14113->11446|14185->11496|14511->11794|14545->11806|14578->11811
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|72->41|72->41|72->41|106->75|106->75|106->75|135->104|135->104|135->104|136->105|136->105|136->105|143->120|145->122|170->147|170->147|170->147|192->169|192->169|194->171|215->192|215->192|215->192|216->193|216->193|216->193|217->194|217->194|217->194|218->195|218->195|218->195|220->197|220->197|220->197|224->201|224->201|224->201|225->202|225->202|225->202|228->205|228->205|228->205|229->206|229->206|229->206|230->207|230->207|230->207|233->210|233->210|233->210|234->211|234->211|234->211|237->214|237->214|237->214|238->215|238->215|238->215|239->216|239->216|239->216|247->224|247->224|248->225
                  -- GENERATED --
              */
          
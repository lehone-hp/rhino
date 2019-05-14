
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
                            <a href="#"><i class="menu-icon fa fa-tachometer"></i>Dashboard </a>
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
                            <a href="#"> <i class="menu-icon fa fa-th-list"></i>Features </a>
                        </li>

                        <li class="menu-title">Authorization</li><!-- /.menu-title -->
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-user-tag"></i>Roles </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon ti-email"></i>Permissions </a>
                        </li>
                        <li>
                            <a href="#"> <i class="menu-icon ti-email"></i>Logout </a>
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*103.70*/routes/*103.76*/.Assets.versioned("images/logo.png")),format.raw/*103.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*104.77*/routes/*104.83*/.Assets.versioned("images/logo2.png")),format.raw/*104.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*119.31*/("""

                            """),format.raw/*121.29*/("""<div class="dropdown for-notification">
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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*146.79*/routes/*146.85*/.Assets.versioned("images/admin.jpg")),format.raw/*146.122*/("""" alt="User Avatar">
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

            """),_display_(/*168.14*/content),format.raw/*168.21*/("""

            """),format.raw/*170.13*/("""</div> <!-- .content -->


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


        <script src=""""),_display_(/*191.23*/routes/*191.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*191.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*192.23*/routes/*192.29*/.Assets.versioned("js/popper.min.js")),format.raw/*192.66*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*193.23*/routes/*193.29*/.Assets.versioned("js/plugins.js")),format.raw/*193.63*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*194.23*/routes/*194.29*/.Assets.versioned("js/main.js")),format.raw/*194.60*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>

        <script src=""""),_display_(/*196.23*/routes/*196.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*196.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*200.23*/routes/*200.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*200.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*201.23*/routes/*201.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*201.91*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*204.23*/routes/*204.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*204.82*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*205.23*/routes/*205.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*205.86*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*206.23*/routes/*206.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*206.89*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*209.23*/routes/*209.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*209.88*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*210.76*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*213.23*/routes/*213.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*213.73*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*214.23*/routes/*214.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*214.78*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*215.23*/routes/*215.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*215.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <div id="container">
        </div>

        <script src="https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="ff61747dd8d7db758f2acf61-|49" defer=""></script>

        """),_display_(/*223.10*/footerScript),format.raw/*223.22*/("""
    """),format.raw/*224.5*/("""</body>
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
                  DATE: Mon May 13 22:34:33 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: cb94f82ea4266fbb4cab39300ed516b129f50670
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|6935->4988|6951->4994|7010->5030|7132->5124|7148->5130|7208->5167|7562->6056|7621->6086|9373->7810|9389->7816|9449->7853|10315->8691|10344->8698|10387->8712|11059->9356|11075->9362|11147->9412|11257->9494|11273->9500|11332->9537|11442->9619|11458->9625|11514->9659|11624->9741|11640->9747|11693->9778|11804->9861|11820->9867|11894->9919|12040->10037|12056->10043|12130->10095|12240->10177|12256->10183|12340->10245|12452->10329|12468->10335|12543->10388|12653->10470|12669->10476|12748->10533|12858->10615|12874->10621|12956->10681|13068->10765|13084->10771|13165->10830|13275->10912|13291->10918|13360->10965|13472->11049|13488->11055|13554->11099|13664->11181|13680->11187|13751->11236|13861->11318|13877->11324|13949->11374|14275->11672|14309->11684|14342->11689
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|134->103|134->103|134->103|135->104|135->104|135->104|142->119|144->121|169->146|169->146|169->146|191->168|191->168|193->170|214->191|214->191|214->191|215->192|215->192|215->192|216->193|216->193|216->193|217->194|217->194|217->194|219->196|219->196|219->196|223->200|223->200|223->200|224->201|224->201|224->201|227->204|227->204|227->204|228->205|228->205|228->205|229->206|229->206|229->206|232->209|232->209|232->209|233->210|233->210|233->210|236->213|236->213|236->213|237->214|237->214|237->214|238->215|238->215|238->215|246->223|246->223|247->224
                  -- GENERATED --
              */
          
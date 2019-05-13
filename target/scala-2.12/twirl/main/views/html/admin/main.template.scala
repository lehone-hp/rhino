
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
                        <li class="active">
                            <a href="index.html"><i class="menu-icon fa fa-laptop"></i>Dashboard </a>
                        </li>
                        <li class="menu-title">UI elements</li><!-- /.menu-title -->
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-cogs"></i>
                                Components</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-puzzle-piece"></i><a href="ui-buttons.html">Buttons</a></li>
                                <li><i class="fa fa-id-badge"></i><a href="ui-badges.html">Badges</a></li>
                                <li><i class="fa fa-bars"></i><a href="ui-tabs.html">Tabs</a></li>

                                <li><i class="fa fa-id-card-o"></i><a href="ui-cards.html">Cards</a></li>
                                <li><i class="fa fa-exclamation-triangle"></i><a href="ui-alerts.html">Alerts</a></li>
                                <li><i class="fa fa-spinner"></i><a href="ui-progressbar.html">Progress Bars</a></li>
                                <li><i class="fa fa-fire"></i><a href="ui-modals.html">Modals</a></li>
                                <li><i class="fa fa-book"></i><a href="ui-switches.html">Switches</a></li>
                                <li><i class="fa fa-th"></i><a href="ui-grids.html">Grids</a></li>
                                <li><i class="fa fa-file-word-o"></i><a href="ui-typgraphy.html">Typography</a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>
                                Tables</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="tables-basic.html">Basic Table</a></li>
                                <li><i class="fa fa-table"></i><a href="tables-data.html">Data Table</a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>
                                Forms</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">Basic Form</a></li>
                                <li><i class="menu-icon fa fa-th"></i><a href="forms-advanced.html">Advanced Form</a></li>
                            </ul>
                        </li>

                        <li class="menu-title">Icons</li><!-- /.menu-title -->

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-tasks"></i>
                                Icons</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-fort-awesome"></i><a href="font-fontawesome.html">
                                    Font Awesome</a></li>
                                <li><i class="menu-icon ti-themify-logo"></i><a href="font-themify.html">Themefy Icons</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="widgets.html"> <i class="menu-icon ti-email"></i>Widgets </a>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-bar-chart"></i>
                                Charts</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-line-chart"></i><a href="charts-chartjs.html">Chart JS</a></li>
                                <li><i class="menu-icon fa fa-area-chart"></i><a href="charts-flot.html">Flot Chart</a></li>
                                <li><i class="menu-icon fa fa-pie-chart"></i><a href="charts-peity.html">Peity Chart</a></li>
                            </ul>
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-map-marker"></i>
                                Maps</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-o"></i><a href="maps-gmap.html">Google Maps</a></li>
                                <li><i class="menu-icon fa fa-street-view"></i><a href="maps-vector.html">Vector Maps</a></li>
                            </ul>
                        </li>
                        <li class="menu-title">Extras</li><!-- /.menu-title -->
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-glass"></i>
                                Pages</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-sign-in"></i><a href="page-login.html">Login</a></li>
                                <li><i class="menu-icon fa fa-sign-in"></i><a href="page-register.html">Register</a></li>
                                <li><i class="menu-icon fa fa-paper-plane"></i><a href="pages-forget.html">Forget Pass</a></li>
                            </ul>
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*133.70*/routes/*133.76*/.Assets.versioned("images/logo.png")),format.raw/*133.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*134.77*/routes/*134.83*/.Assets.versioned("images/logo2.png")),format.raw/*134.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            <button class="search-trigger"><i class="fa fa-search"></i></button>
                            <div class="form-inline">
                                <form class="search-form">
                                    <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                    <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                                </form>
                            </div>

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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*174.79*/routes/*174.85*/.Assets.versioned("images/admin.jpg")),format.raw/*174.122*/("""" alt="User Avatar">
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

                """),_display_(/*196.18*/content),format.raw/*196.25*/("""

            """),format.raw/*198.13*/("""</div> <!-- .content -->


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


        <script src=""""),_display_(/*219.23*/routes/*219.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*219.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*220.23*/routes/*220.29*/.Assets.versioned("js/popper.min.js")),format.raw/*220.66*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*221.23*/routes/*221.29*/.Assets.versioned("js/plugins.js")),format.raw/*221.63*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*222.23*/routes/*222.29*/.Assets.versioned("js/main.js")),format.raw/*222.60*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>

        <script src=""""),_display_(/*224.23*/routes/*224.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*224.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*228.23*/routes/*228.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*228.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*229.23*/routes/*229.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*229.91*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*232.23*/routes/*232.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*232.82*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*233.23*/routes/*233.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*233.86*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*234.23*/routes/*234.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*234.89*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*237.23*/routes/*237.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*237.88*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*238.23*/routes/*238.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*238.76*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*241.23*/routes/*241.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*241.73*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*242.23*/routes/*242.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*242.78*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*243.23*/routes/*243.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*243.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <div id="container">
        </div>

        <script src="https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="ff61747dd8d7db758f2acf61-|49" defer=""></script>

        """),_display_(/*251.10*/footerScript),format.raw/*251.22*/("""
    """),format.raw/*252.5*/("""</body>
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
                  DATE: Mon May 13 16:59:25 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: 1416920cb91c7da50e0cd8e15d9edd4540cb6018
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|10591->8644|10607->8650|10666->8686|10788->8780|10804->8786|10864->8823|13473->11404|13489->11410|13549->11447|14419->12289|14448->12296|14491->12310|15163->12954|15179->12960|15251->13010|15361->13092|15377->13098|15436->13135|15546->13217|15562->13223|15618->13257|15728->13339|15744->13345|15797->13376|15908->13459|15924->13465|15998->13517|16144->13635|16160->13641|16234->13693|16344->13775|16360->13781|16444->13843|16556->13927|16572->13933|16647->13986|16757->14068|16773->14074|16852->14131|16962->14213|16978->14219|17060->14279|17172->14363|17188->14369|17269->14428|17379->14510|17395->14516|17464->14563|17576->14647|17592->14653|17658->14697|17768->14779|17784->14785|17855->14834|17965->14916|17981->14922|18053->14972|18379->15270|18413->15282|18446->15287
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|164->133|164->133|164->133|165->134|165->134|165->134|205->174|205->174|205->174|227->196|227->196|229->198|250->219|250->219|250->219|251->220|251->220|251->220|252->221|252->221|252->221|253->222|253->222|253->222|255->224|255->224|255->224|259->228|259->228|259->228|260->229|260->229|260->229|263->232|263->232|263->232|264->233|264->233|264->233|265->234|265->234|265->234|268->237|268->237|268->237|269->238|269->238|269->238|272->241|272->241|272->241|273->242|273->242|273->242|274->243|274->243|274->243|282->251|282->251|283->252
                  -- GENERATED --
              */
          
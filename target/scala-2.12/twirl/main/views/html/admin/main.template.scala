
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
        <title>Red Rhino Admin - """),_display_(/*7.35*/title),format.raw/*7.40*/(""" """),format.raw/*7.41*/("""</title>
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

                        <li class="menu-title">Dashboard</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*40.30*/if(requestHeader.uri == routes.AdminController.getDashboard().toString)/*40.101*/ {_display_(Seq[Any](format.raw/*40.103*/("""
                            """),format.raw/*41.29*/("""class="active"""")))}),format.raw/*41.44*/(""">
                            <a href=""""),_display_(/*42.39*/routes/*42.45*/.AdminController.getDashboard()),format.raw/*42.76*/(""""><i class="menu-icon fa fa-tachometer"></i>
                                Dashboard </a>
                        </li>

                        <li class="menu-title">Properties</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*48.30*/if(requestHeader.uri == routes.PropertyController.getAllProperties().toString)/*48.108*/ {_display_(Seq[Any](format.raw/*48.110*/("""
                            """),format.raw/*49.29*/("""class="active"""")))}),format.raw/*49.44*/(""">
                            <a href=""""),_display_(/*50.39*/routes/*50.45*/.PropertyController.getAllProperties()),format.raw/*50.83*/(""""> <i class="menu-icon fa fa-home"></i>
                                All Properties </a>
                        </li>
                        <li """),_display_(/*53.30*/if(requestHeader.uri == routes.PropertyController.getUpload().toString)/*53.101*/ {_display_(Seq[Any](format.raw/*53.103*/("""
                            """),format.raw/*54.29*/("""class="active"""")))}),format.raw/*54.44*/(""">
                            <a href=""""),_display_(/*55.39*/routes/*55.45*/.PropertyController.getUpload()),format.raw/*55.76*/("""">
                                <i class="menu-icon fa fa-upload"></i>Upload New </a>
                        </li>
                        <li """),_display_(/*58.30*/if(requestHeader.uri == routes.PropertyContactController.getPropertyContacts().toString)/*58.118*/ {_display_(Seq[Any](format.raw/*58.120*/("""
                            """),format.raw/*59.29*/("""class="active"""")))}),format.raw/*59.44*/(""">
                            <a href=""""),_display_(/*60.39*/routes/*60.45*/.PropertyContactController.getPropertyContacts()),format.raw/*60.93*/("""">
                                <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">1</span></a>
                        </li>
                        <li """),_display_(/*63.30*/if(requestHeader.uri == routes.PropertyController.getPropertyTypes().toString)/*63.108*/ {_display_(Seq[Any](format.raw/*63.110*/("""
                            """),format.raw/*64.29*/("""class="active"""")))}),format.raw/*64.44*/(""">
                            <a href=""""),_display_(/*65.39*/routes/*65.45*/.PropertyController.getPropertyTypes()),format.raw/*65.83*/(""""> <i class="menu-icon fa fa-cogs"></i>
                                Property Type </a>
                        </li>


                        <li class="menu-title">Manage</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*72.30*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*72.97*/ {_display_(Seq[Any](format.raw/*72.99*/("""
                            """),format.raw/*73.29*/("""class="active"""")))}),format.raw/*73.44*/(""">
                            <a href=""""),_display_(/*74.39*/routes/*74.45*/.UserController.getOwners()),format.raw/*74.72*/("""">
                                <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                        </li>
                        <li class="menu-item-has-children dropdown
                                    """),_display_(/*78.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*78.110*/ {_display_(Seq[Any](format.raw/*78.112*/("""active""")))}),format.raw/*78.119*/("""
                            """),_display_(/*79.30*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*79.101*/ {_display_(Seq[Any](format.raw/*79.103*/("""active""")))}),format.raw/*79.110*/("""
                            """),_display_(/*80.30*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*80.105*/ {_display_(Seq[Any](format.raw/*80.107*/("""active""")))}),format.raw/*80.114*/("""">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                                <i class="menu-icon fa fa-map-marker"></i>
                                Location</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*87.47*/routes/*87.53*/.LocationController.getRegions()),format.raw/*87.85*/("""">Region</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*89.47*/routes/*89.53*/.LocationController.getCities()),format.raw/*89.84*/("""">City</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*91.47*/routes/*91.53*/.LocationController.getLocalities()),format.raw/*91.88*/("""">Quarter/Locality</a></li>
                            </ul>
                        </li>
                        <li """),_display_(/*94.30*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*94.105*/ {_display_(Seq[Any](format.raw/*94.107*/("""
                            """),format.raw/*95.29*/("""class="active"""")))}),format.raw/*95.44*/(""">
                            <a href=""""),_display_(/*96.39*/routes/*96.45*/.AmenitiesController.getAmenities()),format.raw/*96.80*/("""">
                                <i class="menu-icon fa fa-th-list"></i>Amenities/Features </a>
                        </li>

                        <li class="menu-title">Authorization</li>
                            <!-- /.menu-title -->
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*128.70*/routes/*128.76*/.Assets.versioned("images/logo.png")),format.raw/*128.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*129.77*/routes/*129.83*/.Assets.versioned("images/logo2.png")),format.raw/*129.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*144.31*/("""

                        """),format.raw/*146.25*/("""<div class="dropdown for-notification">
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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*171.79*/routes/*171.85*/.Assets.versioned("images/admin.jpg")),format.raw/*171.122*/("""" alt="User Avatar">
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
        <script src=""""),_display_(/*246.23*/routes/*246.29*/.Assets.versioned("js/main.js")),format.raw/*246.60*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*248.23*/routes/*248.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*248.81*/("""" type="text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*252.23*/routes/*252.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*252.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*253.23*/routes/*253.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*253.91*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*256.23*/routes/*256.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*256.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*257.23*/routes/*257.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*257.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*258.23*/routes/*258.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*258.89*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*261.23*/routes/*261.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*261.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*262.23*/routes/*262.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*262.76*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*265.23*/routes/*265.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*265.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*266.23*/routes/*266.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*266.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*267.23*/routes/*267.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*267.79*/("""" type="text/javascript"></script>

        """),_display_(/*269.10*/footerScript),format.raw/*269.22*/("""
    """),format.raw/*270.5*/("""</body>
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
                  DATE: Tue Jun 04 10:22:27 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: e99eb75cd8b0c5fc4135b5d045b7ce842a7202a3
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|3902->1956|3983->2027|4024->2029|4081->2058|4127->2073|4194->2113|4209->2119|4261->2150|4553->2415|4641->2493|4682->2495|4739->2524|4785->2539|4852->2579|4867->2585|4926->2623|5104->2774|5185->2845|5226->2847|5283->2876|5329->2891|5396->2931|5411->2937|5463->2968|5638->3116|5736->3204|5777->3206|5834->3235|5880->3250|5947->3290|5962->3296|6031->3344|6247->3533|6335->3611|6376->3613|6433->3642|6479->3657|6546->3697|6561->3703|6620->3741|6908->4002|6984->4069|7024->4071|7081->4100|7127->4115|7194->4155|7209->4161|7257->4188|7514->4418|7596->4490|7637->4492|7676->4499|7733->4529|7814->4600|7855->4602|7894->4609|7951->4639|8036->4714|8077->4716|8116->4723|8623->5203|8638->5209|8691->5241|8861->5384|8876->5390|8928->5421|9096->5562|9111->5568|9167->5603|9315->5724|9400->5799|9441->5801|9498->5830|9544->5845|9611->5885|9626->5891|9682->5926|10926->7142|10942->7148|11001->7184|11123->7278|11139->7284|11199->7321|11553->8186|11608->8212|13280->9856|13296->9862|13356->9899|14247->10762|14289->10794|14330->10796|14380->10817|14518->10927|14533->10932|14570->10947|14624->10972|14873->11189|14919->11207|14960->11238|15001->11240|15051->11261|15188->11370|15203->11375|15239->11389|15293->11414|15542->11631|15588->11649|15627->11678|15668->11680|15718->11701|15853->11808|15868->11813|15902->11825|15956->11850|16205->12067|16252->12086|16281->12093|16324->12107|16449->12603|16487->12613|16581->12679|16597->12685|16669->12735|16754->12792|16770->12798|16829->12835|16914->12892|16930->12898|16986->12932|17071->12989|17087->12995|17140->13026|17226->13084|17242->13090|17316->13142|17437->13235|17453->13241|17527->13293|17612->13350|17628->13356|17712->13418|17799->13477|17815->13483|17890->13536|17975->13593|17991->13599|18070->13656|18155->13713|18171->13719|18253->13779|18340->13838|18356->13844|18437->13903|18522->13960|18538->13966|18607->14013|18694->14072|18710->14078|18776->14122|18861->14179|18877->14185|18948->14234|19033->14291|19049->14297|19121->14347|19194->14392|19228->14404|19261->14409
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|71->40|71->40|71->40|72->41|72->41|73->42|73->42|73->42|79->48|79->48|79->48|80->49|80->49|81->50|81->50|81->50|84->53|84->53|84->53|85->54|85->54|86->55|86->55|86->55|89->58|89->58|89->58|90->59|90->59|91->60|91->60|91->60|94->63|94->63|94->63|95->64|95->64|96->65|96->65|96->65|103->72|103->72|103->72|104->73|104->73|105->74|105->74|105->74|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|118->87|118->87|118->87|120->89|120->89|120->89|122->91|122->91|122->91|125->94|125->94|125->94|126->95|126->95|127->96|127->96|127->96|159->128|159->128|159->128|160->129|160->129|160->129|167->144|169->146|194->171|194->171|194->171|217->194|217->194|217->194|218->195|219->196|219->196|219->196|220->197|224->201|225->202|225->202|225->202|226->203|227->204|227->204|227->204|228->205|232->209|233->210|233->210|233->210|234->211|235->212|235->212|235->212|236->213|240->217|242->219|242->219|244->221|249->237|251->239|255->243|255->243|255->243|256->244|256->244|256->244|257->245|257->245|257->245|258->246|258->246|258->246|260->248|260->248|260->248|264->252|264->252|264->252|265->253|265->253|265->253|268->256|268->256|268->256|269->257|269->257|269->257|270->258|270->258|270->258|273->261|273->261|273->261|274->262|274->262|274->262|277->265|277->265|277->265|278->266|278->266|278->266|279->267|279->267|279->267|281->269|281->269|282->270
                  -- GENERATED --
              */
          
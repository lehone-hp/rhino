
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
                        <li>
                            <a href="#"> <i class="menu-icon fa fa-upload"></i>Upload New </a>
                        </li>
                        <li """),_display_(/*56.30*/if(requestHeader.uri == routes.PropertyContactController.getPropertyContacts().toString)/*56.118*/ {_display_(Seq[Any](format.raw/*56.120*/("""
                            """),format.raw/*57.29*/("""class="active"""")))}),format.raw/*57.44*/(""">
                            <a href=""""),_display_(/*58.39*/routes/*58.45*/.PropertyContactController.getPropertyContacts()),format.raw/*58.93*/("""">
                                <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">1</span></a>
                        </li>
                        <li """),_display_(/*61.30*/if(requestHeader.uri == routes.PropertyController.getPropertyTypes().toString)/*61.108*/ {_display_(Seq[Any](format.raw/*61.110*/("""
                            """),format.raw/*62.29*/("""class="active"""")))}),format.raw/*62.44*/(""">
                            <a href=""""),_display_(/*63.39*/routes/*63.45*/.PropertyController.getPropertyTypes()),format.raw/*63.83*/(""""> <i class="menu-icon fa fa-cogs"></i>
                                Property Type </a>
                        </li>


                        <li class="menu-title">Manage</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*70.30*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*70.97*/ {_display_(Seq[Any](format.raw/*70.99*/("""
                            """),format.raw/*71.29*/("""class="active"""")))}),format.raw/*71.44*/(""">
                            <a href=""""),_display_(/*72.39*/routes/*72.45*/.UserController.getOwners()),format.raw/*72.72*/("""">
                                <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                        </li>
                        <li class="menu-item-has-children dropdown
                                    """),_display_(/*76.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*76.110*/ {_display_(Seq[Any](format.raw/*76.112*/("""active""")))}),format.raw/*76.119*/("""
                            """),_display_(/*77.30*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*77.101*/ {_display_(Seq[Any](format.raw/*77.103*/("""active""")))}),format.raw/*77.110*/("""
                            """),_display_(/*78.30*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*78.105*/ {_display_(Seq[Any](format.raw/*78.107*/("""active""")))}),format.raw/*78.114*/("""">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                                <i class="menu-icon fa fa-map-marker"></i>
                                Location</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*85.47*/routes/*85.53*/.LocationController.getRegions()),format.raw/*85.85*/("""">Region</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*87.47*/routes/*87.53*/.LocationController.getCities()),format.raw/*87.84*/("""">City</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*89.47*/routes/*89.53*/.LocationController.getLocalities()),format.raw/*89.88*/("""">Quarter/Locality</a></li>
                            </ul>
                        </li>
                        <li """),_display_(/*92.30*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*92.105*/ {_display_(Seq[Any](format.raw/*92.107*/("""
                            """),format.raw/*93.29*/("""class="active"""")))}),format.raw/*93.44*/(""">
                            <a href=""""),_display_(/*94.39*/routes/*94.45*/.AmenitiesController.getAmenities()),format.raw/*94.80*/("""">
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*126.70*/routes/*126.76*/.Assets.versioned("images/logo.png")),format.raw/*126.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*127.77*/routes/*127.83*/.Assets.versioned("images/logo2.png")),format.raw/*127.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*142.31*/("""

                        """),format.raw/*144.25*/("""<div class="dropdown for-notification">
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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*169.79*/routes/*169.85*/.Assets.versioned("images/admin.jpg")),format.raw/*169.122*/("""" alt="User Avatar">
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

                """),_display_(/*192.18*/if(flash.containsKey("success"))/*192.50*/ {_display_(Seq[Any](format.raw/*192.52*/("""
                    """),format.raw/*193.21*/("""<div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                        """),_display_(/*194.26*/flash/*194.31*/.get("success")),format.raw/*194.46*/("""
                        """),format.raw/*195.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*199.18*/("""
                """),_display_(/*200.18*/if(flash.containsKey("danger"))/*200.49*/ {_display_(Seq[Any](format.raw/*200.51*/("""
                    """),format.raw/*201.21*/("""<div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                        """),_display_(/*202.26*/flash/*202.31*/.get("danger")),format.raw/*202.45*/("""
                        """),format.raw/*203.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*207.18*/("""
                """),_display_(/*208.18*/if(flash.containsKey("info"))/*208.47*/ {_display_(Seq[Any](format.raw/*208.49*/("""
                    """),format.raw/*209.21*/("""<div class="sufee-alert alert with-close alert-info alert-dismissible fade show">
                        """),_display_(/*210.26*/flash/*210.31*/.get("info")),format.raw/*210.43*/("""
                        """),format.raw/*211.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*215.18*/("""

                """),_display_(/*217.18*/content),format.raw/*217.25*/("""

            """),format.raw/*219.13*/("""</div>
                <!-- .content -->


            <div class="clearfix"></div>
            """),format.raw/*235.24*/("""

        """),format.raw/*237.9*/("""</div>
            <!-- /#right-panel -->


        <script src=""""),_display_(/*241.23*/routes/*241.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*241.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*242.23*/routes/*242.29*/.Assets.versioned("js/popper.min.js")),format.raw/*242.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*243.23*/routes/*243.29*/.Assets.versioned("js/plugins.js")),format.raw/*243.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*244.23*/routes/*244.29*/.Assets.versioned("js/main.js")),format.raw/*244.60*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*246.23*/routes/*246.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*246.81*/("""" type="text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*250.23*/routes/*250.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*250.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*251.23*/routes/*251.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*251.91*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*254.23*/routes/*254.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*254.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*255.23*/routes/*255.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*255.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*256.23*/routes/*256.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*256.89*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*259.23*/routes/*259.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*259.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*260.23*/routes/*260.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*260.76*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*263.23*/routes/*263.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*263.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*264.23*/routes/*264.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*264.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*265.23*/routes/*265.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*265.79*/("""" type="text/javascript"></script>

        """),_display_(/*267.10*/footerScript),format.raw/*267.22*/("""
    """),format.raw/*268.5*/("""</body>
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
                  DATE: Tue May 21 08:37:30 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: fb406af01b0ee4edbb747f6fce2d20805512f677
                  MATRIX: 968->1|1131->71|1158->72|1329->217|1354->222|1382->223|1602->416|1617->422|1677->461|1765->522|1780->528|1841->567|1910->609|1925->615|1984->653|2052->694|2067->700|2130->742|2198->783|2213->789|2279->834|2347->875|2362->881|2425->923|2493->964|2508->970|2574->1015|2627->1041|2642->1047|2713->1097|2783->1140|2798->1146|2865->1192|2953->1253|2968->1259|3023->1293|3074->1317|3089->1323|3158->1371|3226->1412|3241->1418|3316->1472|3373->1502|3405->1513|3438->1519|3902->1956|3983->2027|4024->2029|4081->2058|4127->2073|4194->2113|4209->2119|4261->2150|4553->2415|4641->2493|4682->2495|4739->2524|4785->2539|4852->2579|4867->2585|4926->2623|5258->2928|5356->3016|5397->3018|5454->3047|5500->3062|5567->3102|5582->3108|5651->3156|5867->3345|5955->3423|5996->3425|6053->3454|6099->3469|6166->3509|6181->3515|6240->3553|6528->3814|6604->3881|6644->3883|6701->3912|6747->3927|6814->3967|6829->3973|6877->4000|7134->4230|7216->4302|7257->4304|7296->4311|7353->4341|7434->4412|7475->4414|7514->4421|7571->4451|7656->4526|7697->4528|7736->4535|8243->5015|8258->5021|8311->5053|8481->5196|8496->5202|8548->5233|8716->5374|8731->5380|8787->5415|8935->5536|9020->5611|9061->5613|9118->5642|9164->5657|9231->5697|9246->5703|9302->5738|10546->6954|10562->6960|10621->6996|10743->7090|10759->7096|10819->7133|11173->7998|11228->8024|12900->9668|12916->9674|12976->9711|13867->10574|13909->10606|13950->10608|14000->10629|14138->10739|14153->10744|14190->10759|14244->10784|14493->11001|14539->11019|14580->11050|14621->11052|14671->11073|14808->11182|14823->11187|14859->11201|14913->11226|15162->11443|15208->11461|15247->11490|15288->11492|15338->11513|15473->11620|15488->11625|15522->11637|15576->11662|15825->11879|15872->11898|15901->11905|15944->11919|16069->12415|16107->12425|16201->12491|16217->12497|16289->12547|16374->12604|16390->12610|16449->12647|16534->12704|16550->12710|16606->12744|16691->12801|16707->12807|16760->12838|16846->12896|16862->12902|16936->12954|17057->13047|17073->13053|17147->13105|17232->13162|17248->13168|17332->13230|17419->13289|17435->13295|17510->13348|17595->13405|17611->13411|17690->13468|17775->13525|17791->13531|17873->13591|17960->13650|17976->13656|18057->13715|18142->13772|18158->13778|18227->13825|18314->13884|18330->13890|18396->13934|18481->13991|18497->13997|18568->14046|18653->14103|18669->14109|18741->14159|18814->14204|18848->14216|18881->14221
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|71->40|71->40|71->40|72->41|72->41|73->42|73->42|73->42|79->48|79->48|79->48|80->49|80->49|81->50|81->50|81->50|87->56|87->56|87->56|88->57|88->57|89->58|89->58|89->58|92->61|92->61|92->61|93->62|93->62|94->63|94->63|94->63|101->70|101->70|101->70|102->71|102->71|103->72|103->72|103->72|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|123->92|123->92|123->92|124->93|124->93|125->94|125->94|125->94|157->126|157->126|157->126|158->127|158->127|158->127|165->142|167->144|192->169|192->169|192->169|215->192|215->192|215->192|216->193|217->194|217->194|217->194|218->195|222->199|223->200|223->200|223->200|224->201|225->202|225->202|225->202|226->203|230->207|231->208|231->208|231->208|232->209|233->210|233->210|233->210|234->211|238->215|240->217|240->217|242->219|247->235|249->237|253->241|253->241|253->241|254->242|254->242|254->242|255->243|255->243|255->243|256->244|256->244|256->244|258->246|258->246|258->246|262->250|262->250|262->250|263->251|263->251|263->251|266->254|266->254|266->254|267->255|267->255|267->255|268->256|268->256|268->256|271->259|271->259|271->259|272->260|272->260|272->260|275->263|275->263|275->263|276->264|276->264|276->264|277->265|277->265|277->265|279->267|279->267|280->268
                  -- GENERATED --
              */
          
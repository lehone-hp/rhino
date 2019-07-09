
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
                        <li """),_display_(/*55.30*/if(requestHeader.uri == routes.PropertyController.getUpload().toString)/*55.101*/ {_display_(Seq[Any](format.raw/*55.103*/("""
                            """),format.raw/*56.29*/("""class="active"""")))}),format.raw/*56.44*/(""">
                            <a href=""""),_display_(/*57.39*/routes/*57.45*/.PropertyController.getUpload()),format.raw/*57.76*/("""">
                                <i class="menu-icon fa fa-upload"></i>Upload New </a>
                        </li>
                        <li """),_display_(/*60.30*/if(requestHeader.uri == routes.PropertyContactController.getPropertyContacts().toString)/*60.118*/ {_display_(Seq[Any](format.raw/*60.120*/("""
                            """),format.raw/*61.29*/("""class="active"""")))}),format.raw/*61.44*/(""">
                            <a href=""""),_display_(/*62.39*/routes/*62.45*/.PropertyContactController.getPropertyContacts()),format.raw/*62.93*/("""">
                                <i class="menu-icon fa fa-envelope"></i>Contacts <span class="badge badge-danger">1</span></a>
                        </li>
                        <li """),_display_(/*65.30*/if(requestHeader.uri == routes.PropertyController.getPropertyTypes().toString)/*65.108*/ {_display_(Seq[Any](format.raw/*65.110*/("""
                            """),format.raw/*66.29*/("""class="active"""")))}),format.raw/*66.44*/(""">
                            <a href=""""),_display_(/*67.39*/routes/*67.45*/.PropertyController.getPropertyTypes()),format.raw/*67.83*/(""""> <i class="menu-icon fa fa-cogs"></i>
                                Property Type </a>
                        </li>


                        <li class="menu-title">Manage</li>
                            <!-- /.menu-title -->
                        <li """),_display_(/*74.30*/if(requestHeader.uri == routes.UserController.getOwners().toString)/*74.97*/ {_display_(Seq[Any](format.raw/*74.99*/("""
                            """),format.raw/*75.29*/("""class="active"""")))}),format.raw/*75.44*/(""">
                            <a href=""""),_display_(/*76.39*/routes/*76.45*/.UserController.getOwners()),format.raw/*76.72*/("""">
                                <i class="menu-icon fa fa-users"></i>Landlords / Owners </a>
                        </li>
                        <li class="menu-item-has-children dropdown
                                    """),_display_(/*80.38*/if(requestHeader.uri == routes.LocationController.getRegions().toString)/*80.110*/ {_display_(Seq[Any](format.raw/*80.112*/("""active""")))}),format.raw/*80.119*/("""
                            """),_display_(/*81.30*/if(requestHeader.uri == routes.LocationController.getCities().toString)/*81.101*/ {_display_(Seq[Any](format.raw/*81.103*/("""active""")))}),format.raw/*81.110*/("""
                            """),_display_(/*82.30*/if(requestHeader.uri == routes.LocationController.getLocalities().toString)/*82.105*/ {_display_(Seq[Any](format.raw/*82.107*/("""active""")))}),format.raw/*82.114*/("""">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                                <i class="menu-icon fa fa-map-marker"></i>
                                Location</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*89.47*/routes/*89.53*/.LocationController.getRegions()),format.raw/*89.85*/("""">Region</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*91.47*/routes/*91.53*/.LocationController.getCities()),format.raw/*91.84*/("""">City</a></li>
                                <li><i class="menu-icon fa fa-map-marker"></i>
                                    <a href=""""),_display_(/*93.47*/routes/*93.53*/.LocationController.getLocalities()),format.raw/*93.88*/("""">Quarter/Locality</a></li>
                            </ul>
                        </li>
                        <li """),_display_(/*96.30*/if(requestHeader.uri == routes.AmenitiesController.getAmenities().toString)/*96.105*/ {_display_(Seq[Any](format.raw/*96.107*/("""
                            """),format.raw/*97.29*/("""class="active"""")))}),format.raw/*97.44*/(""">
                            <a href=""""),_display_(/*98.39*/routes/*98.45*/.AmenitiesController.getAmenities()),format.raw/*98.80*/("""">
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
                        <a class="navbar-brand" href="./"><img src=""""),_display_(/*130.70*/routes/*130.76*/.Assets.versioned("images/logo.png")),format.raw/*130.112*/("""" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src=""""),_display_(/*131.77*/routes/*131.83*/.Assets.versioned("images/logo2.png")),format.raw/*131.120*/("""" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            """),format.raw/*146.31*/("""

                        """),format.raw/*148.25*/("""<div class="dropdown for-notification">
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
                                <img class="user-avatar rounded-circle" src=""""),_display_(/*173.79*/routes/*173.85*/.Assets.versioned("images/admin.jpg")),format.raw/*173.122*/("""" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>My Profile</a>

                                <a class="nav-link" href="#"><i class="fa fa-bell-o"></i>Notifications <span class="count">
                                    13</span></a>

                                <a class="nav-link" href="#"><i class="fa fa-cog"></i>Settings</a>

                                <a class="nav-link" href=""""),_display_(/*184.60*/routes/*184.66*/.AuthController.logout),format.raw/*184.88*/("""">
                                    <i class="fa fa-power-off"></i>Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
                <!-- /header -->
                <!-- Header-->


            <div class="content pb-0">

                """),_display_(/*197.18*/if(flash.containsKey("success"))/*197.50*/ {_display_(Seq[Any](format.raw/*197.52*/("""
                    """),format.raw/*198.21*/("""<div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                        """),_display_(/*199.26*/flash/*199.31*/.get("success")),format.raw/*199.46*/("""
                        """),format.raw/*200.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*204.18*/("""
                """),_display_(/*205.18*/if(flash.containsKey("danger"))/*205.49*/ {_display_(Seq[Any](format.raw/*205.51*/("""
                    """),format.raw/*206.21*/("""<div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                        """),_display_(/*207.26*/flash/*207.31*/.get("danger")),format.raw/*207.45*/("""
                        """),format.raw/*208.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*212.18*/("""
                """),_display_(/*213.18*/if(flash.containsKey("info"))/*213.47*/ {_display_(Seq[Any](format.raw/*213.49*/("""
                    """),format.raw/*214.21*/("""<div class="sufee-alert alert with-close alert-info alert-dismissible fade show">
                        """),_display_(/*215.26*/flash/*215.31*/.get("info")),format.raw/*215.43*/("""
                        """),format.raw/*216.25*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                """)))}),format.raw/*220.18*/("""

                """),_display_(/*222.18*/content),format.raw/*222.25*/("""

            """),format.raw/*224.13*/("""</div>
                <!-- .content -->


            <div class="clearfix"></div>
            """),format.raw/*240.24*/("""

        """),format.raw/*242.9*/("""</div>
            <!-- /#right-panel -->


        <script src=""""),_display_(/*246.23*/routes/*246.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*246.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*247.23*/routes/*247.29*/.Assets.versioned("js/popper.min.js")),format.raw/*247.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*248.23*/routes/*248.29*/.Assets.versioned("js/plugins.js")),format.raw/*248.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*249.23*/routes/*249.29*/.Assets.versioned("owlcarousel/owl.carousel.min.js")),format.raw/*249.81*/(""""></script>
        <script src=""""),_display_(/*250.23*/routes/*250.29*/.Assets.versioned("js/main.js")),format.raw/*250.60*/("""" type="text/javascript"></script>

        <script src=""""),_display_(/*252.23*/routes/*252.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*252.81*/("""" type="text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*256.23*/routes/*256.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*256.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*257.23*/routes/*257.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*257.91*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*260.23*/routes/*260.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*260.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*261.23*/routes/*261.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*261.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*262.23*/routes/*262.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*262.89*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*265.23*/routes/*265.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*265.88*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*266.23*/routes/*266.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*266.76*/("""" type="text/javascript"></script>


        <script src=""""),_display_(/*269.23*/routes/*269.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*269.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*270.23*/routes/*270.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*270.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*271.23*/routes/*271.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*271.79*/("""" type="text/javascript"></script>

        """),_display_(/*273.10*/footerScript),format.raw/*273.22*/("""
    """),format.raw/*274.5*/("""</body>
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
                  DATE: Tue Jul 09 12:50:29 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/main.scala.html
                  HASH: aa266140eee849372ac9d8c912db34491ad162aa
                  MATRIX: 968->1|1131->71|1158->72|1236->124|1261->129|1289->130|1508->323|1522->329|1581->368|1669->429|1684->435|1745->474|1814->516|1829->522|1888->560|1956->601|1971->607|2034->649|2102->690|2117->696|2183->741|2251->782|2266->788|2329->830|2397->871|2412->877|2478->922|2531->948|2546->954|2617->1004|2687->1047|2702->1053|2769->1099|2857->1160|2872->1166|2952->1224|3020->1265|3035->1271|3109->1324|3178->1366|3193->1372|3248->1406|3299->1430|3314->1436|3383->1484|3451->1525|3466->1531|3541->1585|3599->1616|3631->1627|3664->1633|4128->2070|4209->2141|4250->2143|4307->2172|4353->2187|4420->2227|4435->2233|4487->2264|4779->2529|4867->2607|4908->2609|4965->2638|5011->2653|5078->2693|5093->2699|5152->2737|5330->2888|5411->2959|5452->2961|5509->2990|5555->3005|5622->3045|5637->3051|5689->3082|5864->3230|5962->3318|6003->3320|6060->3349|6106->3364|6173->3404|6188->3410|6257->3458|6473->3647|6561->3725|6602->3727|6659->3756|6705->3771|6772->3811|6787->3817|6846->3855|7134->4116|7210->4183|7250->4185|7307->4214|7353->4229|7420->4269|7435->4275|7483->4302|7740->4532|7822->4604|7863->4606|7902->4613|7959->4643|8040->4714|8081->4716|8120->4723|8177->4753|8262->4828|8303->4830|8342->4837|8849->5317|8864->5323|8917->5355|9087->5498|9102->5504|9154->5535|9322->5676|9337->5682|9393->5717|9541->5838|9626->5913|9667->5915|9724->5944|9770->5959|9837->5999|9852->6005|9908->6040|11152->7256|11168->7262|11227->7298|11349->7392|11365->7398|11425->7435|11779->8300|11834->8326|13506->9970|13522->9976|13582->10013|14168->10571|14184->10577|14228->10599|14598->10941|14640->10973|14681->10975|14731->10996|14869->11106|14884->11111|14921->11126|14975->11151|15224->11368|15270->11386|15311->11417|15352->11419|15402->11440|15539->11549|15554->11554|15590->11568|15644->11593|15893->11810|15939->11828|15978->11857|16019->11859|16069->11880|16204->11987|16219->11992|16253->12004|16307->12029|16556->12246|16603->12265|16632->12272|16675->12286|16800->12782|16838->12792|16932->12858|16948->12864|17020->12914|17105->12971|17121->12977|17180->13014|17265->13071|17281->13077|17337->13111|17422->13168|17438->13174|17512->13226|17574->13260|17590->13266|17643->13297|17729->13355|17745->13361|17819->13413|17940->13506|17956->13512|18030->13564|18115->13621|18131->13627|18215->13689|18302->13748|18318->13754|18393->13807|18478->13864|18494->13870|18573->13927|18658->13984|18674->13990|18756->14050|18843->14109|18859->14115|18940->14174|19025->14231|19041->14237|19110->14284|19197->14343|19213->14349|19279->14393|19364->14450|19380->14456|19451->14505|19536->14562|19552->14568|19624->14618|19697->14663|19731->14675|19764->14680
                  LINES: 28->1|33->2|34->3|36->5|36->5|36->5|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|63->32|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|81->50|81->50|81->50|82->51|82->51|83->52|83->52|83->52|86->55|86->55|86->55|87->56|87->56|88->57|88->57|88->57|91->60|91->60|91->60|92->61|92->61|93->62|93->62|93->62|96->65|96->65|96->65|97->66|97->66|98->67|98->67|98->67|105->74|105->74|105->74|106->75|106->75|107->76|107->76|107->76|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|120->89|120->89|120->89|122->91|122->91|122->91|124->93|124->93|124->93|127->96|127->96|127->96|128->97|128->97|129->98|129->98|129->98|161->130|161->130|161->130|162->131|162->131|162->131|169->146|171->148|196->173|196->173|196->173|207->184|207->184|207->184|220->197|220->197|220->197|221->198|222->199|222->199|222->199|223->200|227->204|228->205|228->205|228->205|229->206|230->207|230->207|230->207|231->208|235->212|236->213|236->213|236->213|237->214|238->215|238->215|238->215|239->216|243->220|245->222|245->222|247->224|252->240|254->242|258->246|258->246|258->246|259->247|259->247|259->247|260->248|260->248|260->248|261->249|261->249|261->249|262->250|262->250|262->250|264->252|264->252|264->252|268->256|268->256|268->256|269->257|269->257|269->257|272->260|272->260|272->260|273->261|273->261|273->261|274->262|274->262|274->262|277->265|277->265|277->265|278->266|278->266|278->266|281->269|281->269|281->269|282->270|282->270|282->270|283->271|283->271|283->271|285->273|285->273|286->274
                  -- GENERATED --
              */
          
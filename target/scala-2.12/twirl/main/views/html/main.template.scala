
package views.html

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
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Lirive - Real Estate HTML Template | Homepage One</title>
            <!-- Stylesheets -->
        <link href=""""),_display_(/*9.22*/routes/*9.28*/.Assets.versioned("app/css/bootstrap.css")),format.raw/*9.70*/("""" rel="stylesheet">
        <link href=""""),_display_(/*10.22*/routes/*10.28*/.Assets.versioned("app/css/style.css")),format.raw/*10.66*/("""" rel="stylesheet">
        <link rel="shortcut icon" href=""""),_display_(/*11.42*/routes/*11.48*/.Assets.versioned("app/images/favicon.ico")),format.raw/*11.91*/("""" type="image/x-icon">
        <link rel="icon" href=""""),_display_(/*12.33*/routes/*12.39*/.Assets.versioned("app/images/favicon.ico")),format.raw/*12.82*/("""" type="image/x-icon">
            <!-- Responsive -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("app/css/responsive.css")),format.raw/*16.71*/("""" rel="stylesheet">

        """),_display_(/*18.10*/headerStyle),format.raw/*18.21*/("""
    """),format.raw/*19.5*/("""</head>

    <body>

        <div class="page-wrapper">

                <!-- Preloader -->
            <div class="preloader"></div>

                <!-- Main Header-->
            <header class="main-header">

                <div class="main-box">
                    <div class="outer-container clearfix">

                            <!--Logo Box-->
                        <div class="logo-box">
                            <div class="logo"><a href=""""),_display_(/*36.57*/routes/*36.63*/.HomeController.index()),format.raw/*36.86*/("""" title="Red Rhino">
                                <img src=""""),_display_(/*37.44*/routes/*37.50*/.Assets.versioned("app/images/logo.png")),format.raw/*37.90*/(""""
                                    alt="Red Rhino" title="Red Rhino"></a></div>
                        </div>

                            <!--Other Links-->
                        <div class="other-links clearfix">
                            <div class="link-box"><a href=""""),_display_(/*43.61*/routes/*43.67*/.AuthController.getLogin()),format.raw/*43.93*/("""">Sign In</a></div>
                            <div class="link-box"><a href=""""),_display_(/*44.61*/routes/*44.67*/.AuthController.getRegister()),format.raw/*44.96*/("""">Register</a></div>
                        </div>

                            <!--Nav Outer-->
                        <div class="nav-outer clearfix">
                                <!-- Main Menu -->
                            <nav class="main-menu">
                                <div class="navbar-header">
                                        <!-- Toggle Button -->
                                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                </div>

                                <div class="navbar-collapse collapse clearfix">
                                    <ul class="navigation clearfix">
                                        <li class="current dropdown"><a href="#">Home</a>
                                            <ul>
                                                <li><a href="index.html">Homepage One</a></li>
                                                <li><a href="index-2.html">Homepage Two</a></li>
                                            </ul>
                                        </li>
                                        <li class="dropdown"><a href="#">Agents</a>
                                            <ul>
                                                <li><a href="agents.html">Agents List</a></li>
                                                <li><a href="agent-single.html">Agent Profile</a></li>
                                            </ul>
                                        </li>
                                        <li class="dropdown"><a href="#">Property</a>
                                            <ul>
                                                <li><a href="properties-list-one.html">Property List I</a></li>
                                                <li><a href="properties-list-two.html">Property List II</a></li>
                                                <li><a href="properties-grid-one.html">Property Grid View I</a></li>
                                                <li><a href="properties-grid-two.html">Property Gird View II</a></li>
                                                <li><a href="property-details.html">Property Details</a></li>
                                                <li><a href="add-property.html">Add Property</a></li>
                                            </ul>
                                        </li>
                                        <li class="dropdown"><a href="#">Blog</a>
                                            <ul>
                                                <li><a href="blog.html">Blog</a></li>
                                                <li><a href="blog-details.html">Blog Details</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="contact.html">Contact Us</a></li>
                                    </ul>
                                </div>
                            </nav><!-- Main Menu End-->

                        </div>
                            <!--Nav Outer End-->

                    </div>
                </div>

            </header>
                <!--End Main Header -->

                """),_display_(/*104.18*/content),format.raw/*104.25*/("""

                """),format.raw/*106.17*/("""<!--Main Footer-->
            <footer class="main-footer with-padding-top">
                    <!--Widgets Section-->
                <div class="widgets-section">
                    <div class="auto-container">
                        <div class="row clearfix">
                                <!--Big Column-->
                            <div class="big-column col-md-6 col-sm-12 col-xs-12">
                                <div class="row clearfix">
                                        <!--Footer Column-->
                                    <div class="footer-column col-md-7 col-sm-6 col-xs-12">
                                        <div class="footer-widget about-widget">
                                            <div class="logo">
                                                <a href=""""),_display_(/*119.59*/routes/*119.65*/.AuthController.getLogin()),format.raw/*119.91*/("""">
                                                    <img src=""""),_display_(/*120.64*/routes/*120.70*/.Assets.versioned("app/images/footer-logo.png")),format.raw/*120.117*/("""" alt=""></a></div>
                                            <div class="widget-content">
                                                <div class="text">
                                                    Sed perspiciatis unde omnis iste natus elit voluptatem accusantium doloremque site laudantium totam rem aperiam.</div>
                                                <div class="copyright-text">&copy; Lirive 2017, All Rights Reserved.</div>

                                            </div>
                                        </div>
                                    </div><!--End Footer Column-->

                                    <!--Footer Column-->
                                    <div class="footer-column col-md-5 col-sm-6 col-xs-12">
                                        <div class="footer-widget links-widget">
                                            <h2>Quick Links</h2>
                                            <div class="widget-content">
                                                <ul class="list">
                                                    <li><a href="#">About</a></li>
                                                    <li><a href="#">Site Map</a></li>
                                                    <li><a href="#">Support Center</a></li>
                                                    <li><a href="#">Terms & Conditions</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div><!--End Footer Column-->
                                </div>
                            </div><!--End Big Column-->

                            <!--Big Column-->
                            <div class="big-column col-md-6 col-sm-12 col-xs-12">
                                <div class="row clearfix">


                                        <!--Footer Column-->
                                    <div class="footer-column col-md-7 col-sm-6 col-xs-12">
                                        <div class="footer-widget contact-widget">
                                            <h2>Contact Us</h2>
                                            <div class="widget-content">
                                                <div class="text">
                                                    Feel free to ger in touch with us via phone or send us a message.</div>
                                                <ul class="contact-info">
                                                    <li><div class="icon"><span class="fa fa-envelope-o"></span></div> <a href="mailto:info@lirive.com">
                                                        info@lirive.com</a></li>
                                                    <li><div class="icon"><span class="fa fa-phone"></span></div>
                                                        +880 111 234 4567</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div><!--End Footer Column-->

                                    <!--Footer Column-->
                                    <div class="footer-column col-md-5 col-sm-6 col-xs-12">
                                        <div class="footer-widget social-widget">
                                            <h2>Folow Us</h2>
                                            <div class="widget-content">
                                                <ul class="social-links">
                                                    <li><a href="#" class="facebook"><span class="fa fa-facebook-f"></span></a></li>
                                                    <li><a href="#" class="twitter"><span class="fa fa-twitter"></span></a></li>
                                                    <li><a href="#" class="google-plus"><span class="fa fa-google-plus"></span></a></li>
                                                    <li><a href="#" class="linkedin"><span class="fa fa-linkedin"></span></a></li>
                                                    <li><a href="#" class="instagram"><span class="fa fa-instagram"></span></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div><!--End Footer Column-->

                                </div>
                            </div><!--End Big Column-->

                        </div>
                    </div>
                </div>

            </footer>


        </div>
            <!--End pagewrapper-->

            <!--Scroll to top-->
        <div class="scroll-to-top scroll-to-target" data-target="html"><span class="fa fa-long-arrow-up"></span></div>


        <script src=""""),_display_(/*202.23*/routes/*202.29*/.Assets.versioned("app/js/jquery.js")),format.raw/*202.66*/(""""></script>
        <script src=""""),_display_(/*203.23*/routes/*203.29*/.Assets.versioned("app/js/bootstrap.min.js")),format.raw/*203.73*/(""""></script>
        <script src=""""),_display_(/*204.23*/routes/*204.29*/.Assets.versioned("app/js/jquery-ui.js")),format.raw/*204.69*/(""""></script>
        <script src=""""),_display_(/*205.23*/routes/*205.29*/.Assets.versioned("app/js/jquery.fancybox.pack.js")),format.raw/*205.80*/(""""></script>
        <script src=""""),_display_(/*206.23*/routes/*206.29*/.Assets.versioned("app/js/jquery.fancybox-media.js")),format.raw/*206.81*/(""""></script>
        <script src=""""),_display_(/*207.23*/routes/*207.29*/.Assets.versioned("app/js/mixitup.js")),format.raw/*207.67*/(""""></script>
        <script src=""""),_display_(/*208.23*/routes/*208.29*/.Assets.versioned("app/js/owl.js")),format.raw/*208.63*/(""""></script>
        <script src=""""),_display_(/*209.23*/routes/*209.29*/.Assets.versioned("app/js/wow.js")),format.raw/*209.63*/(""""></script>
        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.versioned("app/js/appear.js")),format.raw/*210.66*/(""""></script>
        <script src=""""),_display_(/*211.23*/routes/*211.29*/.Assets.versioned("app/js/script.js")),format.raw/*211.66*/(""""></script>

        """),_display_(/*213.10*/footerScript),format.raw/*213.22*/("""
    """),format.raw/*214.5*/("""</body>
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
                  DATE: Tue Jul 09 15:26:12 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/main.scala.html
                  HASH: 43fc72a2c2723d53d9a556877353d6b37a8f5edb
                  MATRIX: 962->1|1125->71|1152->72|1370->264|1384->270|1446->312|1514->353|1529->359|1588->397|1676->458|1691->464|1755->507|1837->562|1852->568|1916->611|2196->864|2211->870|2275->913|2332->943|2364->954|2396->959|2882->1418|2897->1424|2941->1447|3032->1511|3047->1517|3108->1557|3416->1838|3431->1844|3478->1870|3585->1950|3600->1956|3650->1985|7251->5558|7280->5565|7327->5583|8167->6395|8183->6401|8231->6427|8325->6493|8341->6499|8411->6546|13392->11501|13408->11507|13467->11544|13529->11578|13545->11584|13611->11628|13673->11662|13689->11668|13751->11708|13813->11742|13829->11748|13902->11799|13964->11833|13980->11839|14054->11891|14116->11925|14132->11931|14192->11969|14254->12003|14270->12009|14326->12043|14388->12077|14404->12083|14460->12117|14522->12151|14538->12157|14597->12194|14659->12228|14675->12234|14734->12271|14784->12293|14818->12305|14851->12310
                  LINES: 28->1|33->2|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|47->16|47->16|47->16|49->18|49->18|50->19|67->36|67->36|67->36|68->37|68->37|68->37|74->43|74->43|74->43|75->44|75->44|75->44|135->104|135->104|137->106|150->119|150->119|150->119|151->120|151->120|151->120|233->202|233->202|233->202|234->203|234->203|234->203|235->204|235->204|235->204|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|239->208|239->208|239->208|240->209|240->209|240->209|241->210|241->210|241->210|242->211|242->211|242->211|244->213|244->213|245->214
                  -- GENERATED --
              */
          
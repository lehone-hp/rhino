
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
        <title>Green House | """),_display_(/*7.31*/title),format.raw/*7.36*/(""" """),format.raw/*7.37*/("""</title>
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
                            <div class="logo" style="margin-top: 2rem"><a href=""""),_display_(/*36.82*/routes/*36.88*/.HomeController.index()),format.raw/*36.111*/("""" title="Green House">
                                <img src=""""),_display_(/*37.44*/routes/*37.50*/.Assets.versioned("app/images/logo.png")),format.raw/*37.90*/(""""
                                    alt="Green House" title="Green House"></a></div>
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
                                        <li """),_display_(/*62.46*/if(requestHeader.uri == routes.HomeController.index().toString)/*62.109*/ {_display_(Seq[Any](format.raw/*62.111*/("""
                                            """),format.raw/*63.45*/("""class="current"""")))}),format.raw/*63.61*/(""">
                                            <a href=""""),_display_(/*64.55*/routes/*64.61*/.HomeController.index()),format.raw/*64.84*/("""">Home</a></li>

                                        <li """),_display_(/*66.46*/if(requestHeader.uri == routes.HomeController.agents().toString)/*66.110*/ {_display_(Seq[Any](format.raw/*66.112*/("""
                                            """),format.raw/*67.45*/("""class="current"""")))}),format.raw/*67.61*/(""">
                                            <a href=""""),_display_(/*68.55*/routes/*68.61*/.HomeController.agents()),format.raw/*68.85*/("""">Agents</a></li>

                                        <li """),_display_(/*70.46*/if(requestHeader.uri == routes.HomeController.getProperties().toString)/*70.117*/ {_display_(Seq[Any](format.raw/*70.119*/("""
                                            """),format.raw/*71.45*/("""class="current"""")))}),format.raw/*71.61*/(""">
                                            <a href=""""),_display_(/*72.55*/routes/*72.61*/.HomeController.getProperties()),format.raw/*72.92*/("""">Property</a></li>

                                        <li """),_display_(/*74.46*/if(requestHeader.uri == routes.HomeController.aboutUs().toString)/*74.111*/ {_display_(Seq[Any](format.raw/*74.113*/("""
                                            """),format.raw/*75.45*/("""class="current"""")))}),format.raw/*75.61*/(""">
                                            <a href=""""),_display_(/*76.55*/routes/*76.61*/.HomeController.aboutUs()),format.raw/*76.86*/("""">About Us</a></li>

                                        <li """),_display_(/*78.46*/if(requestHeader.uri == routes.HomeController.contactUs().toString)/*78.113*/ {_display_(Seq[Any](format.raw/*78.115*/("""
                                            """),format.raw/*79.45*/("""class="current"""")))}),format.raw/*79.61*/(""">
                                            <a href=""""),_display_(/*80.55*/routes/*80.61*/.HomeController.contactUs()),format.raw/*80.88*/("""">Contact Us</a></li>
                                    </ul>
                                </div>
                            </nav><!-- Main Menu End-->

                        </div>
                            <!--Nav Outer End-->

                    </div>
                </div>

            </header>
                <!--End Main Header -->

                """),_display_(/*94.18*/content),format.raw/*94.25*/("""

                """),format.raw/*96.17*/("""<!--Main Footer-->
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
                                                <a href=""""),_display_(/*109.59*/routes/*109.65*/.AuthController.getLogin()),format.raw/*109.91*/("""">
                                                    <img src=""""),_display_(/*110.64*/routes/*110.70*/.Assets.versioned("app/images/footer-logo.png")),format.raw/*110.117*/("""" alt=""></a></div>
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


        <script src=""""),_display_(/*192.23*/routes/*192.29*/.Assets.versioned("app/js/jquery.js")),format.raw/*192.66*/(""""></script>
        <script src=""""),_display_(/*193.23*/routes/*193.29*/.Assets.versioned("app/js/bootstrap.min.js")),format.raw/*193.73*/(""""></script>
        <script src=""""),_display_(/*194.23*/routes/*194.29*/.Assets.versioned("app/js/jquery-ui.js")),format.raw/*194.69*/(""""></script>
        <script src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.versioned("app/js/jquery.fancybox.pack.js")),format.raw/*195.80*/(""""></script>
        <script src=""""),_display_(/*196.23*/routes/*196.29*/.Assets.versioned("app/js/jquery.fancybox-media.js")),format.raw/*196.81*/(""""></script>
        <script src=""""),_display_(/*197.23*/routes/*197.29*/.Assets.versioned("app/js/mixitup.js")),format.raw/*197.67*/(""""></script>
        <script src=""""),_display_(/*198.23*/routes/*198.29*/.Assets.versioned("app/js/owl.js")),format.raw/*198.63*/(""""></script>
        <script src=""""),_display_(/*199.23*/routes/*199.29*/.Assets.versioned("app/js/wow.js")),format.raw/*199.63*/(""""></script>
        <script src=""""),_display_(/*200.23*/routes/*200.29*/.Assets.versioned("app/js/appear.js")),format.raw/*200.66*/(""""></script>
        <script src=""""),_display_(/*201.23*/routes/*201.29*/.Assets.versioned("app/js/script.js")),format.raw/*201.66*/(""""></script>

        """),_display_(/*203.10*/footerScript),format.raw/*203.22*/("""
    """),format.raw/*204.5*/("""</body>
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
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/main.scala.html
                  HASH: 9c43e22372760bc989b9005478d8afd56f81891a
                  MATRIX: 962->1|1125->71|1152->72|1273->167|1298->172|1326->173|1415->236|1429->242|1491->284|1559->325|1574->331|1633->369|1721->430|1736->436|1800->479|1882->534|1897->540|1961->583|2241->836|2256->842|2320->885|2377->915|2409->926|2441->931|2952->1415|2967->1421|3012->1444|3105->1510|3120->1516|3181->1556|3493->1841|3508->1847|3555->1873|3662->1953|3677->1959|3727->1988|4763->2997|4836->3060|4877->3062|4950->3107|4997->3123|5080->3179|5095->3185|5139->3208|5228->3270|5302->3334|5343->3336|5416->3381|5463->3397|5546->3453|5561->3459|5606->3483|5697->3547|5778->3618|5819->3620|5892->3665|5939->3681|6022->3737|6037->3743|6089->3774|6182->3840|6257->3905|6298->3907|6371->3952|6418->3968|6501->4024|6516->4030|6562->4055|6655->4121|6732->4188|6773->4190|6846->4235|6893->4251|6976->4307|6991->4313|7039->4340|7438->4712|7466->4719|7512->4737|8352->5549|8368->5555|8416->5581|8510->5647|8526->5653|8596->5700|13577->10655|13593->10661|13652->10698|13714->10732|13730->10738|13796->10782|13858->10816|13874->10822|13936->10862|13998->10896|14014->10902|14087->10953|14149->10987|14165->10993|14239->11045|14301->11079|14317->11085|14377->11123|14439->11157|14455->11163|14511->11197|14573->11231|14589->11237|14645->11271|14707->11305|14723->11311|14782->11348|14844->11382|14860->11388|14919->11425|14969->11447|15003->11459|15036->11464
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|47->16|47->16|47->16|49->18|49->18|50->19|67->36|67->36|67->36|68->37|68->37|68->37|74->43|74->43|74->43|75->44|75->44|75->44|93->62|93->62|93->62|94->63|94->63|95->64|95->64|95->64|97->66|97->66|97->66|98->67|98->67|99->68|99->68|99->68|101->70|101->70|101->70|102->71|102->71|103->72|103->72|103->72|105->74|105->74|105->74|106->75|106->75|107->76|107->76|107->76|109->78|109->78|109->78|110->79|110->79|111->80|111->80|111->80|125->94|125->94|127->96|140->109|140->109|140->109|141->110|141->110|141->110|223->192|223->192|223->192|224->193|224->193|224->193|225->194|225->194|225->194|226->195|226->195|226->195|227->196|227->196|227->196|228->197|228->197|228->197|229->198|229->198|229->198|230->199|230->199|230->199|231->200|231->200|231->200|232->201|232->201|232->201|234->203|234->203|235->204
                  -- GENERATED --
              */
          
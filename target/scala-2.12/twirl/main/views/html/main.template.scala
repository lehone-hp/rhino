
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
        <title>Green Home | """),_display_(/*7.30*/title),format.raw/*7.35*/(""" """),format.raw/*7.36*/("""</title>
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
                            <div class="logo" style="margin-top: 2rem"><a href=""""),_display_(/*36.82*/routes/*36.88*/.HomeController.index()),format.raw/*36.111*/("""" title="Green Home">
                                <img src=""""),_display_(/*37.44*/routes/*37.50*/.Assets.versioned("app/images/logo.png")),format.raw/*37.90*/(""""
                                    alt="Green Home" title="Green Home"></a></div>
                        </div>

                            <!--Other Links-->
                        <div class="other-links clearfix">
                            """),_display_(/*43.30*/if(AuthController.isLoggedIn)/*43.59*/ {_display_(Seq[Any](format.raw/*43.61*/("""
                                """),format.raw/*44.33*/("""<div class="link-box"><a href=""""),_display_(/*44.65*/routes/*44.71*/.AdminController.getDashboard()),format.raw/*44.102*/("""">Dashboard</a></div>
                            """)))}/*45.31*/else/*45.36*/{_display_(Seq[Any](format.raw/*45.37*/("""
                                """),format.raw/*46.33*/("""<div class="link-box"><a href=""""),_display_(/*46.65*/routes/*46.71*/.AuthController.getLogin()),format.raw/*46.97*/("""">Sign In</a></div>
                                <div class="link-box"><a href=""""),_display_(/*47.65*/routes/*47.71*/.AuthController.getRegister()),format.raw/*47.100*/("""">Register</a></div>
                            """)))}),format.raw/*48.30*/("""
                        """),format.raw/*49.25*/("""</div>

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
                                        <li """),_display_(/*66.46*/if(requestHeader.uri == routes.HomeController.index().toString)/*66.109*/ {_display_(Seq[Any](format.raw/*66.111*/("""
                                            """),format.raw/*67.45*/("""class="current"""")))}),format.raw/*67.61*/(""">
                                            <a href=""""),_display_(/*68.55*/routes/*68.61*/.HomeController.index()),format.raw/*68.84*/("""">Home</a></li>

                                        <li """),_display_(/*70.46*/if(requestHeader.uri == routes.HomeController.agents().toString)/*70.110*/ {_display_(Seq[Any](format.raw/*70.112*/("""
                                            """),format.raw/*71.45*/("""class="current"""")))}),format.raw/*71.61*/(""">
                                            <a href=""""),_display_(/*72.55*/routes/*72.61*/.HomeController.agents()),format.raw/*72.85*/("""">Agents</a></li>

                                        <li """),_display_(/*74.46*/if(requestHeader.uri == routes.HomeController.getProperties().toString)/*74.117*/ {_display_(Seq[Any](format.raw/*74.119*/("""
                                            """),format.raw/*75.45*/("""class="current"""")))}),format.raw/*75.61*/(""">
                                            <a href=""""),_display_(/*76.55*/routes/*76.61*/.HomeController.getProperties()),format.raw/*76.92*/("""">Property</a></li>

                                        <li """),_display_(/*78.46*/if(requestHeader.uri == routes.HomeController.aboutUs().toString)/*78.111*/ {_display_(Seq[Any](format.raw/*78.113*/("""
                                            """),format.raw/*79.45*/("""class="current"""")))}),format.raw/*79.61*/(""">
                                            <a href=""""),_display_(/*80.55*/routes/*80.61*/.HomeController.aboutUs()),format.raw/*80.86*/("""">About Us</a></li>

                                        <li """),_display_(/*82.46*/if(requestHeader.uri == routes.HomeController.contactUs().toString)/*82.113*/ {_display_(Seq[Any](format.raw/*82.115*/("""
                                            """),format.raw/*83.45*/("""class="current"""")))}),format.raw/*83.61*/(""">
                                            <a href=""""),_display_(/*84.55*/routes/*84.61*/.HomeController.contactUs()),format.raw/*84.88*/("""">Contact Us</a></li>
                                    </ul>
                                </div>
                            </nav><!-- Main Menu End-->

                        </div>
                            <!--Nav Outer End-->

                    </div>
                </div>

            </header>
                <!--End Main Header -->

                """),_display_(/*98.18*/content),format.raw/*98.25*/("""

                """),format.raw/*100.17*/("""<!--Main Footer-->
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
                                                <a href=""""),_display_(/*113.59*/routes/*113.65*/.AuthController.getLogin()),format.raw/*113.91*/("""">
                                                    <img src=""""),_display_(/*114.64*/routes/*114.70*/.Assets.versioned("app/images/logo.png")),format.raw/*114.110*/("""" alt=""></a></div>
                                            <div class="widget-content">
                                                <div class="text">
                                                    Sed perspiciatis unde omnis iste natus elit voluptatem accusantium doloremque site laudantium totam rem aperiam.</div>
                                                <div class="copyright-text">&copy; GreenHome 2019, All Rights Reserved.</div>

                                            </div>
                                        </div>
                                    </div><!--End Footer Column-->

                                    <!--Footer Column-->
                                    <div class="footer-column col-md-5 col-sm-6 col-xs-12">
                                        <div class="footer-widget links-widget">
                                            <h2>Quick Links</h2>
                                            <div class="widget-content">
                                                <ul class="list">
                                                    <li><a href=""""),_display_(/*130.67*/routes/*130.73*/.HomeController.index()),format.raw/*130.96*/("""">Home</a></li>
                                                    <li><a href=""""),_display_(/*131.67*/routes/*131.73*/.HomeController.getProperties()),format.raw/*131.104*/("""">Properties</a></li>
                                                    <li><a href=""""),_display_(/*132.67*/routes/*132.73*/.HomeController.aboutUs()),format.raw/*132.98*/("""">About</a></li>
                                                    <li><a href=""""),_display_(/*133.67*/routes/*133.73*/.HomeController.contactUs()),format.raw/*133.100*/("""">Support Center</a></li>
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
                                                        info@greenhouse.com</a></li>
                                                    <li><div class="icon"><span class="fa fa-phone"></span></div>
                                                        +237 671 256 210</li>
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


        <script src=""""),_display_(/*196.23*/routes/*196.29*/.Assets.versioned("app/js/jquery.js")),format.raw/*196.66*/(""""></script>
        <script src=""""),_display_(/*197.23*/routes/*197.29*/.Assets.versioned("app/js/bootstrap.min.js")),format.raw/*197.73*/(""""></script>
        <script src=""""),_display_(/*198.23*/routes/*198.29*/.Assets.versioned("app/js/jquery-ui.js")),format.raw/*198.69*/(""""></script>
        <script src=""""),_display_(/*199.23*/routes/*199.29*/.Assets.versioned("app/js/jquery.fancybox.pack.js")),format.raw/*199.80*/(""""></script>
        <script src=""""),_display_(/*200.23*/routes/*200.29*/.Assets.versioned("app/js/jquery.fancybox-media.js")),format.raw/*200.81*/(""""></script>
        <script src=""""),_display_(/*201.23*/routes/*201.29*/.Assets.versioned("app/js/mixitup.js")),format.raw/*201.67*/(""""></script>
        <script src=""""),_display_(/*202.23*/routes/*202.29*/.Assets.versioned("app/js/owl.js")),format.raw/*202.63*/(""""></script>
        <script src=""""),_display_(/*203.23*/routes/*203.29*/.Assets.versioned("app/js/wow.js")),format.raw/*203.63*/(""""></script>
        <script src=""""),_display_(/*204.23*/routes/*204.29*/.Assets.versioned("app/js/appear.js")),format.raw/*204.66*/(""""></script>
        <script src=""""),_display_(/*205.23*/routes/*205.29*/.Assets.versioned("app/js/script.js")),format.raw/*205.66*/(""""></script>

        """),_display_(/*207.10*/footerScript),format.raw/*207.22*/("""
    """),format.raw/*208.5*/("""</body>
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
                  DATE: Fri Jul 12 06:32:04 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/main.scala.html
                  HASH: 9e865e1cdbafc2eddd0b162bc48c3ba6d1551ac1
                  MATRIX: 962->1|1125->71|1152->72|1272->166|1297->171|1325->172|1414->235|1428->241|1490->283|1558->324|1573->330|1632->368|1720->429|1735->435|1799->478|1881->533|1896->539|1960->582|2240->835|2255->841|2319->884|2376->914|2408->925|2440->930|2951->1414|2966->1420|3011->1443|3103->1508|3118->1514|3179->1554|3458->1806|3496->1835|3536->1837|3597->1870|3656->1902|3671->1908|3724->1939|3794->1991|3807->1996|3846->1997|3907->2030|3966->2062|3981->2068|4028->2094|4139->2178|4154->2184|4205->2213|4286->2263|4339->2288|5330->3252|5403->3315|5444->3317|5517->3362|5564->3378|5647->3434|5662->3440|5706->3463|5795->3525|5869->3589|5910->3591|5983->3636|6030->3652|6113->3708|6128->3714|6173->3738|6264->3802|6345->3873|6386->3875|6459->3920|6506->3936|6589->3992|6604->3998|6656->4029|6749->4095|6824->4160|6865->4162|6938->4207|6985->4223|7068->4279|7083->4285|7129->4310|7222->4376|7299->4443|7340->4445|7413->4490|7460->4506|7543->4562|7558->4568|7606->4595|8005->4967|8033->4974|8080->4992|8920->5804|8936->5810|8984->5836|9078->5902|9094->5908|9157->5948|10309->7072|10325->7078|10370->7101|10480->7183|10496->7189|10550->7220|10666->7308|10682->7314|10729->7339|10840->7422|10856->7428|10906->7455|14504->11027|14520->11033|14579->11070|14641->11104|14657->11110|14723->11154|14785->11188|14801->11194|14863->11234|14925->11268|14941->11274|15014->11325|15076->11359|15092->11365|15166->11417|15228->11451|15244->11457|15304->11495|15366->11529|15382->11535|15438->11569|15500->11603|15516->11609|15572->11643|15634->11677|15650->11683|15709->11720|15771->11754|15787->11760|15846->11797|15896->11819|15930->11831|15963->11836
                  LINES: 28->1|33->2|34->3|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|47->16|47->16|47->16|49->18|49->18|50->19|67->36|67->36|67->36|68->37|68->37|68->37|74->43|74->43|74->43|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|78->47|79->48|80->49|97->66|97->66|97->66|98->67|98->67|99->68|99->68|99->68|101->70|101->70|101->70|102->71|102->71|103->72|103->72|103->72|105->74|105->74|105->74|106->75|106->75|107->76|107->76|107->76|109->78|109->78|109->78|110->79|110->79|111->80|111->80|111->80|113->82|113->82|113->82|114->83|114->83|115->84|115->84|115->84|129->98|129->98|131->100|144->113|144->113|144->113|145->114|145->114|145->114|161->130|161->130|161->130|162->131|162->131|162->131|163->132|163->132|163->132|164->133|164->133|164->133|227->196|227->196|227->196|228->197|228->197|228->197|229->198|229->198|229->198|230->199|230->199|230->199|231->200|231->200|231->200|232->201|232->201|232->201|233->202|233->202|233->202|234->203|234->203|234->203|235->204|235->204|235->204|236->205|236->205|236->205|238->207|238->207|239->208
                  -- GENERATED --
              */
          
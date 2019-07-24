
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Property],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(properties: List[Property]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
    """),_display_(/*3.6*/main("Welcome to Green Home")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
        """),format.raw/*4.9*/("""<!-- HEADER STYLE -->

    """)))}/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
        """),format.raw/*7.9*/("""<!-- CONTENT -->
        <!--Home Banner-->
        <section class="home-banner with-border">
                <!--Banner Slider-->
            <div class="banner-slider-container">
                <ul class="banner-slider owl-theme owl-carousel">
                    <li class="slide-item" style="background-image: url("""),_display_(/*13.74*/routes/*13.80*/.Assets.versioned("app/images/main-slider/1.jpg")),format.raw/*13.129*/(""");"></li>
                    <li class="slide-item" style="background-image: url("""),_display_(/*14.74*/routes/*14.80*/.Assets.versioned("app/images/main-slider/2.jpg")),format.raw/*14.129*/(""");"></li>
                    <li class="slide-item" style="background-image: url("""),_display_(/*15.74*/routes/*15.80*/.Assets.versioned("app/images/main-slider/3.jpg")),format.raw/*15.129*/(""");"></li>
                </ul>
            </div>

                <!--Banner Search Form-->
            <div class="banner-search-container">
                <div class="form-outer">
                    <div class="banner-search-form">
                        <h1>Find your dream home just in a click</h1>
                        <div class="text">
                            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur sint.</div>

                        <div class="banner-form-box">
                            <div class="default-form">
                                <form method="post" action="properties-list-one.html">
                                    <div class="row clearfix">
                                        <div class="form-group col-md-3 col-sm-4 col-xs-12">
                                            <select class="custom-select-box">
                                                <option>Property Type</option>
                                                <option>Residential</option>
                                                <option>Commercial</option>
                                                <option>Agriculture</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6 col-sm-4 col-xs-12">
                                            <input type="text" name="field-name" value="" placeholder="Enter Location" required>
                                        </div>
                                        <div class="form-group col-md-3 col-sm-4 col-xs-12">
                                            <button type="submit" class="theme-btn btn-style-one">SEARCH</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </section>


            <!--Property Listing-->
        <section class="property-listing">
            <div class="auto-container">
                <div class="mixitup-gallery">
                        <!--Heading-->
                    <div class="sec-title centered">
                        <h2>Latest Properties</h2>
                    </div>

                        <!--Filter-->
                    <div class="filters gallery-filters">
                        <ul class="filter-tabs filter-btns clearfix">
                            <li class="active filter" data-role="button" data-filter="all">Any Type</li>
                            <li class="filter" data-role="button" data-filter=".for-sell">For Sell</li>
                            <li class="filter" data-role="button" data-filter=".for-rent">For Rent</li>
                        </ul>
                    </div>

                    <div class="filter-list row clearfix">

                        """),_display_(/*76.26*/if(properties.size() > 0)/*76.51*/ {_display_(Seq[Any](format.raw/*76.53*/("""
                            """),_display_(/*77.30*/for(property <- properties) yield /*77.57*/ {_display_(Seq[Any](format.raw/*77.59*/("""
                                    """),format.raw/*78.37*/("""<!--Default Property Box-->
                                <div class="default-property-box mix all """),_display_(/*79.75*/if(property.forSale)/*79.95*/{_display_(Seq[Any](format.raw/*79.96*/("""for-sell""")))}/*79.105*/else/*79.109*/{_display_(Seq[Any](format.raw/*79.110*/("""for-rent""")))}),format.raw/*79.119*/(""" """),format.raw/*79.120*/("""col-lg-4 col-md-6 col-sm-6 col-xs-12">
                                    <div class="inner-box">
                                        <div class="image-box">
                                            <figure class="image"><a href=""""),_display_(/*82.77*/routes/*82.83*/.HomeController.getProperty(property.slug)),format.raw/*82.125*/("""">
                                                <img src=""""),_display_(/*83.60*/routes/*83.66*/.Assets.versioned("uploads/properties/"+property.getImage())),format.raw/*83.126*/("""" alt=""></a></figure>
                                            <div class="property-price">XAF """),_display_(/*84.78*/property/*84.86*/.price),format.raw/*84.92*/(""" """),format.raw/*84.93*/("""/ <span class="text-capitalize">"""),_display_(/*84.126*/property/*84.134*/.priceType.name),format.raw/*84.149*/(""" """),format.raw/*84.150*/("""</span></div>
                                        </div>
                                        <div class="lower-content">
                                            """),format.raw/*94.53*/("""
                                            """),format.raw/*95.45*/("""<div class="property-title">
                                                <h3><a href=""""),_display_(/*96.63*/routes/*96.69*/.HomeController.getProperty(property.slug)),format.raw/*96.111*/("""">"""),_display_(/*96.114*/property/*96.122*/.name),format.raw/*96.127*/("""</a></h3>
                                                <div class="location"><span class="fa fa-map-marker"></span>
                                                        &nbsp; """),_display_(/*98.65*/property/*98.73*/.getAddress()),format.raw/*98.86*/("""</div>
                                            </div>
                                            <div class="prop-info clearfix">
                                                <div class="prop-for"><span class="for">"""),_display_(/*101.90*/if(property.forSale)/*101.110*/{_display_(Seq[Any](format.raw/*101.111*/("""For sell""")))}/*101.120*/else/*101.124*/{_display_(Seq[Any](format.raw/*101.125*/("""For rent""")))}),format.raw/*101.134*/("""</span>
                                                    <span class="area">"""),_display_(/*102.73*/if(property.area != null)/*102.98*/{_display_(Seq[Any](format.raw/*102.99*/(""" """),_display_(/*102.101*/property/*102.109*/.area),format.raw/*102.114*/(""" """),format.raw/*102.115*/("""sq ft.""")))}),format.raw/*102.122*/("""</span>
                                                </div>
                                                <div class="link-box"><a href=""""),_display_(/*104.81*/routes/*104.87*/.HomeController.getProperty(property.slug)),format.raw/*104.129*/("""" class="theme-btn">
                                                View Details <span class="fa fa-angle-right"></span></a>
                                                </div>
                                            </div>
                                            <div class="property-meta">
                                                <ul class="clearfix">
                                                    <li><span class="icon fa fa-user"></span> """),_display_(/*110.96*/property/*110.104*/.user.name),format.raw/*110.114*/("""</li>
                                                    <li><span class="icon fa fa-bed"></span> """),_display_(/*111.95*/property/*111.103*/.bedRooms),format.raw/*111.112*/("""</li>
                                                    <li><span class="icon fa fa-bathtub"></span> """),_display_(/*112.99*/property/*112.107*/.bathRooms),format.raw/*112.117*/("""</li>
                                                    <li><span class="icon fa fa-television"></span> """),_display_(/*113.102*/property/*113.110*/.parlors),format.raw/*113.118*/("""</li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            """)))}),format.raw/*119.30*/("""
                        """)))}/*120.27*/else/*120.32*/{_display_(Seq[Any](format.raw/*120.33*/("""
                            """),format.raw/*121.29*/("""<h2 class="text-center">No Property Uploaded</h2>
                        """)))}),format.raw/*122.26*/("""

                    """),format.raw/*124.21*/("""</div>
                </div>
                <div class="view-all"><a href=""""),_display_(/*126.49*/routes/*126.55*/.HomeController.getProperties()),format.raw/*126.86*/("""" class="theme-btn btn-style-two">
                    Explore More Properties</a></div>

            </div>
        </section>


            <!--Popular Places-->
        <section class="popular-places">
            <div class="auto-container">
                    <!--Heading-->
                <div class="sec-title centered">
                    <h2>Popular Places</h2>
                </div>

                <div class="popular-place-carousel owl-theme owl-carousel">
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*146.66*/routes/*146.72*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*146.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Buea</h4>
                                    <div class="count">24 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*159.66*/routes/*159.72*/.Assets.versioned("app/images/resource/featured-image-8.jpg")),format.raw/*159.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Limbe</h4>
                                    <div class="count">11 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*172.66*/routes/*172.72*/.Assets.versioned("app/images/resource/featured-image-9.jpg")),format.raw/*172.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Douala</h4>
                                    <div class="count">20 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*185.66*/routes/*185.72*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*185.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Kumba</h4>
                                    <div class="count">24 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*198.66*/routes/*198.72*/.Assets.versioned("app/images/resource/featured-image-8.jpg")),format.raw/*198.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Tiko</h4>
                                    <div class="count">11 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*211.66*/routes/*211.72*/.Assets.versioned("app/images/resource/featured-image-9.jpg")),format.raw/*211.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Kribi</h4>
                                    <div class="count">20 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>
                        <!--Popular Place Box-->
                    <div class="popular-place-box">
                        <div class="inner-box">
                            <div class="image-box">
                                <figure class="image"><img src=""""),_display_(/*224.66*/routes/*224.72*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*224.133*/("""" alt=""></figure>
                                <div class="overlay-content">
                                    <h4>Mutengene</h4>
                                    <div class="count">24 Properties</div>
                                </div>
                            </div>
                            <a href="#" class="link-overlay"></a>
                        </div>
                    </div>

                </div>
            </div>
        </section>


            <!--Team Section-->
        <section class="team-section">
            <div class="auto-container">
                    <!--Heading-->
                <div class="sec-title centered">
                    <h2>Creative Agents</h2>
                </div>

                <div class="row clearfix">
                        <!--Team Member-->
                    <div class="team-member col-md-6 col-sm-6 col-xs-12">
                        <div class="inner-box">
                            <div class="clearfix">
                                    <!--Image Column-->
                                <div class="image-column col-md-5 col-sm-12 col-xs-12">
                                    <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*254.98*/routes/*254.104*/.Assets.versioned("app/images/resource/team-image-1.jpg")),format.raw/*254.161*/("""" alt=""></a></figure>
                                </div>
                                    <!--Content Column-->
                                <div class="content-column col-md-7 col-sm-12 col-xs-12">
                                    <div class="inner">
                                        <div class="title">
                                            <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                                            <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                                        </div>
                                        <div class="desc-text">
                                            Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
                                        <div class="social-links">
                                            <ul class="clearfix">
                                                <li><a href="#"><span class="fa fa-facebook-f"></span></a></li>
                                                <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                                <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                                <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!--Team Member-->
                    <div class="team-member col-md-6 col-sm-6 col-xs-12">
                        <div class="inner-box">
                            <div class="clearfix">
                                    <!--Image Column-->
                                <div class="image-column col-md-5 col-sm-12 col-xs-12">
                                    <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*285.98*/routes/*285.104*/.Assets.versioned("app/images/resource/team-image-2.jpg")),format.raw/*285.161*/("""" alt=""></a></figure>
                                </div>
                                    <!--Content Column-->
                                <div class="content-column col-md-7 col-sm-12 col-xs-12">
                                    <div class="inner">
                                        <div class="title">
                                            <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                                            <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                                        </div>
                                        <div class="desc-text">
                                            Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
                                        <div class="social-links">
                                            <ul class="clearfix">
                                                <li><a href="#"><span class="fa fa-facebook-f"></span></a></li>
                                                <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                                <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                                <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!--Team Member-->
                    <div class="team-member col-md-6 col-sm-6 col-xs-12">
                        <div class="inner-box">
                            <div class="clearfix">
                                    <!--Image Column-->
                                <div class="image-column col-md-5 col-sm-12 col-xs-12">
                                    <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*316.98*/routes/*316.104*/.Assets.versioned("app/images/resource/team-image-3.jpg")),format.raw/*316.161*/("""" alt=""></a></figure>
                                </div>
                                    <!--Content Column-->
                                <div class="content-column col-md-7 col-sm-12 col-xs-12">
                                    <div class="inner">
                                        <div class="title">
                                            <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                                            <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                                        </div>
                                        <div class="desc-text">
                                            Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
                                        <div class="social-links">
                                            <ul class="clearfix">
                                                <li><a href="#"><span class="fa fa-facebook-f"></span></a></li>
                                                <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                                <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                                <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!--Team Member-->
                    <div class="team-member col-md-6 col-sm-6 col-xs-12">
                        <div class="inner-box">
                            <div class="clearfix">
                                    <!--Image Column-->
                                <div class="image-column col-md-5 col-sm-12 col-xs-12">
                                    <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*347.98*/routes/*347.104*/.Assets.versioned("app/images/resource/team-image-4.jpg")),format.raw/*347.161*/("""" alt=""></a></figure>
                                </div>
                                    <!--Content Column-->
                                <div class="content-column col-md-7 col-sm-12 col-xs-12">
                                    <div class="inner">
                                        <div class="title">
                                            <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                                            <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                                        </div>
                                        <div class="desc-text">
                                            Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
                                        <div class="social-links">
                                            <ul class="clearfix">
                                                <li><a href="#"><span class="fa fa-facebook-f"></span></a></li>
                                                <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                                <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                                <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

                <div class="view-all"><a href=""""),_display_(/*374.49*/routes/*374.55*/.HomeController.agents()),format.raw/*374.79*/("""" class="theme-btn btn-style-two">View More Agents</a></div>

            </div>
        </section>
        """),format.raw/*615.21*/("""
    """)))}/*616.6*/ {_display_(Seq[Any](format.raw/*616.8*/("""
            """),format.raw/*617.13*/("""<!-- FOOTER SCRIPT -->

    """)))}),format.raw/*619.6*/("""
"""))
      }
    }
  }

  def render(properties:List[Property]): play.twirl.api.HtmlFormat.Appendable = apply(properties)

  def f:((List[Property]) => play.twirl.api.HtmlFormat.Appendable) = (properties) => apply(properties)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 12 06:32:04 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/index.scala.html
                  HASH: caa95e333c7401640c5eb96bb9e3b10cbd0ee010
                  MATRIX: 956->1|1078->30|1109->36|1146->65|1185->67|1220->76|1265->104|1303->106|1338->115|1685->435|1700->441|1771->490|1881->573|1896->579|1967->628|2077->711|2092->717|2163->766|5247->3823|5281->3848|5321->3850|5378->3880|5421->3907|5461->3909|5526->3946|5655->4048|5684->4068|5723->4069|5752->4078|5766->4082|5806->4083|5847->4092|5877->4093|6143->4332|6158->4338|6222->4380|6311->4442|6326->4448|6408->4508|6535->4608|6552->4616|6579->4622|6608->4623|6669->4656|6687->4664|6724->4679|6754->4680|6955->5468|7028->5513|7146->5604|7161->5610|7225->5652|7256->5655|7274->5663|7301->5668|7511->5851|7528->5859|7562->5872|7814->6096|7845->6116|7886->6117|7916->6126|7931->6130|7972->6131|8014->6140|8122->6220|8157->6245|8197->6246|8228->6248|8247->6256|8275->6261|8306->6262|8346->6269|8517->6412|8533->6418|8598->6460|9095->6929|9114->6937|9147->6947|9275->7047|9294->7055|9326->7064|9458->7168|9477->7176|9510->7186|9646->7293|9665->7301|9696->7309|9997->7578|10043->7605|10057->7610|10097->7611|10155->7640|10262->7715|10313->7737|10419->7815|10435->7821|10488->7852|11256->8592|11272->8598|11356->8659|12054->9329|12070->9335|12154->9396|12853->10067|12869->10073|12953->10134|13653->10806|13669->10812|13753->10873|14452->11544|14468->11550|14552->11611|15250->12281|15266->12287|15350->12348|16049->13019|16065->13025|16149->13086|17415->14324|17432->14330|17512->14387|19654->16502|19671->16508|19751->16565|21893->18680|21910->18686|21990->18743|24132->20858|24149->20864|24229->20921|25986->22651|26002->22657|26048->22681|26185->32613|26210->32619|26250->32621|26292->32634|26352->32663
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|38->7|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|107->76|107->76|107->76|108->77|108->77|108->77|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|110->79|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|115->84|115->84|115->84|118->94|119->95|120->96|120->96|120->96|120->96|120->96|120->96|122->98|122->98|122->98|125->101|125->101|125->101|125->101|125->101|125->101|125->101|126->102|126->102|126->102|126->102|126->102|126->102|126->102|126->102|128->104|128->104|128->104|134->110|134->110|134->110|135->111|135->111|135->111|136->112|136->112|136->112|137->113|137->113|137->113|143->119|144->120|144->120|144->120|145->121|146->122|148->124|150->126|150->126|150->126|170->146|170->146|170->146|183->159|183->159|183->159|196->172|196->172|196->172|209->185|209->185|209->185|222->198|222->198|222->198|235->211|235->211|235->211|248->224|248->224|248->224|278->254|278->254|278->254|309->285|309->285|309->285|340->316|340->316|340->316|371->347|371->347|371->347|398->374|398->374|398->374|402->615|403->616|403->616|404->617|406->619
                  -- GENERATED --
              */
          
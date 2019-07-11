
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Green House")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
  """),format.raw/*4.3*/("""<!-- HEADER STYLE -->

""")))}/*6.2*/{_display_(Seq[Any](format.raw/*6.3*/("""
  """),format.raw/*7.3*/("""<!-- CONTENT -->
  <!--Home Banner-->
  <section class="home-banner with-border">
      <!--Banner Slider-->
    <div class="banner-slider-container">
      <ul class="banner-slider owl-theme owl-carousel">
        <li class="slide-item" style="background-image:url("""),_display_(/*13.61*/routes/*13.67*/.Assets.versioned("app/images/main-slider/1.jpg")),format.raw/*13.116*/(""");"></li>
        <li class="slide-item" style="background-image:url("""),_display_(/*14.61*/routes/*14.67*/.Assets.versioned("app/images/main-slider/2.jpg")),format.raw/*14.116*/(""");"></li>
        <li class="slide-item" style="background-image:url("""),_display_(/*15.61*/routes/*15.67*/.Assets.versioned("app/images/main-slider/3.jpg")),format.raw/*15.116*/(""");"></li>
      </ul>
    </div>

      <!--Banner Search Form-->
    <div class="banner-search-container">
      <div class="form-outer">
        <div class="banner-search-form">
          <h1>Find your dream home just in a click</h1>
          <div class="text">Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur sint.</div>

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

            <!--Default Property Box-->
          <div class="default-property-box mix all for-rent col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*79.82*/routes/*79.88*/.Assets.versioned("app/images/resource/featured-image-1.jpg")),format.raw/*79.149*/("""" alt=""></a></figure>
                <div class="property-price">$1,000 / Month</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For rent</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

            <!--Default Property Box-->
          <div class="default-property-box mix all for-sell col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*110.82*/routes/*110.88*/.Assets.versioned("app/images/resource/featured-image-2.jpg")),format.raw/*110.149*/("""" alt=""></a></figure>
                <div class="property-price">$27,000</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For sell</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

            <!--Default Property Box-->
          <div class="default-property-box mix all for-rent col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*141.82*/routes/*141.88*/.Assets.versioned("app/images/resource/featured-image-3.jpg")),format.raw/*141.149*/("""" alt=""></a></figure>
                <div class="property-price">$15,00 / Month</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For rent</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

            <!--Default Property Box-->
          <div class="default-property-box mix all for-sell col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*172.82*/routes/*172.88*/.Assets.versioned("app/images/resource/featured-image-4.jpg")),format.raw/*172.149*/("""" alt=""></a></figure>
                <div class="property-price">$27,000</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For sell</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

            <!--Default Property Box-->
          <div class="default-property-box mix all for-rent col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*203.82*/routes/*203.88*/.Assets.versioned("app/images/resource/featured-image-5.jpg")),format.raw/*203.149*/("""" alt=""></a></figure>
                <div class="property-price">$800 / Month</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For rent</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

            <!--Default Property Box-->
          <div class="default-property-box mix all for-sell col-lg-4 col-md-6 col-sm-6 col-xs-12">
            <div class="inner-box">
              <div class="image-box">
                <figure class="image"><a href="property-details.html"><img src=""""),_display_(/*234.82*/routes/*234.88*/.Assets.versioned("app/images/resource/featured-image-6.jpg")),format.raw/*234.149*/("""" alt=""></a></figure>
                <div class="property-price">$27,000</div>
              </div>
              <div class="lower-content">
                <div class="rating-review">
                  <div class="ratings"><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span><span class="fa fa-star"></span></div>
                  <div class="rev">(105 reviews)</div>
                </div>
                <div class="property-title">
                  <h3><a href="property-details.html">146 Woodhaven Preserve</a></h3>
                  <div class="location"><span class="fa fa-map-marker"></span>&nbsp; 10037 North Douglas Hwy.</div>
                </div>
                <div class="prop-info clearfix">
                  <div class="prop-for"><span class="for">For sell</span><span class="area">1600 sq ft.</span></div>
                  <div class="link-box"><a href="property-details.html" class="theme-btn">View Details <span class="fa fa-angle-right"></span></a></div>
                </div>
                <div class="property-meta">
                  <ul class="clearfix">
                    <li><span class="icon fa fa-user"></span> Kelium Smith</li>
                    <li><span class="icon fa fa-calendar"></span> 02 Days ago</li>
                    <li class="options"><a href="#"><span class="fa fa-heart-o"></span></a> &ensp; <a href="#"><span class="fa fa-share-alt"></span></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>


        </div>
      </div>
      <div class="view-all"><a href="properties-list-one.html" class="theme-btn btn-style-two">Explore More Properties</a></div>

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
              <figure class="image"><img src=""""),_display_(/*283.48*/routes/*283.54*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*283.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Vegas</h4>
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
              <figure class="image"><img src=""""),_display_(/*296.48*/routes/*296.54*/.Assets.versioned("app/images/resource/featured-image-8.jpg")),format.raw/*296.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>New York</h4>
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
              <figure class="image"><img src=""""),_display_(/*309.48*/routes/*309.54*/.Assets.versioned("app/images/resource/featured-image-9.jpg")),format.raw/*309.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Angeles</h4>
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
              <figure class="image"><img src=""""),_display_(/*322.48*/routes/*322.54*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*322.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Vegas</h4>
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
              <figure class="image"><img src=""""),_display_(/*335.48*/routes/*335.54*/.Assets.versioned("app/images/resource/featured-image-8.jpg")),format.raw/*335.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>New York</h4>
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
              <figure class="image"><img src=""""),_display_(/*348.48*/routes/*348.54*/.Assets.versioned("app/images/resource/featured-image-9.jpg")),format.raw/*348.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Angeles</h4>
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
              <figure class="image"><img src=""""),_display_(/*361.48*/routes/*361.54*/.Assets.versioned("app/images/resource/featured-image-7.jpg")),format.raw/*361.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Vegas</h4>
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
              <figure class="image"><img src=""""),_display_(/*374.48*/routes/*374.54*/.Assets.versioned("app/images/resource/featured-image-8.jpg")),format.raw/*374.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>New York</h4>
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
              <figure class="image"><img src=""""),_display_(/*387.48*/routes/*387.54*/.Assets.versioned("app/images/resource/featured-image-9.jpg")),format.raw/*387.115*/("""" alt=""></figure>
              <div class="overlay-content">
                <h4>Las Angeles</h4>
                <div class="count">20 Properties</div>
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
                <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*417.78*/routes/*417.84*/.Assets.versioned("app/images/resource/team-image-1.jpg")),format.raw/*417.141*/("""" alt=""></a></figure>
              </div>
                <!--Content Column-->
              <div class="content-column col-md-7 col-sm-12 col-xs-12">
                <div class="inner">
                  <div class="title">
                    <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                    <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                  </div>
                  <div class="desc-text">Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
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
                <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*447.78*/routes/*447.84*/.Assets.versioned("app/images/resource/team-image-2.jpg")),format.raw/*447.141*/("""" alt=""></a></figure>
              </div>
                <!--Content Column-->
              <div class="content-column col-md-7 col-sm-12 col-xs-12">
                <div class="inner">
                  <div class="title">
                    <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                    <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                  </div>
                  <div class="desc-text">Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
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
                <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*477.78*/routes/*477.84*/.Assets.versioned("app/images/resource/team-image-3.jpg")),format.raw/*477.141*/("""" alt=""></a></figure>
              </div>
                <!--Content Column-->
              <div class="content-column col-md-7 col-sm-12 col-xs-12">
                <div class="inner">
                  <div class="title">
                    <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                    <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                  </div>
                  <div class="desc-text">Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
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
                <figure class="image"><a href="agent-single.html"><img src=""""),_display_(/*507.78*/routes/*507.84*/.Assets.versioned("app/images/resource/team-image-4.jpg")),format.raw/*507.141*/("""" alt=""></a></figure>
              </div>
                <!--Content Column-->
              <div class="content-column col-md-7 col-sm-12 col-xs-12">
                <div class="inner">
                  <div class="title">
                    <h3><a href="agent-single.html">Miraz Kadri</a></h3>
                    <div class="designation">Company Agent @<a href="#">Reki Housing</a></div>
                  </div>
                  <div class="desc-text">Duis aute irure dolor in voccaecat reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla.</div>
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

      <div class="view-all"><a href="agents.html" class="theme-btn btn-style-two">View More Agents</a></div>

    </div>
  </section>

"""),format.raw/*777.15*/("""

""")))}/*779.2*/{_display_(Seq[Any](format.raw/*779.3*/("""
  """),format.raw/*780.3*/("""<!-- FOOTER SCRIPT -->

""")))}),format.raw/*782.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 11 11:05:28 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/index.scala.html
                  HASH: 435c2a71afe4e05baa9e124f867a8b99c69cef3e
                  MATRIX: 941->1|1037->4|1064->6|1102->36|1141->38|1170->41|1211->65|1248->66|1277->69|1571->336|1586->342|1657->391|1754->461|1769->467|1840->516|1937->586|1952->592|2023->641|4547->3138|4562->3144|4645->3205|6568->5100|6584->5106|6668->5167|8584->7055|8600->7061|8684->7122|10607->9017|10623->9023|10707->9084|12623->10972|12639->10978|12723->11039|14644->12932|14660->12938|14744->12999|17011->15238|17027->15244|17111->15305|17606->15772|17622->15778|17706->15839|18200->16305|18216->16311|18300->16372|18797->16841|18813->16847|18897->16908|19392->17375|19408->17381|19492->17442|19986->17908|20002->17914|20086->17975|20583->18444|20599->18450|20683->18511|21178->18978|21194->18984|21278->19045|21772->19511|21788->19517|21872->19578|22792->20470|22808->20476|22888->20533|24405->22023|24421->22029|24501->22086|26018->23576|26034->23582|26114->23639|27631->25129|27647->25135|27727->25192|29051->37357|29073->37360|29112->37361|29143->37364|29199->37389
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|38->7|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|110->79|110->79|110->79|141->110|141->110|141->110|172->141|172->141|172->141|203->172|203->172|203->172|234->203|234->203|234->203|265->234|265->234|265->234|314->283|314->283|314->283|327->296|327->296|327->296|340->309|340->309|340->309|353->322|353->322|353->322|366->335|366->335|366->335|379->348|379->348|379->348|392->361|392->361|392->361|405->374|405->374|405->374|418->387|418->387|418->387|448->417|448->417|448->417|478->447|478->447|478->447|508->477|508->477|508->477|538->507|538->507|538->507|569->777|571->779|571->779|572->780|574->782
                  -- GENERATED --
              */
          
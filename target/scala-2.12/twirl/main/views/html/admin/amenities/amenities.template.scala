
package views.html.admin.amenities

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

object amenities extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Feature],List[Feature],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(createForm: Form[Feature], amenities: List[Feature]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import helper._


Seq[Any](format.raw/*2.1*/("""
    """),format.raw/*4.1*/("""
    """),_display_(/*5.6*/views/*5.11*/.html.admin.main("Amenities")/*5.40*/ {_display_(Seq[Any](format.raw/*5.42*/("""

    """)))}/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

        """),format.raw/*9.9*/("""<div class="animated fadeIn">
            <div class="row">
                <div class="col-lg-8">
                    <div class="card">
                        <div class="card-header">
                            <strong class="card-title">House Amenities</strong>
                        </div>
                        <div class="card-body card-block">
                            <div class="table-responsive">
                                <table class="table table-sm">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Name</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        """),_display_(/*27.42*/if(amenities.isEmpty())/*27.65*/ {_display_(Seq[Any](format.raw/*27.67*/("""
                                            """),format.raw/*28.45*/("""<tr>
                                                <td colspan="3" class="text-center">No Amenities</td>
                                            </tr>
                                        """)))}/*31.42*/else/*31.47*/{_display_(Seq[Any](format.raw/*31.48*/("""
                                            """),_display_(/*32.46*/for(amenity <- amenities) yield /*32.71*/ {_display_(Seq[Any](format.raw/*32.73*/("""
                                                """),format.raw/*33.49*/("""<tr>
                                                    <td>"""),_display_(/*34.58*/{amenities.indexOf(amenity)+1}),format.raw/*34.88*/("""</td>
                                                    <td>"""),_display_(/*35.58*/amenity/*35.65*/.name),format.raw/*35.70*/("""</td>
                                                    <td>
                                                        <a href="#" class="btn btn-primary btn-sm">Edit</a>
                                                        <a href=""""),_display_(/*38.67*/routes/*38.73*/.AmenitiesController.delete(amenity.id)),format.raw/*38.112*/(""""
                                                            class="btn btn-danger btn-sm">Delete</a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*42.46*/("""
                                        """)))}),format.raw/*43.42*/("""

                                    """),format.raw/*45.37*/("""</tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-header">
                            <strong class="card-title">Add New House Amenity</strong>
                        </div>
                        <div class="card-body card-block">
                        """),_display_(/*57.26*/form(routes.AmenitiesController.create())/*57.67*/ {_display_(Seq[Any](format.raw/*57.69*/("""
                            """),format.raw/*58.29*/("""<div class="form-group">
                                <label for="amenity" class=" form-control-label">Amenity</label>
                                <input type="text"
                                    value=""""),_display_(/*61.45*/createForm("name")/*61.63*/.value),format.raw/*61.69*/("""" name="name"
                                    id="amenity" placeholder="Enter name of amenity"
                                    class="form-control">
                                """),_display_(/*64.34*/if(createForm("name").errors.size > 0)/*64.72*/{_display_(Seq[Any](format.raw/*64.73*/("""
                                    """),_display_(/*65.38*/for(error <- createForm("name").errors) yield /*65.77*/{_display_(Seq[Any](format.raw/*65.78*/("""
                                        """),format.raw/*66.41*/("""<span class="text-danger">"""),_display_(/*66.68*/Messages(error.message())),format.raw/*66.93*/("""</span>
                                    """)))}),format.raw/*67.38*/("""
                                """)))}),format.raw/*68.34*/("""
                            """),format.raw/*69.29*/("""</div>

                            <div class="text-right">
                                <button class="btn btn-primary">Save</button>
                            </div>
                        """)))}),format.raw/*74.26*/("""
                        """),format.raw/*75.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>

    """)))}/*81.6*/ {_display_(Seq[Any](format.raw/*81.8*/("""


    """)))}),format.raw/*84.6*/("""
"""))
      }
    }
  }

  def render(createForm:Form[Feature],amenities:List[Feature]): play.twirl.api.HtmlFormat.Appendable = apply(createForm,amenities)

  def f:((Form[Feature],List[Feature]) => play.twirl.api.HtmlFormat.Appendable) = (createForm,amenities) => apply(createForm,amenities)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 22 07:53:39 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/amenities/amenities.scala.html
                  HASH: 4aa1f7b9b04c7f875158fe40b9755943172980d3
                  MATRIX: 989->1|1115->61|1159->55|1190->77|1221->83|1234->88|1271->117|1310->119|1334->126|1372->128|1408->138|2353->1056|2385->1079|2425->1081|2498->1126|2715->1324|2728->1329|2767->1330|2840->1376|2881->1401|2921->1403|2998->1452|3087->1514|3138->1544|3228->1607|3244->1614|3270->1619|3534->1856|3549->1862|3610->1901|3901->2161|3974->2203|4040->2241|4562->2736|4612->2777|4652->2779|4709->2808|4953->3025|4980->3043|5007->3049|5224->3239|5271->3277|5310->3278|5375->3316|5430->3355|5469->3356|5538->3397|5592->3424|5638->3449|5714->3494|5779->3528|5836->3557|6066->3756|6119->3781|6234->3878|6273->3880|6311->3888
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|36->5|38->7|38->7|40->9|58->27|58->27|58->27|59->28|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|66->35|66->35|69->38|69->38|69->38|73->42|74->43|76->45|88->57|88->57|88->57|89->58|92->61|92->61|92->61|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|99->68|100->69|105->74|106->75|112->81|112->81|115->84
                  -- GENERATED --
              */
          
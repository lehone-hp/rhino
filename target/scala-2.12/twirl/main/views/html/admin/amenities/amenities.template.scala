
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

object amenities extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Amenities")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

""")))}/*5.2*/ {_display_(Seq[Any](format.raw/*5.4*/("""

    """),format.raw/*7.5*/("""<div class="animated fadeIn">
        <div class="row">
            <div class="col-lg-8">
                <div class="card">
                    <div class="card-header">
                        <strong class="card-title">Custom Table</strong>
                    </div>
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Name</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>Fence</td>
                                    <td>
                                        <a href="#" class="btn btn-primary btn-sm">Edit</a>
                                        <a href="#" class="btn btn-danger btn-sm">Delete</a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="card">
                    <div class="card-header">
                        <strong class="card-title">Add New House Amenity</strong>
                    </div>
                    <div class="card-body card-block">
                        <div class="form-group">
                            <label for="amenity" class=" form-control-label">Amenity</label>
                            <input type="text"
                                id="amenity" placeholder="Enter name of amenity"
                                class="form-control">
                        </div>

                        <div class="text-right">
                            <button class="btn btn-primary">Save</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}/*59.2*/ {_display_(Seq[Any](format.raw/*59.4*/("""


""")))}),format.raw/*62.2*/("""
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
                  DATE: Tue May 14 07:55:11 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/amenities/amenities.scala.html
                  HASH: f6399a054fa141eb6e6de8b606a3b72c0ddc0a17
                  MATRIX: 961->1|1057->4|1084->6|1096->11|1133->40|1172->42|1192->45|1230->47|1262->53|3463->2236|3502->2238|3536->2242
                  LINES: 28->1|33->2|34->3|34->3|34->3|34->3|36->5|36->5|38->7|90->59|90->59|93->62
                  -- GENERATED --
              */
          
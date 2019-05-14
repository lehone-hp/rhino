
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/views/*3.7*/.html.admin.main("Dashboard")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.37*/("""

    """),format.raw/*7.5*/("""<style>
            #weatherWidget .currentDesc """),format.raw/*8.41*/("""{"""),format.raw/*8.42*/("""
                """),format.raw/*9.17*/("""color: #ffffff !important;
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/("""

            """),format.raw/*12.13*/(""".traffic-chart """),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
                """),format.raw/*13.17*/("""min-height: 335px;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""

            """),format.raw/*16.13*/("""#flotPie1 """),format.raw/*16.23*/("""{"""),format.raw/*16.24*/("""
                """),format.raw/*17.17*/("""height: 150px;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""

            """),format.raw/*20.13*/("""#flotPie1 td """),format.raw/*20.26*/("""{"""),format.raw/*20.27*/("""
                """),format.raw/*21.17*/("""padding: 3px;
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""#flotPie1 table """),format.raw/*24.29*/("""{"""),format.raw/*24.30*/("""
                """),format.raw/*25.17*/("""top: 20px !important;
                right: -10px !important;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""

            """),format.raw/*29.13*/(""".chart-container """),format.raw/*29.30*/("""{"""),format.raw/*29.31*/("""
                """),format.raw/*30.17*/("""display: table;
                min-width: 270px ;
                text-align: left;
                padding-top: 10px;
                padding-bottom: 10px;
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""

            """),format.raw/*37.13*/("""#flotLine5 """),format.raw/*37.24*/("""{"""),format.raw/*37.25*/("""
                """),format.raw/*38.17*/("""height: 105px;
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""#flotBarChart """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
                """),format.raw/*42.17*/("""height: 150px;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""

            """),format.raw/*45.13*/("""#cellPaiChart """),format.raw/*45.27*/("""{"""),format.raw/*45.28*/("""
                """),format.raw/*46.17*/("""height: 160px;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""

    """),format.raw/*49.5*/("""</style>
""")))}/*50.2*/ {_display_(Seq[Any](format.raw/*50.4*/("""
    """),format.raw/*51.37*/("""
        """),format.raw/*52.9*/("""<!-- Widgets  -->
    <div class="row">
        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-body">
                    <div class="stat-widget-five">
                        <div class="stat-icon dib flat-color-1">
                            <i class="pe-7f-cash"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text">$<span class="count">23569</span></div>
                                <div class="stat-heading">Revenue</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-body">
                    <div class="stat-widget-five">
                        <div class="stat-icon dib flat-color-2">
                            <i class="pe-7f-cart"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">3435</span></div>
                                <div class="stat-heading">Sales</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-body">
                    <div class="stat-widget-five">
                        <div class="stat-icon dib flat-color-3">
                            <i class="pe-7f-browser"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">349</span></div>
                                <div class="stat-heading">Templates</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-6">
            <div class="card">
                <div class="card-body">
                    <div class="stat-widget-five">
                        <div class="stat-icon dib flat-color-4">
                            <i class="pe-7f-users"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">2986</span></div>
                                <div class="stat-heading">Clients</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- Widgets End -->


        <!--  Traffic  -->
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body">
                    <h4 class="box-title">Traffic </h4>
                </div>
                <div class="row">
                    <div class="col-lg-8">
                        <div class="card-body">
                                <!-- <canvas id="TrafficChart"></canvas>   -->
                            <div id="traffic-chart" class="traffic-chart"></div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="card-body">
                            <div class="progress-box progress-1">
                                <h4 class="por-title">Visits</h4>
                                <div class="por-txt">96,930 Users (40%)</div>
                                <div class="progress mb-2" style="height: 5px;">
                                    <div class="progress-bar bg-flat-color-1" role="progressbar" style="width: 40%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                            <div class="progress-box progress-2">
                                <h4 class="por-title">Bounce Rate</h4>
                                <div class="por-txt">3,220 Users (24%)</div>
                                <div class="progress mb-2" style="height: 5px;">
                                    <div class="progress-bar bg-flat-color-2" role="progressbar" style="width: 24%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                            <div class="progress-box progress-2">
                                <h4 class="por-title">Unique Visitors</h4>
                                <div class="por-txt">29,658 Users (60%)</div>
                                <div class="progress mb-2" style="height: 5px;">
                                    <div class="progress-bar bg-flat-color-3" role="progressbar" style="width: 60%;" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                            <div class="progress-box progress-2">
                                <h4 class="por-title">Targeted  Visitors</h4>
                                <div class="por-txt">99,658 Users (90%)</div>
                                <div class="progress mb-2" style="height: 5px;">
                                    <div class="progress-bar bg-flat-color-4" role="progressbar" style="width: 90%;" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
                                </div>
                            </div>
                        </div> <!-- /.card-body -->
                    </div>
                </div> <!-- /.row -->
                <div class="card-body"></div>
            </div>
        </div><!-- /# column -->
    </div>
        <!--  Traffic  End -->


    <div class="clearfix"></div>
    <div class="orders">
        <div class="row">
            <div class="col-xl-8">
                <div class="card">
                    <div class="card-body">
                        <h4 class="box-title">Orders </h4>
                    </div>
                    <div class="card-body--">
                        <div class="table-stats order-table ov-h">
                            <table class="table ">
                                <thead>
                                    <tr>
                                        <th class="serial">#</th>
                                        <th class="avatar">Avatar</th>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Product</th>
                                        <th>Quantity</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="serial">1.</td>
                                        <td class="avatar">
                                            <div class="round-img">
                                                <a href="#"><img class="rounded-circle" src="images/avatar/1.jpg" alt=""></a>
                                            </div>
                                        </td>
                                        <td> #5469 </td>
                                        <td>  <span class="name">Louis Stanley</span> </td>
                                        <td> <span class="product">iMax</span> </td>
                                        <td><span class="count">231</span></td>
                                        <td>
                                            <span class="badge badge-complete">Complete</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="serial">2.</td>
                                        <td class="avatar">
                                            <div class="round-img">
                                                <a href="#"><img class="rounded-circle" src="images/avatar/2.jpg" alt=""></a>
                                            </div>
                                        </td>
                                        <td> #5468 </td>
                                        <td>  <span class="name">Gregory Dixon</span> </td>
                                        <td> <span class="product">iPad</span> </td>
                                        <td><span class="count">250</span></td>
                                        <td>
                                            <span class="badge badge-complete">Complete</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="serial">3.</td>
                                        <td class="avatar">
                                            <div class="round-img">
                                                <a href="#"><img class="rounded-circle" src="images/avatar/3.jpg" alt=""></a>
                                            </div>
                                        </td>
                                        <td> #5467 </td>
                                        <td>  <span class="name">Catherine Dixon</span> </td>
                                        <td> <span class="product">SSD</span> </td>
                                        <td><span class="count">250</span></td>
                                        <td>
                                            <span class="badge badge-complete">Complete</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="serial">4.</td>
                                        <td class="avatar">
                                            <div class="round-img">
                                                <a href="#"><img class="rounded-circle" src="images/avatar/4.jpg" alt=""></a>
                                            </div>
                                        </td>
                                        <td> #5466 </td>
                                        <td>  <span class="name">Mary Silva</span> </td>
                                        <td> <span class="product">Magic Mouse</span> </td>
                                        <td><span class="count">250</span></td>
                                        <td>
                                            <span class="badge badge-pending">Pending</span>
                                        </td>
                                    </tr>
                                    <tr class=" pb-0">
                                        <td class="serial">5.</td>
                                        <td class="avatar pb-0">
                                            <div class="round-img">
                                                <a href="#"><img class="rounded-circle" src="images/avatar/6.jpg" alt=""></a>
                                            </div>
                                        </td>
                                        <td> #5465 </td>
                                        <td>  <span class="name">Johnny Stephens</span> </td>
                                        <td> <span class="product">Monitor</span> </td>
                                        <td><span class="count">250</span></td>
                                        <td>
                                            <span class="badge badge-complete">Complete</span>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div> <!-- /.table-stats -->
                    </div>
                </div> <!-- /.card -->
            </div>  <!-- /.col-lg-8 -->

            <div class="col-xl-4">
                <div class="row">
                    <div class="col-lg-6 col-xl-12">
                        <div class="card br-0">
                            <div class="card-body">
                                <div class="chart-container ov-h">
                                    <div id="flotPie1" class="float-chart"></div>
                                </div>
                            </div>
                        </div><!-- /.card -->
                    </div>

                    <div class="col-lg-6 col-xl-12">
                        <div class="card bg-flat-color-3  ">
                            <div class="card-body">
                                <h4 class="card-title m-0  white-color ">August 2018</h4>
                            </div>
                            <div class="card-body">
                                <div id="flotLine5" class="flot-line"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> <!-- /.col-md-4 -->
        </div>
    </div>
        <!-- /.order -->


        <!-- To Do and Live Chat -->
    <div class="row">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title box-title">To Do List</h4>
                    <div class="card-content">
                        <div class="todo-list">
                            <div class="tdl-holder">
                                <div class="tdl-content">
                                    <ul>
                                        <li>
                                            <label>
                                                <input type="checkbox"><i class="check-box"></i><span>
                                                Conveniently fabricate interactive technology for ....</span>
                                                <a href='#' class="fa fa-times"></a>
                                                <a href='#' class="fa fa-pencil"></a>
                                                <a href='#' class="fa fa-check"></a>
                                            </label>
                                        </li>
                                        <li>
                                            <label>
                                                <input type="checkbox"><i class="check-box"></i><span>
                                                Creating component page</span>
                                                <a href='#' class="fa fa-times"></a>
                                                <a href='#' class="fa fa-pencil"></a>
                                                <a href='#' class="fa fa-check"></a>
                                            </label>
                                        </li>
                                        <li>
                                            <label>
                                                <input type="checkbox" checked><i class="check-box"></i><span>
                                                Follow back those who follow you</span>
                                                <a href='#' class="fa fa-times"></a>
                                                <a href='#' class="fa fa-pencil"></a>
                                                <a href='#' class="fa fa-check"></a>
                                            </label>
                                        </li>
                                        <li>
                                            <label>
                                                <input type="checkbox" checked><i class="check-box"></i><span>
                                                Design One page theme</span>
                                                <a href='#' class="fa fa-times"></a>
                                                <a href='#' class="fa fa-pencil"></a>
                                                <a href='#' class="fa fa-check"></a>
                                            </label>
                                        </li>

                                        <li>
                                            <label>
                                                <input type="checkbox" checked><i class="check-box"></i><span>
                                                Creating component page</span>
                                                <a href='#' class="fa fa-times"></a>
                                                <a href='#' class="fa fa-pencil"></a>
                                                <a href='#' class="fa fa-check"></a>
                                            </label>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div> <!-- /.todo-list -->
                    </div>
                </div> <!-- /.card-body -->
            </div><!-- /.card -->
        </div>

        <div class="col-lg-6">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title box-title">Live Chat</h4>
                    <div class="card-content">
                        <div class="messenger-box">
                            <ul>
                                <li>
                                    <div class="msg-received msg-container">
                                        <div class="avatar">
                                            <img src="images/avatar/64-1.jpg" alt="">
                                            <div class="send-time">11.11 am</div>
                                        </div>
                                        <div class="msg-box">
                                            <div class="inner-box">
                                                <div class="name">
                                                    John Doe
                                                </div>
                                                <div class="meg">
                                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perspiciatis sunt placeat velit ad reiciendis ipsam
                                                </div>
                                            </div>
                                        </div>
                                    </div><!-- /.msg-received -->
                                </li>
                                <li>
                                    <div class="msg-sent msg-container">
                                        <div class="avatar">
                                            <img src="images/avatar/64-2.jpg" alt="">
                                            <div class="send-time">11.11 am</div>
                                        </div>
                                        <div class="msg-box">
                                            <div class="inner-box">
                                                <div class="name">
                                                    John Doe
                                                </div>
                                                <div class="meg">
                                                    Hay how are you doing?
                        """),
format.raw("""                        </div>
                                            </div>
                                        </div>
                                    </div><!-- /.msg-sent -->
                                </li>
                            </ul>
                            <div class="send-mgs">
                                <div class="yourmsg">
                                    <input class="form-control" type="text">
                                </div>
                                <button class="btn msg-send-btn">
                                    <i class="pe-7f-paper-plane"></i>
                                </button>
                            </div>
                        </div><!-- /.messenger-box -->
                    </div>
                </div> <!-- /.card-body -->
            </div><!-- /.card -->
        </div>

    </div>
        <!-- /.row -->
        <!-- To Do and Live Chat End -->


        <!-- Calender Chart Weather  -->
    <div class="row">
        <div class="col-md-12 col-lg-4">
            <div class="card">
                <div class="card-body">
                        <!-- <h4 class="box-title">Chandler</h4> -->
                    <div class="calender-cont widget-calender">
                        <div id="calendar"></div>
                    </div>
                </div>
            </div><!-- /.card -->
        </div>

        <div class="col-lg-4 col-md-6">
            <div class="card ov-h">
                <div class="card-body bg-flat-color-2">
                    <div id="flotBarChart" class="float-chart ml-4 mr-4"></div>
                </div>
                <div id="cellPaiChart" class="float-chart"></div>
            </div><!-- /.card -->
        </div>
        <div class="col-lg-4 col-md-6">
            <div class="card weather-box">
                <h4 class="weather-title box-title">Weather</h4>
                <div class="card-body">
                    <div class="weather-widget">
                        <div id="weather-one" class="weather-one"></div>
                    </div>
                </div>
            </div><!-- /.card -->
        </div>
    </div>
        <!-- /.row -->
        <!-- Calender Chart Weather  End -->


    <div class="modal fade none-border" id="event-modal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"><strong>Add New Event</strong></h4>
                </div>
                <div class="modal-body"></div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-success save-event waves-effect waves-light">
                        Create event</button>
                    <button type="button" class="btn btn-danger delete-event waves-effect waves-light" data-dismiss="modal">
                        Delete</button>
                </div>
            </div>
        </div>
    </div>

        <!-- Modal Add Category -->
    <div class="modal fade none-border" id="add-category">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"><strong>Add a category </strong></h4>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="row">
                            <div class="col-md-6">
                                <label class="control-label">Category Name</label>
                                <input class="form-control form-white" placeholder="Enter name" type="text" name="category-name"/>
                            </div>
                            <div class="col-md-6">
                                <label class="control-label">Choose Category Color</label>
                                <select class="form-control form-white" data-placeholder="Choose a color..." name="category-color">
                                    <option value="success">Success</option>
                                    <option value="danger">Danger</option>
                                    <option value="info">Info</option>
                                    <option value="pink">Pink</option>
                                    <option value="primary">Primary</option>
                                    <option value="warning">Warning</option>
                                </select>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-danger waves-effect waves-light save-category" data-dismiss="modal">
                        Save</button>
                </div>
            </div>
        </div>
    </div>
        <!-- END MODAL -->
""")))}/*539.2*/ {_display_(Seq[Any](format.raw/*539.4*/("""
    """),format.raw/*540.37*/("""
    """),format.raw/*541.5*/("""<script type="ff61747dd8d7db758f2acf61-text/javascript">
        jQuery(document).ready(function($) """),format.raw/*542.44*/("""{"""),format.raw/*542.45*/("""
            """),format.raw/*543.13*/(""""use strict";

            // Pie chart flotPie1
            var piedata = [
                """),format.raw/*547.17*/("""{"""),format.raw/*547.18*/(""" """),format.raw/*547.19*/("""label: "Desktop visits", data: [[1,32]], color: '#5c6bc0'"""),format.raw/*547.76*/("""}"""),format.raw/*547.77*/(""",
                """),format.raw/*548.17*/("""{"""),format.raw/*548.18*/(""" """),format.raw/*548.19*/("""label: "Tab visits", data: [[1,33]], color: '#ef5350'"""),format.raw/*548.72*/("""}"""),format.raw/*548.73*/(""",
                """),format.raw/*549.17*/("""{"""),format.raw/*549.18*/(""" """),format.raw/*549.19*/("""label: "Mobile visits", data: [[1,35]], color: '#66bb6a'"""),format.raw/*549.75*/("""}"""),format.raw/*549.76*/("""
            """),format.raw/*550.13*/("""];

            $.plot('#flotPie1', piedata, """),format.raw/*552.42*/("""{"""),format.raw/*552.43*/("""
                """),format.raw/*553.17*/("""series: """),format.raw/*553.25*/("""{"""),format.raw/*553.26*/("""
                    """),format.raw/*554.21*/("""pie: """),format.raw/*554.26*/("""{"""),format.raw/*554.27*/("""
                        """),format.raw/*555.25*/("""show: true,
                        radius: 1,
                        innerRadius: 0.65,
                        label: """),format.raw/*558.32*/("""{"""),format.raw/*558.33*/("""
                            """),format.raw/*559.29*/("""show: true,
                            radius: 2/3,
                            threshold: 1
                        """),format.raw/*562.25*/("""}"""),format.raw/*562.26*/(""",
                        stroke: """),format.raw/*563.33*/("""{"""),format.raw/*563.34*/("""
                            """),format.raw/*564.29*/("""width: 0
                        """),format.raw/*565.25*/("""}"""),format.raw/*565.26*/("""
                    """),format.raw/*566.21*/("""}"""),format.raw/*566.22*/("""
                """),format.raw/*567.17*/("""}"""),format.raw/*567.18*/(""",
                grid: """),format.raw/*568.23*/("""{"""),format.raw/*568.24*/("""
                    """),format.raw/*569.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*571.17*/("""}"""),format.raw/*571.18*/("""
            """),format.raw/*572.13*/("""}"""),format.raw/*572.14*/(""");

            // Pie chart flotPie1  End




            var cellPaiChart = [
                """),format.raw/*580.17*/("""{"""),format.raw/*580.18*/(""" """),format.raw/*580.19*/("""label: "Direct Sell", data: [[1,65]], color: '#5b83de'"""),format.raw/*580.73*/("""}"""),format.raw/*580.74*/(""",
                """),format.raw/*581.17*/("""{"""),format.raw/*581.18*/(""" """),format.raw/*581.19*/("""label: "Channel Sell", data: [[1,35]], color: '#00bfa5'"""),format.raw/*581.74*/("""}"""),format.raw/*581.75*/("""
            """),format.raw/*582.13*/("""];
            $.plot('#cellPaiChart', cellPaiChart, """),format.raw/*583.51*/("""{"""),format.raw/*583.52*/("""
                """),format.raw/*584.17*/("""series: """),format.raw/*584.25*/("""{"""),format.raw/*584.26*/("""
                    """),format.raw/*585.21*/("""pie: """),format.raw/*585.26*/("""{"""),format.raw/*585.27*/("""
                        """),format.raw/*586.25*/("""show: true,
                        stroke: """),format.raw/*587.33*/("""{"""),format.raw/*587.34*/("""
                            """),format.raw/*588.29*/("""width: 0
                        """),format.raw/*589.25*/("""}"""),format.raw/*589.26*/("""
                    """),format.raw/*590.21*/("""}"""),format.raw/*590.22*/("""
                """),format.raw/*591.17*/("""}"""),format.raw/*591.18*/(""",
                legend: """),format.raw/*592.25*/("""{"""),format.raw/*592.26*/("""
                    """),format.raw/*593.21*/("""show: false
                """),format.raw/*594.17*/("""}"""),format.raw/*594.18*/(""",grid: """),format.raw/*594.25*/("""{"""),format.raw/*594.26*/("""
                    """),format.raw/*595.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*597.17*/("""}"""),format.raw/*597.18*/("""

            """),format.raw/*599.13*/("""}"""),format.raw/*599.14*/(""");















            // Line Chart  #flotLine5
            var newCust = [[0, 3], [1, 5], [2,4], [3, 7], [4, 9], [5, 3], [6, 6], [7, 4], [8, 10]];

            var plot = $.plot($('#flotLine5'),["""),format.raw/*618.48*/("""{"""),format.raw/*618.49*/("""
                """),format.raw/*619.17*/("""data: newCust,
                label: 'New Data Flow',
                color: '#fff'
            """),format.raw/*622.13*/("""}"""),format.raw/*622.14*/("""],
            """),format.raw/*623.13*/("""{"""),format.raw/*623.14*/("""
                """),format.raw/*624.17*/("""series: """),format.raw/*624.25*/("""{"""),format.raw/*624.26*/("""
                    """),format.raw/*625.21*/("""lines: """),format.raw/*625.28*/("""{"""),format.raw/*625.29*/("""
                        """),format.raw/*626.25*/("""show: true,
                        lineColor: '#fff',
                        lineWidth: 2
                    """),format.raw/*629.21*/("""}"""),format.raw/*629.22*/(""",
                    points: """),format.raw/*630.29*/("""{"""),format.raw/*630.30*/("""
                        """),format.raw/*631.25*/("""show: true,
                        fill: true,
                        fillColor: "#ffffff",
                        symbol: "circle",
                        radius: 3
                    """),format.raw/*636.21*/("""}"""),format.raw/*636.22*/(""",
                    shadowSize: 0
                """),format.raw/*638.17*/("""}"""),format.raw/*638.18*/(""",
                points: """),format.raw/*639.25*/("""{"""),format.raw/*639.26*/("""
                    """),format.raw/*640.21*/("""show: true,
                """),format.raw/*641.17*/("""}"""),format.raw/*641.18*/(""",
                legend: """),format.raw/*642.25*/("""{"""),format.raw/*642.26*/("""
                    """),format.raw/*643.21*/("""show: false
                """),format.raw/*644.17*/("""}"""),format.raw/*644.18*/(""",
                grid: """),format.raw/*645.23*/("""{"""),format.raw/*645.24*/("""
                    """),format.raw/*646.21*/("""show: false
                """),format.raw/*647.17*/("""}"""),format.raw/*647.18*/("""
            """),format.raw/*648.13*/("""}"""),format.raw/*648.14*/(""");

             // Line Chart  #flotLine5 End





            // Traffic Chart using chartist
            if ($('#traffic-chart').length) """),format.raw/*657.45*/("""{"""),format.raw/*657.46*/("""
                """),format.raw/*658.17*/("""var chart = new Chartist.Line('#traffic-chart', """),format.raw/*658.65*/("""{"""),format.raw/*658.66*/("""
                  """),format.raw/*659.19*/("""labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
                  series: [
                  [0, 18000, 35000,  25000,  22000,  0],
                  [0, 33000, 15000,  20000,  15000,  300],
                  [0, 15000, 28000,  15000,  30000,  5000]
                  ]
              """),format.raw/*665.15*/("""}"""),format.raw/*665.16*/(""", """),format.raw/*665.18*/("""{"""),format.raw/*665.19*/("""
                  """),format.raw/*666.19*/("""low: 0,
                  showArea: true,
                  showLine: false,
                  showPoint: false,
                  fullWidth: true,
                  axisX: """),format.raw/*671.26*/("""{"""),format.raw/*671.27*/("""
                    """),format.raw/*672.21*/("""showGrid: true
                """),format.raw/*673.17*/("""}"""),format.raw/*673.18*/("""
            """),format.raw/*674.13*/("""}"""),format.raw/*674.14*/(""");

                chart.on('draw', function(data) """),format.raw/*676.49*/("""{"""),format.raw/*676.50*/("""
                    """),format.raw/*677.21*/("""if(data.type === 'line' || data.type === 'area') """),format.raw/*677.70*/("""{"""),format.raw/*677.71*/("""
                        """),format.raw/*678.25*/("""data.element.animate("""),format.raw/*678.46*/("""{"""),format.raw/*678.47*/("""
                            """),format.raw/*679.29*/("""d: """),format.raw/*679.32*/("""{"""),format.raw/*679.33*/("""
                                """),format.raw/*680.33*/("""begin: 2000 * data.index,
                                dur: 2000,
                                from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
                                to: data.path.clone().stringify(),
                                easing: Chartist.Svg.Easing.easeOutQuint
                            """),format.raw/*685.29*/("""}"""),format.raw/*685.30*/("""
                        """),format.raw/*686.25*/("""}"""),format.raw/*686.26*/(""");
                    """),format.raw/*687.21*/("""}"""),format.raw/*687.22*/("""
                """),format.raw/*688.17*/("""}"""),format.raw/*688.18*/(""");
            """),format.raw/*689.13*/("""}"""),format.raw/*689.14*/("""
            """),format.raw/*690.13*/("""// Traffic Chart using chartist End




            //Traffic chart chart-js
            if ($('#TrafficChart').length) """),format.raw/*696.44*/("""{"""),format.raw/*696.45*/("""
                """),format.raw/*697.17*/("""var ctx = document.getElementById( "TrafficChart" );
                ctx.height = 150;
                var myChart = new Chart( ctx, """),format.raw/*699.47*/("""{"""),format.raw/*699.48*/("""
                    """),format.raw/*700.21*/("""type: 'line',
                    data: """),format.raw/*701.27*/("""{"""),format.raw/*701.28*/("""
                        """),format.raw/*702.25*/("""labels: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" ],
                        datasets: [
                        """),format.raw/*704.25*/("""{"""),format.raw/*704.26*/("""
                            """),format.raw/*705.29*/("""label: "Visit",
                            borderColor: "rgba(4, 73, 203,.09)",
                            borderWidth: "1",
                            backgroundColor: "rgba(4, 73, 203,.5)",
                            data: [ 0, 2900, 5000, 3300, 6000, 3250, 0 ]
                        """),format.raw/*710.25*/("""}"""),format.raw/*710.26*/(""",
                        """),format.raw/*711.25*/("""{"""),format.raw/*711.26*/("""
                            """),format.raw/*712.29*/("""label: "Bounce",
                            borderColor: "rgba(245, 23, 66, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(245, 23, 66,.5)",
                            pointHighlightStroke: "rgba(245, 23, 66,.5)",
                            data: [ 0, 4200, 4500, 1600, 4200, 1500, 4000 ]
                        """),format.raw/*718.25*/("""}"""),format.raw/*718.26*/(""",
                        """),format.raw/*719.25*/("""{"""),format.raw/*719.26*/("""
                            """),format.raw/*720.29*/("""label: "Targeted",
                            borderColor: "rgba(40, 169, 46, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(40, 169, 46, .5)",
                            pointHighlightStroke: "rgba(40, 169, 46,.5)",
                            data: [1000, 5200, 3600, 2600, 4200, 5300, 0 ]
                        """),format.raw/*726.25*/("""}"""),format.raw/*726.26*/("""
                        """),format.raw/*727.25*/("""]
                    """),format.raw/*728.21*/("""}"""),format.raw/*728.22*/(""",
                    options: """),format.raw/*729.30*/("""{"""),format.raw/*729.31*/("""
                        """),format.raw/*730.25*/("""responsive: true,
                        tooltips: """),format.raw/*731.35*/("""{"""),format.raw/*731.36*/("""
                            """),format.raw/*732.29*/("""mode: 'index',
                            intersect: false
                        """),format.raw/*734.25*/("""}"""),format.raw/*734.26*/(""",
                        hover: """),format.raw/*735.32*/("""{"""),format.raw/*735.33*/("""
                            """),format.raw/*736.29*/("""mode: 'nearest',
                            intersect: true
                        """),format.raw/*738.25*/("""}"""),format.raw/*738.26*/("""

                    """),format.raw/*740.21*/("""}"""),format.raw/*740.22*/("""
                """),format.raw/*741.17*/("""}"""),format.raw/*741.18*/(""" """),format.raw/*741.19*/(""");
            """),format.raw/*742.13*/("""}"""),format.raw/*742.14*/("""
            """),format.raw/*743.13*/("""//Traffic chart chart-js  End



            // Bar Chart #flotBarChart
            $.plot("#flotBarChart", ["""),format.raw/*748.38*/("""{"""),format.raw/*748.39*/("""
                """),format.raw/*749.17*/("""data: [[0, 18], [2, 8], [4, 5], [6, 13],[8,5], [10,7],[12,4], [14,6],[16,15], [18, 9],[20,17], [22,7],[24,4], [26,9],[28,11]],
                bars: """),format.raw/*750.23*/("""{"""),format.raw/*750.24*/("""
                    """),format.raw/*751.21*/("""show: true,
                    lineWidth: 0,
                    fillColor: '#ffffff8a'
                """),format.raw/*754.17*/("""}"""),format.raw/*754.18*/("""
            """),format.raw/*755.13*/("""}"""),format.raw/*755.14*/("""], """),format.raw/*755.17*/("""{"""),format.raw/*755.18*/("""
                """),format.raw/*756.17*/("""grid: """),format.raw/*756.23*/("""{"""),format.raw/*756.24*/("""
                    """),format.raw/*757.21*/("""show: false
                """),format.raw/*758.17*/("""}"""),format.raw/*758.18*/("""
            """),format.raw/*759.13*/("""}"""),format.raw/*759.14*/(""");
            // Bar Chart #flotBarChart End

        """),format.raw/*762.9*/("""}"""),format.raw/*762.10*/(""");  // End of Document Ready
    </script>
""")))}),format.raw/*764.2*/("""
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
                  DATE: Tue May 14 07:09:26 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/dashboard.scala.html
                  HASH: 1a9bfd192697ef820cebaf00a9ea83cc2b518f4e
                  MATRIX: 951->1|1047->4|1074->6|1086->11|1123->40|1162->42|1195->80|1227->86|1302->134|1330->135|1374->152|1441->191|1470->192|1512->206|1555->221|1584->222|1629->239|1688->270|1717->271|1759->285|1797->295|1826->296|1871->313|1926->340|1955->341|1997->355|2038->368|2067->369|2112->386|2166->412|2195->413|2237->427|2281->443|2310->444|2355->461|2458->536|2487->537|2529->551|2574->568|2603->569|2648->586|2846->756|2875->757|2917->771|2956->782|2985->783|3030->800|3085->827|3114->828|3156->842|3198->856|3227->857|3272->874|3327->901|3356->902|3398->916|3440->930|3469->931|3514->948|3569->975|3598->976|3631->982|3659->992|3698->994|3731->1031|3767->1040|29174->26408|29214->26410|29248->26447|29281->26452|29410->26552|29440->26553|29482->26566|29604->26659|29634->26660|29664->26661|29750->26718|29780->26719|29827->26737|29857->26738|29887->26739|29969->26792|29999->26793|30046->26811|30076->26812|30106->26813|30191->26869|30221->26870|30263->26883|30337->26928|30367->26929|30413->26946|30450->26954|30480->26955|30530->26976|30564->26981|30594->26982|30648->27007|30798->27128|30828->27129|30886->27158|31033->27276|31063->27277|31126->27311|31156->27312|31214->27341|31276->27374|31306->27375|31356->27396|31386->27397|31432->27414|31462->27415|31515->27439|31545->27440|31595->27461|31693->27530|31723->27531|31765->27544|31795->27545|31920->27641|31950->27642|31980->27643|32063->27697|32093->27698|32140->27716|32170->27717|32200->27718|32284->27773|32314->27774|32356->27787|32438->27840|32468->27841|32514->27858|32551->27866|32581->27867|32631->27888|32665->27893|32695->27894|32749->27919|32822->27963|32852->27964|32910->27993|32972->28026|33002->28027|33052->28048|33082->28049|33128->28066|33158->28067|33213->28093|33243->28094|33293->28115|33350->28143|33380->28144|33416->28151|33446->28152|33496->28173|33594->28242|33624->28243|33667->28257|33697->28258|33930->28462|33960->28463|34006->28480|34132->28577|34162->28578|34206->28593|34236->28594|34282->28611|34319->28619|34349->28620|34399->28641|34435->28648|34465->28649|34519->28674|34660->28786|34690->28787|34749->28817|34779->28818|34833->28843|35052->29033|35082->29034|35163->29086|35193->29087|35248->29113|35278->29114|35328->29135|35385->29163|35415->29164|35470->29190|35500->29191|35550->29212|35607->29240|35637->29241|35690->29265|35720->29266|35770->29287|35827->29315|35857->29316|35899->29329|35929->29330|36098->29470|36128->29471|36174->29488|36251->29536|36281->29537|36329->29556|36647->29845|36677->29846|36708->29848|36738->29849|36786->29868|36988->30041|37018->30042|37068->30063|37128->30094|37158->30095|37200->30108|37230->30109|37311->30161|37341->30162|37391->30183|37469->30232|37499->30233|37553->30258|37603->30279|37633->30280|37691->30309|37723->30312|37753->30313|37815->30346|38200->30702|38230->30703|38284->30728|38314->30729|38366->30752|38396->30753|38442->30770|38472->30771|38516->30786|38546->30787|38588->30800|38737->30920|38767->30921|38813->30938|38975->31071|39005->31072|39055->31093|39124->31133|39154->31134|39208->31159|39358->31280|39388->31281|39446->31310|39767->31602|39797->31603|39852->31629|39882->31630|39940->31659|40342->32032|40372->32033|40427->32059|40457->32060|40515->32089|40919->32464|40949->32465|41003->32490|41054->32512|41084->32513|41144->32544|41174->32545|41228->32570|41309->32622|41339->32623|41397->32652|41510->32736|41540->32737|41602->32770|41632->32771|41690->32800|41804->32885|41834->32886|41885->32908|41915->32909|41961->32926|41991->32927|42021->32928|42065->32943|42095->32944|42137->32957|42275->33066|42305->33067|42351->33084|42529->33233|42559->33234|42609->33255|42743->33360|42773->33361|42815->33374|42845->33375|42877->33378|42907->33379|42953->33396|42988->33402|43018->33403|43068->33424|43125->33452|43155->33453|43197->33466|43227->33467|43310->33522|43340->33523|43415->33567
                  LINES: 28->1|33->2|34->3|34->3|34->3|34->3|36->5|38->7|39->8|39->8|40->9|41->10|41->10|43->12|43->12|43->12|44->13|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|58->27|58->27|60->29|60->29|60->29|61->30|66->35|66->35|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|74->43|74->43|76->45|76->45|76->45|77->46|78->47|78->47|80->49|81->50|81->50|82->51|83->52|571->539|571->539|572->540|573->541|574->542|574->542|575->543|579->547|579->547|579->547|579->547|579->547|580->548|580->548|580->548|580->548|580->548|581->549|581->549|581->549|581->549|581->549|582->550|584->552|584->552|585->553|585->553|585->553|586->554|586->554|586->554|587->555|590->558|590->558|591->559|594->562|594->562|595->563|595->563|596->564|597->565|597->565|598->566|598->566|599->567|599->567|600->568|600->568|601->569|603->571|603->571|604->572|604->572|612->580|612->580|612->580|612->580|612->580|613->581|613->581|613->581|613->581|613->581|614->582|615->583|615->583|616->584|616->584|616->584|617->585|617->585|617->585|618->586|619->587|619->587|620->588|621->589|621->589|622->590|622->590|623->591|623->591|624->592|624->592|625->593|626->594|626->594|626->594|626->594|627->595|629->597|629->597|631->599|631->599|650->618|650->618|651->619|654->622|654->622|655->623|655->623|656->624|656->624|656->624|657->625|657->625|657->625|658->626|661->629|661->629|662->630|662->630|663->631|668->636|668->636|670->638|670->638|671->639|671->639|672->640|673->641|673->641|674->642|674->642|675->643|676->644|676->644|677->645|677->645|678->646|679->647|679->647|680->648|680->648|689->657|689->657|690->658|690->658|690->658|691->659|697->665|697->665|697->665|697->665|698->666|703->671|703->671|704->672|705->673|705->673|706->674|706->674|708->676|708->676|709->677|709->677|709->677|710->678|710->678|710->678|711->679|711->679|711->679|712->680|717->685|717->685|718->686|718->686|719->687|719->687|720->688|720->688|721->689|721->689|722->690|728->696|728->696|729->697|731->699|731->699|732->700|733->701|733->701|734->702|736->704|736->704|737->705|742->710|742->710|743->711|743->711|744->712|750->718|750->718|751->719|751->719|752->720|758->726|758->726|759->727|760->728|760->728|761->729|761->729|762->730|763->731|763->731|764->732|766->734|766->734|767->735|767->735|768->736|770->738|770->738|772->740|772->740|773->741|773->741|773->741|774->742|774->742|775->743|780->748|780->748|781->749|782->750|782->750|783->751|786->754|786->754|787->755|787->755|787->755|787->755|788->756|788->756|788->756|789->757|790->758|790->758|791->759|791->759|794->762|794->762|796->764
                  -- GENERATED --
              */
          
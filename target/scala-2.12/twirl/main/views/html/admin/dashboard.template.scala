
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
                            <i class="pe-7f-home"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">"""),_display_(/*63.77*/AdminController/*63.92*/.getPropertyCount),format.raw/*63.109*/("""</span></div>
                                <div class="stat-heading">Properties</div>
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
                            <i class="pe-7f-mail"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">"""),_display_(/*81.77*/AdminController/*81.92*/.getContactCount),format.raw/*81.108*/("""</span></div>
                                <div class="stat-heading">Contacts</div>
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
                            <i class="pe-7f-coffee"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">"""),_display_(/*99.77*/AdminController/*99.92*/.getPropTypeCount),format.raw/*99.109*/("""</span></div>
                                <div class="stat-heading">Property Types</div>
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
                            <i class="pe-7f-home"></i>
                        </div>
                        <div class="stat-content">
                            <div class="text-left dib">
                                <div class="stat-text"><span class="count">"""),_display_(/*117.77*/AdminController/*117.92*/.getAmenityCount),format.raw/*117.108*/("""</span></div>
                                <div class="stat-heading">Amenities</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- Widgets End -->


""")))}/*129.2*/ {_display_(Seq[Any](format.raw/*129.4*/("""
    """),format.raw/*130.37*/("""
    """),format.raw/*131.5*/("""<script type="ff61747dd8d7db758f2acf61-text/javascript">
        jQuery(document).ready(function($) """),format.raw/*132.44*/("""{"""),format.raw/*132.45*/("""
            """),format.raw/*133.13*/(""""use strict";

            // Pie chart flotPie1
            var piedata = [
                """),format.raw/*137.17*/("""{"""),format.raw/*137.18*/(""" """),format.raw/*137.19*/("""label: "Desktop visits", data: [[1,32]], color: '#5c6bc0'"""),format.raw/*137.76*/("""}"""),format.raw/*137.77*/(""",
                """),format.raw/*138.17*/("""{"""),format.raw/*138.18*/(""" """),format.raw/*138.19*/("""label: "Tab visits", data: [[1,33]], color: '#ef5350'"""),format.raw/*138.72*/("""}"""),format.raw/*138.73*/(""",
                """),format.raw/*139.17*/("""{"""),format.raw/*139.18*/(""" """),format.raw/*139.19*/("""label: "Mobile visits", data: [[1,35]], color: '#66bb6a'"""),format.raw/*139.75*/("""}"""),format.raw/*139.76*/("""
            """),format.raw/*140.13*/("""];

            $.plot('#flotPie1', piedata, """),format.raw/*142.42*/("""{"""),format.raw/*142.43*/("""
                """),format.raw/*143.17*/("""series: """),format.raw/*143.25*/("""{"""),format.raw/*143.26*/("""
                    """),format.raw/*144.21*/("""pie: """),format.raw/*144.26*/("""{"""),format.raw/*144.27*/("""
                        """),format.raw/*145.25*/("""show: true,
                        radius: 1,
                        innerRadius: 0.65,
                        label: """),format.raw/*148.32*/("""{"""),format.raw/*148.33*/("""
                            """),format.raw/*149.29*/("""show: true,
                            radius: 2/3,
                            threshold: 1
                        """),format.raw/*152.25*/("""}"""),format.raw/*152.26*/(""",
                        stroke: """),format.raw/*153.33*/("""{"""),format.raw/*153.34*/("""
                            """),format.raw/*154.29*/("""width: 0
                        """),format.raw/*155.25*/("""}"""),format.raw/*155.26*/("""
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/("""
                """),format.raw/*157.17*/("""}"""),format.raw/*157.18*/(""",
                grid: """),format.raw/*158.23*/("""{"""),format.raw/*158.24*/("""
                    """),format.raw/*159.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*161.17*/("""}"""),format.raw/*161.18*/("""
            """),format.raw/*162.13*/("""}"""),format.raw/*162.14*/(""");

            // Pie chart flotPie1  End




            var cellPaiChart = [
                """),format.raw/*170.17*/("""{"""),format.raw/*170.18*/(""" """),format.raw/*170.19*/("""label: "Direct Sell", data: [[1,65]], color: '#5b83de'"""),format.raw/*170.73*/("""}"""),format.raw/*170.74*/(""",
                """),format.raw/*171.17*/("""{"""),format.raw/*171.18*/(""" """),format.raw/*171.19*/("""label: "Channel Sell", data: [[1,35]], color: '#00bfa5'"""),format.raw/*171.74*/("""}"""),format.raw/*171.75*/("""
            """),format.raw/*172.13*/("""];
            $.plot('#cellPaiChart', cellPaiChart, """),format.raw/*173.51*/("""{"""),format.raw/*173.52*/("""
                """),format.raw/*174.17*/("""series: """),format.raw/*174.25*/("""{"""),format.raw/*174.26*/("""
                    """),format.raw/*175.21*/("""pie: """),format.raw/*175.26*/("""{"""),format.raw/*175.27*/("""
                        """),format.raw/*176.25*/("""show: true,
                        stroke: """),format.raw/*177.33*/("""{"""),format.raw/*177.34*/("""
                            """),format.raw/*178.29*/("""width: 0
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/("""
                """),format.raw/*181.17*/("""}"""),format.raw/*181.18*/(""",
                legend: """),format.raw/*182.25*/("""{"""),format.raw/*182.26*/("""
                    """),format.raw/*183.21*/("""show: false
                """),format.raw/*184.17*/("""}"""),format.raw/*184.18*/(""",grid: """),format.raw/*184.25*/("""{"""),format.raw/*184.26*/("""
                    """),format.raw/*185.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*187.17*/("""}"""),format.raw/*187.18*/("""

            """),format.raw/*189.13*/("""}"""),format.raw/*189.14*/(""");















            // Line Chart  #flotLine5
            var newCust = [[0, 3], [1, 5], [2,4], [3, 7], [4, 9], [5, 3], [6, 6], [7, 4], [8, 10]];

            var plot = $.plot($('#flotLine5'),["""),format.raw/*208.48*/("""{"""),format.raw/*208.49*/("""
                """),format.raw/*209.17*/("""data: newCust,
                label: 'New Data Flow',
                color: '#fff'
            """),format.raw/*212.13*/("""}"""),format.raw/*212.14*/("""],
            """),format.raw/*213.13*/("""{"""),format.raw/*213.14*/("""
                """),format.raw/*214.17*/("""series: """),format.raw/*214.25*/("""{"""),format.raw/*214.26*/("""
                    """),format.raw/*215.21*/("""lines: """),format.raw/*215.28*/("""{"""),format.raw/*215.29*/("""
                        """),format.raw/*216.25*/("""show: true,
                        lineColor: '#fff',
                        lineWidth: 2
                    """),format.raw/*219.21*/("""}"""),format.raw/*219.22*/(""",
                    points: """),format.raw/*220.29*/("""{"""),format.raw/*220.30*/("""
                        """),format.raw/*221.25*/("""show: true,
                        fill: true,
                        fillColor: "#ffffff",
                        symbol: "circle",
                        radius: 3
                    """),format.raw/*226.21*/("""}"""),format.raw/*226.22*/(""",
                    shadowSize: 0
                """),format.raw/*228.17*/("""}"""),format.raw/*228.18*/(""",
                points: """),format.raw/*229.25*/("""{"""),format.raw/*229.26*/("""
                    """),format.raw/*230.21*/("""show: true,
                """),format.raw/*231.17*/("""}"""),format.raw/*231.18*/(""",
                legend: """),format.raw/*232.25*/("""{"""),format.raw/*232.26*/("""
                    """),format.raw/*233.21*/("""show: false
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""",
                grid: """),format.raw/*235.23*/("""{"""),format.raw/*235.24*/("""
                    """),format.raw/*236.21*/("""show: false
                """),format.raw/*237.17*/("""}"""),format.raw/*237.18*/("""
            """),format.raw/*238.13*/("""}"""),format.raw/*238.14*/(""");

             // Line Chart  #flotLine5 End





            // Traffic Chart using chartist
            if ($('#traffic-chart').length) """),format.raw/*247.45*/("""{"""),format.raw/*247.46*/("""
                """),format.raw/*248.17*/("""var chart = new Chartist.Line('#traffic-chart', """),format.raw/*248.65*/("""{"""),format.raw/*248.66*/("""
                  """),format.raw/*249.19*/("""labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
                  series: [
                  [0, 18000, 35000,  25000,  22000,  0],
                  [0, 33000, 15000,  20000,  15000,  300],
                  [0, 15000, 28000,  15000,  30000,  5000]
                  ]
              """),format.raw/*255.15*/("""}"""),format.raw/*255.16*/(""", """),format.raw/*255.18*/("""{"""),format.raw/*255.19*/("""
                  """),format.raw/*256.19*/("""low: 0,
                  showArea: true,
                  showLine: false,
                  showPoint: false,
                  fullWidth: true,
                  axisX: """),format.raw/*261.26*/("""{"""),format.raw/*261.27*/("""
                    """),format.raw/*262.21*/("""showGrid: true
                """),format.raw/*263.17*/("""}"""),format.raw/*263.18*/("""
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/(""");

                chart.on('draw', function(data) """),format.raw/*266.49*/("""{"""),format.raw/*266.50*/("""
                    """),format.raw/*267.21*/("""if(data.type === 'line' || data.type === 'area') """),format.raw/*267.70*/("""{"""),format.raw/*267.71*/("""
                        """),format.raw/*268.25*/("""data.element.animate("""),format.raw/*268.46*/("""{"""),format.raw/*268.47*/("""
                            """),format.raw/*269.29*/("""d: """),format.raw/*269.32*/("""{"""),format.raw/*269.33*/("""
                                """),format.raw/*270.33*/("""begin: 2000 * data.index,
                                dur: 2000,
                                from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
                                to: data.path.clone().stringify(),
                                easing: Chartist.Svg.Easing.easeOutQuint
                            """),format.raw/*275.29*/("""}"""),format.raw/*275.30*/("""
                        """),format.raw/*276.25*/("""}"""),format.raw/*276.26*/(""");
                    """),format.raw/*277.21*/("""}"""),format.raw/*277.22*/("""
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/(""");
            """),format.raw/*279.13*/("""}"""),format.raw/*279.14*/("""
            """),format.raw/*280.13*/("""// Traffic Chart using chartist End




            //Traffic chart chart-js
            if ($('#TrafficChart').length) """),format.raw/*286.44*/("""{"""),format.raw/*286.45*/("""
                """),format.raw/*287.17*/("""var ctx = document.getElementById( "TrafficChart" );
                ctx.height = 150;
                var myChart = new Chart( ctx, """),format.raw/*289.47*/("""{"""),format.raw/*289.48*/("""
                    """),format.raw/*290.21*/("""type: 'line',
                    data: """),format.raw/*291.27*/("""{"""),format.raw/*291.28*/("""
                        """),format.raw/*292.25*/("""labels: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" ],
                        datasets: [
                        """),format.raw/*294.25*/("""{"""),format.raw/*294.26*/("""
                            """),format.raw/*295.29*/("""label: "Visit",
                            borderColor: "rgba(4, 73, 203,.09)",
                            borderWidth: "1",
                            backgroundColor: "rgba(4, 73, 203,.5)",
                            data: [ 0, 2900, 5000, 3300, 6000, 3250, 0 ]
                        """),format.raw/*300.25*/("""}"""),format.raw/*300.26*/(""",
                        """),format.raw/*301.25*/("""{"""),format.raw/*301.26*/("""
                            """),format.raw/*302.29*/("""label: "Bounce",
                            borderColor: "rgba(245, 23, 66, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(245, 23, 66,.5)",
                            pointHighlightStroke: "rgba(245, 23, 66,.5)",
                            data: [ 0, 4200, 4500, 1600, 4200, 1500, 4000 ]
                        """),format.raw/*308.25*/("""}"""),format.raw/*308.26*/(""",
                        """),format.raw/*309.25*/("""{"""),format.raw/*309.26*/("""
                            """),format.raw/*310.29*/("""label: "Targeted",
                            borderColor: "rgba(40, 169, 46, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(40, 169, 46, .5)",
                            pointHighlightStroke: "rgba(40, 169, 46,.5)",
                            data: [1000, 5200, 3600, 2600, 4200, 5300, 0 ]
                        """),format.raw/*316.25*/("""}"""),format.raw/*316.26*/("""
                        """),format.raw/*317.25*/("""]
                    """),format.raw/*318.21*/("""}"""),format.raw/*318.22*/(""",
                    options: """),format.raw/*319.30*/("""{"""),format.raw/*319.31*/("""
                        """),format.raw/*320.25*/("""responsive: true,
                        tooltips: """),format.raw/*321.35*/("""{"""),format.raw/*321.36*/("""
                            """),format.raw/*322.29*/("""mode: 'index',
                            intersect: false
                        """),format.raw/*324.25*/("""}"""),format.raw/*324.26*/(""",
                        hover: """),format.raw/*325.32*/("""{"""),format.raw/*325.33*/("""
                            """),format.raw/*326.29*/("""mode: 'nearest',
                            intersect: true
                        """),format.raw/*328.25*/("""}"""),format.raw/*328.26*/("""

                    """),format.raw/*330.21*/("""}"""),format.raw/*330.22*/("""
                """),format.raw/*331.17*/("""}"""),format.raw/*331.18*/(""" """),format.raw/*331.19*/(""");
            """),format.raw/*332.13*/("""}"""),format.raw/*332.14*/("""
            """),format.raw/*333.13*/("""//Traffic chart chart-js  End



            // Bar Chart #flotBarChart
            $.plot("#flotBarChart", ["""),format.raw/*338.38*/("""{"""),format.raw/*338.39*/("""
                """),format.raw/*339.17*/("""data: [[0, 18], [2, 8], [4, 5], [6, 13],[8,5], [10,7],[12,4], [14,6],[16,15], [18, 9],[20,17], [22,7],[24,4], [26,9],[28,11]],
                bars: """),format.raw/*340.23*/("""{"""),format.raw/*340.24*/("""
                    """),format.raw/*341.21*/("""show: true,
                    lineWidth: 0,
                    fillColor: '#ffffff8a'
                """),format.raw/*344.17*/("""}"""),format.raw/*344.18*/("""
            """),format.raw/*345.13*/("""}"""),format.raw/*345.14*/("""], """),format.raw/*345.17*/("""{"""),format.raw/*345.18*/("""
                """),format.raw/*346.17*/("""grid: """),format.raw/*346.23*/("""{"""),format.raw/*346.24*/("""
                    """),format.raw/*347.21*/("""show: false
                """),format.raw/*348.17*/("""}"""),format.raw/*348.18*/("""
            """),format.raw/*349.13*/("""}"""),format.raw/*349.14*/(""");
            // Bar Chart #flotBarChart End

        """),format.raw/*352.9*/("""}"""),format.raw/*352.10*/(""");  // End of Document Ready
    </script>
""")))}),format.raw/*354.2*/("""
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
                  DATE: Fri Jul 12 04:01:58 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/dashboard.scala.html
                  HASH: 2de6ab089bbc00fb3548d341ff32aa4eef40b9de
                  MATRIX: 951->1|1047->4|1074->6|1086->11|1123->40|1162->42|1195->80|1227->86|1302->134|1330->135|1374->152|1441->191|1470->192|1512->206|1555->221|1584->222|1629->239|1688->270|1717->271|1759->285|1797->295|1826->296|1871->313|1926->340|1955->341|1997->355|2038->368|2067->369|2112->386|2166->412|2195->413|2237->427|2281->443|2310->444|2355->461|2458->536|2487->537|2529->551|2574->568|2603->569|2648->586|2846->756|2875->757|2917->771|2956->782|2985->783|3030->800|3085->827|3114->828|3156->842|3198->856|3227->857|3272->874|3327->901|3356->902|3398->916|3440->930|3469->931|3514->948|3569->975|3598->976|3631->982|3659->992|3698->994|3731->1031|3767->1040|4330->1576|4354->1591|4393->1608|5156->2344|5180->2359|5218->2375|5981->3111|6005->3126|6044->3143|6812->3883|6837->3898|6876->3914|7176->4195|7216->4197|7250->4234|7283->4239|7412->4339|7442->4340|7484->4353|7606->4446|7636->4447|7666->4448|7752->4505|7782->4506|7829->4524|7859->4525|7889->4526|7971->4579|8001->4580|8048->4598|8078->4599|8108->4600|8193->4656|8223->4657|8265->4670|8339->4715|8369->4716|8415->4733|8452->4741|8482->4742|8532->4763|8566->4768|8596->4769|8650->4794|8800->4915|8830->4916|8888->4945|9035->5063|9065->5064|9128->5098|9158->5099|9216->5128|9278->5161|9308->5162|9358->5183|9388->5184|9434->5201|9464->5202|9517->5226|9547->5227|9597->5248|9695->5317|9725->5318|9767->5331|9797->5332|9922->5428|9952->5429|9982->5430|10065->5484|10095->5485|10142->5503|10172->5504|10202->5505|10286->5560|10316->5561|10358->5574|10440->5627|10470->5628|10516->5645|10553->5653|10583->5654|10633->5675|10667->5680|10697->5681|10751->5706|10824->5750|10854->5751|10912->5780|10974->5813|11004->5814|11054->5835|11084->5836|11130->5853|11160->5854|11215->5880|11245->5881|11295->5902|11352->5930|11382->5931|11418->5938|11448->5939|11498->5960|11596->6029|11626->6030|11669->6044|11699->6045|11932->6249|11962->6250|12008->6267|12134->6364|12164->6365|12208->6380|12238->6381|12284->6398|12321->6406|12351->6407|12401->6428|12437->6435|12467->6436|12521->6461|12662->6573|12692->6574|12751->6604|12781->6605|12835->6630|13054->6820|13084->6821|13165->6873|13195->6874|13250->6900|13280->6901|13330->6922|13387->6950|13417->6951|13472->6977|13502->6978|13552->6999|13609->7027|13639->7028|13692->7052|13722->7053|13772->7074|13829->7102|13859->7103|13901->7116|13931->7117|14100->7257|14130->7258|14176->7275|14253->7323|14283->7324|14331->7343|14649->7632|14679->7633|14710->7635|14740->7636|14788->7655|14990->7828|15020->7829|15070->7850|15130->7881|15160->7882|15202->7895|15232->7896|15313->7948|15343->7949|15393->7970|15471->8019|15501->8020|15555->8045|15605->8066|15635->8067|15693->8096|15725->8099|15755->8100|15817->8133|16202->8489|16232->8490|16286->8515|16316->8516|16368->8539|16398->8540|16444->8557|16474->8558|16518->8573|16548->8574|16590->8587|16739->8707|16769->8708|16815->8725|16977->8858|17007->8859|17057->8880|17126->8920|17156->8921|17210->8946|17360->9067|17390->9068|17448->9097|17769->9389|17799->9390|17854->9416|17884->9417|17942->9446|18344->9819|18374->9820|18429->9846|18459->9847|18517->9876|18921->10251|18951->10252|19005->10277|19056->10299|19086->10300|19146->10331|19176->10332|19230->10357|19311->10409|19341->10410|19399->10439|19512->10523|19542->10524|19604->10557|19634->10558|19692->10587|19806->10672|19836->10673|19887->10695|19917->10696|19963->10713|19993->10714|20023->10715|20067->10730|20097->10731|20139->10744|20277->10853|20307->10854|20353->10871|20531->11020|20561->11021|20611->11042|20745->11147|20775->11148|20817->11161|20847->11162|20879->11165|20909->11166|20955->11183|20990->11189|21020->11190|21070->11211|21127->11239|21157->11240|21199->11253|21229->11254|21312->11309|21342->11310|21417->11354
                  LINES: 28->1|33->2|34->3|34->3|34->3|34->3|36->5|38->7|39->8|39->8|40->9|41->10|41->10|43->12|43->12|43->12|44->13|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|58->27|58->27|60->29|60->29|60->29|61->30|66->35|66->35|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|74->43|74->43|76->45|76->45|76->45|77->46|78->47|78->47|80->49|81->50|81->50|82->51|83->52|94->63|94->63|94->63|112->81|112->81|112->81|130->99|130->99|130->99|148->117|148->117|148->117|160->129|160->129|161->130|162->131|163->132|163->132|164->133|168->137|168->137|168->137|168->137|168->137|169->138|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|170->139|171->140|173->142|173->142|174->143|174->143|174->143|175->144|175->144|175->144|176->145|179->148|179->148|180->149|183->152|183->152|184->153|184->153|185->154|186->155|186->155|187->156|187->156|188->157|188->157|189->158|189->158|190->159|192->161|192->161|193->162|193->162|201->170|201->170|201->170|201->170|201->170|202->171|202->171|202->171|202->171|202->171|203->172|204->173|204->173|205->174|205->174|205->174|206->175|206->175|206->175|207->176|208->177|208->177|209->178|210->179|210->179|211->180|211->180|212->181|212->181|213->182|213->182|214->183|215->184|215->184|215->184|215->184|216->185|218->187|218->187|220->189|220->189|239->208|239->208|240->209|243->212|243->212|244->213|244->213|245->214|245->214|245->214|246->215|246->215|246->215|247->216|250->219|250->219|251->220|251->220|252->221|257->226|257->226|259->228|259->228|260->229|260->229|261->230|262->231|262->231|263->232|263->232|264->233|265->234|265->234|266->235|266->235|267->236|268->237|268->237|269->238|269->238|278->247|278->247|279->248|279->248|279->248|280->249|286->255|286->255|286->255|286->255|287->256|292->261|292->261|293->262|294->263|294->263|295->264|295->264|297->266|297->266|298->267|298->267|298->267|299->268|299->268|299->268|300->269|300->269|300->269|301->270|306->275|306->275|307->276|307->276|308->277|308->277|309->278|309->278|310->279|310->279|311->280|317->286|317->286|318->287|320->289|320->289|321->290|322->291|322->291|323->292|325->294|325->294|326->295|331->300|331->300|332->301|332->301|333->302|339->308|339->308|340->309|340->309|341->310|347->316|347->316|348->317|349->318|349->318|350->319|350->319|351->320|352->321|352->321|353->322|355->324|355->324|356->325|356->325|357->326|359->328|359->328|361->330|361->330|362->331|362->331|362->331|363->332|363->332|364->333|369->338|369->338|370->339|371->340|371->340|372->341|375->344|375->344|376->345|376->345|376->345|376->345|377->346|377->346|377->346|378->347|379->348|379->348|380->349|380->349|383->352|383->352|385->354
                  -- GENERATED --
              */
          

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
"""),format.raw/*3.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Red Rhino - Admin</title>
        <meta name="description" content="Red Rhino - Admin">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href=""""),_display_(/*11.45*/routes/*11.51*/.Assets.versioned("images/favicon.png")),format.raw/*11.90*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">

        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("css/normalize.css")),format.raw/*14.83*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*15.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*16.90*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("css/themify-icons.css")),format.raw/*17.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*18.39*/routes/*18.45*/.Assets.versioned("css/pe-icon-7-filled.css")),format.raw/*18.90*/("""">


        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("weather/css/weather-icons.css")),format.raw/*21.78*/("""" rel="stylesheet" />
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("calendar/fullcalendar.css")),format.raw/*22.74*/("""" rel="stylesheet" />

        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("css/style.css")),format.raw/*24.79*/("""">
        <link href=""""),_display_(/*25.22*/routes/*25.28*/.Assets.versioned("css/charts/chartist.min.css")),format.raw/*25.76*/("""" rel="stylesheet">
        <link href=""""),_display_(/*26.22*/routes/*26.28*/.Assets.versioned("css/lib/vector-map/jqvmap.min.css")),format.raw/*26.82*/("""" rel="stylesheet">


        <style>
    #weatherWidget .currentDesc """),format.raw/*30.33*/("""{"""),format.raw/*30.34*/("""
        """),format.raw/*31.9*/("""color: #ffffff!important;
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""
    """),format.raw/*33.5*/(""".traffic-chart """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/("""
        """),format.raw/*34.9*/("""min-height: 335px;
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""
    """),format.raw/*36.5*/("""#flotPie1  """),format.raw/*36.16*/("""{"""),format.raw/*36.17*/("""
        """),format.raw/*37.9*/("""height: 150px;
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""#flotPie1 td """),format.raw/*39.18*/("""{"""),format.raw/*39.19*/("""
        """),format.raw/*40.9*/("""padding:3px;
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""#flotPie1 table """),format.raw/*42.21*/("""{"""),format.raw/*42.22*/("""
        """),format.raw/*43.9*/("""top: 20px!important;
        right: -10px!important;
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""
    """),format.raw/*46.5*/(""".chart-container """),format.raw/*46.22*/("""{"""),format.raw/*46.23*/("""
        """),format.raw/*47.9*/("""display: table;
        min-width: 270px ;
        text-align: left;
        padding-top: 10px;
        padding-bottom: 10px;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
    """),format.raw/*53.5*/("""#flotLine5  """),format.raw/*53.17*/("""{"""),format.raw/*53.18*/("""
        """),format.raw/*54.9*/("""height: 105px;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""#flotBarChart """),format.raw/*57.19*/("""{"""),format.raw/*57.20*/("""
        """),format.raw/*58.9*/("""height: 150px;
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
    """),format.raw/*60.5*/("""#cellPaiChart"""),format.raw/*60.18*/("""{"""),format.raw/*60.19*/("""
        """),format.raw/*61.9*/("""height: 160px;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""

    """),format.raw/*64.5*/("""</style>

    </head>
    <body>


            <!-- Left Panel -->
        <aside id="left-panel" class="left-panel">
            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="index.html"><i class="menu-icon fa fa-laptop"></i>Dashboard </a>
                        </li>
                        <li class="menu-title">UI elements</li><!-- /.menu-title -->
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-cogs"></i>Components</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-puzzle-piece"></i><a href="ui-buttons.html">Buttons</a></li>
                                <li><i class="fa fa-id-badge"></i><a href="ui-badges.html">Badges</a></li>
                                <li><i class="fa fa-bars"></i><a href="ui-tabs.html">Tabs</a></li>

                                <li><i class="fa fa-id-card-o"></i><a href="ui-cards.html">Cards</a></li>
                                <li><i class="fa fa-exclamation-triangle"></i><a href="ui-alerts.html">Alerts</a></li>
                                <li><i class="fa fa-spinner"></i><a href="ui-progressbar.html">Progress Bars</a></li>
                                <li><i class="fa fa-fire"></i><a href="ui-modals.html">Modals</a></li>
                                <li><i class="fa fa-book"></i><a href="ui-switches.html">Switches</a></li>
                                <li><i class="fa fa-th"></i><a href="ui-grids.html">Grids</a></li>
                                <li><i class="fa fa-file-word-o"></i><a href="ui-typgraphy.html">Typography</a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-table"></i>Tables</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="fa fa-table"></i><a href="tables-basic.html">Basic Table</a></li>
                                <li><i class="fa fa-table"></i><a href="tables-data.html">Data Table</a></li>
                            </ul>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>Forms</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">Basic Form</a></li>
                                <li><i class="menu-icon fa fa-th"></i><a href="forms-advanced.html">Advanced Form</a></li>
                            </ul>
                        </li>

                        <li class="menu-title">Icons</li><!-- /.menu-title -->

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-tasks"></i>Icons</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-fort-awesome"></i><a href="font-fontawesome.html">Font Awesome</a></li>
                                <li><i class="menu-icon ti-themify-logo"></i><a href="font-themify.html">Themefy Icons</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="widgets.html"> <i class="menu-icon ti-email"></i>Widgets </a>
                        </li>
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-bar-chart"></i>Charts</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-line-chart"></i><a href="charts-chartjs.html">Chart JS</a></li>
                                <li><i class="menu-icon fa fa-area-chart"></i><a href="charts-flot.html">Flot Chart</a></li>
                                <li><i class="menu-icon fa fa-pie-chart"></i><a href="charts-peity.html">Peity Chart</a></li>
                            </ul>
                        </li>

                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-map-marker"></i>Maps</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-map-o"></i><a href="maps-gmap.html">Google Maps</a></li>
                                <li><i class="menu-icon fa fa-street-view"></i><a href="maps-vector.html">Vector Maps</a></li>
                            </ul>
                        </li>
                        <li class="menu-title">Extras</li><!-- /.menu-title -->
                        <li class="menu-item-has-children dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-glass"></i>Pages</a>
                            <ul class="sub-menu children dropdown-menu">
                                <li><i class="menu-icon fa fa-sign-in"></i><a href="page-login.html">Login</a></li>
                                <li><i class="menu-icon fa fa-sign-in"></i><a href="page-register.html">Register</a></li>
                                <li><i class="menu-icon fa fa-paper-plane"></i><a href="pages-forget.html">Forget Pass</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </aside><!-- /#left-panel -->
        <!-- Left Panel -->



        <!-- Right Panel -->
        <div id="right-panel" class="right-panel">

                <!-- Header-->
            <header id="header" class="header">
                <div class="top-left">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="./"><img src="images/logo.png" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src="images/logo2.png" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                            <button class="search-trigger"><i class="fa fa-search"></i></button>
                            <div class="form-inline">
                                <form class="search-form">
                                    <input class="form-control mr-sm-2" type="text" placeholder="Search ..." aria-label="Search">
                                    <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                                </form>
                            </div>

                            <div class="dropdown for-notification">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-bell"></i>
                                    <span class="count bg-danger">3</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="notification">
                                    <p class="red">You have 3 Notification</p>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-check"></i>
                                        <p>Server #1 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-info"></i>
                                        <p>Server #2 overloaded.</p>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <i class="fa fa-warning"></i>
                                        <p>Server #3 overloaded.</p>
                                    </a>
                                </div>
                            </div>

                            <div class="dropdown for-message">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="message" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-envelope"></i>
                                    <span class="count bg-primary">4</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="message">
                                    <p class="red">You have 4 Mails</p>
                                    <a class="dropdown-item media" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="images/avatar/1.jpg"></span>
                                        <div class="message media-body">
                                            <span class="name float-left">Jonathan Smith</span>
                                            <span class="time float-right">Just now</span>
                                            <p>Hello, this is an example msg</p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="images/avatar/2.jpg"></span>
                                        <div class="message media-body">
                                            <span class="name float-left">Jack Sanders</span>
                                            <span class="time float-right">5 minutes ago</span>
                                            <p>Lorem ipsum dolor sit amet, consectetur</p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="images/avatar/3.jpg"></span>
                                        <div class="message media-body">
                                            <span class="name float-left">Cheryl Wheeler</span>
                                            <span class="time float-right">10 minutes ago</span>
                                            <p>Hello, this is an example msg</p>
                                        </div>
                                    </a>
                                    <a class="dropdown-item media" href="#">
                                        <span class="photo media-left"><img alt="avatar" src="images/avatar/4.jpg"></span>
                                        <div class="message media-body">
                                            <span class="name float-left">Rachel Santos</span>
                                            <span class="time float-right">15 minutes ago</span>
                                            <p>Lorem ipsum dolor sit amet, consectetur</p>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src="images/admin.jpg" alt="User Avatar">
                            </a>

                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>My Profile</a>

                                <a class="nav-link" href="#"><i class="fa fa-bell-o"></i>Notifications <span class="count">13</span></a>

                                <a class="nav-link" href="#"><i class="fa fa-cog"></i>Settings</a>

                                <a class="nav-link" href="#"><i class="fa fa-power-off"></i>Logout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header><!-- /header -->
            <!-- Header-->


            <div class="content pb-0">

                    <!-- Widgets  -->
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
                                       """),
format.raw("""         <div class="progress-bar bg-flat-color-3" role="progressbar" style="width: 60%;" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
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
                </div> <!-- /.order -->





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
                                                            <input type="checkbox"><i class="check-box"></i><span>Conveniently fabricate interactive technology for ....</span>
                                                            <a href='#' class="fa fa-times"></a>
                                                            <a href='#' class="fa fa-pencil"></a>
                                                            <a href='#' class="fa fa-check"></a>
                                                        </label>
                                                    </li>
                                                    <li>
                                                        <label>
                                                            <input type="checkbox"><i class="check-box"></i><span>Creating component page</span>
                                                            <a href='#' class="fa fa-times"></a>
                                                            <a href='#' class="fa fa-pencil"></a>
                                                            <a href='#' class="fa fa-check"></a>
                                                        </label>
                                                    </li>
                                                    <li>
                                                        <label>
                                                            <input type="checkbox" checked><i class="check-box"></i><span>Follow back those who follow you</span>
                                                            <a href='#' class="fa fa-times"></a>
                                                            <a href='#' class="fa fa-pencil"></a>
                                                            <a href='#' class="fa fa-check"></a>
                                                        </label>
                                                    </li>
                                                    <li>
                                                        <label>
                                                            <input type="checkbox" checked><i class="check-box"></i><span>Design One page theme</span>
                                                            <a href='#' class="fa fa-times"></a>
                                                            <a href='#' class="fa fa-pencil"></a>
                                                            <a href='#' class="fa fa-check"></a>
                                                        </label>
                                                    </li>

                                                    <li>
                                                        <label>
                                                            <input type="checkbox" checked><i class="check-box"></i><span>Creating component page</span>
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
                                                            </div>
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

                </div> <!-- /.row -->
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
                            <div class="card-body"""),
format.raw("""">
                                <div class="weather-widget">
                                    <div id="weather-one" class="weather-one"></div>
                                </div>
                            </div>
                        </div><!-- /.card -->
                    </div>
                </div><!-- /.row -->
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
                                <button type="button" class="btn btn-success save-event waves-effect waves-light">Create event</button>
                                <button type="button" class="btn btn-danger delete-event waves-effect waves-light" data-dismiss="modal">Delete</button>
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
                                <button type="button" class="btn btn-danger waves-effect waves-light save-category" data-dismiss="modal">Save</button>
                            </div>
                        </div>
                    </div>
                </div>
                    <!-- END MODAL -->


            </div> <!-- .content -->



            <div class="clearfix"></div>

            <footer class="site-footer">
                <div class="footer-inner bg-white">
                    <div class="row">
                        <div class="col-sm-6">
                        Copyright &copy; 2018 Ela Admin
                        </div>
                        <div class="col-sm-6 text-right">
                        Designed by <a href="https://colorlib.com">Colorlib</a>
                    </div>
                    </div>
                </div>
            </footer>

        </div><!-- /#right-panel -->


        <script src=""""),_display_(/*779.23*/routes/*779.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*779.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*780.23*/routes/*780.29*/.Assets.versioned("js/popper.min.js")),format.raw/*780.66*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*781.23*/routes/*781.29*/.Assets.versioned("js/plugins.js")),format.raw/*781.63*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*782.23*/routes/*782.29*/.Assets.versioned("js/main.js")),format.raw/*782.60*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>

        <script src=""""),_display_(/*784.23*/routes/*784.29*/.Assets.versioned("js/lib/chart-js/Chart.bundle.js")),format.raw/*784.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


            <!--Chartist Chart-->
        <script src=""""),_display_(/*788.23*/routes/*788.29*/.Assets.versioned("js/lib/chartist/chartist.min.js")),format.raw/*788.81*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*789.23*/routes/*789.29*/.Assets.versioned("js/lib/chartist/chartist-plugin-legend.js")),format.raw/*789.91*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*792.23*/routes/*792.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.js")),format.raw/*792.82*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*793.23*/routes/*793.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.pie.js")),format.raw/*793.86*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*794.23*/routes/*794.29*/.Assets.versioned("js/lib/flot-chart/jquery.flot.spline.js")),format.raw/*794.89*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*797.23*/routes/*797.29*/.Assets.versioned("weather/js/jquery.simpleWeather.min.js")),format.raw/*797.88*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*798.23*/routes/*798.29*/.Assets.versioned("weather/js/weather-init.js")),format.raw/*798.76*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>


        <script src=""""),_display_(/*801.23*/routes/*801.29*/.Assets.versioned("js/lib/moment/moment.js")),format.raw/*801.73*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*802.23*/routes/*802.29*/.Assets.versioned("calendar/fullcalendar.min.js")),format.raw/*802.78*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>
        <script src=""""),_display_(/*803.23*/routes/*803.29*/.Assets.versioned("calendar/fullcalendar-init.js")),format.raw/*803.79*/("""" type="ff61747dd8d7db758f2acf61-text/javascript"></script>






        <script type="ff61747dd8d7db758f2acf61-text/javascript">
        jQuery(document).ready(function($) """),format.raw/*811.44*/("""{"""),format.raw/*811.45*/("""
            """),format.raw/*812.13*/(""""use strict";

            // Pie chart flotPie1
            var piedata = [
                """),format.raw/*816.17*/("""{"""),format.raw/*816.18*/(""" """),format.raw/*816.19*/("""label: "Desktop visits", data: [[1,32]], color: '#5c6bc0'"""),format.raw/*816.76*/("""}"""),format.raw/*816.77*/(""",
                """),format.raw/*817.17*/("""{"""),format.raw/*817.18*/(""" """),format.raw/*817.19*/("""label: "Tab visits", data: [[1,33]], color: '#ef5350'"""),format.raw/*817.72*/("""}"""),format.raw/*817.73*/(""",
                """),format.raw/*818.17*/("""{"""),format.raw/*818.18*/(""" """),format.raw/*818.19*/("""label: "Mobile visits", data: [[1,35]], color: '#66bb6a'"""),format.raw/*818.75*/("""}"""),format.raw/*818.76*/("""
            """),format.raw/*819.13*/("""];

            $.plot('#flotPie1', piedata, """),format.raw/*821.42*/("""{"""),format.raw/*821.43*/("""
                """),format.raw/*822.17*/("""series: """),format.raw/*822.25*/("""{"""),format.raw/*822.26*/("""
                    """),format.raw/*823.21*/("""pie: """),format.raw/*823.26*/("""{"""),format.raw/*823.27*/("""
                        """),format.raw/*824.25*/("""show: true,
                        radius: 1,
                        innerRadius: 0.65,
                        label: """),format.raw/*827.32*/("""{"""),format.raw/*827.33*/("""
                            """),format.raw/*828.29*/("""show: true,
                            radius: 2/3,
                            threshold: 1
                        """),format.raw/*831.25*/("""}"""),format.raw/*831.26*/(""",
                        stroke: """),format.raw/*832.33*/("""{"""),format.raw/*832.34*/("""
                            """),format.raw/*833.29*/("""width: 0
                        """),format.raw/*834.25*/("""}"""),format.raw/*834.26*/("""
                    """),format.raw/*835.21*/("""}"""),format.raw/*835.22*/("""
                """),format.raw/*836.17*/("""}"""),format.raw/*836.18*/(""",
                grid: """),format.raw/*837.23*/("""{"""),format.raw/*837.24*/("""
                    """),format.raw/*838.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*840.17*/("""}"""),format.raw/*840.18*/("""
            """),format.raw/*841.13*/("""}"""),format.raw/*841.14*/(""");

            // Pie chart flotPie1  End




            var cellPaiChart = [
                """),format.raw/*849.17*/("""{"""),format.raw/*849.18*/(""" """),format.raw/*849.19*/("""label: "Direct Sell", data: [[1,65]], color: '#5b83de'"""),format.raw/*849.73*/("""}"""),format.raw/*849.74*/(""",
                """),format.raw/*850.17*/("""{"""),format.raw/*850.18*/(""" """),format.raw/*850.19*/("""label: "Channel Sell", data: [[1,35]], color: '#00bfa5'"""),format.raw/*850.74*/("""}"""),format.raw/*850.75*/("""
            """),format.raw/*851.13*/("""];
            $.plot('#cellPaiChart', cellPaiChart, """),format.raw/*852.51*/("""{"""),format.raw/*852.52*/("""
                """),format.raw/*853.17*/("""series: """),format.raw/*853.25*/("""{"""),format.raw/*853.26*/("""
                    """),format.raw/*854.21*/("""pie: """),format.raw/*854.26*/("""{"""),format.raw/*854.27*/("""
                        """),format.raw/*855.25*/("""show: true,
                        stroke: """),format.raw/*856.33*/("""{"""),format.raw/*856.34*/("""
                            """),format.raw/*857.29*/("""width: 0
                        """),format.raw/*858.25*/("""}"""),format.raw/*858.26*/("""
                    """),format.raw/*859.21*/("""}"""),format.raw/*859.22*/("""
                """),format.raw/*860.17*/("""}"""),format.raw/*860.18*/(""",
                legend: """),format.raw/*861.25*/("""{"""),format.raw/*861.26*/("""
                    """),format.raw/*862.21*/("""show: false
                """),format.raw/*863.17*/("""}"""),format.raw/*863.18*/(""",grid: """),format.raw/*863.25*/("""{"""),format.raw/*863.26*/("""
                    """),format.raw/*864.21*/("""hoverable: true,
                    clickable: true
                """),format.raw/*866.17*/("""}"""),format.raw/*866.18*/("""

            """),format.raw/*868.13*/("""}"""),format.raw/*868.14*/(""");















            // Line Chart  #flotLine5
            var newCust = [[0, 3], [1, 5], [2,4], [3, 7], [4, 9], [5, 3], [6, 6], [7, 4], [8, 10]];

            var plot = $.plot($('#flotLine5'),["""),format.raw/*887.48*/("""{"""),format.raw/*887.49*/("""
                """),format.raw/*888.17*/("""data: newCust,
                label: 'New Data Flow',
                color: '#fff'
            """),format.raw/*891.13*/("""}"""),format.raw/*891.14*/("""],
            """),format.raw/*892.13*/("""{"""),format.raw/*892.14*/("""
                """),format.raw/*893.17*/("""series: """),format.raw/*893.25*/("""{"""),format.raw/*893.26*/("""
                    """),format.raw/*894.21*/("""lines: """),format.raw/*894.28*/("""{"""),format.raw/*894.29*/("""
                        """),format.raw/*895.25*/("""show: true,
                        lineColor: '#fff',
                        lineWidth: 2
                    """),format.raw/*898.21*/("""}"""),format.raw/*898.22*/(""",
                    points: """),format.raw/*899.29*/("""{"""),format.raw/*899.30*/("""
                        """),format.raw/*900.25*/("""show: true,
                        fill: true,
                        fillColor: "#ffffff",
                        symbol: "circle",
                        radius: 3
                    """),format.raw/*905.21*/("""}"""),format.raw/*905.22*/(""",
                    shadowSize: 0
                """),format.raw/*907.17*/("""}"""),format.raw/*907.18*/(""",
                points: """),format.raw/*908.25*/("""{"""),format.raw/*908.26*/("""
                    """),format.raw/*909.21*/("""show: true,
                """),format.raw/*910.17*/("""}"""),format.raw/*910.18*/(""",
                legend: """),format.raw/*911.25*/("""{"""),format.raw/*911.26*/("""
                    """),format.raw/*912.21*/("""show: false
                """),format.raw/*913.17*/("""}"""),format.raw/*913.18*/(""",
                grid: """),format.raw/*914.23*/("""{"""),format.raw/*914.24*/("""
                    """),format.raw/*915.21*/("""show: false
                """),format.raw/*916.17*/("""}"""),format.raw/*916.18*/("""
            """),format.raw/*917.13*/("""}"""),format.raw/*917.14*/(""");

             // Line Chart  #flotLine5 End





            // Traffic Chart using chartist
            if ($('#traffic-chart').length) """),format.raw/*926.45*/("""{"""),format.raw/*926.46*/("""
                """),format.raw/*927.17*/("""var chart = new Chartist.Line('#traffic-chart', """),format.raw/*927.65*/("""{"""),format.raw/*927.66*/("""
                  """),format.raw/*928.19*/("""labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],
                  series: [
                  [0, 18000, 35000,  25000,  22000,  0],
                  [0, 33000, 15000,  20000,  15000,  300],
                  [0, 15000, 28000,  15000,  30000,  5000]
                  ]
              """),format.raw/*934.15*/("""}"""),format.raw/*934.16*/(""", """),format.raw/*934.18*/("""{"""),format.raw/*934.19*/("""
                  """),format.raw/*935.19*/("""low: 0,
                  showArea: true,
                  showLine: false,
                  showPoint: false,
                  fullWidth: true,
                  axisX: """),format.raw/*940.26*/("""{"""),format.raw/*940.27*/("""
                    """),format.raw/*941.21*/("""showGrid: true
                """),format.raw/*942.17*/("""}"""),format.raw/*942.18*/("""
            """),format.raw/*943.13*/("""}"""),format.raw/*943.14*/(""");

                chart.on('draw', function(data) """),format.raw/*945.49*/("""{"""),format.raw/*945.50*/("""
                    """),format.raw/*946.21*/("""if(data.type === 'line' || data.type === 'area') """),format.raw/*946.70*/("""{"""),format.raw/*946.71*/("""
                        """),format.raw/*947.25*/("""data.element.animate("""),format.raw/*947.46*/("""{"""),format.raw/*947.47*/("""
                            """),format.raw/*948.29*/("""d: """),format.raw/*948.32*/("""{"""),format.raw/*948.33*/("""
                                """),format.raw/*949.33*/("""begin: 2000 * data.index,
                                dur: 2000,
                                from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
                                to: data.path.clone().stringify(),
                                easing: Chartist.Svg.Easing.easeOutQuint
                            """),format.raw/*954.29*/("""}"""),format.raw/*954.30*/("""
                        """),format.raw/*955.25*/("""}"""),format.raw/*955.26*/(""");
                    """),format.raw/*956.21*/("""}"""),format.raw/*956.22*/("""
                """),format.raw/*957.17*/("""}"""),format.raw/*957.18*/(""");
            """),format.raw/*958.13*/("""}"""),format.raw/*958.14*/("""
            """),format.raw/*959.13*/("""// Traffic Chart using chartist End




            //Traffic chart chart-js
            if ($('#TrafficChart').length) """),format.raw/*965.44*/("""{"""),format.raw/*965.45*/("""
                """),format.raw/*966.17*/("""var ctx = document.getElementById( "TrafficChart" );
                ctx.height = 150;
                var myChart = new Chart( ctx, """),format.raw/*968.47*/("""{"""),format.raw/*968.48*/("""
                    """),format.raw/*969.21*/("""type: 'line',
                    data: """),format.raw/*970.27*/("""{"""),format.raw/*970.28*/("""
                        """),format.raw/*971.25*/("""labels: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" ],
                        datasets: [
                        """),format.raw/*973.25*/("""{"""),format.raw/*973.26*/("""
                            """),format.raw/*974.29*/("""label: "Visit",
                            borderColor: "rgba(4, 73, 203,.09)",
                            borderWidth: "1",
                            backgroundColor: "rgba(4, 73, 203,.5)",
                            data: [ 0, 2900, 5000, 3300, 6000, 3250, 0 ]
                        """),format.raw/*979.25*/("""}"""),format.raw/*979.26*/(""",
                        """),format.raw/*980.25*/("""{"""),format.raw/*980.26*/("""
                            """),format.raw/*981.29*/("""label: "Bounce",
                            borderColor: "rgba(245, 23, 66, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(245, 23, 66,.5)",
                            pointHighlightStroke: "rgba(245, 23, 66,.5)",
                            data: [ 0, 4200, 4500, 1600, 4200, 1500, 4000 ]
                        """),format.raw/*987.25*/("""}"""),format.raw/*987.26*/(""",
                        """),format.raw/*988.25*/("""{"""),format.raw/*988.26*/("""
                            """),format.raw/*989.29*/("""label: "Targeted",
                            borderColor: "rgba(40, 169, 46, 0.9)",
                            borderWidth: "1",
                            backgroundColor: "rgba(40, 169, 46, .5)",
                            pointHighlightStroke: "rgba(40, 169, 46,.5)",
                            data: [1000, 5200, 3600, 2600, 4200, 5300, 0 ]
                        """),format.raw/*995.25*/("""}"""),format.raw/*995.26*/("""
                        """),format.raw/*996.25*/("""]
                    """),format.raw/*997.21*/("""}"""),format.raw/*997.22*/(""",
                    options: """),format.raw/*998.30*/("""{"""),format.raw/*998.31*/("""
                        """),format.raw/*999.25*/("""responsive: true,
                        tooltips: """),format.raw/*1000.35*/("""{"""),format.raw/*1000.36*/("""
                            """),format.raw/*1001.29*/("""mode: 'index',
                            intersect: false
                        """),format.raw/*1003.25*/("""}"""),format.raw/*1003.26*/(""",
                        hover: """),format.raw/*1004.32*/("""{"""),format.raw/*1004.33*/("""
                            """),format.raw/*1005.29*/("""mode: 'nearest',
                            intersect: true
                        """),format.raw/*1007.25*/("""}"""),format.raw/*1007.26*/("""

                    """),format.raw/*1009.21*/("""}"""),format.raw/*1009.22*/("""
                """),format.raw/*1010.17*/("""}"""),format.raw/*1010.18*/(""" """),format.raw/*1010.19*/(""");
            """),format.raw/*1011.13*/("""}"""),format.raw/*1011.14*/("""
            """),format.raw/*1012.13*/("""//Traffic chart chart-js  End



            // Bar Chart #flotBarChart
            $.plot("#flotBarChart", ["""),format.raw/*1017.38*/("""{"""),format.raw/*1017.39*/("""
                """),format.raw/*1018.17*/("""data: [[0, 18], [2, 8], [4, 5], [6, 13],[8,5], [10,7],[12,4], [14,6],[16,15], [18, 9],[20,17], [22,7],[24,4], [26,9],[28,11]],
                bars: """),format.raw/*1019.23*/("""{"""),format.raw/*1019.24*/("""
                    """),format.raw/*1020.21*/("""show: true,
                    lineWidth: 0,
                    fillColor: '#ffffff8a'
                """),format.raw/*1023.17*/("""}"""),format.raw/*1023.18*/("""
            """),format.raw/*1024.13*/("""}"""),format.raw/*1024.14*/("""], """),format.raw/*1024.17*/("""{"""),format.raw/*1024.18*/("""
                """),format.raw/*1025.17*/("""grid: """),format.raw/*1025.23*/("""{"""),format.raw/*1025.24*/("""
                    """),format.raw/*1026.21*/("""show: false
                """),format.raw/*1027.17*/("""}"""),format.raw/*1027.18*/("""
            """),format.raw/*1028.13*/("""}"""),format.raw/*1028.14*/(""");
            // Bar Chart #flotBarChart End

        """),format.raw/*1031.9*/("""}"""),format.raw/*1031.10*/(""");  // End of Document Ready
    </script>




        <div id="container">
        </div>

        <script src="https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="ff61747dd8d7db758f2acf61-|49" defer=""></script>
    </body>
</html>
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
                  DATE: Mon May 13 15:39:34 WAT 2019
                  SOURCE: /home/lehone/repo/github/play/rhino/app/views/admin/dashboard.scala.html
                  HASH: 6e6b1b72f5f8cb00a3f88408353b045d0a587b95
                  MATRIX: 951->1|1047->4|1074->5|1437->341|1452->347|1512->386|1600->447|1615->453|1676->492|1745->534|1760->540|1819->578|1887->619|1902->625|1965->667|2033->708|2048->714|2114->759|2182->800|2197->806|2260->848|2328->889|2343->895|2409->940|2462->966|2477->972|2548->1022|2618->1065|2633->1071|2700->1117|2788->1178|2803->1184|2858->1218|2909->1242|2924->1248|2993->1296|3061->1337|3076->1343|3151->1397|3249->1467|3278->1468|3314->1477|3371->1507|3399->1508|3431->1513|3474->1528|3503->1529|3539->1538|3589->1561|3617->1562|3649->1567|3688->1578|3717->1579|3753->1588|3799->1607|3827->1608|3859->1613|3900->1626|3929->1627|3965->1636|4009->1653|4037->1654|4069->1659|4113->1675|4142->1676|4178->1685|4262->1742|4290->1743|4322->1748|4367->1765|4396->1766|4432->1775|4589->1905|4617->1906|4649->1911|4689->1923|4718->1924|4754->1933|4800->1952|4828->1953|4861->1959|4903->1973|4932->1974|4968->1983|5014->2002|5042->2003|5074->2008|5115->2021|5144->2022|5180->2031|5226->2050|5254->2051|5287->2057|50076->46778|50092->46784|50164->46834|50274->46916|50290->46922|50349->46959|50459->47041|50475->47047|50531->47081|50641->47163|50657->47169|50710->47200|50821->47283|50837->47289|50911->47341|51057->47459|51073->47465|51147->47517|51257->47599|51273->47605|51357->47667|51469->47751|51485->47757|51560->47810|51670->47892|51686->47898|51765->47955|51875->48037|51891->48043|51973->48103|52085->48187|52101->48193|52182->48252|52292->48334|52308->48340|52377->48387|52489->48471|52505->48477|52571->48521|52681->48603|52697->48609|52768->48658|52878->48740|52894->48746|52966->48796|53169->48970|53199->48971|53241->48984|53363->49077|53393->49078|53423->49079|53509->49136|53539->49137|53586->49155|53616->49156|53646->49157|53728->49210|53758->49211|53805->49229|53835->49230|53865->49231|53950->49287|53980->49288|54022->49301|54096->49346|54126->49347|54172->49364|54209->49372|54239->49373|54289->49394|54323->49399|54353->49400|54407->49425|54557->49546|54587->49547|54645->49576|54792->49694|54822->49695|54885->49729|54915->49730|54973->49759|55035->49792|55065->49793|55115->49814|55145->49815|55191->49832|55221->49833|55274->49857|55304->49858|55354->49879|55452->49948|55482->49949|55524->49962|55554->49963|55679->50059|55709->50060|55739->50061|55822->50115|55852->50116|55899->50134|55929->50135|55959->50136|56043->50191|56073->50192|56115->50205|56197->50258|56227->50259|56273->50276|56310->50284|56340->50285|56390->50306|56424->50311|56454->50312|56508->50337|56581->50381|56611->50382|56669->50411|56731->50444|56761->50445|56811->50466|56841->50467|56887->50484|56917->50485|56972->50511|57002->50512|57052->50533|57109->50561|57139->50562|57175->50569|57205->50570|57255->50591|57353->50660|57383->50661|57426->50675|57456->50676|57689->50880|57719->50881|57765->50898|57891->50995|57921->50996|57965->51011|57995->51012|58041->51029|58078->51037|58108->51038|58158->51059|58194->51066|58224->51067|58278->51092|58419->51204|58449->51205|58508->51235|58538->51236|58592->51261|58811->51451|58841->51452|58922->51504|58952->51505|59007->51531|59037->51532|59087->51553|59144->51581|59174->51582|59229->51608|59259->51609|59309->51630|59366->51658|59396->51659|59449->51683|59479->51684|59529->51705|59586->51733|59616->51734|59658->51747|59688->51748|59857->51888|59887->51889|59933->51906|60010->51954|60040->51955|60088->51974|60406->52263|60436->52264|60467->52266|60497->52267|60545->52286|60747->52459|60777->52460|60827->52481|60887->52512|60917->52513|60959->52526|60989->52527|61070->52579|61100->52580|61150->52601|61228->52650|61258->52651|61312->52676|61362->52697|61392->52698|61450->52727|61482->52730|61512->52731|61574->52764|61959->53120|61989->53121|62043->53146|62073->53147|62125->53170|62155->53171|62201->53188|62231->53189|62275->53204|62305->53205|62347->53218|62496->53338|62526->53339|62572->53356|62734->53489|62764->53490|62814->53511|62883->53551|62913->53552|62967->53577|63117->53698|63147->53699|63205->53728|63526->54020|63556->54021|63611->54047|63641->54048|63699->54077|64101->54450|64131->54451|64186->54477|64216->54478|64274->54507|64678->54882|64708->54883|64762->54908|64813->54930|64843->54931|64903->54962|64933->54963|64987->54988|65069->55040|65100->55041|65159->55070|65273->55154|65304->55155|65367->55188|65398->55189|65457->55218|65572->55303|65603->55304|65655->55326|65686->55327|65733->55344|65764->55345|65795->55346|65840->55361|65871->55362|65914->55375|66053->55484|66084->55485|66131->55502|66310->55651|66341->55652|66392->55673|66527->55778|66558->55779|66601->55792|66632->55793|66665->55796|66696->55797|66743->55814|66779->55820|66810->55821|66861->55842|66919->55870|66950->55871|66993->55884|67024->55885|67108->55940|67139->55941
                  LINES: 28->1|33->2|34->3|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|61->30|61->30|62->31|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|73->42|73->42|73->42|74->43|76->45|76->45|77->46|77->46|77->46|78->47|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|88->57|88->57|88->57|89->58|90->59|90->59|91->60|91->60|91->60|92->61|93->62|93->62|95->64|812->779|812->779|812->779|813->780|813->780|813->780|814->781|814->781|814->781|815->782|815->782|815->782|817->784|817->784|817->784|821->788|821->788|821->788|822->789|822->789|822->789|825->792|825->792|825->792|826->793|826->793|826->793|827->794|827->794|827->794|830->797|830->797|830->797|831->798|831->798|831->798|834->801|834->801|834->801|835->802|835->802|835->802|836->803|836->803|836->803|844->811|844->811|845->812|849->816|849->816|849->816|849->816|849->816|850->817|850->817|850->817|850->817|850->817|851->818|851->818|851->818|851->818|851->818|852->819|854->821|854->821|855->822|855->822|855->822|856->823|856->823|856->823|857->824|860->827|860->827|861->828|864->831|864->831|865->832|865->832|866->833|867->834|867->834|868->835|868->835|869->836|869->836|870->837|870->837|871->838|873->840|873->840|874->841|874->841|882->849|882->849|882->849|882->849|882->849|883->850|883->850|883->850|883->850|883->850|884->851|885->852|885->852|886->853|886->853|886->853|887->854|887->854|887->854|888->855|889->856|889->856|890->857|891->858|891->858|892->859|892->859|893->860|893->860|894->861|894->861|895->862|896->863|896->863|896->863|896->863|897->864|899->866|899->866|901->868|901->868|920->887|920->887|921->888|924->891|924->891|925->892|925->892|926->893|926->893|926->893|927->894|927->894|927->894|928->895|931->898|931->898|932->899|932->899|933->900|938->905|938->905|940->907|940->907|941->908|941->908|942->909|943->910|943->910|944->911|944->911|945->912|946->913|946->913|947->914|947->914|948->915|949->916|949->916|950->917|950->917|959->926|959->926|960->927|960->927|960->927|961->928|967->934|967->934|967->934|967->934|968->935|973->940|973->940|974->941|975->942|975->942|976->943|976->943|978->945|978->945|979->946|979->946|979->946|980->947|980->947|980->947|981->948|981->948|981->948|982->949|987->954|987->954|988->955|988->955|989->956|989->956|990->957|990->957|991->958|991->958|992->959|998->965|998->965|999->966|1001->968|1001->968|1002->969|1003->970|1003->970|1004->971|1006->973|1006->973|1007->974|1012->979|1012->979|1013->980|1013->980|1014->981|1020->987|1020->987|1021->988|1021->988|1022->989|1028->995|1028->995|1029->996|1030->997|1030->997|1031->998|1031->998|1032->999|1033->1000|1033->1000|1034->1001|1036->1003|1036->1003|1037->1004|1037->1004|1038->1005|1040->1007|1040->1007|1042->1009|1042->1009|1043->1010|1043->1010|1043->1010|1044->1011|1044->1011|1045->1012|1050->1017|1050->1017|1051->1018|1052->1019|1052->1019|1053->1020|1056->1023|1056->1023|1057->1024|1057->1024|1057->1024|1057->1024|1058->1025|1058->1025|1058->1025|1059->1026|1060->1027|1060->1027|1061->1028|1061->1028|1064->1031|1064->1031
                  -- GENERATED --
              */
          
<%-- 
    Document   : index
    Created on : 28 Mar, 2017, 4:30:13 PM
    Author     : Honey Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="../css/adminPanel.css">
</head>
<body>
    
<!-- horizontal nav bar --> 
    
<nav class="navbar he navbar-inverse">
  <div class="container-fluid">  
    <div class="collapse navbar-collapse" id="myNavbar">

      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!--horizontal navbar completed-->
<!-- vertical navbar starts -->

<div class="nav-side-menu">
    <div class="brand">
      <img class="img-thumbnail" alt="Stroy Bulletin" src="../img/logo.jpg" height="50" width="50">
      &nbsp;&nbsp;&nbsp;<b>Admin Panel</b>
    </div> 
    <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
  
        <div class="menu-list">
  
            <ul id="menu-content" class="menu-content collapse out">
                <li id="li1">
                  <a href="c.html">
                  <i class="fa fa-dashboard fa-lg"></i> Dashboard
                  </a>  
                </li>

                <li  data-toggle="collapse" data-target="#products" class="collapsed active">
                  <a href="#"><i class="fa fa-gift fa-lg"></i> UI Elements <span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="products">
                    <li class="active"><a href="#">CSS3 Animation</a></li>
                    <li><a href="#">General</a></li>
                    <li><a href="#">Buttons</a></li>
                    <li><a href="#">Tabs & Accordions</a></li>
                    <li><a href="#">Typography</a></li>
                    <li><a href="#">FontAwesome</a></li>
                    <li><a href="#">Slider</a></li>
                    <li><a href="#">Panels</a></li>
                    <li><a href="#">Widgets</a></li>
                    <li><a href="#">Bootstrap Model</a></li>
                </ul>


                <li data-toggle="collapse" data-target="#service" class="collapsed">
                  <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts <span class="arrow"></span></a>
                </li>  
                <ul class="sub-menu collapse" id="service">
                    <li><a href="../AnalyticsController">Demo</a></li>
                  <li>New Service 2</li>
                  <li>New Service 3</li>
                </ul>


                <li data-toggle="collapse" data-target="#new" class="collapsed">
                  <a href="#"><i class="fa fa-users fa-lg"></i>  Users <span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="new">
                    <li id="user"><a href="../UserInformationController?page=1">Online Users</a></li>
                  <li>All Users</li>
                </ul>


                 <li>
                  <a href="#">
                  <i class="fa fa-user fa-lg"></i> Profile
                  </a>
                  </li>

                 <li>
                  <a href="#">
                  <i class="fa fa-users fa-lg"></i> Users
                  </a>
                </li>
            </ul>
     </div>
    
</div>
<div id="myDiv"></div>
<!-- vertical navbar completed -->

</body>
<!--    <script>
        $(document).ready(function (){
            $("#user").click(function(){ // when #showhidecomment is clicked
                $("#myDiv").load("Users.jsp"); // load the sample.jsp page in the #chkcomments element
             }); 
        });
    </script>-->
</html>

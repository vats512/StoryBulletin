<%-- 
    Document   : client
    Created on : 15 Apr, 2017, 2:47:07 PM
    Author     : Honey Shah
--%>

<%@page import="com.storybulletin.model.FetchNews"%>
<%@page import="java.util.List"%>
<%@page import="com.storybulletin.dao.NewsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<title>Story Bulletin</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<style>
    .n{
        float:right;
        position: relative;
     }
</style>
</head>
<body>

<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<header id="header">
  <nav class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
        <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="Story Bulletin"></a></div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav custom_nav">
          <li class="active"><a href="../NewsController">Home</a></li>
          <li><a href="../CategoryController?category=top&page=1">Top</a></li>
          <li><a href="../CategoryController?category=world&page=1">World</a></li>
          <li><a href="../CategoryController?category=politics&page=1">Politics</a></li>
          <li><a href="../CategoryController?category=sports&page=1">Sports</a></li>
          <li><a href="../CategoryController?category=lifestyle&page=1">Lifestyle</a></li>
          <li><a href="../CategoryController?category=business&page=1">Business</a></li>
          <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Articles <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="sportserv"><b>Read Articles</b></a></li>
                    <li><a href="politicserv"><b>Upload Articles</b></a></li>
                </ul>
          </li>
        </ul>
          
          <ul class="n nav navbar-nav custom_nav">
              <%  if(session.getAttribute("userID")==null){  %>
                  <li><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
              <%  } %>
                
             <li>
                     
                     <% if(session.getAttribute("userID")==null){%>
                      <a href="Login.jsp">
                       <span class="glyphicon glyphicon-log-in"></span> 
                      
                        Login
                       </a>
                    <% }else{%>
<!--                       <a href="../LogoutController">
                        <span class="glyphicon glyphicon-log-out"></span>  
                        Logout
                       </a>-->
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Hi,<%=session.getAttribute("userName")%><b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span>Profile</a></li>
                    <li><a href="../LogoutController"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
                </ul>
                    <% }
                     
                     %>
  
                 
             </li>
          </ul>
      </div>
   
      
      <div class="search"><a class="search_icon" href="#"><i class="fa fa-search"></i></a>
        <form action="#">
          <input class="search_bar" type="text" placeholder="Search here">
        </form>
      </div>
    </div>
  </nav>
</header>
<script src="assets/js/jquery.min.js"></script> 
<script src="assets/js/wow.min.js"></script> 
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/custom.js"></script>
</body>   
</html>
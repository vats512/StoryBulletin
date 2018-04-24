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
<style type="text/css">
    .read-more{
        color: blue;
    }

</style>
</head>
<body>

<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<%@include file="ClientHeader.jsp" %>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<section id="content">
 <%
     if(session.getAttribute("REFRESH")!=null){
        response.sendRedirect("../NewsController");
    }
    else{    
        session.setAttribute("REFRESH","TRUE");
    }
     
     if(session.getAttribute("userID")!=null){
         
 %>
  <div class="row">
    <div class="col-lg-12 col-md-12 col-sm-12">
      <div class="featured_slider">
        <h2 class="featured_title">Recommended For You</h2>
        <div class="slick_slider">
            <%
//                NewsDao n2=new NewsDao();
//                List<FetchNews> f2=n2.getNews("india","ANI",5);
                  List<FetchNews> f2=(List)session.getAttribute("rec");
                for(FetchNews fn2:f2){
//                    FetchNews fn2=f2.get(i);
            %>
          <div class="single_iteam"><img height="300" width="250" src="<%=fn2.getImageLink()%>" alt="">
            <h2><a class="slider_tittle" href="#"><%=fn2.getNewsHeading()%></a></h2>
          </div>
          <%}%>
        </div>
      </div>
    </div>
  </div>
 <%}%>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-3 col-sm-4">
        <div class="left_sidebar">
          <div class="single_widget">
              <h2>Sports</h2>
              <ul class="ppost_nav wow fadeInDown">
                  <%
                      List<FetchNews> sports=(List)session.getAttribute("choice1");
                      for(FetchNews s: sports){
                          long id=s.getNewsID();
                  %>
                <li>
                  <div class="media"><img class="media-left" height="70" width="70" src="<%=s.getImageLink()%>" alt="">
                      <div class="media-body"><a class="catg_title" href="../DetailNewsController?id=<%=id%>"><%=s.getNewsHeading()%></a></div>
                  </div>
                </li>
             
              <%}%>
               </ul>
            </div>

        </div>
      </div>
      <div class="col-lg-6 col-md-6 col-sm-8">
        <div class="middle_content">
          <h2>Top News</h2>
          <ul class="featured_nav">
           <%
                List<FetchNews> india=(List<FetchNews>)session.getAttribute("choice2");
                for(FetchNews i:india){
                    long id=i.getNewsID();
            %>
            <li class="wow fadeInDown">
                <figure class="featured_img">
                    <img height="550" width="400" src="<%=i.getImageLink()%>" alt="">
                </figure>
                <article class="featured_article">
                <div class="article_category">
                    <%=i.getNewsSourceName()%> <i class="fa fa-angle-right"></i><%=i.getDate()%>
                </div>
                <h2 class="article_titile">
                    <a href="../DetailNewsController?id=<%=id%>"><%=i.getNewsHeading()%></a></h2>
                <div>
                    <%=i.getDetailNews().substring(0,500)%><a href="../DetailNewsController?id=<%=id%>"><b class="read-more">&nbsp;Read More</b></a></div>
              </article>
            </li>
            <%}%>
          </ul>

        </div>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-12">
        <div class="right_sidebar">
          <div class="single_widget">
            <h2>Business</h2>
            <ul class="ppost_nav wow fadeInDown">
              <%
                    List<FetchNews> business=(List<FetchNews>)session.getAttribute("choice3");
                    for(FetchNews b:business){
                        long id=b.getNewsID();
              %>
              <li>
                  <div class="media"><img class="media-left" height="70" width="70" src="<%=b.getImageLink()%>" alt="">
                      <div class="media-body"><a class="catg_title" href="../DetailNewsController?id=<%=id%>"><%=b.getNewsHeading()%></a></div>
                </div>
              </li>
             <% }%>
            </ul>
          </div>
          
          </div>
        
          
          
        </div>
      </div>
    </div>
  
</section>
<footer id="footer">
  <div class="footer_top">
    <div class="container">
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm3">
          <div class="footer_widget wow fadeInLeftBig">
            <h2>Labels</h2>
            <ul class="labels_nav">
              <li><a href="#">Games</a></li>
              <li><a href="#">Gallery</a></li>
              <li><a href="#">Technology</a></li>
              <li><a href="#">Business</a></li>
              <li><a href="#">Slider</a></li>
              <li><a href="#">Life &amp; Style</a></li>
              <li><a href="#">Ver</a></li>
              <li><a href="#">Sports</a></li>
            </ul>
          </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm3">
          <div class="footer_widget">
            <h2>Popular Post</h2>
            <ul class="ppost_nav wow fadeInLeftBig">
              <li>
                <div class="media"><a href="pages/single_page.html" class="media-left"><img alt="" src="images/70x70.jpg"></a>
                  <div class="media-body"><a href="pages/single_page.html" class="catg_title">Aliquam malesuada diam eget turpis varius</a></div>
                </div>
              </li>
              
            </ul>
          </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm3">
          <div class="footer_widget wow fadeInRightBig">
            <h2>Flickr Images</h2>
          </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm3">
          <div class="footer_widget wow fadeInRightBig">
            <h2>Jetpack Subscription Widget</h2>
            <form action="#" class="subscribe_form">
              <p id="subscribe-text">We promise, we will only send you awesome stuff which will make your day!</p>
              <p id="subscribe-email">
                <input type="text" placeholder="Email Address" name="email">
              </p>
              <p id="subscribe-submit">
                <input type="submit" value="Submit">
              </p>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="footer_bottom">
    <div class="container">
      <p class="copyright">Copyright &copy; 2045 <a href="index.html">Cyber Tech</a></p>
      <p class="developer">Developed By Wpfreeware</p>
    </div>
  </div>
</footer>
<!--<script src="assets/js/jquery.min.js"></script> 
<script src="assets/js/wow.min.js"></script> 
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/custom.js"></script>-->
</body>
</html>

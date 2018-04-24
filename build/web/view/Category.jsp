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
/*    .borderbottom{
        border-bottom: 1px dotted lightgray;
        padding-bottom: 40px;
    }*/
    .info-color{
        color:gray;
    }
    .c{
        font-family: 'Allerta',Helvetica,Arial,sans-serif;
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
        <div class="container">
            <div class="row">
                <div class="col-sm-offset-1 col-sm-6">
                    <div class="left_sidebar">
                        <div class="single_widget">
                             <h2 class="single_widget-h2">
                                 <%
                                     String category=request.getParameter("category");
                                     if(category.equals("india"))
                                        category="top";
                                     category=category.toUpperCase();
                                 %>
                                 <%=category%>
                             </h2>
                            <ul class="ppost_nav wow fadeInDown">
                            <%
                                List<FetchNews> news=(List)session.getAttribute("news");
                                for(FetchNews n:news){
                            %>
                                <li>
                                    <div class="media"><img class="media-left" height="100" width="150" src="<%=n.getImageLink()%>" alt="">
                                        <div class="media-body"><a class="catg_title" href="../DetailNewsController?id=<%=n.getNewsID()%>"><%=n.getNewsHeading()%></a>
                                            <div class="info-color">From : <%=n.getNewsSourceName()%> News</div>
                                            <div class="info-color">Posted Date : <%=n.getDate()%></div>
                                        </div>
                                    </div>
                                  
                                </li>
                           <%}%>
                            </ul>
                           <div id="pagination" class="container1" align="center">
                                <ul class="pagination">
                                 <%                      
                                     int count=(int)session.getAttribute("totalNews");
                                     int total;
                                     if(count%10!=0)
                                         total=(count/10)+1;
                                     else
                                         total=count/10;
                                     for (int j=1;j<=total;j++){ %>
                                        <li 
                                            <%
                                                int page1=(int)session.getAttribute("page");
                                                if(page1==j)
                                                   out.print("class=\"active\"");
                                            %>
                               
                                            ><a href="../CategoryController?category=<%=session.getAttribute("category")%>&page=<%=j%>"><%= j%></a></li>
                                       <%}%>
                                    </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 col-sm-offset-1">
          <div class="right_sidebar">
            <div class="single_widget">
              <h2>Most Viewed</h2>
              <ul class="ppost_nav wow fadeInDown">
                            <%
                                List<FetchNews> mostViewed=(List)session.getAttribute("mostViewed");
                                for(FetchNews n:mostViewed){
                            %>
                                <li>
                                    <div class="media"><img class="media-left" height="100" width="150" src="<%=n.getImageLink()%>" alt="">
                                        <div class="media-body"><a class="c" href="../DetailNewsController?id=<%=n.getNewsID()%>"><%=n.getNewsHeading()%></a>
<!--                                            <div class="info-color">From : <%=n.getNewsSourceName()%> News</div>
                                            <div class="info-color">Posted Date : <%=n.getDate()%></div>-->
                                        </div>
                                    </div>
                                  
                                </li>
                           <%}%>
                            </ul>
            </div>
           
            
           
            
          </div>
        </div>
            </div>
        </div>                            
    </section>

</body>
</html>
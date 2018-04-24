<%-- 
    Document   : Users.jsp
    Created on : 28 Mar, 2017, 6:59:03 PM
    Author     : Honey Shah
--%>

<%@page import="com.storybulletin.model.UserInformation"%>
<%@page import="java.util.List"%>
<%@page import="com.storybulletin.dao.UserDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Table</title>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <style>
            .container1 {
                width: 50%;
                height: 30%;
                margin: auto;  
           }
        </style>
    </head>
    <body>
          <%@include file="index.jsp" %> 
          <% 
           long count=(long)session.getAttribute("count");
            long tot=(count/5)+1;
          %>
        <div class="table-responsive container1">          
         <table class="table table-hover table-bordered">
          <thead>
            <tr>
              <th>Firstname</th>
              <th>Lastname</th>
              <th>SportsClicks</th>
              <th>BusinessClicks</th>
              <th>LifeStyleClicks</th>
              <th>PoliticsClicks</th>
            </tr>
          </thead>
          <tbody>
              <% 
                  List<UserInformation> users=(List)session.getAttribute("users");
                  for(int i=0;i<users.size();i++){
                        UserInformation user=users.get(i);
                  
              %>  
                    <tr>
                      <td><%= user.getEmailID()%></td>
                      <td><%= user.getGender()%></td>
                      <td><%= user.getLifeStyleClicks() %></td>
                      <td><%= user.getPoliticsClicks() %></td>
                      <td><%= user.getSportsClicks() %></td>
                      <td><%= user.getBusinessClicks() %></td>
                    </tr>
                 <% } %>    
          </tbody>
        </table>
        </div>
        <div id="pagination" class="container1" align="center">
             <ul class="pagination">
                 <% for (int j=1;j<=tot;j++){ %>
                 <li class="active"><a href="../UserInformationController?page=<%=j%>"><%= j%></a></li>
                <%}%>
            </ul>
        </div>
    </body>
<!--    <script>
        $(document).ready(function (){
            $('#pagination ul li').click(function(e) {
            var $this = $(this);
            if (!$this.hasClass('active')) {
                  $this.addClass('active');
            },
            e.preventDefault();
            });
        });
    </script>-->
</html>

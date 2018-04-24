<%-- 
    Document   : DetailedNews
    Created on : 15 Apr, 2017, 4:55:51 PM
    Author     : Honey Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detailed News</title>
                <style>
              .boxed {
               
                margin-top: 8%;
            }
            .pdfButton{
                align: center!important;
            }
        </style>
       
    </head>
    <body>
        <%@include file="ClientHeader.jsp" %>
      <div class="container boxed">
            <div class="col-sm-offset-2 col-sm-8">
                <div class="middle_content">
                    <h2 class="middle-content-h2">Detailed News</h2>
                    <ul class="featured_nav1">
                    <%
                        FetchNews news=(FetchNews)session.getAttribute("singleNews");
                        String category=news.getNewsType();
//                        if(category.equals("india"))
//                            category="top";
                        category=category.toUpperCase();
                    %>
                        <li class="wow fadeInDown">
                            <figure class="featured_img"><a href="#"><img src="<%=news.getImageLink()%>" alt=""></a></figure>
                            <article class="featured_article" id="myDiv">
                                <div class="article_category"><a href="#"><%=category%> <i class="fa fa-angle-right"></i></a><a href="#"><%=news.getNewsSourceName()%> <i class="fa fa-angle-right"></i></a><a href="#"><%=news.getDate()%></a></div>
                                <h2 class="article_titile"><%=news.getNewsHeading()%></h2>
                                <p><%=news.getDetailNews()%></p>
                            </article>
                        </li>
                    </ul>
                            <div class="col-sm-4 pdfButton">
					<form method="post" action="../PdfController">
						<input type="hidden" name="html_val_pdf" id="html_val_pdf"/>
						<input type="submit" id="abc" class="btn btn-danger" value="Create PDF"/>
					</form>
				</div>
                </div>
            </div>                      
        </div>
                             <script>
 	$(document).ready(function()
	{
		$("#html_val_pdf").val($("#myDiv").html());
		
	});
 	</script>
    
    </body>
    
</html>

package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.storybulletin.model.FetchNews;
import java.util.List;
import com.storybulletin.dao.NewsDao;

public final class Category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/view/ClientHeader.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>jsp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Story Bulletin</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/theme.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/style.css\">\n");
      out.write("<style>\n");
      out.write("    .n{\n");
      out.write("        float:right;\n");
      out.write("        position: relative;\n");
      out.write("     }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("<header id=\"header\">\n");
      out.write("  <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"Story Bulletin\"></a></div>\n");
      out.write("      <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav custom_nav\">\n");
      out.write("          <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li><a href=\"#\">Top</a></li>\n");
      out.write("          <li><a href=\"#\">World</a></li>\n");
      out.write("          <li><a href=\"#\">Politics</a></li>\n");
      out.write("          <li><a href=\"#\">Sports</a></li>\n");
      out.write("          <li><a href=\"pages/contact.html\">Lifestyle</a></li>\n");
      out.write("          <li><a href=\"pages/404.html\">Business</a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Articles <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"sportserv\"><b>Read Articles</b></a></li>\n");
      out.write("                    <li><a href=\"politicserv\"><b>Upload Articles</b></a></li>\n");
      out.write("                </ul>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("          \n");
      out.write("          <ul class=\"n nav navbar-nav custom_nav\">\n");
      out.write("              <li><a href=\"../LogoutController\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("             <li>\n");
      out.write("                     \n");
      out.write("                     ");
 if(session.getAttribute("userID")==null){
      out.write("\n");
      out.write("                      <a href=\"Login.jsp\">\n");
      out.write("                       <span class=\"glyphicon glyphicon-log-in\"></span> \n");
      out.write("                      \n");
      out.write("                        Login\n");
      out.write("                       </a>\n");
      out.write("                    ");
 }else{
      out.write("\n");
      out.write("                       <a href=\"../LogoutController\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-log-out\"></span>  \n");
      out.write("                        Logout\n");
      out.write("                       </a>\n");
      out.write("                    ");
 }
                     
                     
      out.write("\n");
      out.write("  \n");
      out.write("                 </a>\n");
      out.write("             </li>\n");
      out.write("          </ul>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("      <div class=\"search\"><a class=\"search_icon\" href=\"#\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("        <form action=\"#\">\n");
      out.write("          <input class=\"search_bar\" type=\"text\" placeholder=\"Search here\">\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("</header>\n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script> \n");
      out.write("<script src=\"assets/js/wow.min.js\"></script> \n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"assets/js/slick.min.js\"></script> \n");
      out.write("<script src=\"assets/js/custom.js\"></script>\n");
      out.write("</body>   \n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-12\">\n");
      out.write("        <div class=\"right_sidebar\">\n");
      out.write("          <div class=\"single_widget\">\n");
      out.write("            <h2>Business</h2>\n");
      out.write("            <ul class=\"ppost_nav wow fadeInDown\">\n");
      out.write("              ");

                   
                    for(int i=0;i<5;i++){
              
      out.write("\n");
      out.write("              <li>\n");
      out.write("                  <div class=\"media\"><a class=\"media-left\" href=\"pages/single_page.html\"><img height=\"70\" width=\"70\" src=\"images/blue1.jpg\" alt=\"\"></a>\n");
      out.write("                      <div class=\"media-body\"><a class=\"catg_title\" href=\"DetailedNews.jsp\">dklghfl;ghdhg'sakgoh[rhgoinklfnvfd.nd;ghfdngdno</a></div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("             ");
 }
      out.write("\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

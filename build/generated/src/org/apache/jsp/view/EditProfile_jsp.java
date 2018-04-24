package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.storybulletin.model.FetchNews;
import java.util.List;
import com.storybulletin.dao.NewsDao;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign Up Form</title>\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"assets/css1/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("     \n");
      out.write("<style>\n");
      out.write("    .bkg\n");
      out.write("    {\n");
      out.write("    background: url('images/blue1_1.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    min-height: 799px;  \n");
      out.write("    z-index: -1; \n");
      out.write("}\n");
      out.write(".grid\n");
      out.write("{\n");
      out.write("    color: #D7E5E6!important;\n");
      out.write("    font-size: 2.3em;\n");
      out.write("    margin-top:30px;\n");
      out.write("    text-align: left;\n");
      out.write("    text-transform:uppercase;\n");
      out.write("}\n");
      out.write(".button\n");
      out.write("{\n");
      out.write("    color:white!important;\n");
      out.write("    font-size: 2.3em;\n");
      out.write("    text-align: center;\n");
      out.write("    text-transform:uppercase;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".signin-box{\n");
      out.write("    margin-top: 10%;\n");
      out.write("    box-shadow: 10px 10px 5px #888888!important;\n");
      out.write("    /*opacity: 0.5;*/\n");
      out.write("}\n");
      out.write(".z{\n");
      out.write("    background-color: black!important;\n");
      out.write("    box-shadow: 10px 10px 5px #888888!important;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".shadow{\n");
      out.write("      text-shadow: 1px 1px #888888;\n");
      out.write("}\n");
      out.write(".help{\n");
      out.write("    font-size: 1em;\n");
      out.write("    color: #333;\n");
      out.write("    padding-bottom:-50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"dashboard-page\">\n");
      out.write("    ");
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
      out.write("          <li class=\"active\"><a href=\"../NewsController\">Home</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=top&page=1\">Top</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=world&page=1\">World</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=politics&page=1\">Politics</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=sports&page=1\">Sports</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=lifestyle&page=1\">Lifestyle</a></li>\n");
      out.write("          <li><a href=\"../CategoryController?category=business&page=1\">Business</a></li>\n");
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
      out.write("              ");
  if(session.getAttribute("userID")==null){  
      out.write("\n");
      out.write("                  <li><a href=\"Signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("              ");
  } 
      out.write("\n");
      out.write("                \n");
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
      out.write("<!--                       <a href=\"../LogoutController\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-log-out\"></span>  \n");
      out.write("                        Logout\n");
      out.write("                       </a>-->\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Hi,");
      out.print(session.getAttribute("userName"));
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"Signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span>Profile</a></li>\n");
      out.write("                    <li><a href=\"../LogoutController\"><span class=\"glyphicon glyphicon-log-out\"></span>Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("                    ");
 }
                     
                     
      out.write("\n");
      out.write("  \n");
      out.write("                 \n");
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
      out.write("    <div class=\"bkg img-responsive\">\n");
      out.write("\t<div class=\"main-grid\">\n");
      out.write("            <div class=\"agile-grids\">\t\n");
      out.write("\t\t<!-- validation -->\n");
      out.write("\t\t<div class=\"grids\">\n");
      out.write("                    <div class=\"forms-grids\">\n");
      out.write("\t\t\t<div class=\"forms3\">\n");
      out.write("                            <div class=\"w3agile-validation w3ls-validation\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-widget agile-validation register-form\">\n");
      out.write("                                    <div class=\"signin-box validation-grids widget-shadow\" data-example-id=\"basic-forms\"> \n");
      out.write("\t\t\t\t\t<div class=\"input-info\">\n");
      out.write("                                            <h3 class=\"shadow\">Registration Form :</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-body form-body-info\">\n");
      out.write("                                            <form action=\"../SignupController\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    <input type=\"password\" data-toggle=\"validator\" data-minlength=\"6\" class=\"form-control inputPassword\" name=\"password\" placeholder=\"Current Password\" required=\"\">\n");
      out.write("                                                        <!--<span class=\"help-block\">Minimum of 6 characters</span>-->\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    <input type=\"password\" data-toggle=\"validator\" data-minlength=\"6\" class=\"form-control inputPassword\" name=\"password\" placeholder=\"New Password\" required=\"\">\n");
      out.write("                                                        <!--<span class=\"help-block\">Minimum of 6 characters</span>-->\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    <input type=\"password\" data-toggle=\"validator\" data-minlength=\"6\" class=\"form-control inputPassword\" name=\"repassword\" placeholder=\"Reenter Password\" required=\"\">\n");
      out.write("                                                        <!--<span class=\"help-block\">Minimum of 6 characters</span>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group valid-form\">\n");
      out.write("                                                    <input type=\"radio\" class=\"radio\" name=\"gender\" value=\"0\" checked>Male\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                    <input type=\"radio\" class=\"radio\" name=\"gender\" value=\"1\">Female\n");
      out.write("                                                </div>\n");
      out.write("                                                <span class=\"help\">Select your interest</span>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" name=\"categories\" value=\"world\">World\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" name=\"categories\" value=\"technology\">Technology\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" name=\"categories\" value=\"business\">Business\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" name=\"categories\" value=\"lifestyle\">Lifestyle\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                   <input type=\"checkbox\" name=\"categories\" value=\"politics\">Politics\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"checkbox\">\n");
      out.write("                                                   <input type=\"checkbox\" name=\"categories\" value=\"sports\">Sports\n");
      out.write("                                                </div>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group button\">\n");
      out.write("                                                    <input type=\"submit\" class=\"btn z btn-info btn-md\" name=\"Submit\" value=\"SUBMIT\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("                            </div>\n");
      out.write("<!--                            <div class=\"clear\"> </div>-->\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

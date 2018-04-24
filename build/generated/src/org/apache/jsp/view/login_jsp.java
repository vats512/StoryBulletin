package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.storybulletin.model.FetchNews;
import java.util.List;
import com.storybulletin.dao.NewsDao;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Form</title>\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"assets/css1/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- font CSS --><!--\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Archivo+Black\" rel=\"stylesheet\">-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Signika:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:400,700\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("    .bkg\n");
      out.write("    {\n");
      out.write("    background: url('images/blue1_1.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    min-height: 799px;  \n");
      out.write("    z-index: -1;\n");
      out.write("    height: 100%;\n");
      out.write("    width: 100%;\n");
      out.write("    \n");
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
      out.write(".login-box{\n");
      out.write("    margin-top: 12%;\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--font CSS-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\t\t<script>\n");
      out.write("\t\t$(function () {\n");
      out.write("\t\t\t$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);\n");
      out.write("\n");
      out.write("\t\t\tif (!screenfull.enabled) {\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t$('#toggle').click(function () {\n");
      out.write("\t\t\t\tscreenfull.toggle($('#container')[0]);\n");
      out.write("\t\t\t});\t\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>-->\n");
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
      out.write("              <li><a href=\"regDemo.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("             <li><a href=\"logDemo.jsp\">\n");
      out.write("                     <span class=\"glyphicon glyphicon-log-in\"></span> \n");
      out.write("                     ");
 if(session.getAttribute("userID")==null){
//                         System.out.print("jdks");
                     out.print("Login");
                     
                     }else{
                         out.print("Logout");
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
      out.write("</body>\n");
      out.write("    \n");
      out.write("</html>");
      out.write("\n");
      out.write("    <div class=\"bkg img-responsive\">\n");
      out.write("\t<div class=\"main-grid\">\n");
      out.write("            <div class=\"agile-grids\">\t\n");
      out.write("\t\t<!-- validation -->\n");
      out.write("\t\t<div class=\"grids\">\n");
      out.write("                    <div class=\" panel panel-widget agile-validation\">\n");
      out.write("\t\t\t<div class=\"login-box validation-grids validation-grids-right login-form\">\n");
      out.write("                      \t    <div class=\" widget-shadow login-form-shadow\" data-example-id=\"basic-forms\"> \n");
      out.write("\t\t\t\t<div class=\"input-info\">\n");
      out.write("                        \t    <h3 class=\"shadow\">Login form :</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-body form-body-info\">\n");
      out.write("                                    <form data-toggle=\"validator\" novalidate=\"\" action=\"logServ\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t            <input type=\"email\" class=\"form-control inputEmail\" name=\"Email\" placeholder=\"Enter Your Email\" data-error=\"Bruh, that email address is invalid\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon form-control-feedback\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t    <input type=\"password\" data-toggle=\"validator\" data-minlength=\"6\" class=\"form-control inputPassword\" name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t\t<div class=\"bottom\">\n");
      out.write("\t\t\t\t       \t    <div class=\"form-group\">\n");
      out.write("                                                <label class=\"shadow\">\n");
      out.write("                                                    <a href=\"reset.jsp\"><p>Forgot Password?</a>\n");
      out.write("\t\t\t\t\t\t</label>\t\t\t\n");
      out.write("\t               \t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"form-group button\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn z btn-md\" name=\"Login\" value=\"LOGIN\">\n");
      out.write("\t\t\t\t\t    </div>\t\t\t\t\t\t\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("<!--\t\t<script type=\"text/javascript\" src=\"js/valida.2.1.6.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" >\n");
      out.write("\n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t// show Valida's version.\n");
      out.write("\t\t\t\t$('#version').valida( 'version' );\n");
      out.write("\n");
      out.write("\t\t\t\t// Exemple 1\n");
      out.write("\t\t\t\t$('.valida').valida();\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$('#partial-1').on('click', function( ev ) {\n");
      out.write("\t\t\t\t\tev.preventDefault();\n");
      out.write("\t\t\t\t\t$('#res-1').click(); // clear form error msgs\n");
      out.write("\t\t\t\t\t$('form').valida('partial', '#field-1'); // validate only field-1\n");
      out.write("\t\t\t\t\t$('form').valida('partial', '#field-1-3'); // validate only field-1-3\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t</script>-->\n");
      out.write("\t\t<!-- //input-forms -->\n");
      out.write("\t\t<!--validator js-->\n");
      out.write("\t\t<!--<script src=\"js/validator.min.js\"></script>-->\n");
      out.write("\t\t<!--//validator js-->\n");
      out.write("        </div>\n");
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

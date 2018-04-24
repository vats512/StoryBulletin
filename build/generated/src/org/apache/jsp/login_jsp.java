package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Registration / Login form Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Registration / Login form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- font CSS --><!--\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Archivo+Black\" rel=\"stylesheet\">-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Signika:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:400,700\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("    .bkg\n");
      out.write("    {\n");
      out.write("    background: url('images/bon.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("\tmin-height: 799px;\n");
      out.write("}\n");
      out.write(".grid\n");
      out.write("{\n");
      out.write("    color: #D7E5E6!important;\n");
      out.write("    font-size: 2.3em;\n");
      out.write("    margin-top:30px;\n");
      out.write("    text-align: left;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("}\n");
      out.write(".button\n");
      out.write("{\n");
      out.write("    color: #D7E5E6!important;\n");
      out.write("    font-size: 2.3em;\n");
      out.write("    text-align: center;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--font CSS-->\n");
      out.write("<script src=\"js/jquery2.0.3.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<script>\n");
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
      out.write("\t\t</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"dashboard-page\">\n");
      out.write("    \n");
      out.write("    <div class=\"bkg\">\n");
      out.write("\t\t<div class=\"main-grid\">\n");
      out.write("\t\t\t<div class=\"agile-grids\">\t\n");
      out.write("\t\t\t\t<!-- validation -->\n");
      out.write("\t\t\t\t<div class=\"grids\">\n");
      out.write("\t\t\t\t\t<div class=\"progressbar-heading grid\">\n");
      out.write("\t\t\t\t\t\t<h2>story bulletin</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("                                    <div class=\"panel panel-widget agile-validation\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"validation-grids validation-grids-right login-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-shadow login-form-shadow\" data-example-id=\"basic-forms\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Login form :</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-body form-body-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form data-toggle=\"validator\" novalidate=\"\" action=\"logServ\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control inputEmail\" name=\"Email\" placeholder=\"Enter Your Email\" data-error=\"Bruh, that email address is invalid\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon form-control-feedback\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" data-toggle=\"validator\" data-minlength=\"6\" class=\"form-control inputPassword\" name=\"Password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label>\n");
      out.write("                                                                                                                            <a href=\"reset.jsp\">Forgot Password?</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group button\">\n");
      out.write("                                                                                                            <input type=\"submit\" class=\"btn btn-info btn-md\" name=\"Login\" value=\"LOGIN\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- //validation -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- footer -->\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //footer -->\n");
      out.write("\t\t<!-- input-forms -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/valida.2.1.6.min.js\"></script>\n");
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
      out.write("\t\t\t\t// Exemple 2\n");
      out.write("\t\t\t\t/*\n");
      out.write("\t\t\t\t$('.valida').valida({\n");
      out.write("\n");
      out.write("\t\t\t\t\t// basic settings\n");
      out.write("\t\t\t\t\tvalidate: 'novalidate',\n");
      out.write("\t\t\t\t\tautocomplete: 'off',\n");
      out.write("\t\t\t\t\ttag: 'p',\n");
      out.write("\n");
      out.write("\t\t\t\t\t// default messages\n");
      out.write("\t\t\t\t\tmessages: {\n");
      out.write("\t\t\t\t\t\tsubmit: 'Wait ...',\n");
      out.write("\t\t\t\t\t\trequired: 'Este campo é obrigatório',\n");
      out.write("\t\t\t\t\t\tinvalid: 'Field with invalid data',\n");
      out.write("\t\t\t\t\t\ttextarea_help: 'Digitados <span class=\"at-counter\">{0}</span> de {1}'\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\n");
      out.write("\t\t\t\t\t// filters & callbacks\n");
      out.write("\t\t\t\t\tuse_filter: true,\n");
      out.write("\n");
      out.write("\t\t\t\t\t// a callback function that will be called right before valida runs.\n");
      out.write("\t\t\t\t\t// it must return a boolan value (true for good results and false for errors)\n");
      out.write("\t\t\t\t\tbefore_validate: null,\n");
      out.write("\n");
      out.write("\t\t\t\t\t// a callback function that will be called right after valida runs.\n");
      out.write("\t\t\t\t\t// it must return a boolan value (true for good results and false for errors)\n");
      out.write("\t\t\t\t\tafter_validate: null\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t*/\n");
      out.write("\n");
      out.write("        // setup the partial validation\n");
      out.write("\t\t\t\t$('#partial-1').on('click', function( ev ) {\n");
      out.write("\t\t\t\t\tev.preventDefault();\n");
      out.write("\t\t\t\t\t$('#res-1').click(); // clear form error msgs\n");
      out.write("\t\t\t\t\t$('form').valida('partial', '#field-1'); // validate only field-1\n");
      out.write("\t\t\t\t\t$('form').valida('partial', '#field-1-3'); // validate only field-1-3\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- //input-forms -->\n");
      out.write("\t\t<!--validator js-->\n");
      out.write("\t\t<script src=\"js/validator.min.js\"></script>\n");
      out.write("\t\t<!--//validator js-->\n");
      out.write("        </div>\n");
      out.write("</body>\n");
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

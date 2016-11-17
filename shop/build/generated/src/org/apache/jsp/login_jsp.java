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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("<!--slider-script-->\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t$(function () {\n");
      out.write("\t\t\t\t  $(\"#slider1\").responsiveSlides({\n");
      out.write("\t\t\t\t\tauto: true,\n");
      out.write("\t\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\t\tnamespace: \"callbacks\",\n");
      out.write("\t\t\t\t\tpager: true,\n");
      out.write("\t\t\t\t  });\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("<!--//slider-script-->\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close').on('click', function(c){\n");
      out.write("\t\t$('.message').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close1').on('click', function(c){\n");
      out.write("\t\t$('.message1').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message1').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <section id=\"form\"><!--form-->\n");
      out.write("            <div class=\"container\">\t\t\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("\t\t\t<div class=\"login-form\"><!--login form-->\n");
      out.write("                            <h2>Login to your account</h2>\n");
      out.write("\t\t\t\t<form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                                    ");
 if(request.getParameter("error")!=null){ 
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <p style=\"color:red\">");
      out.print(request.getParameter("error"));
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    <input type=\"text\" placeholder=\"User Name\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keptEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Password\" name=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keptPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <div>\n");
      out.write("                                        <p style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <a href=\"register.jsp\">Đăng ký</a>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\" value=\"Login\" name=\"command\">Đăng nhập</button>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div><!--/login form-->\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</section><!--/form-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

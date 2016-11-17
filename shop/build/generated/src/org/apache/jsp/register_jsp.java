package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>register</title>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#email\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var user_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(user_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write(" \n");
      out.write("                function check_username_ajax(username) {\n");
      out.write("                $(\"#user-result\").html('<img src=\"img/ajax-loader.gif\" />');\n");
      out.write("                $.post('CheckEmailServlet', {'username': username}, function (data) {\n");
      out.write("                    $(\"#user-result\").html(data);\n");
      out.write("                 });\n");
      out.write("                }\n");
      out.write("                $('#pass1, #pass2').on('keyup', function () {\n");
      out.write("                if ($('#pass1').val() == $('#pass2').val()&&$('#pass1').val()!='') {\n");
      out.write("                    $('#message').html('Matched').css('color', 'green');\n");
      out.write("                } else{\n");
      out.write("                    $('#message').html('Not Matching').css('color', 'red');\n");
      out.write("                }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("                        <div class=\"container\">\t\t\t\t\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("                                    <div class=\"login-form\"><!--register-->\n");
      out.write("                                        <h2>Register</h2>\n");
      out.write("                                            <form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                                                <div>\n");
      out.write("                                                        <span class=\"word\">Email address*</span><span id=\"user-result\"></span>\n");
      out.write("                                                        <input type=\"email\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keptEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div> \n");
      out.write("                                                        <span class=\"word\">Password*</span>\n");
      out.write("                                                        <input type=\"password\" name=\"pass\" id=\"pass1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keptPass1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\t\t\n");
      out.write("                                                <div> \n");
      out.write("                                                        <span class=\"word\">Confirm*</span>\n");
      out.write("                                                        <input type=\"password\" name=\"pass2\" id=\"pass2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${keptPass2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                        <span id='message'></span>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div>\n");
      out.write("                                                    <p style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"submit\" value=\"Register\" name=\"command\"  id=\"RegisterButton\"> \n");
      out.write("                                        </form>\n");
      out.write("                                    </div><!--/login form-->\n");
      out.write("                                </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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

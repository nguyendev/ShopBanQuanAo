package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t<div class=\"content-top\">\n");
      out.write("\t\t\t\t\t<h3 class=\"future\">FEATURED</h3>\n");
      out.write("\t\t\t\t\t<div class=\"content-top-in\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\"><img  src=\"images/pi.jpg\" alt=\"\" /></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Mascot Kitty - White</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\"><img  src=\"images/pi1.jpg\" alt=\"\" />\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Bite Me</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>3</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\"><img  src=\"images/pi2.jpg\" alt=\"\" /></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Little Fella</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>5</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\"><img  src=\"images/pi3.jpg\" alt=\"\" /></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Astral Cruise</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>4</span><span>5</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!---->\n");
      out.write("\t\t\t\t<div class=\"content-middle\">\n");
      out.write("\t\t\t\t\t<h3 class=\"future\">BRANDS</h3>\n");
      out.write("\t\t\t\t\t<div class=\"content-middle-in\">\n");
      out.write("\t\t\t\t\t<ul id=\"flexiselDemo1\">\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/ap.png\"/></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/ap1.png\"/></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/ap2.png\"/></li>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"images/ap3.png\"/></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("            \t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(window).load(function() {\n");
      out.write("\t\t\t$(\"#flexiselDemo1\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 4,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t    \t\tportrait: { \n");
      out.write("\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t    \t\t}, \n");
      out.write("\t\t    \t\tlandscape: { \n");
      out.write("\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttablet: { \n");
      out.write("\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
      out.write("\t\t    \n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!---->\n");
      out.write("\t\t\t\t<div class=\"content-bottom\">\n");
      out.write("\t\t\t\t\t<h3 class=\"future\">LATEST</h3>\n");
      out.write("\t\t\t\t\t<div class=\"content-bottom-in\">\n");
      out.write("\t\t\t\t\t<ul id=\"flexiselDemo2\">\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><div class=\"col-md men\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi4.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare in-compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Compare</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Whislist</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content bag\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Symbolic Bag</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>4</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t\t<li><div class=\"col-md men\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi5.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare in-compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Compare</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Whislist</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content bag\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Interesting Read</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>5</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t\t<li><div class=\"col-md men\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi6.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare in-compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Compare</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Whislist</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content bag\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">The Carter</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>1</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t\t<li><div class=\"col-md men\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi7.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare in-compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Compare</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Add to Whislist</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div></a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content bag\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Onesie</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>6</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(window).load(function() {\n");
      out.write("\t\t\t$(\"#flexiselDemo2\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 4,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t    \t\tportrait: { \n");
      out.write("\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t    \t\t}, \n");
      out.write("\t\t    \t\tlandscape: { \n");
      out.write("\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttablet: { \n");
      out.write("\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
      out.write("\t\t    \n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"start\">\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\"><i></i></a></li>\n");
      out.write("\t\t\t\t\t<li><span>1</span></li>\n");
      out.write("\t\t\t\t\t<li class=\"arrow\"><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"arrow\"><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"arrow\"><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"arrow\"><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>EShop - Website bán quần áo chạy nhất hiện nay</title>\n");
      out.write("    \n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("       ");

            ProductDAO productDAO = new ProductDAO ();
           
           
        
      out.write(" \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category-products.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!--<div class=\"brands_products\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Brands</h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brands-name\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(50)</span>Acne</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(56)</span>Grüne Erde</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(27)</span>Albiro</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(32)</span>Ronhill</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(5)</span>Oddmolly</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(9)</span>Boudestijn</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(4)</span>Rösch creative culture</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div><!--/brands_products-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!--<div class=\"price-range\"><!--price-range\n");
      out.write("\t\t\t\t\t\t\t<h2>Price Range</h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"well text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[250,450]\" id=\"sl2\" ><br />\n");
      out.write("\t\t\t\t\t\t\t\t <b class=\"pull-left\">$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div><!--/price-range-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!--<div class=\"shipping text-center\"><!--shipping\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div><!--/shipping-->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"features_items\"><!--features_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Tất cả sản phẩm</h2>\n");
      out.write("                                                ");

                                                for(Product p : productDAO.getListProduct()){
                                                        
                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-image-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-products\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"productinfo text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=");
      out.print( p.getProductImage());
      out.write(" alt=");
      out.print( p.getProductImage());
      out.write(" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2>");
      out.print(p.getProductPrice());
      out.write("VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print( p.getProductName());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product-overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"overlay-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2>");
      out.print(p.getProductPrice());
      out.write("VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print( p.getProductName());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"choose\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><i class=\"fa fa-plus-square\"></i>Xem chi tiết</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>Add to compare</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("   \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div><!--features_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("    </section>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
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

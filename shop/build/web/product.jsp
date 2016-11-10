<%-- 
    Document   : product
    Created on : Nov 8, 2016, 4:23:09 PM
    Author     : duy tung dao
--%>

<%@page import="model.Cart"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="slider.jsp"></jsp:include>
	 <jsp:include page="category-products.jsp"></jsp:include>
        <%
            ProductDAO productDAO = new ProductDAO ();
            String category_id = "";
            if(request.getParameter("category") != null){
                category_id = request.getParameter("category");
            }
            Cart cart = (Cart)session.getAttribute("cart");
            if (cart == null){
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">Features Items</h2>
                                                <%
                                                for(Product p : productDAO.getListProductByCategory(Long.parseLong(category_id))){
                                                        
                                                %>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="<%= p.getProductImage()%>" alt=<%= p.getProductImage()%>/>
										<h2><%=p.getProductPrice()%>VNĐ</h2>
										<p><%= p.getProductName()%></p>
										<a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2><%=p.getProductPrice()%>VNĐ</h2>
											<p><%= p.getProductName()%></p>
											<a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="single.jsp?productID=<%=p.getProductID()%>"><i class="fa fa-plus-square"></i>Xem chi tiết</a></li>
										<li><a href=""><i class="fa fa-plus-square"></i>Thêm vào so sánh</a></li>
									</ul>
								</div>
							</div>
						</div>
                                                                                         
                                                <%
                                                    }
                                                %>                                           
						<!--ul class="pagination">
							<li class="active"><a href="">1</a></li>
							<li><a href="">2</a></li>
							<li><a href="">3</a></li>
							<li><a href="">&raquo;</a></li>
						</ul-->
					</div><!--features_items-->
				</div>
			</div>
		</div>
	</section>
	
      
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

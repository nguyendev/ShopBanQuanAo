<%-- 
    Document   : index
    Created on : Nov 8, 2016, 3:21:10 PM
    Author     : duy tung dao
--%>

<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>EShop - Website bán quần áo chạy nhất hiện nay</title>
    
</head><!--/head-->

<body>
       <%
            ProductDAO productDAO = new ProductDAO ();
           
           
        %> 
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="slider.jsp"></jsp:include>
    <jsp:include page="category-products.jsp"></jsp:include>

					
						<!--<div class="brands_products">
							<h2>Brands</h2>
							<div class="brands-name">
								<ul class="nav nav-pills nav-stacked">
									<li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
									<li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
									<li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
									<li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
									<li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
									<li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
									<li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
								</ul>
							</div>
						</div><!--/brands_products-->
						
						<!--<div class="price-range"><!--price-range
							<h2>Price Range</h2>
							<div class="well text-center">
								 <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
								 <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
							</div>
						</div><!--/price-range-->
						
						<!--<div class="shipping text-center"><!--shipping
							<img src="images/home/shipping.jpg" alt="" />
						</div><!--/shipping-->
				
				
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">Tất cả sản phẩm</h2>
                                                <%
                                                for(Product p : productDAO.getListProduct()){
                                                        
                                                %>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
										<div class="productinfo text-center">
											<img src=<%= p.getProductImage()%> alt=<%= p.getProductImage()%> />
											<h2><%=p.getProductPrice()%> VNĐ</h2>
											<p><%= p.getProductName()%></p>
											<a id="<%=p.getProductID()%>" href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
										<div class="product-overlay">
											<div class="overlay-content">
												<h2><%=p.getProductPrice()%>VNĐ</h2>
												<p id="<%=p.getProductID()%>" name="nameProduct"><%= p.getProductName()%></p>
                                                                                                <a id="<%=p.getProductID()%>" href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
											</div>
										</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="single.jsp?productID=<%=p.getProductID()%>"><i class="fa fa-plus-square"></i>Xem chi tiết</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
                                                <%
                                                    }
                                                %>   
						
					</div><!--features_items-->
					
					
				</div>
			</div>
		</div>
    </section>
	
	
	
    <jsp:include page="footer.jsp"></jsp:include>
  
   
</body>
</html>
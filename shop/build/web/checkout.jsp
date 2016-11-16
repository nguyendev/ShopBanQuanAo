<%-- 
    Document   : checkout
    Created on : Nov 10, 2016, 6:08:48 PM
    Author     : NguyenIT
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Cart"%>
<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thanh toán đơn hàng EShoping</title>
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
      
        
       
    </head>
    <body>
        <%
            Users users = (Users) session.getAttribute("user");
            if (users == null) {
                response.sendRedirect("/shop/login.jsp");
            }
            Cart cart = (Cart) session.getAttribute ("cart");     
            if (cart == null){
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            if(cart.countItem() <= 0){
                response.sendRedirect("/shop/index.jsp");
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
      
        
        <section id="cart_items">
            <div class="container">
		<div class="breadcrumbs">
                    <ol class="breadcrumb">
			<li><a href="#">Home</a></li>
			<li class="active">Check out</li>
                    </ol>
		</div><!--/breadcrums-->

						
        <form action="CheckOutServlet" method="POST">
		<div class="shopper-informations">
                    <div class="row">
			
                            <div class="col-sm-12">
                                <div class="bill-to">
                                    <div class="form-one">
                                        <p>Thông tin hàng hóax</p>
                                        <input name="email" required type="email" placeholder="Email*">
                                        <input name="name" required type="text" placeholder="Họ và tên *">
                                        <select required name="provincial">
                                            <option>-- Tỉnh Thành --</option>
                                            <option>Hồ Chí Minh</option>
                                            <option>Bình Dương</option>
                                            <option>Đồng Nai</option>
                                            <option>Hà Nội</option>
                                            <option>Cần Thơ</option>										
                                        </select>
                                        <br>
                                        <br>
                                        <input required name="address" type="text" placeholder="Address 1 *">
                                        <input name="address1"type="text" placeholder="Address 2">
                                        <input required type="number" placeholder="Số Điện Thoại *">
                                        <select required name="payment">
                                            <option value="Bank transfer"> Bank transfer</option>
                                            <option value="Live"> Live</option>
                                        </select>
                                    </div>    
                                    <div class="form-two">
                                        <div class="order-message">
                                            <p>Ghi chú</p>
                                            <textarea name="message"  placeholder="Nhập ghi chú của bạn" rows="16"></textarea>                  
                                        </div>	
                                    </div>
                                </div>	
                            </div>

                    </div>
							
					
									
		</div>
			
		<div class="review-payment">
                    <h2>Review & Payment</h2>
		</div>

		<div class="table-responsive cart_info">
                    <table class="table table-condensed">
			<thead>
                            <tr class="cart_menu">
				<td class="image">Hình ảnh</td>
				<td class="description">Tên mặt hàng</td>
				<td class="price">Giá cả</td>
				<td class="quantity">Số lượng</td>
				<td class="total">Tổng tiền</td>
				<td></td>
                            </tr>
			</thead>
                            <tbody>
                                                <%
                                                    for (Map.Entry<Long, Item> list: cart.getCartItems().entrySet()){ 
                                                    
                                                %>
			<tr>
                            <td class="cart_product">
                            <a href="single.jsp?productID=<%=list.getValue().getProduct().getProductID()%>"><img src=<%=list.getValue().getProduct().getProductImage()%> height="42" width="42" alt=""></a>
							</td>
							<td class="cart_description">
								<h4><a href="single.jsp?productID=<%=list.getValue().getProduct().getProductID()%>"><%=list.getValue().getProduct().getProductName()%></a></h4>
								<!--p>Web ID: 1089772</p-->
							</td>
							<td class="cart_price">
								<p><%=list.getValue().getProduct().getProductPrice()%> VNĐ</p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									<!--a class="cart_quantity_up" href=""> + </a-->
                                                                        <input disabled="true" class="cart_quantity_input" type="text" name="quantity" value=<%=list.getValue().getQuantity()%> autocomplete="off" size="2">
									<!--a class="cart_quantity_down" href=""> - </a-->
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price"><%=list.getValue().getQuantity() * list.getValue().getProduct().getProductPrice() %></p>
							</td>
							
						</tr>
                                                
                                                <% 
                                                    }
                                                %>

						
						<tr>
							<td colspan="4">&nbsp;</td>
							<td colspan="2">
								<table class="table table-condensed total-result">
									<tr>
										<td>Tổng giá trị sản phẩm</td>
										<td><%=cart.totalCart() %></td>
									</tr>
									<!--tr>
										<td>Exo Tax</td>
										<td>$2</td>
									</tr-->
									<tr class="shipping-cost">
										<td>Phí vận chuyển</td>
										<td>Miễn phí</td>										
									</tr>
									<tr>
										<td>Tổng tiền</td>
										<td><span><%=cart.totalCart() %></span></td>
									</tr>
								</table>
							</td>
						</tr>
					</tbody>
				</table>
                                                                        <input type="submit" class="btn btn-primary pull-right" value="Checkout"> 
			</div>
		
                                                                        
        </form>
            </div>  
	</section> <!--/#cart_items-->

	
        
        <jsp:include page="footer.jsp"></jsp:include>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
         <script>
            $(function () {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </body>
</html>

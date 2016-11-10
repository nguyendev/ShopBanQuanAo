<%-- 
    Document   : cart
    Created on : Nov 10, 2016, 2:37:13 PM
    Author     : NguyenIT
--%>

<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
       
    
    <body>
        <%
         Cart cart = (Cart) session.getAttribute ("cart");     
            if (cart == null){
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            %>
        <jsp:include page="header.jsp"></jsp:include>
        
        <section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
				  <li><a href="#">Trang chủ</a></li>
				  <li class="active">Shopping Cart</li>
				</ol>
			</div>
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Item</td>
							<td class="description"></td>
							<td class="price">Price</td>
							<td class="quantity">Quantity</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
                                                <%for (Map.Entry<Long, Item> list: cart.getCartItems().entrySet()){ %>
						<tr>
							<td class="cart_product">
								<a href=""><img src="images/cart/one.png" alt=""></a>
							</td>
							<td class="cart_description">
								<h4><a href=""><!--% list.getValue().getProduct().getProductName();%--></a></h4>
								<!--p>Web ID: 1089772</p-->
							</td>
							<td class="cart_price">
								<p>$59</p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									<a class="cart_quantity_up" href=""> + </a>
									<input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
									<a class="cart_quantity_down" href=""> - </a>
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price">$59</p>
							</td>
							<td class="cart_delete">
								<a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
							</td>
						</tr>
                                                
                                                < % 
                                                    }
                                                %>
					</tbody>
				</table>
			</div>
		</div>
	</section> <!--/#cart_items-->
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

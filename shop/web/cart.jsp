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
        <title>Giỏ hàng của bạn</title>
    </head>
    
       
    
    <body>
       
        <jsp:include page="header.jsp"></jsp:include>
         <%
         Cart cart = (Cart) session.getAttribute ("cart");     
            if (cart == null){
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
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
								<a id="<%=list.getValue().getProduct().getProductID()%>" href="single.jsp?productID=<%=list.getValue().getProduct().getProductID()%>"><img src=<%=list.getValue().getProduct().getProductImage()%> height="42" width="42" alt=""></a>
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
									
                                                                    <input class="cart_quantity_input" disabled="true" type="text" name="quantity" value=<%=list.getValue().getQuantity()%> autocomplete="off" size="2">
									
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price"><%=list.getValue().getQuantity() * list.getValue().getProduct().getProductPrice() %></p>
							</td>
							<td class="cart_delete">
								<a class="cart_quantity_delete" id="<%=list.getValue().getProduct().getProductID()%>" href="CartServlet?command=remove&productID=<%=list.getValue().getProduct().getProductID()%>"><i class="fa fa-times"></i></a>
							</td>
						</tr>
                                                
                                                <% 
                                                    }
                                                %>
					</tbody>
				</table>
			</div>
                                        
                        <div class="col-sm-12">
                            <div class="total_area">
						<ul>
							<li>Tổng giá trị đơn hàng <span><%=cart.totalCart()%> VNĐ</span></li>
							<li>Phí vận chuyển <span>Miễn phí</span></li>
							<li>Tổng tiền <span><%=cart.totalCart()%> VNĐ</span></li>
						</ul>
							<!--a class="btn btn-default update" href="checkout.jsp">Update</a-->
							
					</div>
                                                         <% 
                                                     if(cart.countItem() > 0)
                                                     {
                                                         %>
                                                         <a id="checkoutsuccess" class="btn btn-default check_out pull-right" href="checkout.jsp">Check Out</a>
                                                        <br>
                                                        <br>
                                                        <br>
                                                     <%}
                                                    else {
                                                        %>

                                                       <a id="checkoutfalse" class="btn btn-default check_out pull-right" href="index.jsp">Quay lại đặt hàng</a>
                                                        <br>
                                                        <br>
                                                        <br>
                                               <%} %>
                                                           
                                                            
                                                
                                                
                           
			</div>                
		</div>
	</section> <!--/#cart_items-->
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

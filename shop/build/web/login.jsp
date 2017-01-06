<%-- 
    Document   : register
    Created on : Nov 8, 2016, 4:02:00 PM
    Author     : duy tung dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
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
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <section id="form"><!--form-->
            <div class="container">				
		<div class="row">
                    <div class="col-sm-4 col-sm-offset-1">
			<div class="login-form"><!--login form-->
                            <h2>Đăng nhập tài khoản của bạn</h2>
				<form action="UsersServlet" method="POST">
                                    <% if(request.getParameter("error")!=null){ %>
                                    <div id="error" style="color:red"><%=request.getParameter("error")%>
                                    </div>
                                    <%}%>
                                    <input type="text" placeholder="User Name" name="email" value="${keptEmail}"/>
                                    <input type="password" placeholder="Password" name="pass" value="${keptPass}"/>
                                    <div>
                                        <p style="color:red">${error}</p>
                                    </div>
                                    
                                    <button type="submit" class="btn btn-default" value="Login" name="command">Đăng nhập</button>
                                    <br>
                                    
                                    <a href="register.jsp">Đăng ký</a> 
				</form>
			</div><!--/login form-->
                    </div>
		</div>
            </div>
	</section><!--/form-->
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

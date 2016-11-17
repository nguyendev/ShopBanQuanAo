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
        <title>register</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });
 
                function check_username_ajax(username) {
                $("#user-result").html('<img src="img/ajax-loader.gif" />');
                $.post('CheckEmailServlet', {'username': username}, function (data) {
                    $("#user-result").html(data);
                 });
                }
                $('#pass1, #pass2').on('keyup', function () {
                if ($('#pass1').val() == $('#pass2').val()&&$('#pass1').val()!='') {
                    $('#message').html('Matched').css('color', 'green');
                } else{
                    $('#message').html('Not Matching').css('color', 'red');
                }
                });
            });
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
                        <div class="container">				
                            <div class="row">
                                <div class="col-sm-4 col-sm-offset-1">
                                    <div class="login-form"><!--register-->
                                        <h2>Register</h2>
                                            <form action="UsersServlet" method="POST">
                                                <div>
                                                        <span class="word">Email address*</span><span id="user-result"></span>
                                                        <input type="email" name="email" id="email" value="${keptEmail}">
                                                </div>
                                                <div> 
                                                        <span class="word">Password*</span>
                                                        <input type="password" name="pass" id="pass1" value="${keptPass1}">
                                                </div>		
                                                <div> 
                                                        <span class="word">Confirm*</span>
                                                        <input type="password" name="pass2" id="pass2" value="${keptPass2}">
                                                        <span id='message'></span>
                                                </div>
                                                <div>
                                                    <p style="color:red">${error}</p>
                                                </div>
                                                <input type="submit" value="Register" name="command"  id="RegisterButton"> 
                                        </form>
                                    </div><!--/login form-->
                                </div>
		</div>
	</div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

<%-- 
    Document   : category-products
    Created on : Nov 10, 2016, 8:06:33 AM
    Author     : NguyenIT
--%>

<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category-products</title>
    </head>
    <body>
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
        %>
          <section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Chuyên mục</h2>
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                                    <div class="panel panel-default">
                                                        <%
                                                           for(Category c : categoryDAO.getListCategory()){
                                                        %>       
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" data-parent="#accordian" href="product.jsp?category=<%=c.getCategoryID()%>">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											<%=c.getCategoryName()%>
								</a>
                                                            </h4>
                                                        </div>      
                                                        <%
                                                           }
                                                        %>												
                                                    </div><!--/category-products-->
                                                </div>
                                            </div>
                                </div>
    </body>
</html>

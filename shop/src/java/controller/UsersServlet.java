/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsersDAO;
import model.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.MD5;

/**
 *
 * @author duy tung dao
 */
public class UsersServlet extends HttpServlet {
    UsersDAO userDAO = new UsersDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String command = request.getParameter("command");
       String url="";
       Users u = new Users();
       HttpSession httpSession=request.getSession();
       switch(command){
           case "Register":
               // so sánh 2 ô mật khẩu
               if(request.getParameter("pass").equals(request.getParameter("pass2"))){
                    u.setUserID(new Date().getTime());
                    // get by name
                    u.setUserEmail(request.getParameter("email"));
                    u.setUserPass(MD5.encryption(request.getParameter("pass")));
                    u.setUserRole(false);
                    
                    try{
                        // chưa tồn tại email
                        if(!userDAO.checkEmail(request.getParameter("email"))){
                             userDAO.insertUser(u);
                             url = "/login.jsp";
                             RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                             rd.forward(request, response);
                        }
                        //đã tồn tại
                        else{
                            request.setAttribute("keptEmail",request.getParameter("email"));  
                            request.setAttribute("keptPass1",request.getParameter("pass"));
                            request.setAttribute("keptPass2",request.getParameter("pass2"));
                            request.setAttribute("error", "Email đã tồn tại!");
                            url = "/register.jsp";
                            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                            rd.forward(request, response);
                        }
                    }
                    catch(SQLException e){
                   
                    }
               }
               // nếu 2 ô mật khẩu không khớp
               else{
                    // giữ username và mật khẩu lại các textbox
                    request.setAttribute("keptEmail",request.getParameter("email"));  
                    request.setAttribute("keptPass1",request.getParameter("pass"));
                    request.setAttribute("keptPass2",request.getParameter("pass2"));
                    request.setAttribute("error", "Mật khẩu không khớp");  
                    request.getRequestDispatcher("register.jsp").forward(request,response);
               }
               
               break;
            case "Login":
               u= userDAO.Login(request.getParameter("email"), MD5.encryption(request.getParameter("pass")));
               // nếu tồn tại người dùng
               if(u!=null){
                    httpSession.setAttribute("user", u);
                    url = "/index.jsp";
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
               }
               // người dùng không tồn tại
               else{
                   request.setAttribute("keptEmail",request.getParameter("email"));  
                    request.setAttribute("keptPass",request.getParameter("pass"));
                   request.setAttribute("error", "Sai tên người dùng hoặc mật khẩu!");
                   url = "/login.jsp";
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
               }
               
               break;
       }
        
    }

}

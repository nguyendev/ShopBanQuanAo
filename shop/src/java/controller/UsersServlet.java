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
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
               
               u.setUserID(new Date().getTime());
               // get by name
               u.setUserEmail(request.getParameter("email"));
               u.setUserPass(request.getParameter("pass"));
               u.setUserRole(false);
               userDAO.insertUser(u);
               url = "/login.jsp";
               break;
            case "Login":
               u= userDAO.Login(request.getParameter("email"), request.getParameter("pass"));
               if(u!=null){
                    httpSession.setAttribute("user", u);
                    url = "/index.jsp";
               }
               else{
                   request.setAttribute("error", "Sai tên người dùng hoặc mật khẩu!");
                   url = "/login.jsp";
               }
               
               break;
       }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

}

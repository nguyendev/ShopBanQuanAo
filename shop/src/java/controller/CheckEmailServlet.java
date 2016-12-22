/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duy tung dao
 */
public class CheckEmailServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write(writeImage(request,usersDAO));
        }catch(IOException e){
            
        }
    }
    protected String writeImage(HttpServletRequest request,UsersDAO usersDAO){
        String s = "";
        try{
            // user name đã có
            if (usersDAO.checkEmail(request.getParameter("username"))) {
                s = "<img src=\"img/not-available.png\" />";
            } else {
                s = "<img src=\"img/available.png\" />";
            }
        }
        catch(SQLException e){
            
        }
        return s;
    }
}

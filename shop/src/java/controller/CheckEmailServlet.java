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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            if (usersDAO.checkEmail(request.getParameter("username"))) {
                response.getWriter().write("<img src=\"img/not-available.png\" />");
            } else {
                response.getWriter().write("<img src=\"img/available.png\" />");
            }
        }
        catch(SQLException e){
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import static org.mockito.Mockito.*;


/**
 *
 * @author NguyenIT
 */
public class UsersServletTest {
    
    @Mock
    RequestDispatcher rd;

    private ServletContext appContext;

    /*@Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        HttpSession session = request.getSession(true);
        when(request.getParameter("email")).thenReturn("nguyen.nah76@gmail.com");
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("command")).thenReturn("Login");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/index.jsp")).thenReturn(rd);
        new UsersServlet().doPost(request, response);

/*        verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        */
        
        
    /*}*/
    
    @Test
    public void testRegister_sucess() {
        System.out.println("Tai khoan -> Dang ky -> Thanh cong");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("pass2")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("tung11@gmail.com");
        when(request.getParameter("command")).thenReturn("Register");
         
        String url="";
        Users u = new Users();
        UsersServlet us = new UsersServlet();
        
        String result = us.register(request, response, u, url);
        assertEquals("/login.jsp",result);
        System.out.println("Tai khoan -> Dang ky -> Thanh cong");
    }
    @Test
    public void testRegister_Exits() {
        System.out.println("Tai khoan -> Dang ky -> Ton tai");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("pass2")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("nguyen.nah76@gmail.com");
        when(request.getParameter("command")).thenReturn("Register");
        String url="";
        Users u = new Users();
        
        UsersServlet us = new UsersServlet();
        String result = us.register(request, response, u, url);
        assertEquals("/register.jsp",result);
        System.out.println("Tai khoan -> Dang ky -> Ton tai");
    }
    
    @Test
    public void testRegister_passNotMatch() {
        System.out.println("Tai khoan -> Dang ky -> Mat khau khong dung");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("pass2")).thenReturn("1234567");
        when(request.getParameter("email")).thenReturn("nguyen.nah777@gmail.com");
        when(request.getParameter("command")).thenReturn("Register");
        String url="";
        Users u = new Users();
        
        UsersServlet us = new UsersServlet();
        String result = us.register(request, response, u, url);
        assertEquals("",result);
        System.out.println("Tai khoan -> Dang ky -> Mat khau khong dung -> Thanh cong");
    }
}

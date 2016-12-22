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
    // Điều kiện pass: Chưa có account nào trong database có email đó, password trùng nhau
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
    // Điều kiện pass: Đã tồn tại user có email đó trong database
    @Test
    public void testRegister_Exists() {
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
    // Điều kiện pass: Mật xác chính và xác nhận mật khẩu không khớp
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
    // Điều kiện pass: đúng tên đăng nhập và mật khẩu
    @Test 
    public void testLogin_success(){
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap thanh cong");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("nguyen.nah76@gmail.com");
        String url="";
        Users u = new Users();
        
        UsersServlet us = new UsersServlet();
        String result = us.login(u, request);
        assertEquals("/index.jsp",result);
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap thanh cong -> Thanh cong");
    }
    // Điều kiện pass: sai tên đăng nhập
    @Test 
    public void testLogin_fail_wrongUsername(){
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap that bai (Khong ton tai username)");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("nguyen.nah7678@gmail.com"); // user name khong ton tai
        Users u = new Users();
        
        UsersServlet us = new UsersServlet();
        String result = us.login(u, request);
        assertEquals("/index.jsp",result);
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap that bai (Khong ton tai username) -> Thanh cong ");
    }
    // Điều kiện pass: sai mật khẩu
    @Test 
    public void testLogin_fail_wrongPassword(){
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap that bai (Khong dung mat khau)");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        when(request.getParameter("pass")).thenReturn("123456");                    // mat khau khong dung
        when(request.getParameter("email")).thenReturn("nguyen.nah76@gmail.com");   // user name ton tai
        Users u = new Users();
        
        UsersServlet us = new UsersServlet();
        String result = us.login(u, request);
        assertEquals("/index.jsp",result);
        System.out.println("Tai khoan -> Dang nhap -> Dang nhap that bai (Khong dung mat khau -> Thanh cong ");
    }
}

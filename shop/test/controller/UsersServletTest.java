/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsersDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;
import org.junit.After;
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
     @Before
    public void setUp() {
        System.out.println("Bat dau test case moi _____________________");
    } 
    //delete from <table> where id not in
    //(select id from <table> order by <datecol> desc limit 20)
    //DELETE FROM user WHERE user_id NOT IN (SELECT user_id FROM (SELECT user_id FROM user ORDER BY user_id DESC LIMIT 0) x)
    @After
    public void tearDown() {
        System.out.println("Ket thuc test case    _____________________");
    }
    @Test
    public void testRegister_sucess() {
        System.out.println("Tai khoan -> Dang ky thanh cong");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("pass2")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("registersuccess@gmail.com");
        when(request.getParameter("command")).thenReturn("Register");
         
        String url="";
        Users u = new Users();
        UsersServlet us = new UsersServlet();
        
        String result = us.register(request, response, u, url);
        assertEquals("/login.jsp",result);
        
        dao.UsersDAO ud = new UsersDAO();
        boolean deleteUser = ud.deleteUser(u.getUserID());
        assertEquals(true,deleteUser);
        
        System.out.println("Tai khoan -> Dang ky thanh cong-> Thanh cong");
    }
    // Điều kiện pass: Đã tồn tại user có email đó trong database
    @Test
    public void testRegister_Exists() {
        System.out.println("Tai khoan -> Dang ky -> Ton tai");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("pass2")).thenReturn("123456");
        when(request.getParameter("email")).thenReturn("testRegister_Exists@gmail.com");
        when(request.getParameter("command")).thenReturn("Register");
        
        Users create = new Users(10009, "testRegister_Exists@gmail.com", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean createResult = instance.insertUser(create);
        assertEquals(true, createResult);
        
        Users u = new Users();
        String url="";
        UsersServlet us = new UsersServlet();
        String result = us.register(request, response, u, url);
        assertEquals("/register.jsp",result);
        
         // xoa    
        boolean resultdelete = instance.deleteUser(10009);
        assertEquals(true, resultdelete);
        System.out.println("Tai khoan -> Dang ky -> Ton tai -> Thanh cong");
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

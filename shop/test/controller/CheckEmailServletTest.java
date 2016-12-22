/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsersDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author NguyenIT
 */
public class CheckEmailServletTest {
    
    public CheckEmailServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
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

    /**
     * Test of doGet method, of class CheckEmailServlet.
     * @throws java.lang.Exception
     */
    // Điều kiện pass: email đã tồn tại trong database
    @Test 
    public void testWriteImage_exist(){
        System.out.println("Kiem tra email -> Email da ton tai");
        HttpServletRequest request = mock(HttpServletRequest.class);   
        when(request.getParameter("username")).thenReturn("nguyen.nah76@@gmail.com");
        
        CheckEmailServlet c = new CheckEmailServlet();
        UsersDAO userDAO = new UsersDAO();
        String result = c.writeImage(request,userDAO);
        assertNotNull(result);
        System.out.println("Kiem tra email -> Khong ton tai email -> Thanh cong");
    }
    // Điều kiện pass: email chưa tồn tại trong database
    @Test 
    public void testWriteImage_notExist(){
        System.out.println("Kiem tra email -> Email chua ton tai");
        HttpServletRequest request = mock(HttpServletRequest.class);   
        when(request.getParameter("username")).thenReturn("duytung95nb12@gmail.com");
        
        CheckEmailServlet c = new CheckEmailServlet();
        UsersDAO userDAO = new UsersDAO();
        String result = c.writeImage(request,userDAO);
        assertEquals("<img src=\"img/available.png\" />",result);
        System.out.println("Kiem tra email -> Email chua ton tai -> Thanh cong");
    }
}

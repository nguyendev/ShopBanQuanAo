/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import connect.DBConnect;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NguyenIT
 */
public class UsersDAOTest {
    // lấy giá trị số dòng trước khi chạy và sau khi chạy database
    private static int beforeExecuteLinesCount;
    private static Connection connection;
    public UsersDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        connection = DBConnect.getConnecttion();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    // lấy giá trị số dòng ở bảng hiện tại
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
     * Test of checkEmail method, of class UsersDAO.
     */
    @Test
    public void testCheckEmail_exists() throws Exception {
        System.out.println("Nguoi dung -> Kiem tra email da ton tai");
        
        // them vao de xoa
        Users u = new Users(10001, "exists@gmail.com", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        
        // kiem tra email
        String email = "exists@gmail.com";
        boolean result1 = instance.checkEmail(email);
        assertEquals(expResult, result1);
        
        // xoa
        boolean result2 = instance.deleteUser(10001);
        assertEquals(expResult, result2);
        System.out.println("Nguoi dung -> Kiem tra email da ton tai -> Thanh cong");
        
        //Xoa nguoi dung sau khi test
        
        
    }
    @Test
    public void testCheckEmail_notExists() throws Exception {
        System.out.println("Nguoi dung -> Kiem tra email khong ton tai");
        String email = "duytung95nb1@gmail.com";
        UsersDAO instance = new UsersDAO();
        boolean expResult = false;
        boolean result = instance.checkEmail(email);
        assertEquals(expResult, result);
        System.out.println("Nguoi dung -> Kiem tra email khong ton tai -> Thanh cong");
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of insertUser method, of class UsersDAO.
     */
    @Test
    public void testInsertUser_success() {
        System.out.println("Nguoi dung -> Them");
        // id chưa có
        Users u = new Users(100, "successInsert", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        
        // xoa
        boolean result1 = instance.deleteUser(100);
        assertEquals(expResult, result1);
        System.out.println("Nguoi dung -> Them -> Thanh cong");
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testInsertUser_fail() {
        System.out.println("Nguoi dung -> Them that bai");
        
        // them vao de test
        Users u = new Users(10003, "addexits@gmail.com", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        
        //đã tồn tại user có id là 0
        Users u2 = new Users(10003, "testfail@gmail.com", "1234", true);
        boolean result1 = instance.insertUser(u2);
        assertEquals(expResult, result1);
        
        boolean result2 = instance.deleteUser(10003);
        assertEquals(expResult, result2);
        
        System.out.println("Nguoi dung -> Them that bai -> Thanh cong");
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of Login method, of class UsersDAO.
     */
    @Test
    public void testLogin_success() {
        System.out.println("Nguoi dung -> Dang nhap thanh cong");
        
        Users u = new Users(10006, "login@gmail.com", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        

        String email = "login@gmail.com";
        String password = "e10adc3949ba59abbe56e057f20f883e";
        Users result1  = instance.Login(email, password);
        assertNotNull(result1);
        
        boolean result2 = instance.deleteUser(10006);
        assertEquals(expResult, result2);
        System.out.println("Nguoi dung -> Dang nhap thanh cong -> Thanh cong!");
    }
    // not exist user name || password
    @Test
    public void testLogin_fail() {
        System.out.println("Nguoi dung -> Dang nhap that bai");
        // not exists username
        String email = "notexists@gmail.com";
        String password = "e10adc3949ba59abbe56e057f20f883e";
        UsersDAO instance = new UsersDAO();
        Users result = instance.Login(email, password);
        
        assertNull(result);
        System.out.println("Nguoi dung -> Dang nhap that bai - sai username -> Thanh cong");
        
        // not exists password
        email = "duytung95nb@gmail.com";
        password = "notexist";
        result = instance.Login(email, password);
        
        assertNull(result);
        System.out.println("Nguoi dung -> Dang nhap that bai - sai password -> Thanh cong");
    }
    @Test
    public void testdeleteUser() {
        System.out.println("Nguoi dung -> Xoa");
        // them vao de xoa
        Users u = new Users(10002, "delete@gmail.com", "e10adc3949ba59abbe56e057f20f883e", true);
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        
        // xoa
        boolean result1 = instance.deleteUser(10002);
        assertEquals(expResult, result1);
        System.out.println("Nguoi dung -> Xoa -> Thanh cong");
        // TODO review the generated test code and remove the default call to fail.
    }
}

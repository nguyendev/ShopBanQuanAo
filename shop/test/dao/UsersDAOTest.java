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

/**
 *
 * @author NguyenIT
 */
public class UsersDAOTest {
    
    public UsersDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkEmail method, of class UsersDAO.
     */
    @Test
    public void testCheckEmail() throws Exception {
        System.out.println("checkEmail");
        String email = "";
        UsersDAO instance = new UsersDAO();
        boolean expResult = false;
        boolean result = instance.checkEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class UsersDAO.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        Users u = null;
        UsersDAO instance = new UsersDAO();
        boolean expResult = false;
        boolean result = instance.insertUser(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class UsersDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String email = "";
        String password = "";
        UsersDAO instance = new UsersDAO();
        Users expResult = null;
        Users result = instance.Login(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

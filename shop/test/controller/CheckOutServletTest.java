/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Item;
import model.Product;
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
public class CheckOutServletTest {
    
    public CheckOutServletTest() {
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
     * Test of doGet method, of class CheckOutServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CheckOutServlet instance = new CheckOutServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class CheckOutServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CheckOutServlet instance = new CheckOutServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CheckOutServlet.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CheckOutServlet.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertBill method, of class CheckOutServlet.
     */
    @Test
    public void testInsertBill() {
        System.out.println("Controller: InsertBill ");
        HttpServletRequest request = null;
        request.setAttribute("payment", this);
        request.setAttribute("address", this);
        request.setAttribute("adress1", this);
        request.setAttribute("name", this);
        request.setAttribute("provincial", this);
        request.setAttribute("email", this);
        request.setAttribute("message", this);
        
        CheckOutServlet instance = new CheckOutServlet();
        boolean expResult = true;
        boolean result;
        /*result = instance.InsertBill(request, null);
        assertEquals(expResult, result);*/
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

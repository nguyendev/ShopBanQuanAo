/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Cart;
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


    @Test
    public void testInsertBill() {
        System.out.println("Thanh toan -> them ");
        HttpServletRequest request = mock(HttpServletRequest.class);   
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        request.setAttribute("bill_id", 1000);
        request.setAttribute("payment", "s");
        request.setAttribute("address", "s");
        request.setAttribute("adress1", "s");
        request.setAttribute("name", "s");
        request.setAttribute("provincial", "s");
        request.setAttribute("email", "s@s.con");
        request.setAttribute("message", "s");
        
        Cart cart = new Cart();
        cart.setTotalCart(1000);
        Users users = new Users();
        users.setUserID(1000);
        CheckOutServlet instance = new CheckOutServlet();
        boolean result = instance.InsertBill(request, cart, users);
        assertEquals(true,result);
        /*result = instance.InsertBill(request, null);
        assertEquals(expResult, result);*/
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Thanh toan -> them -> thanh cong");
    }
    
}

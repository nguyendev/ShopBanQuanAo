/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cart;
import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.Product;

/**
 *
 * @author NguyenIT
 */
public class CartServletTest {
    
    public CartServletTest() {
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
 
    @Test
    public void testPlusflase() {
      
        System.out.println("Gio hang -> Them san pham ");
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        HttpSession session = mock(HttpSession.class);
        when(request.getParameter("productID")).thenReturn("1");
        when(request.getSession()).thenReturn(session);
        session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        if (cart == null){
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        CartServlet instance = new CartServlet();
        boolean result = instance.Plus(request, response, cart);
        assertEquals(true,result);
        System.out.println("Gio hang -> Them san pham -> Thanh cong");
    }

    /**
     * Test of Remove method, of class CartServlet.
     */
    @Test
    public void testRemove() {
        System.out.println("Gio hang -> Xoa san pham");
        Cart cart = new Cart();
        cart.plusToCart((long)1, new Item(new Product(1,1,"","","","",1,""), 1));
        long productid = 1;
        CartServlet instance = new CartServlet();
        boolean result = instance.Remove(cart, productid);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Gio hang -> Xoa san pham -> Thanh cong");
    }
    
}

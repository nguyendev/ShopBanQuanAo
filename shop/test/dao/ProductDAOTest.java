/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duy tung dao
 */
public class ProductDAOTest {
    
    public ProductDAOTest() {
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
     * Test of getListProductByCategory method, of class ProductDAO.
     */
    @Test
    public void testGetListProductByCategory() {
        System.out.println("San pham -> Danh sach theo chuyen muc");
        long category_id = 1;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> result = instance.getListProductByCategory(category_id);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("San pham -> Danh sach theo chuyen muc ->  Thanh cong");
    }
    /**
     * Test of getProduct method, of class ProductDAO.
     */
    @Test
    public void testGetProduct(){
        System.out.println("San pham -> Mot san pham");
        // ton tai product id = 1
        long productID = 1;
        ProductDAO instance = new ProductDAO();
        Product result = instance.getProduct(productID);
        assertNotNull(result);
        System.out.println("San pham -> Mot san pham -> Thanh cong");
    }

    /**
     * Test of getListProduct method, of class ProductDAO.
     */
    @Test
    public void testGetListProduct() {
        System.out.println("San pham -> Danh sach san pham");
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> result = instance.getListProduct();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("San pham -> Danh sach san pham -> Thanh cong");
    }
    
}

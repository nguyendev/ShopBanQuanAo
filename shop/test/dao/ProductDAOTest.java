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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListProductByCategory method, of class ProductDAO.
     */
    @Test
    public void testGetListProductByCategory() {
        System.out.println("getListProductByCategory: Tra ve danh sach product theo category");
        long category_id = 1;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> result = instance.getListProductByCategory(category_id);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Tra ve danh sach product theo category: Thanh cong");
    }
    /**
     * Test of getProduct method, of class ProductDAO.
     */
    @Test
    public void testGetProduct(){
        System.out.println("getProduct: Tra ve product");
        // ton tai product id = 1
        long productID = 1;
        ProductDAO instance = new ProductDAO();
        Product result = instance.getProduct(productID);
        assertNotNull(result);
        System.out.println("Tra ve product: Thanh cong");
    }

    /**
     * Test of getListProduct method, of class ProductDAO.
     */
    @Test
    public void testGetListProduct() {
        System.out.println("getListProduct: Lay danh sach product");
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> result = instance.getListProduct();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Lay danh sach product: Thanh cong");
    }
    
}

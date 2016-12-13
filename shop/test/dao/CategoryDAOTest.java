/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Category;
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
public class CategoryDAOTest {
    
    public CategoryDAOTest() {
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
     * Test of getListCategory method, of class CategoryDAO.
     */
    @Test
    public void testGetListCategory() throws Exception {
        System.out.println("getListCategory");
        CategoryDAO instance = new CategoryDAO();
        ArrayList<Category> expResult = null;
        ArrayList<Category> result = instance.getListCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CategoryDAO.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CategoryDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

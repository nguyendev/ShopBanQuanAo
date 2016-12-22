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
        System.out.println("Chuyen muc: Lay danh sach");
        CategoryDAO instance = new CategoryDAO();
        ArrayList<Category> result = instance.getListCategory();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.print("Chuyen muc: Lay danh sach 'thanh cong'");
    }
        
}

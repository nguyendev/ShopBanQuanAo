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
     * Test of getListCategory method, of class CategoryDAO.
     */
    @Test
    public void testGetListCategory() throws Exception {
        System.out.println("Chuyen muc -> Lay danh sach");
        CategoryDAO instance = new CategoryDAO();
        ArrayList<Category> result = instance.getListCategory();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.print("Chuyen muc -> Lay danh sach -> thanh cong");
    }
        
}

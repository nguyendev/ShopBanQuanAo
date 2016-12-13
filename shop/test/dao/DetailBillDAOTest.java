/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.BillDetail;
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
public class DetailBillDAOTest {
    
    public DetailBillDAOTest() {
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
     * Test of insertBillDetail method, of class DetailBillDAO.
     */
    @Test
    public void testInsertBillDetail() throws Exception {
        System.out.println("insertBillDetail");
        BillDetail bd = null;
        DetailBillDAO instance = new DetailBillDAO();
        instance.insertBillDetail(bd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

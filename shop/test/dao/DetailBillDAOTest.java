/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
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
        System.out.println("Chi tiet hoa don: chen");
        BillDetail bd = new BillDetail();
        bd.setBillDetailID(1000);
        bd.setBillID(1000);
        bd.setProductID(1000);
        bd.setPrice(1000);
        bd.setQuantity(1);
        DetailBillDAO instance = new DetailBillDAO();
        boolean result = instance.insertBillDetail(bd);
        assertTrue(result);
        System.out.println("Chi tiet hoa don: Test chen vao hoa don 'thanh cong' ");
        
        boolean result1 = instance.deleteBill(1000);
        assertTrue(result1);
        System.out.println("Chi tiet hoa don: Khoi phuc ban dau sau khi Test 'Thanh cong'");
    }
    @Test
    public void testDeleteBillDetail() {
        System.out.println("Chi tiet hoa don: Test Xoa");
        BillDetail billdetail = new BillDetail();
        billdetail.setBillDetailID(1001);
        billdetail.setBillID(1001);
        billdetail.setProductID(1000);
        billdetail.setPrice(1000);
        billdetail.setQuantity(1);
        DetailBillDAO instance = new DetailBillDAO();
        boolean result = instance.insertBillDetail(billdetail);
        assertTrue(result);
        System.out.println("Chi tiet hoa don: them vao hoa don de test 'thành công' ");
        
        boolean result1 = instance.deleteBill(1001);
        assertTrue(result1);
        System.out.println("Chi tiet hoa don: Xoa hoa don 'Thanh cong'");
    }
    
    @Test
    public void testgetBill() {
        System.out.println("Chi tiet Hoa don: Test lay");
        
        DetailBillDAO instance = new DetailBillDAO();
        ArrayList<BillDetail>  result = instance.getBillDetail();
        assertNotNull(result);
        System.out.println("Chi tiet hoa don: Test lay toan bo hoa don 'thành công' ");
    }
    
}

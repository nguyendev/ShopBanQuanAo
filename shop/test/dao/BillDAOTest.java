/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Bill;
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
public class BillDAOTest {
    
    public BillDAOTest() {
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
     * Test of insertBill method, of class BillDAO.
     */
    @Test
    public void testInsertBill() {
        System.out.println("Hoa don -> Chen");
        Bill bill = new Bill();
        bill.setBillID(1000);
        bill.setTotal(1000);
        bill.setPayment("0");
        bill.setAddress("Dong Thap");
        bill.setDate(null);
        bill.setName("Nguyen An Hoang Nguyen");
        bill.setAddress1("Ký Túc Xá Khu B");
        bill.setProvincial("Hồ Chí Minh");
        bill.setMessage("gửi nhanh cho tôi");
        bill.setEmail("nguyen.nah76@gmail.com");
        BillDAO instance = new BillDAO();
        boolean result = instance.insertBill(bill);
        assertTrue(result);
        System.out.println("Hoa don -> Chen -> Thanh cong ");
        
        boolean result1 = instance.deleteBill(1000);
        assertTrue(result1);
        System.out.println("Hoa don -> Chen -> Khoi phuc -> Thanh cong");
    }
    
    
    @Test
    public void testDeleteBill() {
        System.out.println("Hoa don -> Xoa");
        Bill bill = new Bill();
        bill.setBillID(1001);
        bill.setTotal(1001);
        bill.setPayment("0");
        bill.setAddress("Dong Thap");
        bill.setDate(null);
        bill.setName("Nguyen An Hoang Nguyen");
        bill.setAddress1("Ký Túc Xá Khu B");
        bill.setProvincial("Hồ Chí Minh");
        bill.setMessage("gửi nhanh cho tôi");
        bill.setEmail("nguyen.nah76@gmail.com");
        BillDAO instance = new BillDAO();
        boolean result = instance.insertBill(bill);
        assertTrue(result);
        System.out.println("Hoa don -> Xoa -> Them -> Thanh cong' ");
        
        boolean result1 = instance.deleteBill(1001);
        assertTrue(result1);
        System.out.println("Hoa don -> Xoa -> Thanh cong'");
    }
    
    @Test
    public void testgetBill() {
        System.out.println("Hoa don -> Lay");
        
        BillDAO instance = new BillDAO();
        ArrayList<Bill>  result = instance.getBill();
        assertNull(result);
        System.out.println("Hoa don -> Lay -> Thanh cong ");
    }
}

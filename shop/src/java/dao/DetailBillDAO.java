/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Bill;
import model.BillDetail;

/**
 *
 * @author NguyenIT
 */
public class DetailBillDAO {
     public boolean insertBillDetail(BillDetail bd) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO bill_detail VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, bd.getBillDetailID());
            ps.setLong(2, bd.getBillID());
            ps.setLong(3, bd.getProductID());
            ps.setDouble(4, bd.getPrice());
            ps.setInt(5, bd.getQuantity());
            ps.executeUpdate();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
     public ArrayList<BillDetail> getBillDetail() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM bill_detail";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<BillDetail> list = new ArrayList<>();
            while (rs.next()){
                BillDetail billdetail = new BillDetail();
                billdetail.setBillDetailID(rs.getInt("bill_detail_id"));
                billdetail.setBillID(rs.getInt("bill_id"));
                billdetail.setProductID(rs.getInt("product_id"));
                billdetail.setPrice(rs.getDouble("price"));
                billdetail.setQuantity(rs.getInt("quantity"));
                list.add(billdetail);
            }
            return list;
        }
        catch (SQLException e)
        {
        }
        return null;
    }
    public boolean deleteBill(int id) {
        String sql = "DELETE from bill_detail where bill_detail_id = "+ id;
        Connection connection = DBConnect.getConnecttion();
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            e.getStackTrace();
        }
        return false;
    }
}

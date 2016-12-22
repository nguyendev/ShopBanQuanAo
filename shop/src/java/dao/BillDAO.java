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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.Bill;

/**
 *
 * @author NguyenIT
 */
public class BillDAO {
    private Connection connection;
    public BillDAO(){
        connection = DBConnect.getConnecttion();
    }
    public boolean insertBill(Bill bill) {
        String sql = "INSERT INTO bill VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, bill.getBillID());
            ps.setLong(2, bill.getUserID());
            ps.setDouble(3, bill.getTotal());
            ps.setString(4, bill.getPayment());
            ps.setString(5, bill.getAddress());
            ps.setTimestamp(6, bill.getDate());
            ps.setString(7, bill.getName());
            ps.setString(8,bill.getAddress1());
            ps.setString(9, bill.getProvincial());
            ps.setString(10, bill.getMessage());
            ps.setString(11, bill.getEmail());
            ps.executeUpdate();
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return false;
        
    }
    public ArrayList<Bill> getBill() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM bill";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Bill> list = new ArrayList<>();
            while (rs.next()){
                Bill bill = new Bill();
                bill.setBillID(rs.getInt("bill_id"));
                bill.setUserID(rs.getInt("user_id"));
                bill.setTotal(rs.getDouble("total"));
                bill.setPayment(rs.getString("payment"));
                bill.setAddress(rs.getString("address"));
                bill.setDate(rs.getTimestamp("date"));
                bill.setName(rs.getString("name"));
                bill.setAddress1(rs.getString("address1"));
                bill.setProvincial(rs.getString("provincial"));
                bill.setMessage(rs.getString("message"));
                bill.setEmail(rs.getString("email"));
                list.add(bill);
            }
            
        }
        catch (SQLException e)
        {
        }
        return null;
    }
    public boolean deleteBill(int id) {
        String sql = "DELETE from bill where bill_id = "+ id;
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
    /*public int count(){
        String sql = "SELECT COUNT(BillID) FROM bill";  
        try{
        PreparedStatement ps = connection.prepareCall(sql);
        ps.executeUpdate();
        connection.close();
        return sql.c;
        }
        catch(SQLException e)
        {
            e.getSQLState();
        }
    }*/
    
}

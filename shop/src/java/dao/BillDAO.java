/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Bill;

/**
 *
 * @author NguyenIT
 */
public class BillDAO {
    public void insertBill(Bill bill) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO bill VALUES(?,?,?,?,?,?,?,?,?,?,?)";
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
    }
    
}

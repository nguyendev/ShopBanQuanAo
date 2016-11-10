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
import model.Item;

/**
 *
 * @author NguyenIT
 */
public class UsersDAO {
    public boolean checkEmail (String email) throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM user WHERE user_email = '" + email + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()){
                connection.close();
                return true;
            }
        }
        catch (SQLException ex){
            
        }
       return false;
        
    }
    
}





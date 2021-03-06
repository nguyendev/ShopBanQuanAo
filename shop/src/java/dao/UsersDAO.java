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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Item;
import model.Users;

/**
 *
 * @author NguyenIT
 */
public class UsersDAO {
    // thao tác trên bảng user
    private Connection connection;
    public UsersDAO(){
        connection= DBConnect.getConnecttion();
    }
    public boolean checkEmail (String email) throws SQLException{
        String sql = "SELECT * FROM user WHERE user_email = '" + email + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet  rs = ps.executeQuery();
            while (rs.next()){
                return true;
            }
        }
        catch (SQLException ex){
            
        }
       return false;
        
    }
    public boolean insertUser(Users  u){
        String sql = "INSERT INTO user VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1,u.getUserID());
            ps.setString(2,u.getUserEmail());
            ps.setString(3,u.getUserPass());
            ps.setBoolean(4,u.getUserRole());
            ps.executeUpdate();
            return true;
        }
        catch(SQLException e){
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }
    public boolean deleteUser(long  user_id){
        String sql = "DELETE FROM user WHERE user_id = " + user_id;
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.executeUpdate();
            return true;
        }
        catch(SQLException e){
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }
    public boolean deleteUserFromEmail(String  email){
        String sql = "DELETE FROM user WHERE user_email = "+"'"+email+"'" ;
        try{
            PreparedStatement ps = connection.prepareCall(sql);
            ps.execute();
            return true;
        }
        catch(SQLException e){
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }
    
    public Users Login(String email, String password){
        String sql = "SELECT * FROM user WHERE user_email='"+email+
                "' and user_pass='"+ password+"'";
        PreparedStatement ps;
        try{
            ps=(PreparedStatement)connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Users u = new Users();
                u.setUserID(rs.getLong("user_id"));
                u.setUserEmail(rs.getString("user_email"));
                u.setUserPass(rs.getString("user_pass"));
                return u;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
}





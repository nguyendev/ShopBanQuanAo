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
import model.Category;

/**
 *
 * @author NguyenIT
 */
public class CategoryDAO {
    // lấy danh sách thể loại
    public ArrayList<Category> getListCategory() {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM category";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Category> list = new ArrayList<>();
            while (rs.next()){
                Category category = new Category();
                category.setCategoryID(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category_name"));
                list.add(category);
            }
            return list;
        }
        catch (SQLException e)
        {
        }
        return null;
    }
    
}

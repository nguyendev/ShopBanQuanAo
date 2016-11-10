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
import model.Product;

/**
 *
 * @author NguyenIT
 */
public class ProductDAO {
    // lay danh sach san pham
    public ArrayList<Product> getListProductByCategory(long category_id) throws SQLException{
        Connection connection =  DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE category_id = '" + category_id +"'";
        PreparedStatement ps = connection.prepareCall (sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()){
         Product product = new Product();
         product.setProductID(rs.getLong("product_id"));
         product.setProductName(rs.getString("product_name"));
         product.setProductDescription(rs.getString("product_description"));
         product.setProductPrice(rs.getDouble("product_price"));
         product.setProductImage(rs.getString("product_image"));
         list.add(product);
         
        }
        return list;
    }
    public Product getProduct(long productID) throws SQLException
    {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE product_id = '"+ productID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()){
            product.setProductID(rs.getLong("product_id"));
         product.setProductName(rs.getString("product_name"));
         product.setProductDescription(rs.getString("product_description"));
         product.setProductPrice(rs.getDouble("product_price"));
         product.setProductImage(rs.getString("product_image"));
        }
        return product;       
    }
}

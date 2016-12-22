/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author NguyenIT
 */
public class CartServlet extends HttpServlet {
    private ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String productID = request.getParameter("productID");
       
        Cart cart = (Cart) session.getAttribute("cart");
        
        try{
            Long productid = Long.parseLong(productID);
            Product product = productDAO.getProduct(productid);          
            switch(command){
                case "plus":
                    Plus(request, response, cart);
                case "remove":
                    Remove(cart,productid);
                    break;
              
            }
        }
        catch (Exception e){
            e.printStackTrace();
            response.sendRedirect("/shop/index.jsp");
        }
        session.setAttribute("cart",cart);
        response.sendRedirect("/shop/index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    public boolean Plus(HttpServletRequest request, HttpServletResponse response, Cart cart) {
    
        HttpSession session = request.getSession();
        String productID = request.getParameter("productID");
        Long productid = Long.parseLong(productID);
        try{
            Product product = productDAO.getProduct(productid);   
            if(cart.getCartItems().containsKey(productid)){
                cart.plusToCart(productid, new Item(product, 
                    cart.getCartItems().get(productid).getQuantity()));
            }
            else{
                cart.plusToCart(productid, new Item(product,1));
            }
            return true;
        }
        catch (Exception e)
        {
        }
        return false;
    }
    public boolean Remove(Cart cart, Long productid){
        try {
            cart.removeToCart(productid);
            return true;
        }
        catch (Exception e){}
        return false;
    }
}

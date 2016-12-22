/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BillDAO;
import dao.DetailBillDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.BillDetail;
import model.Cart;
import model.Item;
import model.Users;

/**
 *
 * @author NguyenIT
 */
public class CheckOutServlet extends HttpServlet {

    private final BillDAO billDAO = new BillDAO();
    private final DetailBillDAO billDetailDAO = new DetailBillDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Users users = (Users) session.getAttribute("user");
        InsertBill(request, cart, users);
        response.sendRedirect("/shop/index.jsp");
    }
    public static void main(String[] args) throws SQLException {
        
        new BillDAO().insertBill(new Bill(0, 0, 0, "s", "s", new Timestamp(new Date().getTime()),"s","s","s","s","s"));
    }
    
    public boolean InsertBill(HttpServletRequest request, Cart cart, Users users)
    {
        String payment = request.getParameter("payment");
        String address = request.getParameter("address");
        String address1 = request.getParameter("adress1");
        String name = request.getParameter("name");
        String provincial = request.getParameter("provincial");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        HttpSession session = request.getSession();
        try {
            long ID = new Date().getTime();
            Bill bill = new Bill();
            bill.setBillID(ID);
            bill.setAddress(address);
            bill.setAddress1(address1);
            bill.setName(name);;
            bill.setProvincial(provincial);
            bill.setEmail(email);
            bill.setMessage(message);
            bill.setPayment(payment);
            bill.setUserID(users.getUserID());
            bill.setDate(new Timestamp(new Date().getTime()));
            bill.setTotal(cart.totalCart());
            billDAO.insertBill(bill);
            for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                billDetailDAO.insertBillDetail(new BillDetail(0, ID,
                        list.getValue().getProduct().getProductID(),
                        list.getValue().getProduct().getProductPrice(),
                        list.getValue().getQuantity()));
            }
            cart = new Cart();
            session.setAttribute("cart", cart);
            return true;
        } 
        
        catch (SQLException e) {
        }
        return false;
    }

}

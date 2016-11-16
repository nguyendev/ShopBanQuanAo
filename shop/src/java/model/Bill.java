/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author NguyenIT
 */
public class Bill {
    private long billID;
    private long userID;
    private double total;
    private String name;
    private String address1;
    private String provincial;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String message;

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    private String payment;
    private String address;
    private Timestamp date;
    public long getBillID() {
        return billID;
    }

    public void setBillID(long billID) {
        this.billID = billID;
    }
    public Bill() {
    }

    public Bill(long billID, long userID, double total, String payment, String address, Timestamp date, String name, String address1, String provincial, String message, String email) {
        this.billID = billID;
        this.userID = userID;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.address1 = address1;
        this.provincial = provincial;
        this.name = name;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}

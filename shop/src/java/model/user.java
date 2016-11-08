/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author duy tung dao
 */
public class user {
    private long userID;
    private String userEmail;;
    private String userPass;
    private boolean userRole;
    public user(){
        
    }

    public user(long userID, String userEmail, String userPass, boolean userRole) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userRole = userRole;
    }
    
}
    

package com.project.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class RegisterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;
    private String userName;
    private String userEmail;
    private Character userGender;
    private String userAddress;

    
    
    public RegisterModel() {
    }
    public Integer getUserID() {
        return userID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public char getUserGender() {
        return userGender;
    }
    public void setUserGender(char userGender) {
        this.userGender = userGender;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    

    

}

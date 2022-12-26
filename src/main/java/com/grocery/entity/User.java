package com.grocery.entity;

 

import java.util.HashSet;
import java.util.Set;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;

    private String password;

    private String email;

    private String mobileNumber;
   

 

    @OneToMany
    private Set<Product> product = new HashSet<>();

    public User() {

    }

 

    public User(String userName, String password, String email, String mobileNumber) {
        super();
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

 

    public int getUserId() {
        return userId;
    }

 

    public void setUserId(int userId) {
        this.userId = userId;
    }

 

    public String getUserName() {
        return userName;
    }

 

    public void setUserName(String userName) {
        this.userName = userName;
    }

 

    public String getPassword() {
        return password;
    }

 

    public void setPassword(String password) {
        this.password = password;
    }

 

    public String getMobileNumber() {
        return mobileNumber;
    }

 

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

 

  



}
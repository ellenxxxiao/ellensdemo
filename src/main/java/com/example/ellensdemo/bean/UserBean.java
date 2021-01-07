package com.example.ellensdemo.bean;

public class UserBean {
    private int userId;
    private String userName;
    private String userPassword;

    public int getUserId(){
        return userId;
    }

    public void setId(int newId){
        this.userId = newId;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String newUserName){
        this.userName = newUserName;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public void setUserPassword(String newUserPassword){
        this.userPassword = newUserPassword;
    }
}

package com.digitalmoney.home.models;

/**
 * Created by shailesh on 13/11/17.
 */

public class User {

    private String userAuth;
    private String userName;
    private String userEmail;
    private String userMobileno;
    private String userPassword;

    public String getReferral_code() {
        return referral_code;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    private String referral_code;

    public User() {
    }

    public User(String userAuth, String userName, String userEmail, String userMobileno, String userPassword, String referral_code) {
        this.userAuth = userAuth;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userMobileno = userMobileno;
        this.userPassword = userPassword;
        this.referral_code = referral_code;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
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

    public String getUserMobileno() {
        return userMobileno;
    }

    public void setUserMobileno(String userMobileno) {
        this.userMobileno = userMobileno;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "userAuth='" + userAuth + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userMobileno='" + userMobileno + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", referral_code='" + referral_code + '\'' +
                '}';
    }
}

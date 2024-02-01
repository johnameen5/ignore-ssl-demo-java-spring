package com.example.ignoressldemo.models;

import java.util.Date;

public class Token {
    String userName;
    String role;
    Date validFrom;
    Date validTo;
    String bearer;

    public Token() {
    }

    public Token(String userName, String role, Date validFrom, Date validTo, String bearer) {
        this.userName = userName;
        this.role = role;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.bearer = bearer;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }
}

package com.example.ignoressldemo.models;

public class LoginResponse {
    Message message;
    Account account;
    Token token;
    String returnUrl;

    public LoginResponse() {
    }

    public LoginResponse(Message message, Account account, Token token, String returnUrl) {
        this.message = message;
        this.account = account;
        this.token = token;
        this.returnUrl = returnUrl;
    }

    public LoginResponse(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}

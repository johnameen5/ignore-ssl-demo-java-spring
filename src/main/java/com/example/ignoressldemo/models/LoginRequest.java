package com.example.ignoressldemo.models;

public class LoginRequest {
    String account;
    String password;
    boolean rememberMe;
    String operatingSystem;
    String osVersion;
    String application;
    String appVersion;
    String returnUrl;

    public LoginRequest(String account, String password, boolean rememberMe, String operatingSystem, String osVersion, String application, String appVersion, String returnUrl) {
        this.account = account;
        this.password = password;
        this.rememberMe = rememberMe;
        this.operatingSystem = operatingSystem;
        this.osVersion = osVersion;
        this.application = application;
        this.appVersion = appVersion;
        this.returnUrl = returnUrl;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}

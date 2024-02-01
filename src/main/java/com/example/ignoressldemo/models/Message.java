package com.example.ignoressldemo.models;

public class Message {
    String description;
    String code;
    String title;
    String type;
    boolean success;

    public Message() {
    }

    public Message(String description, String code, String title, String type, boolean success) {
        this.description = description;
        this.code = code;
        this.title = title;
        this.type = type;
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

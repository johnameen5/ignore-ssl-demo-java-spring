package com.example.ignoressldemo.models;

public class Account {
    int id;
    String userId;
    String firstName;
    String lastName;
    int patientId;
    String patientProfile;
    boolean isActive;

    public Account() {
    }

    public Account(int id, String userId, String firstName, String lastName, int patientId, String patientProfile, boolean isActive) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientId = patientId;
        this.patientProfile = patientProfile;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientProfile() {
        return patientProfile;
    }

    public void setPatientProfile(String patientProfile) {
        this.patientProfile = patientProfile;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

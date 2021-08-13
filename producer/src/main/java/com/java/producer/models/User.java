package com.java.producer.models;

public class User {
    
    public User(){}

    private String name;
    private String lastName;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
}

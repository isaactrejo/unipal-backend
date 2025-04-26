package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "[user]")
public class User {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String type;
    private String firebaseId; // initializing models to mirror json

    public User () {}

    // getters and setters for table data

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirebaseId() { return firebaseId; }

    public void setFirebaseId(String firebaseId) { this.firebaseId = firebaseId; }
}



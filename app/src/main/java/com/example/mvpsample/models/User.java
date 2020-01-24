package com.example.mvpsample.models;

import androidx.room.Entity;

@Entity
public class User {

    public String name;
    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

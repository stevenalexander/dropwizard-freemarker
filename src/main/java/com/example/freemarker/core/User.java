package com.example.freemarker.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    @JsonProperty
    private String displayName;

    @JsonProperty
    private String displayRole;

    public User() {
        // Jackson deserialization
    }

    public User(String username, String password, String displayName, String displayRole) {
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.displayRole = displayRole;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayRole() {
        return displayRole;
    }
}

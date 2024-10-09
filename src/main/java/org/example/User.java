package org.example;

public class User extends BasicUser {
    public User(String aName) {
        super(aName, new UserType());
    }
}

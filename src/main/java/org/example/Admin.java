package org.example;

public class Admin extends BasicUser {
    public Admin(String aName) {
        super(aName, new AdminType());
    }
}

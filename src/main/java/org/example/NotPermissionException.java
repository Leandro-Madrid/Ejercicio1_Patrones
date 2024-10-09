package org.example;

public class NotPermissionException extends Exception {
    public NotPermissionException(User anUser) {
        super("The user: " + anUser.getNombre() + " hasn't permission for this action");
    }
}

package org.example;

public abstract class UserState {
    public abstract void cambiarDelPedidoAEntregado(Order unPedido) throws NotPermissionException;
}

package org.example;

public class UserType extends UserState {
    @Override
    public void cambiarDelPedidoAEntregado(Order unPedido) throws NotPermissionException {
        throw new NotPermissionException(new User("Usuario sin permisos"));
    }
}

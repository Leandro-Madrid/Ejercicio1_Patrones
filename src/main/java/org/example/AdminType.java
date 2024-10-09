package org.example;

public class AdminType extends UserState {
    @Override
    public void cambiarDelPedidoAEntregado(Order unPedido) {
        unPedido.cambiarEstadoAEntregado();
    }
}

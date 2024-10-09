package org.example;

public abstract class BasicUser {
    protected String name;
    private UserState state;

    public BasicUser(String aName, UserState aState) {
        this.name = aName;
        this.state = aState;
    }

    public String getNombre() {
        return this.name;
    }

    public void cambiaEstadoDelPedidoAEntregado(Order unPedido) throws NotPermissionException {
        this.state.cambiarDelPedidoAEntregado(unPedido);
    }
}

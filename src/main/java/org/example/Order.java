package org.example;

public class Order {
    private StateOrder estado;

    public Order() {
        this.estado = StateOrder.CREADO;
    }

    public StateOrder getEstado() {
        return this.estado;
    }

    public void cambiarEstadoAEntregado() {
        this.estado = StateOrder.ENTREGADO;
    }
}

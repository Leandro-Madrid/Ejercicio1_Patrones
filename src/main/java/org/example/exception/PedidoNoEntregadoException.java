package org.example.exception;

public class PedidoNoEntregadoException extends RuntimeException {
    public PedidoNoEntregadoException(){
        super("El pedido aun no fue entregado");
    }
}

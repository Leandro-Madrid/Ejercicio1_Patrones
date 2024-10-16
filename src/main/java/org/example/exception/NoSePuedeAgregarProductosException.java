package org.example.exception;

import org.example.model.estado.EstadoPedido;

public class NoSePuedeAgregarProductosException extends RuntimeException {
    public NoSePuedeAgregarProductosException(EstadoPedido unEstadoPedido){
        super("no se puede agregar un producto al pedido pues esta en estado: " + unEstadoPedido.toString());
    }
}

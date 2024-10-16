package org.example.model;

import org.example.model.estado.Monio;

public class ConTarjetita extends DecoradorPedido{
    public ConTarjetita(Pedido unPedido) {
        super(unPedido);
    }

    @Override
    protected Producto agregarProductoPropio() {
        return new Tarjeta();
    }
}

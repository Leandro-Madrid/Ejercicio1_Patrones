package org.example.model.decorador;

import org.example.model.Pedido;
import org.example.model.Producto;
import org.example.model.Tarjeta;

public class ConTarjetita extends DecoradorPedido {
    public ConTarjetita(Pedido unPedido) {
        super(unPedido);
    }

    @Override
    protected Producto agregarProductoPropio() {
        return new Tarjeta();
    }
}

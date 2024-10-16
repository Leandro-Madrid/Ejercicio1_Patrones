package org.example.model.decorador;

import org.example.model.Pedido;
import org.example.model.Producto;
import org.example.model.Monio;

public class ConMonio extends DecoradorPedido {
    public ConMonio(Pedido unPedido) {
        super(unPedido);
    }

    @Override
    protected Producto agregarProductoPropio() {
        return new Monio();
    }
}

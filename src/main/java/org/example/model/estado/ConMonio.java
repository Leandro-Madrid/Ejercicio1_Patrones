package org.example.model.estado;

import org.example.model.DecoradorPedido;
import org.example.model.Pedido;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ConMonio extends DecoradorPedido {
    public ConMonio(Pedido unPedido) {
        super(unPedido);
    }

    @Override
    protected Producto agregarProductoPropio() {
        return new Monio();
    }
}

package org.example.model;

import java.util.ArrayList;
import java.util.List;

public abstract class DecoradorPedido implements IPedido{
    private Pedido pedido;
    public DecoradorPedido(Pedido unPedido){
        this.pedido = unPedido;
    }

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(this.agregarProductoPropio());
        productos.addAll(this.pedido.getProductos());
        return productos;
    }

    protected abstract Producto agregarProductoPropio();
}

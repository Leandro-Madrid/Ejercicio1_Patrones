package org.example.model.decorador;

import org.example.model.interfaces.IPedido;
import org.example.model.Pedido;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class DecoradorPedido implements IPedido {
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

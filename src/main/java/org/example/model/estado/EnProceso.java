package org.example.model.estado;

import org.example.model.Producto;

import java.util.List;

public class EnProceso extends EstadoPedido{
    @Override
    public boolean estaEnProceso(){
        return true;
    }

    @Override
    public void agregarProducto(List<Producto> productos, Producto unProducto) {
        productos.add(unProducto);
    }
}

package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pack extends Producto {
    List<Producto> productos;


    public Pack(String unNombre, String unaDescripcion){
        super(unNombre, unaDescripcion);
        this.productos = new ArrayList<>();
    }

    @Override
    public Long getPrecio() {
        return this.getPrecio(this.productos);
    }

    public void agregarproducto(Producto unProducto) {
        this.productos.add(unProducto);
    }
}

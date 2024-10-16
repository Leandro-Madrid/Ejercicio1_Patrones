package org.example.model;

import org.example.model.interfaces.SumadorDePreciosDeProductos;

public abstract class Producto implements SumadorDePreciosDeProductos {
    private String nombre, descripcion;

    public Producto(String unNombre, String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }

    public abstract Long getPrecio();
}

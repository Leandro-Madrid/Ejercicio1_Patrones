package org.example;

public abstract class Producto implements SumadorDePreciosDeProductos{
    private String nombre, descripcion;

    public Producto(String unNombre, String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }

    public abstract Long getPrecio();
}

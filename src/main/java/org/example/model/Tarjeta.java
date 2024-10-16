package org.example.model;

public class Tarjeta extends Producto {
    public Tarjeta() {
        super("tarjeta", "una descripcion bien mamona");
    }

    @Override
    public Long getPrecio() {
        return 0L;
    }
}

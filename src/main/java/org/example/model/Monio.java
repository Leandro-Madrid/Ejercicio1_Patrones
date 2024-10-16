package org.example.model;

public class Monio extends Producto {
    public Monio() {
        super("Monio", "otraDescripcion");
    }

    @Override
    public Long getPrecio() {
        return 0L;
    }
}

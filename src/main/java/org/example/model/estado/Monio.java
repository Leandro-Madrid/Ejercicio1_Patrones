package org.example.model.estado;

import org.example.model.Producto;

import java.util.List;

public class Monio extends Producto {
    public Monio() {
        super("Monio", "otraDescripcion");
    }

    @Override
    public Long getPrecio() {
        return 0L;
    }
}

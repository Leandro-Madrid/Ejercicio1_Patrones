package org.example;

public class Basico extends Producto {
    private Long precio;
    public Basico(String unNombre, long unPrecio, String unaDescripcion) {
        super(unNombre, unaDescripcion);
        this.precio = unPrecio;
    }

    @Override
    public Long getPrecio(){
        return this.precio;
    }
}

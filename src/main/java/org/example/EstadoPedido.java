package org.example;

public abstract class EstadoPedido {
    public String nombreRepartidor(){
        throw new NotRepartidorDesignadoException();
    }

    public boolean fueEntregado(){
        return false;
    }

    public boolean estaEnCamino(){
        return false;
    }
}

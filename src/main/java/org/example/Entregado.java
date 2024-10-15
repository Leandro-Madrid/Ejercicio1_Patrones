package org.example;

public class Entregado extends EstadoPedido{
    private Repartidor repartidor;
    public Entregado(Repartidor unRepartidor){
        this.repartidor = unRepartidor;
    }
    @Override
    public String nombreRepartidor(){
        return this.repartidor.getNombre();
    }
}

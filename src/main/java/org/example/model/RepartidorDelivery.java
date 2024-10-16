package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class RepartidorDelivery {
    private List<Repartidor> repartidores;
    private static RepartidorDelivery delivery;
    private RepartidorDelivery(){
        this.repartidores = new ArrayList<>();
    }

    public static final RepartidorDelivery getInstance(){
        if(delivery == null){
            delivery = new RepartidorDelivery();
        }
        return delivery;
    }

    public void agregarRepartidor(Repartidor unRepartidor){
        this.repartidores.add(unRepartidor);
    }

    public Repartidor obtenerUnRepartidor(){
        int randomNum = (int)(Math.random() * this.repartidores.size()+1);
        return this.repartidores.get(randomNum);
    }
}

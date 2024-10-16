package org.example.model.estado;

import org.example.exception.NoSePuedeAgregarProductosException;
import org.example.model.Producto;
import org.example.model.Repartidor;

import java.util.Date;
import java.util.List;

public class Entregado extends EstadoPedido{
    private Repartidor repartidor;
    private Date entrega;

    public Entregado(Repartidor unRepartidor){
        this.repartidor = unRepartidor;
        this.entrega = new Date();
    }

    @Override
    public String nombreRepartidor(){
        return this.repartidor.getNombre();
    }

    @Override
    public boolean estaEntregado(){
        return true;
    }

    @Override
    public void agregarProducto(List<Producto> productos, Producto unProducto) {
        throw new NoSePuedeAgregarProductosException(this);
    }

    @Override
    public Date cuandoFueEntregado(){
        return this.entrega;
    }


}

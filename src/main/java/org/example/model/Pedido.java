package org.example.model;

import org.example.model.estado.*;
import org.example.model.interfaces.IPedido;
import org.example.model.interfaces.SumadorDePreciosDeProductos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements IPedido, SumadorDePreciosDeProductos {
    List<Producto> productos;
    EstadoPedido estado;

    public Pedido(){
        this.productos = new ArrayList<>();
        this.estado = new Creado();
    }
    public void agregarProducto(Producto unProducto) {
        this.estado.agregarProducto(this.productos, unProducto);
    }

    public Long getPrecio(){
        return this.getPrecio(this.productos);
    }

    public EstadoPedido getEstado() {
        return this.estado;
    }

    public String nombreRepartidor(){
        return this.estado.nombreRepartidor();
    }

    public boolean fueEntregado(){
        return this.estado.estaEntregado();
    }

    public boolean estaEnCamino(){
        return this.estado.estaEnCamino();
    }

    public Date cuandoFueEntregado(){
        return this.estado.cuandoFueEntregado();
    }

    private void setEstado(EstadoPedido unEstado){
        this.estado = unEstado;
    }

    public void estarEnProceso(){
        this.setEstado(new EnProceso());
    }

    public void estarEnviado(){ //Como hago para pasarle desde el Estado Enviado el repartidor al Estado Entregado
        this.setEstado(new Enviado());
    }

    public void estarEntregado(){
        this.setEstado(new Entregado(null));
    }

    @Override
    public List<Producto> getProductos() {
        return this.productos;
    }
}

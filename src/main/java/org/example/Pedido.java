package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements SumadorDePreciosDeProductos{
    List<Producto> productos;
    EstadoPedido estado;

    public Pedido(){
        this.productos = new ArrayList<>();
        this.estado = new Creado();
    }
    public void agregarProducto(Producto unProducto) {
        this.productos.add(unProducto);
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
        return this.estado.fueEntregado();
    }

    public boolean estaEnCamino(){
        return this.estado.estaEnCamino();
    }
}

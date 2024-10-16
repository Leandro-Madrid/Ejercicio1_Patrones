package org.example.model.estado;

import org.example.exception.NotRepartidorDesignadoException;
import org.example.exception.PedidoNoEntregadoException;
import org.example.model.Producto;

import java.util.Date;
import java.util.List;

public abstract class EstadoPedido {
    public String nombreRepartidor(){
        throw new NotRepartidorDesignadoException();
    }

    public boolean estaEntregado(){
        return false;
    }

    public boolean estaEnCamino(){
        return false;
    }

    public boolean estaEnProceso(){
        return false;
    }

    public boolean estaCreado(){
        return false;
    }

    public Date cuandoFueEntregado() {
        throw new PedidoNoEntregadoException();
    }

    public abstract void agregarProducto(List<Producto> productos, Producto unProducto);
}

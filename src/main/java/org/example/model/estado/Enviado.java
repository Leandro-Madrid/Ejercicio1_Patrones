package org.example.model.estado;

import org.example.exception.NoSePuedeAgregarProductosException;
import org.example.model.Producto;
import org.example.model.Repartidor;
import org.example.model.RepartidorDelivery;

import java.util.List;

public class Enviado extends EstadoPedido{
    private Repartidor repartidor;
        public Enviado(){
            this.repartidor = RepartidorDelivery.getInstance().obtenerUnRepartidor();
        }
        @Override
        public String nombreRepartidor(){
            return this.repartidor.getNombre();
        }

        @Override
        public boolean estaEnCamino(){
            return true;
        }

    @Override
    public void agregarProducto(List<Producto> productos, Producto unProducto) {
        throw new NoSePuedeAgregarProductosException(this);
    }
}

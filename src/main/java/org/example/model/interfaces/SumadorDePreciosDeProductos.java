package org.example.model.interfaces;

import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

public interface SumadorDePreciosDeProductos {
    List<Producto> productos = new ArrayList<>();
    default Long getPrecio(List<Producto> unaListaDeProductos) {
        //return this.productos.stream().map(org.example.model.Producto::getPrecio).count();
        Long resultado = 0L;
        for(Producto prod : unaListaDeProductos){
            resultado += prod.getPrecio();
        }
        return resultado;
    }
}

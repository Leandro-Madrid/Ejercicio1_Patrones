package org.example;

public class NotRepartidorDesignadoException extends RuntimeException{
    public NotRepartidorDesignadoException(){
        super("El pedido no tiene asignado un repartidor todavia");
    }
}

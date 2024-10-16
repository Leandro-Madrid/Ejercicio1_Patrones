import org.example.exception.NotRepartidorDesignadoException;
import org.example.model.*;
import org.example.model.Basico;
import org.example.model.estado.Creado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testUnPedidoVacioTieneUnPrecioDe0Inicialmente(){
        Pedido pedido = new Pedido();
        Long precio = pedido.getPrecio();
        assertEquals(0L, precio);
    }

    @Test
    public void testUnPedidoConUNProductoBasicoTieneComoPrecioElPrecioDelProductoBasicoQueContiene(){
        Pedido pedido = new Pedido();
        Producto basico = new Basico("alfajor", 20L, "algo");
        pedido.agregarProducto(basico);
        Long precio = pedido.getPrecio();
        assertEquals(20L, precio);
    }


    @Test
    public void testUnPedidoConDosProductosBasicosTieneComoPrecioLaSumaDeLosPreciosDeLosDosProductosBasicos(){
        Pedido pedido = new Pedido();
        Producto basico1 = new Basico("alfajor A", 20L, "algo");
        Producto basico2 = new Basico("alfajor B", 22L, "otra cosa");
        pedido.agregarProducto(basico1);
        pedido.agregarProducto(basico2);
        Long precio = pedido.getPrecio();
        assertEquals(42L, precio);
    }

    @Test
    public void testUnPedidoConUNPackTieneComoPrecioLaSumaDeLosPreciosDeLosProductosDelPack(){
        Pedido pedido = new Pedido();

        Producto basico1 = new Basico("alfajor A", 20L, "algo");
        Producto basico2 = new Basico("alfajor B", 22L, "otra cosa");

        Pack pack = new Pack("pack 1", "un conveniente pack");
        pack.agregarproducto(basico1);
        pack.agregarproducto(basico2);

        pedido.agregarProducto(pack);

        Long precio = pedido.getPrecio();
        assertEquals(42L, precio);
    }

    @Test
    public void testUnPedidoConUNPackYUnProductoBasicoTieneComoPrecioLaSumaDeLosPreciosDeLosProductosDelPackMasElPrecioDelBasico(){
        Pedido pedido = new Pedido();

        Producto basico1 = new Basico("alfajor A", 20L, "algo");
        Producto basico2 = new Basico("alfajor B", 22L, "otra cosa");
        Producto basico3 = new Basico("alfajor c", 23L, "otra cosa");

        Pack pack = new Pack("pack 1", "un conveniente pack");
        pack.agregarproducto(basico1);
        pack.agregarproducto(basico2);

        pedido.agregarProducto(pack);
        pedido.agregarProducto(basico3);

        Long precio = pedido.getPrecio();
        assertEquals(65L, precio);
    }

    @Test
    public void testAlCrearseUnPedidoTieneComoEstadoCreado(){
        Pedido pedido = new Pedido();
        assertInstanceOf(Creado.class, pedido.getEstado());
    }

    @Test
    public void testUnPedidoAlSerCreadoLanzaUNaExcepcionCuandoSeLePreguntaPorElNombreDelRepartido(){
        Pedido pedido = new Pedido();
        Exception ex = assertThrows(NotRepartidorDesignadoException.class, () -> {
            pedido.nombreRepartidor();
        });
        assertEquals("El pedido no tiene asignado un repartidor todavia", ex.getMessage());
    }




}

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    @Test
    public void testUnUsuarioRetornaElNombre() {
        BasicUser user = new User("pepito");
        assertEquals("pepito", user.getNombre());
    }

    @Test
    public void testUnAdministradorRetornaElNombre() {
        BasicUser user = new Admin("pepito");
        assertEquals("pepito", user.getNombre());
    }

    @Test
    public void testUnAdministradorPuedeForzarElEstadoDeUNPedidoAEntregado() throws NotPermissionException {
        Order unPedido = new Order();
        BasicUser admin = new Admin("adminUser");
        StateOrder estadoAnterior = unPedido.getEstado();
        admin.cambiaEstadoDelPedidoAEntregado(unPedido);
        assertEquals(StateOrder.CREADO, estadoAnterior);
        assertEquals(StateOrder.ENTREGADO, unPedido.getEstado());
    }

    @Test
    public void testUnUsuarioAlForzarElEstadoDeUNPedidoAEntregadoLanzaUnaException() {
        Order unPedido = new Order();
        BasicUser unUser = new User("normalUser");
        Exception exception = assertThrows(NotPermissionException.class, () -> {
            unUser.cambiaEstadoDelPedidoAEntregado(unPedido);
        });
        assertEquals("The user: Usuario sin permisos hasn't permission for this action"
                , exception.getMessage());
    }
}

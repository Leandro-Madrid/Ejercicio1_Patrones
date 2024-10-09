# Sistema de Gestión de Pedidos para Tienda en Línea

## Ejercicio 1 de Patrones

### A) Descripción del Proyecto

Este sistema de gestión de pedidos permite a los usuarios realizar pedidos de productos en una tienda en línea y a los administradores gestionar esos pedidos. La arquitectura del sistema es flexible y permite personalizar los pedidos según las preferencias del usuario (usando el patrón Decorator). Además, implementa un mecanismo para notificar a los usuarios sobre el estado de sus pedidos (usando el patrón Observer).

### Requisitos Específicos

- **Clase `Pedido`**: Representa un pedido en el sistema. Esta clase contiene:
  - Información sobre los productos incluidos en el pedido.
  - El estado actual del pedido (usando el patrón State).
  - Información relevante como el costo total, momento de entrega, productos agregados o quitados, medio de pago y nombre del repartidor.

- **Productos**:
  - **Productos Básicos**: Productos individuales.
  - **Packs**: Compuestos de otros productos básicos o de otros packs (usando el patrón Composite).

- **Personalización de Pedidos**:
  - Implementación de características como envoltura de regalo y tarjetas de felicitación (usando el patrón Decorator).

- **Ciclo de Vida de un Pedido**:
  - Los pedidos pueden cambiar de estado: "pendiente", "en proceso", "enviado" y "entregado". Cada estado es responsable de gestionar las transiciones y realizar acciones específicas.

### Clases Implementadas

- **BasicUser**: Representa a un usuario básico del sistema, con funcionalidad para acceder a su nombre y gestionar pedidos.

- **UserType**: Define los permisos de un usuario normal, que no puede cambiar el estado de los pedidos.

- **AdminType**: Permite a los administradores cambiar el estado de los pedidos, reflejando sus permisos especiales.

- **Pedido**: Clase que gestiona la información del pedido y su estado actual.

- **NotPermissionException**: Excepción lanzada cuando un usuario no tiene permiso para realizar una acción.

- **StateOrder**: Enum que define los posibles estados de un pedido.

### Patrones de Diseño

- **Observer**: Para notificaciones sobre el estado de los pedidos.
- **Decorator**: Para la personalización de pedidos.
- **Composite**: Para estructurar productos y packs.
- **State**: Para gestionar el ciclo de vida de un pedido.

### Descripción de Clases y Responsabilidades

- **BasicUser**: Proporciona métodos para gestionar el nombre del usuario y el estado de los pedidos.

- **UserType**: Implementa restricciones para los usuarios normales.

- **AdminType**: Permite a los administradores realizar acciones sobre los pedidos que no son permitidas para usuarios normales.

- **Pedido**: Contiene información sobre los productos, el estado del pedido y métodos para cambiar su estado.

- **NotPermissionException**: Maneja las situaciones en que un usuario intenta realizar una acción no permitida.

- **StateOrder**: Enum que ayuda a gestionar los estados de los pedidos.

---

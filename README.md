# Sistema de Gestión de Pedidos para Tienda en Línea

## Ejercicio 1 de Patrones

### A) Descripción del Proyecto

Se deberá desarrollar un sistema de gestión de pedidos para una tienda en línea. El sistema debe permitir a los usuarios realizar pedidos de productos y a los administradores gestionar esos pedidos. El sistema debe ser flexible y permitir la personalización de los pedidos según las preferencias del usuario. Además, se debe implementar un mecanismo para notificar a los usuarios sobre el estado de sus pedidos.

### Requisitos Específicos

Los requisitos específicos son los siguientes:

- Implementa una clase `Pedido` que represente un pedido en el sistema. Esta clase debe contener información sobre los productos incluidos en el pedido, el estado actual del pedido y cualquier otra información relevante. Sobre los productos sabemos que bien pueden ser productos básicos o packs que se componen de otros productos básicos o bien, otros packs. De un pedido se debe saber poder cuánto cuesta. Además, debe saber responder en qué momento fue entregado, agregarle o quitarles productos, cambiar el medio de pago, ver el nombre del repartidor, etc. Ojo, ver ciclo de vida del pedido.

- Implementa un conjunto de clases que permitan personalizar los pedidos. Por ejemplo, podrías poder añadir envoltura de regalo, tarjeta de felicitación, etc. Estos modificadores de pedidos podrían combinarse de manera flexible para crear pedidos personalizados.

- Además, para gestionar el ciclo de vida de un pedido, el cual puede cambiar de "pendiente", "en proceso", "enviado" y "entregado". Cada estado debe ser responsable de gestionar las transiciones entre estados y realizar acciones específicas según el estado actual del pedido. Por ejemplo: Implementa un mecanismo que permita notificar a los usuarios sobre el estado de sus pedidos.

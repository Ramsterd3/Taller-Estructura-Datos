package Ejercicio_7;

import java.util.LinkedList;

public class BancoAtencion {
    private LinkedList<String> colaClientes = new LinkedList<>();

    // Agregar cliente de forma normal (al final de la cola)
    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    // Agregar cliente urgente (al inicio de la cola)
    public void agregarClienteUrgente(String cliente) {
        colaClientes.addFirst(cliente);
        System.out.println("Cliente urgente agregado: " + cliente);
    }

    // Atender al primer cliente en la cola
    
    public String atenderCliente() {
        if (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.removeFirst();
            System.out.println("Atendiendo a: " + clienteAtendido);
            return clienteAtendido;
        } else {
            System.out.println("No hay clientes en la cola.");
            return null;
        }
    }

    // Mostrar el estado actual de la cola
    
    public void mostrarCola() {
        System.out.println("Clientes en espera: " + colaClientes);
    }

    public static void main(String[] args) {
        BancoAtencion banco = new BancoAtencion();

        // Agregar clientes de forma normal
        banco.agregarCliente("Cliente A");
        banco.agregarCliente("Cliente B");
        banco.agregarCliente("Cliente C");

        banco.mostrarCola();

        // Agregar un cliente urgente
        banco.agregarClienteUrgente("Cliente Urgente X");
        banco.mostrarCola();

        // Atender clientes
        banco.atenderCliente();
        banco.mostrarCola();
    }
}

package Ejercicio_7;

import java.util.LinkedList;

public class BancoAtencion {
    private LinkedList<String> colaClientes = new LinkedList<>();

    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
        System.out.println("Cliente agregado: " + cliente);
    }

    public void agregarClienteUrgente(String cliente) {
        colaClientes.addFirst(cliente);
        System.out.println("Cliente urgente agregado: " + cliente);
    }

    
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

    
    public void mostrarCola() {
        System.out.println("Clientes en espera: " + colaClientes);
    }

    public static void main(String[] args) {
        BancoAtencion banco = new BancoAtencion();

        banco.agregarCliente("Cliente A");
        banco.agregarCliente("Cliente B");
        banco.agregarCliente("Cliente C");

        banco.mostrarCola();

        banco.agregarClienteUrgente("Cliente Urgente X");
        banco.mostrarCola();

        banco.atenderCliente();
        banco.mostrarCola();
    }
}

package Ejercicio_13;

import java.util.PriorityQueue;
import java.util.Queue;

public class GestionPacientes {
    private Queue<Paciente> colaPacientes;

    public GestionPacientes() {
        this.colaPacientes = new PriorityQueue<>();
    }

    public void agregarPaciente(String nombre, int prioridad) {
        colaPacientes.add(new Paciente(nombre, prioridad));
    }

    public Paciente atenderPaciente() {
        return colaPacientes.poll(); // Atiende al paciente con mayor prioridad
    }

    public void mostrarPacientes() {
        System.out.println("Pacientes en espera:");
        for (Paciente p : colaPacientes) {
            System.out.println(p);
        }
    }
}

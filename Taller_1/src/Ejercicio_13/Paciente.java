package Ejercicio_13;

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int prioridad; // Entre menor el número, mayor la urgencia

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Prioridad: " + prioridad;
    }
}
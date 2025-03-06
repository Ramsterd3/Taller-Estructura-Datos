package Ejercicio_4;

import java.util.PriorityQueue;

class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Ordenamos de tal manera que las tareas con mayor prioridad (valor mayor) sean atendidas primero
    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(otra.prioridad, this.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + ", Prioridad: " + prioridad;
    }
}

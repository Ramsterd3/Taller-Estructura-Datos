package Ejercicio_4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        colaTareas.add(new Tarea("Revisar correos", 2));
        colaTareas.add(new Tarea("Preparar presentación", 5));
        colaTareas.add(new Tarea("Llamar a cliente", 3));

        while (!colaTareas.isEmpty()) {
            Tarea tareaActual = colaTareas.poll();
            System.out.println("Atendiendo: " + tareaActual);
        }
    }
}

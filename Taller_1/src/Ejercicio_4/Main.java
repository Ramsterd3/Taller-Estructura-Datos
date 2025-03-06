package Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        // Agregar algunas tareas a la cola
        colaTareas.add(new Tarea("Revisar correos", 2));
        colaTareas.add(new Tarea("Preparar presentación", 5));
        colaTareas.add(new Tarea("Llamar a cliente", 3));

        // Procesar la cola de tareas
        while (!colaTareas.isEmpty()) {
            Tarea tareaActual = colaTareas.poll(); // Extrae y remueve la tarea de mayor prioridad
            System.out.println("Atendiendo: " + tareaActual);
        }
    }
}

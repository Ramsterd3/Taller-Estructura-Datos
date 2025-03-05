package Ejercicio_12;

import java.util.*;

public class Universidad {
    public static void main(String[] args) {
        // Crear un TreeSet para almacenar los nombres de los estudiantes
        TreeSet<String> estudiantes = new TreeSet<>();

        // Agregar algunos nombres al TreeSet
        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Maria");
        estudiantes.add("Javier");
        estudiantes.add("Lucia");

        // Mostrar todos los nombres ordenados alfabéticamente
        System.out.println("Lista de estudiantes ordenados alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Obtener el primer y último nombre de la lista
        String primerEstudiante = estudiantes.first();
        String ultimoEstudiante = estudiantes.last();

        // Mostrar el primer y último nombre
        System.out.println("\nPrimer estudiante: " + primerEstudiante);
        System.out.println("Último estudiante: " + ultimoEstudiante);
    }
}

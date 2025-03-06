package Ejercicio_12;

import java.util.*;

public class Universidad {
    public static void main(String[] args) {
        TreeSet<String> estudiantes = new TreeSet<>();

        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Maria");
        estudiantes.add("Javier");
        estudiantes.add("Lucia");

        System.out.println("Lista de estudiantes ordenados alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        String primerEstudiante = estudiantes.first();
        String ultimoEstudiante = estudiantes.last();

        System.out.println("\nPrimer estudiante: " + primerEstudiante);
        System.out.println("Último estudiante: " + ultimoEstudiante);
    }
}

package Ejercicio_15;

import java.util.HashMap;
import java.util.Scanner;

public class Directorio {

    public static void main(String[] args) {
        // Crear un HashMap para almacenar los nombres y números telefónicos
        HashMap<String, String> directorio = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Menú interactivo
        while (true) {
            System.out.println("===== Directorio Telefónico =====");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar un contacto
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el número telefónico: ");
                    String telefono = scanner.nextLine();
                    directorio.put(nombre, telefono);
                    System.out.println("Contacto agregado.");
                    break;
                case 2:
                    // Buscar un contacto
                    System.out.print("Introduce el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    if (directorio.containsKey(nombreBuscar)) {
                        System.out.println("Número telefónico de " + nombreBuscar + ": " + directorio.get(nombreBuscar));
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    // Mostrar todos los contactos
                    System.out.println("=== Todos los contactos ===");
                    for (String key : directorio.keySet()) {
                        System.out.println("Nombre: " + key + ", Teléfono: " + directorio.get(key));
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
            }
        }
    }
}

package Ejercicio_15;

public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        directorio.agregarContacto("Juan", "123456789");
        directorio.agregarContacto("María", "987654321");
        directorio.agregarContacto("Carlos", "555666777");

        directorio.mostrarContactos();
        System.out.println("Número de Juan: " + directorio.buscarContacto("Juan"));
        System.out.println("Número de Ana: " + directorio.buscarContacto("Ana")); // No existe
    }
}
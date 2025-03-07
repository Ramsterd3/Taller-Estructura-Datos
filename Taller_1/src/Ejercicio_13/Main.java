package Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        GestionPacientes gestion = new GestionPacientes();

        gestion.agregarPaciente("Juan", 3);
        gestion.agregarPaciente("María", 1);
        gestion.agregarPaciente("Carlos", 2);

        System.out.println("Atendiendo a: " + gestion.atenderPaciente());
        System.out.println("Atendiendo a: " + gestion.atenderPaciente());
        System.out.println("Atendiendo a: " + gestion.atenderPaciente());
    }
}

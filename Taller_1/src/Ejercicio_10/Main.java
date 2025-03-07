package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();

        control.registrarEmpleado("EMP123");
        control.registrarEmpleado("EMP456");
        control.registrarEmpleado("EMP789");

        System.out.println("¿Acceso permitido para EMP123? " + control.verificarAcceso("EMP123"));
        System.out.println("¿Acceso permitido para EMP999? " + control.verificarAcceso("EMP999"));

        control.mostrarEmpleadosAutorizados();
    }
}

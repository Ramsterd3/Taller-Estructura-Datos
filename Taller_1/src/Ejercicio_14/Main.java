package Ejercicio_14;

public class Main {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        for (int i = 1; i <= 12; i++) {
            historial.enviarMensaje("Mensaje " + i);
        }

        historial.mostrarHistorial();
    }
}

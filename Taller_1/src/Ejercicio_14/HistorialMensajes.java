package Ejercicio_14;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {
    private Deque<String> historial;
    private static final int LIMITE = 10;

    public HistorialMensajes() {
        this.historial = new ArrayDeque<>();
    }

    public void enviarMensaje(String mensaje) {
        if (historial.size() == LIMITE) {
            historial.removeFirst(); // Elimina el mensaje más antiguo si se supera el límite
        }
        historial.addLast(mensaje);
    }

    public void mostrarHistorial() {
        System.out.println("Últimos mensajes enviados:");
        for (String mensaje : historial) {
            System.out.println(mensaje);
        }
    }
}
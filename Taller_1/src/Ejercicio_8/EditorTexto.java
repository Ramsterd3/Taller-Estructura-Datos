package Ejercicio_8;
import java.util.Vector;

public class EditorTexto {
    private Vector<String> historial;
    private String contenidoActual;

    public EditorTexto() {
        this.historial = new Vector<>();
        this.contenidoActual = "";
    }

    public void escribir(String nuevoTexto) {
        historial.add(contenidoActual); // Guardar el estado actual antes del cambio
        contenidoActual = nuevoTexto;
    }

    public void deshacer() {
        if (!historial.isEmpty()) {
            contenidoActual = historial.remove(historial.size() - 1); // Recuperar el último estado guardado
        } else {
            contenidoActual = ""; // Si no hay historial, dejar en blanco
        }
    }

    public String getContenido() {
        return contenidoActual;
    }
}


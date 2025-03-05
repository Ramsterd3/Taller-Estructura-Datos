package Ejercicio_17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<LocalDate, String> eventos;

    public AgendaEventos() {
        this.eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDate fecha, String descripcion) {
        eventos.put(fecha, descripcion);
    }

    public void mostrarEventos() {
        System.out.println("Eventos programados:");
        for (Map.Entry<LocalDate, String> evento : eventos.entrySet()) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }
    }

    public String obtenerProximoEvento() {
        return eventos.isEmpty() ? "No hay eventos programados" : eventos.firstEntry().getKey() + " - " + eventos.firstEntry().getValue();
    }
}
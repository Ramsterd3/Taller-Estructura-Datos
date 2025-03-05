package Ejercicio_17;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.agregarEvento(LocalDate.of(2025, 3, 10), "Reunión de proyecto");
        agenda.agregarEvento(LocalDate.of(2025, 3, 15), "Entrega de informe");
        agenda.agregarEvento(LocalDate.of(2025, 3, 5), "Conferencia de tecnología");

        agenda.mostrarEventos();
        System.out.println("Próximo evento: " + agenda.obtenerProximoEvento());
    }
}

package Ejercicio_15;
import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    private Map<String, String> contactos;

    public DirectorioTelefonico() {
        this.contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public String buscarContacto(String nombre) {
        return contactos.getOrDefault(nombre, "Contacto no encontrado");
    }

    public void mostrarContactos() {
        System.out.println("Directorio Telefónico:");
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println(contacto.getKey() + ": " + contacto.getValue());
        }
    }
}


package Ejercicio_11;
import java.util.LinkedHashSet;
import java.util.Set;

public class FavoritosMusica {
    private Set<String> cancionesFavoritas;

    public FavoritosMusica() {
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    public boolean agregarCancion(String cancion) {
        return cancionesFavoritas.add(cancion);
    }

    public boolean eliminarCancion(String cancion) {
        return cancionesFavoritas.remove(cancion);
    }

    public void mostrarFavoritos() {
        System.out.println("Canciones favoritas: " + cancionesFavoritas);
    }
}

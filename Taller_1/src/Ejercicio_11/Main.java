package Ejercicio_11;
public class Main {
    public static void main(String[] args) {
        FavoritosMusica favoritos = new FavoritosMusica();

        favoritos.agregarCancion("Bohemian Rhapsody");
        favoritos.agregarCancion("Stairway to Heaven");
        favoritos.agregarCancion("Imagine");
        favoritos.agregarCancion("Bohemian Rhapsody");

        favoritos.mostrarFavoritos();

        favoritos.eliminarCancion("Imagine");
        favoritos.mostrarFavoritos();
    }
}
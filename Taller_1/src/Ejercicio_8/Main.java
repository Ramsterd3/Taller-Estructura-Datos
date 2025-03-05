package Ejercicio_8;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        editor.escribir("Hola Mundo");
        System.out.println("Contenido: " + editor.getContenido());

        editor.escribir("Hola ChatGPT");
        System.out.println("Contenido: " + editor.getContenido());

        editor.deshacer();
        System.out.println("Después de deshacer: " + editor.getContenido());

        editor.deshacer();
        System.out.println("Después de deshacer: " + editor.getContenido());
    }
}
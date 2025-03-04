package Ejercicio_9;

import java.util.Stack;

public class PaginaWebStack {
    
    private Stack<String> historial;
    
    public PaginaWebStack() {
        // Inicializamos la pila que guardará las URLs visitadas
        historial = new Stack<>();
    }
    
    // Método para visitar una nueva página
    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visita a la página: " + url);
    }
    
    // Método para retroceder a la página anterior
    public void retroceder() {
        if (!historial.isEmpty()) {
            // Elimina la última página visitada y muestra la página anterior
            String paginaAnteriror = historial.pop();
            System.out.println("Retrocediendo a la página: " + paginaAnteriror);
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
    }
    
    // Método principal para simular la navegación web
    public static void main(String[] args) {
        PaginaWebStack navegador = new PaginaWebStack();
        
        
        navegador.visitarPagina("www.google.com");
        navegador.visitarPagina("www.facebook.com");
        navegador.visitarPagina("www.youtube.com");
        
     
        navegador.retroceder(); // Debería retroceder a youtube.com
        navegador.retroceder(); // Debería retroceder a facebook.com
        navegador.retroceder(); // Debería retroceder a google.com
        navegador.retroceder(); // No hay más páginas para retroceder
    }
}

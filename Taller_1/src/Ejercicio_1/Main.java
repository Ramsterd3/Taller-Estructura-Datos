package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        empresa.agregarProducto(101, "Laptop", 3500.0);
        empresa.agregarProducto(102, "Teclado", 150.0);
        empresa.agregarProducto(103, "Mouse", 80.0);
        
        empresa.mostrarProductos();

        // Buscar un producto
        Producto encontrado = empresa.buscarProducto(102);
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

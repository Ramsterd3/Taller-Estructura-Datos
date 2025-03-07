package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarProducto(101, "Laptop", 1500.00);
        empresa.agregarProducto(102, "Mouse", 25.50);
        empresa.agregarProducto(103, "Teclado", 45.99);

        System.out.println("Lista de productos:");
        empresa.mostrarProductos();

        System.out.println("\nBuscando producto con código 102:");
        Producto encontrado = empresa.buscarProducto(102);
        System.out.println(encontrado != null ? encontrado : "Producto no encontrado");
    }
}
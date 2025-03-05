package Ejercicio_6;

import java.util.Scanner;
public class Tienda {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        
        while (true) {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Listar Inventario por Orden Alfabético");
            System.out.println("5. Listar Inventario por Precio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    // Agregar un producto
                    System.out.print("Ingrese el código del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer
                    Producto producto = new Producto(codigo, nombre, precio);
                    inventario.agregarProducto(producto);
                    System.out.println("Producto agregado exitosamente.");
                    break;
                
                case 2:
                    // Eliminar un producto
                    System.out.print("Ingrese el código del producto a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    inventario.eliminarProducto(codigoEliminar);
                    break;

                case 3:
                    // Buscar un producto
                    System.out.print("Ingrese el código del producto a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Producto encontrado = inventario.buscarProducto(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    // Listar inventario en orden alfabético
                    inventario.listarAlfabeticamente();
                    break;

                case 5:
                    // Listar inventario por precio
                    inventario.listarPorPrecio();
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    return;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }


}

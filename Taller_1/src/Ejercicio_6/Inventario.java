package Ejercicio_6;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
	private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto agotado
    public void eliminarProducto(String codigo) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove();
                System.out.println("Producto con código " + codigo + " ha sido eliminado.");
                return;
            }
        }
        System.out.println("Producto con código " + codigo + " no encontrado.");
    }

    // Método para buscar un producto por su código
    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;  // Si no se encuentra el producto
    }

    // Método para listar los productos en orden alfabético
    public void listarAlfabeticamente() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        mostrarInventario();
    }

    // Método para listar los productos por precio
    public void listarPorPrecio() {
        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p1.getPrecio(), p2.getPrecio());
            }
        });
        mostrarInventario();
    }

    // Método para mostrar todo el inventario
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

}

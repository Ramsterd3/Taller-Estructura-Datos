package Ejercicio_16;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroCompras {
    private Map<String, Double> productos;

    public RegistroCompras() {
        this.productos = new LinkedHashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }

    public double calcularTotal() {
        double total = 0;
        for (double precio : productos.values()) {
            total += precio;
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura de compra:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

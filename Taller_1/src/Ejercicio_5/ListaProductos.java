package Ejercicio_5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListaProductos {
    public static void main(String[] args) {
        Map<Integer, String> productosHashMap = new HashMap<>();
        productosHashMap.put(3, "Teclado");
        productosHashMap.put(1, "Monitor");
        productosHashMap.put(2, "Mouse");

        Map<Integer, String> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put(3, "Teclado");
        productosLinkedHashMap.put(1, "Monitor");
        productosLinkedHashMap.put(2, "Mouse");

        Map<Integer, String> productosTreeMap = new TreeMap<>();
        productosTreeMap.put(3, "Teclado");
        productosTreeMap.put(1, "Monitor");
        productosTreeMap.put(2, "Mouse");

        System.out.println("HashMap (Sin orden específico): " + productosHashMap);
        System.out.println("LinkedHashMap (Orden de inserción): " + productosLinkedHashMap);
        System.out.println("TreeMap (Ordenado por clave): " + productosTreeMap);
    }
}


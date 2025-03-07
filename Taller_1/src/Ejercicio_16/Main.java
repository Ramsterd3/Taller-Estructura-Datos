package Ejercicio_16;

public class Main {
    public static void main(String[] args) {
        RegistroCompras registro = new RegistroCompras();

        registro.agregarProducto("Pan", 1.50);
        registro.agregarProducto("Leche", 2.00);
        registro.agregarProducto("Huevos", 3.20);

        registro.mostrarFactura();
    }
}

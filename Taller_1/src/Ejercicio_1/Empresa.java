package Ejercicio_1;

class Empresa {
    private TreeSet<Producto> productos = new TreeSet<>();

    public void agregarProducto(int codigo, String nombre, double precio) {
        productos.add(new Producto(codigo, nombre, precio));
    }

    public Producto buscarProducto(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null; // Retorna null si no se encuentra el producto
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

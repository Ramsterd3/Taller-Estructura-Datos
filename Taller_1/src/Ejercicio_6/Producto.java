package Ejercicio_6;

public class Producto {
	
	String Nombre;
	String Codigo;
	Double Precio;

	public Producto(String nombre, String codigo, Double precio) {
		Nombre = nombre;
		Codigo = codigo;
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + "]";
	}
}


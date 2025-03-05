package Ejercicio_3;

import java.util.HashSet;
import java.util.Iterator;

public class NoDuplicados {

	public static void main(String[] args) {
		 HashSet<String> listaSinDuplicados = new HashSet<>();

	        listaSinDuplicados.add("Manzana");
	        listaSinDuplicados.add("Plátano");
	        listaSinDuplicados.add("Cereza");
	        listaSinDuplicados.add("Papa");
	        listaSinDuplicados.add("Piña");
	        listaSinDuplicados.add("Lulo");
	        listaSinDuplicados.add("Limon");
	        listaSinDuplicados.add("Manzana"); // Este duplicado no será agregado

	        // Obtener un iterador para la lista
	        Iterator<String> iterador = listaSinDuplicados.iterator();

	        // Imprimir el contenido de la lista utilizando el iterador
	        System.out.println("Contenido de la lista sin duplicados:");
	        while (iterador.hasNext()) {
	            System.out.println(iterador.next());
	        }
	    }

	}
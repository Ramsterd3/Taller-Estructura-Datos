package Ejercicio_10;

import java.util.HashSet;
import java.util.Set;

public class ControlAcceso {
    private Set<String> empleadosAutorizados;

    public ControlAcceso() {
        this.empleadosAutorizados = new HashSet<>();
    }

    public void registrarEmpleado(String idEmpleado) {
        empleadosAutorizados.add(idEmpleado);
    }

    public boolean verificarAcceso(String idEmpleado) {
        return empleadosAutorizados.contains(idEmpleado);
    }

    public void mostrarEmpleadosAutorizados() {
        System.out.println("Empleados autorizados:");
        for (String id : empleadosAutorizados) {
            System.out.println(id);
        }
    }
}


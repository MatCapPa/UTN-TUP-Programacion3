package modelos;

import java.util.ArrayList;
import java.util.List;

public class BaseEmpleados {
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}

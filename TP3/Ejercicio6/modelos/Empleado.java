package modelos;
import java.time.LocalDate;

public abstract class Empleado {
    //id, nombre y apellido, edad, fecha de ingreso y sueldo

    public abstract String getID();
    public abstract String getNombre();
    public abstract String getApellido();
    public abstract int getEdad();
    public abstract LocalDate getFechaIngreso();
    public abstract double getSueldo();
    public abstract String detalles();
    public abstract String getTipo();

}

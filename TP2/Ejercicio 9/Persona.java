
public class Persona {
    private String nombre,dni,domicilio,fecha_ingreso,empleado;
    private double sueldo;
    private String jornada_laboral;
    private double ventas_mesuales;
    private int repartos_extra;
    public Persona(String nombre,String dni,String domicilio,String fecha_ingreso,String empleado,double sueldo,String jornada_laboral,double ventas_mesuales,int repartos_extra){
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fecha_ingreso = fecha_ingreso;
        this.empleado = empleado;
        this.sueldo = sueldo;
        this.jornada_laboral = jornada_laboral;
        this.ventas_mesuales = ventas_mesuales;
        this.repartos_extra = repartos_extra;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getFecha_ingreso(){
        return this.fecha_ingreso;
    }
    public String getEmpleado(){
        return this.empleado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public void setEmpleado(String empleado){
        this.empleado = empleado;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public String getJornada_laboral(){
        return this.jornada_laboral;
    }
    public double getVentas_mesuales(){
        return this.ventas_mesuales;
    }
    public int getRepartos_extra(){
        return this.repartos_extra;
    }
    public void setJornada_laboral(String jornada_laboral){
        this.jornada_laboral = jornada_laboral;
    }
    public void setVentas_mesuales(double ventas_mesuales){
        this.ventas_mesuales = ventas_mesuales;
    }
    public void setRepartos_extra(int repartos_extra){
        this.repartos_extra = repartos_extra;
    }
}

package modelos.empleados;

import java.time.LocalDate;

import modelos.Empleado;
public class Vendedor extends Empleado{
    private int edad;
    private String id,tipo;
    private String nombre,apellido;
    private LocalDate fechaIngreso;
    private double sueldo;

    public Vendedor(String tipo, String nombre,String id, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        this.tipo = tipo;
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
    public String getTipo() {
        return tipo;
    }
    public String getID() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String detalles(){
        return "ID: "+getID()+"\n"+"Nombre: "+getNombre()+" "+getApellido()+"\n"+"Edad: "+getEdad()+"\n"+"Fecha de Ingreso: "+getFechaIngreso()+"\n"+"Sueldo: "+getSueldo();
    }
}

public class Paciente {
    private String nombre,apellido;
    private int dni;
    private boolean necesitaInternacion;

    public String getNombre() {
        return nombre;
    }
    public Paciente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public String getApellido() {
        return apellido;
    }
    public Paciente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public int getDni() {
        return dni;
    }
    public Paciente setDni(int dni) {
        this.dni = dni;
        return this;
    }
    public boolean isNecesitaInternacion() {
        return necesitaInternacion;
    }
    public Paciente setNecesitaInternacion(boolean necesitaInternacion) {
        this.necesitaInternacion = necesitaInternacion;
        return this;
    }
}

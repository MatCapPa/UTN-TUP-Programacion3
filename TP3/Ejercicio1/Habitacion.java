import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int cantCamas = 10;
    private boolean habitacionCompleta;
    private List<Paciente> pacientes = new ArrayList<>();

   /*  public int getCantCamas() {
        return cantCamas;
    }
    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }
    public void sethabitacionCompleta(boolean habitacionCompleta) {
        this.habitacionCompleta = habitacionCompleta;
    }
    */
    public boolean ishabitacionCompleta() {
        return habitacionCompleta;
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public String mostrarPacientes() {
        String lista ="";
        for (Paciente paciente : this.pacientes) {
            lista= lista + paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getDni() + " " + paciente.isNecesitaInternacion() + "\n";
            
        }
        return lista;
    }
}

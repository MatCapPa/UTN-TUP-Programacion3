import java.util.Scanner;

public class PacienteInput {
    Scanner entrada = new Scanner(System.in);
    
    public Paciente internarPaciente(){
        
        Paciente paciente = new Paciente();
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = entrada.next();
        System.out.println("Ingrese el dni del paciente: ");
        int dni = entrada.nextInt();
        System.out.println("Paciente necesita internacion? "); // agregar validaciones
        boolean internacion = entrada.nextBoolean();
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setDni(dni);
        paciente.setNecesitaInternacion(internacion);
        return paciente;
    }
    public void darDeAltaPaciente(Habitacion habitacion){
        System.out.println("Ingrese el dni del paciente a eliminar: ");
        int dni2 = entrada.nextInt();
        for (Paciente paciente : habitacion.getPacientes()) {
            if (paciente.getDni() == dni2) {
                habitacion.getPacientes().remove(paciente);
            }
        }               
    }
}


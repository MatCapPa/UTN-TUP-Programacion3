import java.util.Scanner;

public class MenuInput {
    PacienteInput pacienteInput = new PacienteInput();
    Scanner entrada = new Scanner(System.in);
    boolean repetir = true;
    public void Menu(Habitacion habitacion) {
        while(repetir){
            System.out.println("Elija una de las siguientes opciones: ");
            System.err.println("1. Ingresar paciente.");
            System.out.println("2. Eliminar paciente.");
            System.out.println("3. Salir.");

            int opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    Paciente p = pacienteInput.internarPaciente();
                    habitacion.getPacientes().add(p);
                    System.out.println(habitacion.mostrarPacientes());
                    
                    break;
                case 2:
                    pacienteInput.darDeAltaPaciente(habitacion);
                    System.out.println(habitacion.mostrarPacientes());
                    break;
                case 3:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");  
            }          
        }
        entrada.close();
    }
    
}

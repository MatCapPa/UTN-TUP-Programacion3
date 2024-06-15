
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un auto");
        System.out.println("Ingrese la patente");
        String patente = entrada.nextLine();
        System.out.println("Ingrese la marca");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo");
        int modelo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el cilindraje");
        String cilindraje = entrada.nextLine();
        System.out.println("Ingrese el nro de motor");
        int nroMotor = entrada.nextInt();
        System.out.println("Ingrese el kilometraje");
        double kilometraje = entrada.nextDouble();

        Auto auto = new Auto(marca, patente, modelo, new Motor(cilindraje, nroMotor, kilometraje));
        System.out.println(auto.toString());
        entrada.close();
    }
}

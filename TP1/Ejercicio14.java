/*14- Realizar un programa en Java que luego de introducir dos números enteros A y B por teclado, muestre los
números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se
debe poder volver a introducir valores A y B nuevos. */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = entrada.nextInt();
        entrada.close();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("El primer valor debe ser menor al segundo");
        }
    }
}

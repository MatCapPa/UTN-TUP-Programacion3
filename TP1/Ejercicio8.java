/*8- Realizar un programa que lea un carácter por teclado y compruebe si es una letra mayúscula. */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        char caracter = entrada.nextLine().charAt(0);
        
        if (Character.isUpperCase(caracter)) {
            System.out.println("El carácter ingresado es una letra mayúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra mayúscula.");
        }
        entrada.close();
    }
}
/*7- Realizar un programa Java que lea un número entero por teclado y calcule si es par o impar. Podemos saber
si un número es par cuando el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es
impar. El operador Java que calcula el resto de la división entre dos números enteros o no es el operador % 2 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        entrada.close();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}

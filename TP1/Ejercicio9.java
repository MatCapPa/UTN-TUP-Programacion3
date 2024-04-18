/*9- Realizar un programa que lea tres valores enteros. Estos valores representarán los lados de un triángulo,
ergo, lados {a, b, c}. Mostrar si efectivamente pueden los valores {a, b, c } pueden formar un triángulo.
10- Modificar el programa de arriba para que, en caso que los lados { a, b, c } puedan formar un
triángulo, indicar de qué tipo es: escaleno, isósceles o equilátero. */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 numeros");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt(), b = entrada.nextInt(), c = entrada.nextInt();
        //System.out.println(a + " " + b + " " + c);
        entrada.close();
        if (a >0 && b >0 && c >0) {
            System.out.println("Los valores ingresados pueden formar un triángulo");
            if (a == b && b == c) {
                System.out.println("Se puede formar un triángulo equilatero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Se puede formar un triángulo isoceles");
            }else {
                System.out.println("Se puede formar un triángulo escaleno");
            }
        } else {
            System.out.println("Los valores ingresados no pueden formar un triángulo");
        }     
    }
}

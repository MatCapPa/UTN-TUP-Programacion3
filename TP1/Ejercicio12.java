/*12- Calcular el factorial de un número ingresado por el usuario.Sentencia For */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese un numero para calcular su factorial: ");
        Scanner entrada = new Scanner(System.in);
        int factorial_de_x = 1;
        int x = entrada.nextInt();
        entrada.close();
        for(int i=1;i<=x;i++){
            factorial_de_x = factorial_de_x * i;
        }
        
        System.out.println(factorial_de_x);
    }
}

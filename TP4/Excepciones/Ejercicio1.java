package Excepciones;
import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Introduce un numero para calcular su factorial: ");
            
            try {
                System.out.println("Resultado: " + calcular_factorial(entrada.nextLong())+"\n");
            } catch (FactorialException e) {
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Ingrese '1' para terminar el programa. Sino, ingrese cualquier numero: ");
                long x = entrada.nextLong();
                if (x == 1) {  
                    repetir = false;
                }
            }
        }
        entrada.close();
        
    }

    private static long calcular_factorial(long x) throws FactorialException{
        if (x < 0) {
            throw new FactorialException("ERROR.No se puede calcular el factorial de un numero negativo");
        }
        if (x > 12) {
            throw new FactorialException("ERROR.No se puede calcular el factorial de un numero mayor que 12");
        }
        long factorial = 1;
        for(int i=1;i<=x;i++){
            factorial *=  i;
        }
        return factorial;
    }
}
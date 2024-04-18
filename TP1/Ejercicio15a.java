/*15- Leer números enteros por teclado y para cada número introducido indique si es positivo o negativo y si es
par o impar:
a. En la primera versión se utilizará un bucle while. La lectura de números finalizará cuando se
introduzca un cero.*/
import java.util.Scanner;
public class Ejercicio15a {
    public static void main(String[] args) {
        boolean bandera = true;
        String mensaje,par_impar,positivo_negativo="";
        Scanner entrada = new Scanner(System.in);
        while (bandera) {
            System.out.println("Ingrese un numero(Ingrese '0' para terminar): ");
            int numero = entrada.nextInt();
            if (numero > 0){
                positivo_negativo = "El numero es positivo";
                //System.out.println("El numero es positivo");
            }else if (numero<0){
                positivo_negativo = "El numero es negativo";
                //System.out.println("El numero es negativo");
            }else{
                bandera = false;
            }
            if (numero % 2 == 0){
                par_impar = "el numero es par";
            }else{
                par_impar = "el numero es impar";
            }
            mensaje = positivo_negativo + " y " + par_impar;
            System.out.println(mensaje);
        }
        entrada.close();
        System.out.println("Termino la cadena while");
        
    }
}

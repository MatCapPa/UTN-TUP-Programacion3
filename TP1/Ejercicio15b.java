/*15- Leer números enteros por teclado y para cada número introducido indique si es positivo o negativo y si es
par o impar
b.En la segunda versión se utilizará un bucle do .. while. La lectura de números en esta
versión también finaliza cuando se introduzca un cero.*/
import java.util.Scanner;
public class Ejercicio15b {
    public static void main(String[] args) {
        int x=1;
        String mensaje,par_impar,positivo_negativo="";
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero(Ingrese '0' para terminar): ");
            int numero = entrada.nextInt();
            if (numero > 0){
                positivo_negativo = "El numero es positivo";
                
            }else if (numero<0){
                positivo_negativo = "El numero es negativo";
                
            }else{
                x=0;
            }
            if (numero % 2 == 0){
                par_impar = "el numero es par";
            }else{
                par_impar = "el numero es impar";
            }
            mensaje = positivo_negativo + " y " + par_impar;
            System.out.println(mensaje);
        }while(x!=0);
        entrada.close();
        System.out.println("Termino la cadena do-while");
    }
}

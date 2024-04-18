/*15- Leer números enteros por teclado y para cada número introducido indique si es positivo o negativo y si es
par o impar:
c. En la tercera versión también se utilizará un bucle do .. while pero en este caso la lectura
de números finaliza cuando se responda ‘N’ ó ‘n’ a la pregunta “Desea introducir más
números? (S/N):” */
import java.util.Scanner;
public class Ejercicio15c {
    public static void main(String[] args) {
        boolean bandera = true;
        String mensaje,par_impar,positivo_negativo="";
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero(Ingrese '0' para terminar): ");
            int numero = entrada.nextInt();
            if (numero >= 0){
                positivo_negativo = "El numero es positivo";
                
            }else{
                positivo_negativo = "El numero es negativo";
            }
            if (numero % 2 == 0){
                par_impar = "el numero es par";
            }else{
                par_impar = "el numero es impar";
            }
            mensaje = positivo_negativo + " y " + par_impar;
            System.out.println(mensaje);
           // se tiene que poder la letra al lado del numero ingresado para que siga el bucle. 
           //Ejemplos: -5 s
           //-6 S
           //44 n  ----------> esto terminara la cadena do-while.
            System.out.println("¿Desea introducir mas numeros? (S/N):");
            char respuesta = entrada.nextLine().charAt(15 );
            if (respuesta == 'N' || respuesta == 'n'){
                bandera = false;
            }    
        }while(bandera!=false);
        entrada.close();
        System.out.println("Termino la cadena do-while");
    }
    
}

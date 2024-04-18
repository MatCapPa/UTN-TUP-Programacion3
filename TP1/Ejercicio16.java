/*16- Implementar un programa Java que convierta millas a kilómetros. El programa pide que se introduzca una
cantidad de millas y calculará su equivalente en Kilómetros. Se debe mostrar en pantalla el siguiente resultado “El
equivalente a N millas son N Kilómetros”. El proceso se repite hasta que se introduzca un 0 como valor
para las millas. 
NOTA: 1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.*/
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double millas, kilo;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la cantidad de millas(ingrese '0' para terminar el programa): ");
            millas = entrada.nextDouble();
            kilo = millas * 1.6093;
            String resultado = String.format("%.2f", kilo);
            System.out.println("El equivalente en kilometros es: " + resultado+ " km");
            if (millas == 0) {
                bandera = false;
            }
        }
        entrada.close();
        System.out.println("Termino la cadena while");
    }
}

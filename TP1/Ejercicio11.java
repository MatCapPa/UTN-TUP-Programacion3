/*11- Crear un programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while. */
public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        int x = 100;
        do{
            System.out.println(x);
            x = x-1;
            
        }while(x!=0);
        System.out.println("Termino la cadena do-while");
    }
}

/*17- Considere el siguiente programa java, declara un int llamado day cuyo valor representa un día (1-7). El
código muestra el nombre del día, basado en el valor del día, usando la declaración switch. */

import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt(7)+1;
        //System.out.println(day);
        switch (day) {
            case 1:
                System.out.println("Lunes");;
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        
    }
}
    


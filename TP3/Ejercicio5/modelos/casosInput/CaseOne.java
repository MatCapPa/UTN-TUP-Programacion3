package modelos.casosInput;
import java.util.Scanner;

import modelos.Circle;
import modelos.Rectangle;
import modelos.ShapeList;
import modelos.Triangle;

public class CaseOne {
    public void MenuOpcion1(ShapeList figuras) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;
        while(repetir) {
            System.out.println("1. Crear un circulo");
            System.out.println("2. Crear un rectangulo");
            System.out.println("3. Crear un triangulo");
            System.out.println("4. Regresar");
            int opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el radio del Circulo: ");
                    double radio = entrada.nextDouble();
                    figuras.addShape(new Circle(radio));
                    break;
                case 2:
                    System.out.println("Ingrese la base del Rectangulo: ");
                    double base = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Rectangulo: ");
                    double altura = entrada.nextDouble();
                    figuras.addShape(new Rectangle(base, altura));
                    break;
                case 3:
                    System.out.println("Ingrese la base del Triangulo: ");
                    double base2 = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo: ");
                    double altura2 = entrada.nextDouble();
                    figuras.addShape(new Triangle(base2, altura2));
                    break;
                case 4:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}

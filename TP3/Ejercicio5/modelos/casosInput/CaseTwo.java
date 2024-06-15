package modelos.casosInput;
import java.util.Scanner;

import modelos.Circle;
import modelos.Rectangle;
import modelos.ShapeList;
import modelos.Triangle;

public class CaseTwo {
    
    public void MenuOpcion2(ShapeList figuras) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;
        while(repetir) {
            System.out.println("1. Cambiar el radio de un circulo");
            System.out.println("2. Cambiar la base y altura de un rectangulo");
            System.out.println("3. Cambiar la base y altura de un triangulo");
            System.out.println("4. Regresar");
            int opcion = entrada.nextInt();
            switch(opcion) {
                case 1:
                    
                    System.out.println("Ingrese el radio del Circulo: ");
                    double radio = entrada.nextDouble();
                    figuras.getFiguras().forEach(figura -> {
                        if(figura instanceof Circle) {
                            Circle circulo = (Circle) figura;
                            circulo.setRadio(radio);  //circulo.setRadio(radio + circulo.getRadio());
                        }
                    });
                    break;
                case 2:
                    System.out.println("Ingrese la base del Rectangulo: ");
                    double base = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Rectangulo: ");
                    double altura = entrada.nextDouble();
                    figuras.getFiguras().forEach(figura -> {
                        if(figura instanceof Rectangle) {
                            Rectangle rectangulo = (Rectangle) figura;
                            rectangulo.setBase(base);
                            rectangulo.setAltura(altura);
                        }
                    });
                    break;
                case 3:
                    System.out.println("Ingrese la base del Triangulo: ");
                    double base2 = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo: ");
                    double altura2 = entrada.nextDouble();
                    figuras.getFiguras().forEach(figura -> {
                        if(figura instanceof Triangle) {
                            Triangle triangulo = (Triangle) figura;
                            triangulo.setBase(base2);
                            triangulo.setAltura(altura2);
                        }
                    });
                    break;
                case 4:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }   
}

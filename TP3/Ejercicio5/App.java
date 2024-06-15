import java.util.Scanner;

import modelos.ShapeList;

public class App{

    public static void main(String[] args){
        ShapeList figuras = new ShapeList();
        MenuInput menu = new MenuInput();
        menu.menuInput(figuras);  
        
        /* 
        ShapeList figuras = new ShapeList();
        figuras.addShape(new Circle(5));
        figuras.addShape(new Rectangle(5, 10));
        figuras.addShape(new Triangle(5, 10));
        figuras.getFiguras().forEach(figura -> System.out.println(figura.dibujar()));
        System.out.println(figuras.getFiguras().size());
        System.out.println(figuras.getFiguras().get(0).dibujar());
        
        double radio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del Circulo: ");
        radio = entrada.nextDouble();
        figuras.getFiguras().forEach(figura -> {
            if(figura instanceof Circle) {
                Circle circulo = (Circle) figura;
                System.out.println(circulo.getRadio()); 
            }
        });*/
    }
}
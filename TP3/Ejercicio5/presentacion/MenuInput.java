import java.util.Scanner;

import modelos.Shape;
import modelos.ShapeList;
import modelos.casosInput.CaseOne;
import modelos.casosInput.CaseTwo;

public class MenuInput {
    
    public void menuInput(ShapeList figuras) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;

        while(repetir){

            System.out.println("Bienvenido al programa de figuras");
            System.out.println("1. Crear una nueva figura");
            System.out.println("2. Cambiar tamaño de una figura");
            System.out.println("3. Mover figuras");
            System.out.println("4. Mostrar cantidad de figuras creadas");
            System.out.println("5. Eliminar una figura");
            System.out.println("6. Salir");
            int opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    CaseOne menuOpcion1 = new CaseOne();
                    menuOpcion1.MenuOpcion1(figuras);
                    break;
                case 2:
                    CaseTwo menuOpcion2 = new CaseTwo();
                    menuOpcion2.MenuOpcion2(figuras);
                    break;
                case 3:
                    System.out.println("Ingrese la posicion de la figura que deseas mover: ");
                    int pos = entrada.nextInt();
                    if (figuras.getFiguras().size() < pos){
                        System.out.println("La posicion no existe");
                    }else{
                    System.out.println("Ingrese la nueva posicion: ");
                    int nuevaPos = entrada.nextInt();
                    figuras.getFiguras().get(pos);
                    if (figuras.getFiguras().size() < nuevaPos){
                        System.out.println("La nueva posicion no existe");
                    }
                    else{
                        Shape aux = figuras.getFiguras().get(pos);
                        figuras.getFiguras().set(pos, figuras.getFiguras().get(nuevaPos));
                        figuras.getFiguras().set(nuevaPos, aux);
                    }
                }
                    break;
                case 4:
                    figuras.getFiguras().forEach(figura -> System.out.println(figura.dibujar()));
                    break;
                case 5:
                    System.out.println("Ingresa la posicion de la figura que deseas eliminar: ");
                    int posicion = entrada.nextInt();
                    figuras.getFiguras().remove(posicion);
                    figuras.getFiguras().forEach(figura -> System.out.println(figura.dibujar()));
                    break;
                case 6:
                repetir = false;
                break;
            }
        }
    }
}

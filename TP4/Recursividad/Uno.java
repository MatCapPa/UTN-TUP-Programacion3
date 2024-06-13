package Recursividad;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Determinar si una cadena de caracteres está presente en un una lista de cadenas.
public class Uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> listaCadenas = Arrays.asList("messi","di maria","martinez","alvarez","otamendi","romero");

        System.out.println("Introduce una cadena para comprobar si se encuentra en la lista: ");
        String buscado = entrada.nextLine();
        entrada.close();
        if (buscarCadena(buscado, listaCadenas)){
            System.out.println("La cadena '"+buscado+"' se encuentra en la lista");
        }
        else {
            System.out.println("La cadena '"+buscado+"' no se encuentra en la lista");
        }
    }

    public static boolean buscarCadena(String cadena, List<String> lista) {
        if (lista.isEmpty()) {
            return false;
        } else {
            if (lista.get(0).equals(cadena)) {
                return true;
            } else {
                //System.out.println(lista);
                return buscarCadena(cadena,lista.subList(1, lista.size()));
            }
        }
    }
}

package Recursividad;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Contar la cantidad de números impares de una lista.
public class Dos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("La lista tiene "+impar(listaNumeros)+" impares");
        entrada.close();
    }

    private static int impar(List<Integer> lista){
        if (lista.isEmpty()){
            return 0;
        } else {
            if (lista.get(0)%2 != 0){
                return 1 + impar(lista.subList(1, lista.size()));
            } else {
                return impar(lista.subList(1, lista.size()));
            }
        }
    }
}

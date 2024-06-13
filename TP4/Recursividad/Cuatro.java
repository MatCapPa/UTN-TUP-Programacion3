package Recursividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Determinar el máximo de una lista de valores.
public class Cuatro {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        cargarNumerosAleatorios(listaNumeros);
        listaNumeros.add(8);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        System.out.println("Lista = " + listaNumeros);
        System.out.println("Maximo = " + maximo(listaNumeros));
    }

    private static void cargarNumerosAleatorios(ArrayList<Integer> listaNumeros) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(100);
            listaNumeros.add(numero);
        }
    }

    private static int maximo(List<Integer> listaNumeros) {
        if (listaNumeros.size() == 1) {
            return listaNumeros.get(0);
        } else {
            int max = maximo(listaNumeros.subList(1, listaNumeros.size()));
            if (listaNumeros.get(0) > max) {
                return listaNumeros.get(0);
            } else {
                return max;
            }
        }
    }
}

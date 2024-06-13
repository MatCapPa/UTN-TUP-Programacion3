package Recursividad;

import java.util.ArrayList;
import java.util.List;

//Determinar si una lista de enteros es creciente.
public class Tres {
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);
        System.out.println("La lista es creciente: "+esCreciente(listaNumeros));
        System.out.println("Lista = "+listaNumeros);
    }
   
    private static boolean esCreciente(List<Integer> list) {
        if(list.isEmpty())
            return false;
        
        if (list.size()==2)
            return list.get(0)<=list.get(1);
        else
            return list.get(0)<=list.get(1) && esCreciente(list.subList(1,list.size()));
        
    }
}

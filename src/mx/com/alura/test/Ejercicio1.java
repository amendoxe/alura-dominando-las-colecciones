package mx.com.alura.test;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        String numero0 = "Zero";
        String numero1 = "uno";
        String numero2 = "dos";
        String numero3 = "tres";
        ArrayList<String> listaNumeros = new ArrayList<>();
        listaNumeros.add(numero0);
        listaNumeros.add(numero1);
        listaNumeros.add(numero2);
        listaNumeros.add(numero3);
        System.out.println("-------");
        System.out.println(listaNumeros);
        System.out.println("-------");
        listaNumeros.set(1, "One");
        System.out.println(listaNumeros);
        System.out.println(listaNumeros.size());


    }
}

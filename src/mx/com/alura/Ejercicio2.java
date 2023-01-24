package mx.com.alura;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        String clase0 = "clase Zero";
        String clase1 = "clase Uno";
        String clase2 = "clase Dos";
        String clase3 = "clase Tres";
        String clase4 = "clase Cuatro";
        ArrayList<String> clases = new ArrayList<>();
        clases.add(clase0);
        clases.add(clase1);
        clases.add(clase2);
        clases.add(clase3);
        clases.add(clase4);
        System.out.println(clases);
        System.out.println("----------for----------");
        for (int i = 0; i < clases.size(); i++) System.out.println(clases.get(i));
        System.out.println("----------foreach----------");
        for (String clase : clases
        ) {
            System.out.println(clase);
        }
        System.out.println("-----------lamda foreach---------");
        clases.forEach((clase) -> System.out.println(clase));
    }
}

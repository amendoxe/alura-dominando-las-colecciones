package mx.com.alura;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Zero");
        miLista.add("uno");
        miLista.add("dos");
        miLista.add("tres");
        miLista.add("cuatro");
        miLista.add("cinco");
        miLista.forEach((nombre) -> System.out.println(nombre));
        System.out.println("-------");
        miLista.set(1, "One");
        miLista.forEach((nombre) -> System.out.println(nombre));

    }
}
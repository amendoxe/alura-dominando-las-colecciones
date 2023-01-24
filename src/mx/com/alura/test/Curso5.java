package mx.com.alura.test;

import mx.com.alura.module.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Curso5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("PHP", 10);
        Curso curso3 = new Curso("Javascript", 20);
        Curso curso4 = new Curso("Ruby", 50);

        ArrayList<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);
        System.out.println(listaCursos);
        System.out.println("------------Ordena alfabeticamente usando sort (implemtents comparable)");
//        Collections.sort(listaCursos);
//        System.out.println(listaCursos);
//        System.out.println("orden inverso");
//        Collections.sort(listaCursos, Collections.reverseOrder());
//        System.out.println(listaCursos);
        System.out.println("------------Ordena alfabeticamente SIN override Comparable compareTo ");
        listaCursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(listaCursos);
        System.out.println("------------Ordena reversed alfabeticamente SIN override compareTo ---collections ");
        Collections.sort(listaCursos, Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(listaCursos);
        System.out.println("------------Ordena ascendente por tiempo (horas) SIN override compareTo ---STREAM ");
        List<Curso> listaCursosStream = listaCursos.stream().sorted(Comparator.comparingInt(Curso::getHoras)).collect(Collectors.toList());
        System.out.println(listaCursosStream);
        System.out.println("------------ Quita un objeto con un string determinado Ordena ascendente por tiempo (horas) SIN override compareTo ---STREAM ");
        System.out.println("--- Sin ruby, con lambdas");
        List<Curso> listaSinRuby = listaCursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getHoras)).collect(Collectors.toList());
        System.out.println("Lista sin Ruby: " + listaSinRuby);
    }
}

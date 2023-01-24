package mx.com.alura;

import mx.com.alura.module.Clase;
import mx.com.alura.module.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase6 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30, new ArrayList<>());
        curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("Tipos de List"));
        curso1.addClase(new Clase("Linked Lies"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        System.out.println(cursos);
        System.out.println(cursos.get(0).getClaseList());
    }
}

package mx.com.alura.clases;

import mx.com.alura.module.Aula;
import mx.com.alura.module.Curso;

import java.util.ArrayList;

public class Clase6 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30, new ArrayList<>());
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("Tipos de List"));
        curso1.addAula(new Aula("Linked Lies"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        System.out.println(cursos);
        System.out.println(cursos.get(0).getClaseList());
    }
}

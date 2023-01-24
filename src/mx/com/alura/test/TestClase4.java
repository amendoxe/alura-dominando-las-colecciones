package mx.com.alura.test;

import mx.com.alura.Curso;

import java.util.ArrayList;

public class TestClase4 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometría", 30);
        Curso curso2 = new Curso("Trigonometría", 10);
        Curso curso3 = new Curso("Física", 20);
        Curso curso4 = new Curso("Química", 50);

        ArrayList<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);
        System.out.println(listaCursos);

    }
}

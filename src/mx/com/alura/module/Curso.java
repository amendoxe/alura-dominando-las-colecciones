package mx.com.alura.module;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Comparable<Curso> {

    private String nombre;
    private int horas;
    private List<Aula> aulaList = new ArrayList<>();

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Curso(String nombre, int horas, List<Aula> aulaList) {
        this.nombre = nombre;
        this.horas = horas;
        this.aulaList = aulaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public List<Aula> getClaseList() {
        return aulaList;
    }

    public void setClaseList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public void addAula(Aula aula) {
        this.aulaList.add(aula);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
}

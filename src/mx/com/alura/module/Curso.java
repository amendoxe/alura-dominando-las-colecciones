package mx.com.alura.module;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Comparable<Curso> {

    private String nombre;
    private int horas;
    private List<Clase> claseList = new ArrayList<>();

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Curso(String nombre, int horas, List<Clase> claseList) {
        this.nombre = nombre;
        this.horas = horas;
        this.claseList = claseList;
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

    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    public void addClase(Clase clase) {
        this.claseList.add(clase);
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

package mx.com.alura;

public class Curso implements Comparable<Curso> {

    private String nombre;
    private int horas;

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;

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

    @Override
    public String toString() {
        return this.nombre;
    }


    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
}

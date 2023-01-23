package mx.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        String curso0 = "Geometría";
        String curso1 = "Física";
        String curso2 = "Biología";
        String curso3 = "Química";
        String curso4 = "Calculo Diferencial";
        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso0);
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos);
        System.out.println("----------Collections.sort()----------");
        Collections.sort(cursos);
        System.out.println(cursos);
        System.out.println("----------Collections.reverseOrder()----------");
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);
        System.out.println("----------Método del arrayList.sort(Comparator)----------");
        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);
        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);
        System.out.println("----------Stream----------");
        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);
        List<String> cursosList2 = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList);
        System.out.println(cursosList2);

    }
}

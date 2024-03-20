import java.util.Date;

import Cursos.Curso;
import Cursos.GestorCursos;
import Personas.Estudiante;
import Personas.*;

public class Main {
    public static void main(String[] args) {
        GestorCursos g = new GestorCursos();
        @SuppressWarnings("deprecation")
        Date nace = new Date(1995, 2, 1);
        @SuppressWarnings("deprecation")
        Date trabaja = new Date(2008, 3, 5);
        Persona prof = new Profesor("null", "null", "null", "null", "null", nace, 50, trabaja);
        Persona est1 = new Estudiante("null", "est1", "est1", "est1", "est1", nace, "est1");
        Persona est2 = new Estudiante("null", "est2", "est2", "est2","est2", nace, "est1");
        Persona est3 = new Estudiante("null", "est3", "est3", "est3", "est3",nace, "est3");
        Estudiante est4 = new Estudiante("null", "est4", "est4", "est4", "est4",nace, "est1");
        Curso c1 = new Curso("DS", 10, (Profesor) prof);
        Curso c2 = new Curso("Redes", 10, (Profesor) prof);
        Curso c3 = new Curso("Metodos", 10, (Profesor) prof);
        g.addCurso(c1);
        g.addCurso(c2);
        g.addPersona(est1);
        g.addPersona(est2);
        g.matricular(est1, c1);
        g.matricular(est2, c1);
        c1.matricular(est4);
        c2.matricular(est4);
        c2.setNota(est4, 8);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 0);
        c2.setNota(est4, 8);
        c2.setNota(est4, 0);
        c1.setNota((Estudiante) est4, 5);
        c1.setNota((Estudiante) est4, 5);
        c1.setNota((Estudiante) est4, 5);
        c1.setNota((Estudiante) est4, 5);
        System.out.println(est4.getPromedio());
    }
}

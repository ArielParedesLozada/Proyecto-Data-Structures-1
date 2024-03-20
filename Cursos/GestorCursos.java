package Cursos;

import java.util.Iterator;

import DataStructures.ArraySet;
import Personas.Persona;
import Personas.Estudiante;

public class GestorCursos {
    private ArraySet<Curso> cursos;
    private ArraySet<Persona> estudiantes;

    public GestorCursos() {
        this.cursos = new ArraySet<>();
        this.estudiantes = new ArraySet<>();
    }

    public boolean addPersona(Persona persona) {
        if (!this.estudiantes.contains(persona)) {
            this.estudiantes.add(persona);
            return true;
        }
        return false;
    }

    public boolean addCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            return true;
        }
        return false;
    }

    public boolean matricular(Persona persona, Curso curso) {
        if (this.estudiantes.contains(persona) && this.cursos.contains(curso)) {
            try {
                curso.matricular((Estudiante) persona);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public void imprimePersonas() {
        Iterator<Persona> personas = this.estudiantes.iterator();
        while (personas.hasNext()) {
            System.out.println(personas.next());
        }
    }

    public void imprimeCursos() {
        Iterator<Curso> cursosIterator = this.cursos.iterator();
        while (cursosIterator.hasNext()) {
            Curso curso = cursosIterator.next();
            if (curso != null) {
                System.out.print(curso.toString());
                curso.imprimir();
            }
        }
    }
}

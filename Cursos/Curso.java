package Cursos;

import java.util.Iterator;

import DataStructures.ArrayMap;
import DataStructures.ArraySet;
import Personas.Estudiante;
import Personas.Profesor;

public class Curso {
    private String nombre;
    private int cantHoras;
    private ArraySet<ArrayMap<Estudiante, Float>> estudiantes;
    private Profesor profesor;

    public Curso(String nombre, int cantHoras, Profesor profesor) {
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.profesor = profesor;
        this.profesor.addCurso(this);
        this.estudiantes = new ArraySet<>();
    }

    public boolean contains(Estudiante est) {
        Iterator<ArrayMap<Estudiante, Float>> iterate = this.estudiantes.iterator();
        while (iterate.hasNext()) {
            ArrayMap<Estudiante, Float> element = iterate.next();
            if (element != null && element.getElement().equals(est)) {
                return true;
            }
        }
        return false;
    }

    public boolean matricular(Estudiante est) {
        if (!this.contains(est)) {
            ArrayMap<Estudiante, Float> nuevo = new ArrayMap<>(est);
            this.estudiantes.add(nuevo);
            est.addCurso(this);
            return true;
        }
        return false;
    }

    public boolean remover(Estudiante est) {
        Iterator<ArrayMap<Estudiante, Float>> nuevo = this.estudiantes.iterator();
        while (nuevo.hasNext()) {
            ArrayMap<Estudiante, Float> std = nuevo.next();
            if (std != null && std.getElement().equals(est)) {
                est.removeCurso(this);
                return this.estudiantes.remove(std);
            }
        }
        return false;
    }

    public void setNota(Estudiante est, float nota) {
        Iterator<ArrayMap<Estudiante, Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            ArrayMap<Estudiante, Float> student = students.next();
            if (student != null && student.getElement().equals(est)) {
                student.add(nota);
            }
        }
    }

    public Iterator<Float> getNotas(Estudiante est) {
        Iterator<ArrayMap<Estudiante, Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            ArrayMap<Estudiante, Float> student = students.next();
            if (student != null && student.getElement().equals(est)) {
                return student.iterator();
            }
        }
        return null;
    }

    public void imprimir() {
        Iterator<ArrayMap<Estudiante, Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            ArrayMap<Estudiante, Float> student = students.next();
            if (student != null) {
                System.out.println(student.getElement().toString());
            }
        }
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

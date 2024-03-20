package Cursos;

import java.util.Iterator;

import DataStructures.ArrayMap;
import DataStructures.ArraySet;
import Personas.Estudiante;
import Personas.Profesor;

public class Curso {
    private String nombre;
    private int cantHoras;
    private ArraySet<ArrayMap<Estudiante,Float>> estudiantes;
    private Profesor profesor;

    public Curso(String nombre, int cantHoras, Profesor profesor){
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.profesor = profesor;
        this.profesor.addCurso(this);
        this.estudiantes = new ArraySet<>();
    }

    public boolean matricular(Estudiante est){
        ArrayMap<Estudiante,Float> nuevo = new ArrayMap<>(est);
        if (!this.estudiantes.contains(nuevo)) {
            this.estudiantes.add(nuevo);
            est.addCurso(this);
            return true;
        }
        return false;
    }

    public void setNota(Estudiante est, float nota){
        Iterator<ArrayMap<Estudiante,Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            ArrayMap<Estudiante, Float> student = students.next();
            if (student.getElement().equals(est)) {
                student.add(nota);
            }
        }
    }

    public Iterator<Float> getNotas(Estudiante est){
        Iterator<ArrayMap<Estudiante,Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            ArrayMap<Estudiante,Float> student = students.next();
            if (student.getElement().equals(est)) {
                return student.iterator();
            }
        }
        return null;
    }

    public void imprimir(){
        Iterator<ArrayMap<Estudiante,Float>> students = this.estudiantes.iterator();
        while (students.hasNext()) {
            System.out.println(students.next().getElement());
        }
    }
}

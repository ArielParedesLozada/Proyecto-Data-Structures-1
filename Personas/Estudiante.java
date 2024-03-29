package Personas;

import java.util.Date;
import java.util.Iterator;

import Cursos.Curso;
import DataStructures.ArraySet;

public class Estudiante extends Persona {
    private String direccion;
    private ArraySet<Curso> cursos;

    public Estudiante(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNac, String direccion) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNac);
        this.direccion = direccion;
        this.cursos = new ArraySet<>();
    }

    @Override
    public String toString() {
        return super.toString() + " (Estudiante)";
    }

    public boolean addCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            return true;
        }
        return false;
    }

    public boolean removeCurso(Curso curso){
        return this.cursos.remove(curso);
    }

    public float getPromedio(Curso curso) {
        Iterator<Float> notas = curso.getNotas(this);
        float subtotal = 0;
        int n = 0;
        while (notas.hasNext()) {
            Float nota = notas.next();
            if (nota != null) {
                subtotal += nota;
                n++;
            }
        }
        return (n > 0) ? (subtotal / n) : -1;
    }

    public float getPromedio() {
        Iterator<Curso> curosos = this.cursos.iterator();
        float subtotal = 0;
        int n = 0;
        while (curosos.hasNext()) {
            Curso curoso = curosos.next();
            if (curoso != null) {
                subtotal += getPromedio(curoso);
                n++;
            }
        }
        return (n > 0) ? (subtotal / n) : -1;
    }
}
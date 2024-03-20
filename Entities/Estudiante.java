package Entities;

import java.util.Date;

import DataStructures.ArraySet;

public class Estudiante extends Persona {
    private float promCalif;
    private String direccion;
    private ArraySet<Curso> cursos;

    public Estudiante(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNac, String direccion) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNac);
        this.direccion = direccion;
        this.cursos = new ArraySet<>();
        this.promCalif = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " (Estudiante)";
    }

    public boolean matricular(Curso curso){
        if (curso.matricular(this)) {
            this.cursos.add(curso);
            return true;
        }
        return false;
    }

    public float promedio(){
        return this.promCalif;
    }

}
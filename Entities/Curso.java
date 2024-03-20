package Entities;

import DataStructures.ArraySet;

public class Curso {
    private String nombre;
    private int cantHoras;
    private ArraySet<Estudiante> estudiantes;
    private Profesor profesor;

    public Curso(String nombre, int cantHoras, Profesor profesor){
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.profesor = profesor;
        this.estudiantes = new ArraySet<>();
    }

    public boolean matricular(Estudiante est){
        if (est.matricular(this)) {
            this.estudiantes.add(est);
            return true;
        }
        return false;
    }

    public void imprimir(){
        
    }
}

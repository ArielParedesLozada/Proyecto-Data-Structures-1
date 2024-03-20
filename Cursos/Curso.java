package Cursos;

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
        this.estudiantes = new ArraySet<>();
    }

    public boolean matricular(Estudiante est){
        ArrayMap<Estudiante,Float> nuevo = new ArrayMap<>(est);
        if (!this.estudiantes.contains(nuevo)) {
            this.estudiantes.add(nuevo);
            return true;
        }
        return false;
    }
}

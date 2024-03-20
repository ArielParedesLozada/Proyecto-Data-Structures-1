package Entities;

import DataStructures.ArrayMap;
import DataStructures.ArraySet;

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

    public ArraySet<Float> getNotas(Estudiante est){
        ArraySet<Float> notas = new ArraySet<>();
        for (int i = 0; i < this.estudiantes.set.length; i++) {
            if (this.estudiantes.set[i].getElement().equals(est)) {
                for (int j = 0; j < this.estudiantes.set[i].set.size(); j++) {
                    notas.add(this.estudiantes.set[i].set.set[j]);
                }
            }
        }
        return notas;
    }

    public boolean setNota(float nota, Estudiante est){
        ArrayMap<Estudiante,Float> target = new ArrayMap<>(est);
        target.add(nota);
        int index = this.estudiantes.getIndex(target);
        return this.estudiantes.setIndex(index, target);
    }

    public void imprimir(){
        for (int i = 0; i < this.estudiantes.set.length; i++) {
            System.out.println(this.estudiantes.set[i].getElement());
        }
    }
}

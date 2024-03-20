package Personas;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import Cursos.Curso;
import DataStructures.ArraySet;

public class Profesor extends Trabajador{
    private Date inicio;
    private ArraySet<Curso> cursos;

    public Profesor(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNac, int salary, Date inicio){
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNac, salary);
        this.inicio = inicio;
        this.cursos = new ArraySet<>();
    }

    public int experiencia(){
        Period period = Period.between(this.inicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());       
        int years = period.getYears();
        return years;
    }
}

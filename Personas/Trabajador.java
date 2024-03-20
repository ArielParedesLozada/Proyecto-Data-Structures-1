package Personas;

import java.util.Date;

public class Trabajador extends Persona{
    private int salary;

    public Trabajador(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNac,int salary){
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNac);
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
}
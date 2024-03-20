package Personas;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona {
    protected String cedula;
    protected String nombre1;
    protected String nombre2;
    protected String apellido1;
    protected String apellido2;
    protected Date nac;

    public Persona(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNac) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nac = fechaNac;
    }


    @Override
    public String toString() {
        return nombre1+" "+nombre2+" "+apellido1+" "+apellido2;
    }

    public String nombre(){
        return nombre1+" "+apellido1;
    }

    public int edad(){
        Period period = Period.between(this.nac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());       
        int years = period.getYears();
        return years;
    }
}
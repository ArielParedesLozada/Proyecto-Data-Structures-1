import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona {
    public String cedula;
    public String nombre1;
    public String nombre2;
    public String apellido1;
    public String apellido2;
    private Date nac;

    public Persona(){}

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
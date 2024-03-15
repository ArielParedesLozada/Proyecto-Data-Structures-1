public class Trabajador extends Persona{
    private int salary;

    public Trabajador(int salary){
        super();
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
}

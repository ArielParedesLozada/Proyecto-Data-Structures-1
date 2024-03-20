package Entities;

public class Grades {
    public float valor;
    public Estudiante est;

    public Grades(Estudiante est){
        this.est = est;
        this.valor = 0;
    }
}

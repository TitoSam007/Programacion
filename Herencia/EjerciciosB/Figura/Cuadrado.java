package EjerciciosB.Figura;

public class Cuadrado extends Figura{

    public Cuadrado(double l) {
        super(l);
    }

    public double area(){
        return lado * lado;
    }
}

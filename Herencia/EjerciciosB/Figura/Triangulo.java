package EjerciciosB.Figura;

public class Triangulo extends Figura{
    
    private double altura;

    public Triangulo(double l, double a) {
        super(l);
        this.altura = a;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return  altura * lado;
    }
}

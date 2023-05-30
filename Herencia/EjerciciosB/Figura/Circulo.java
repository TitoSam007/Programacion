package EjerciciosB.Figura;
public class Circulo extends Figura{

    private double radio;

    public Circulo(double r) {
        super(r);
        this.radio = r;
    }
    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area() {
        return Math.PI * (radio*radio);
    }
}

package EjerciciosB.Animal;

public class Pez extends Animal{

    private String canto = "glu glu";

    public Pez(String c) {
        super(c);
        this.canto = c;
    }
    @Override
    public String toString() {

        return super.toString() + canto;
    }
}

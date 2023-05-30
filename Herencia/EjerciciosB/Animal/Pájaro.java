package EjerciciosB.Animal;

public class Pájaro extends Animal{
    
    private String canto;

    public Pájaro(String c) {
        super(c);
        this.canto = c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + canto;
    }
}

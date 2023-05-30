package EjerciciosB.Animal;

public class Gallo extends Pájaro{
    
    private String canto;

    public Gallo(String c) {
        super(c);
        this.canto = c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + canto;
    }
}

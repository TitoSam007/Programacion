package EjerciciosB.Animal;

public class Carpintero extends Pájaro{
    
    private String canto;

    public Carpintero(String c) {
        super(c);
        this.canto = c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + canto;
    }
}

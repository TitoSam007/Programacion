package EjerciciosB.Animal;

public class Payaso extends Pez{
    
    private String canto;

    public Payaso(String c) {
        super(c);
        this.canto = c;
    }

    @Override
    public String toString() {
        return super.toString() + canto;
    }
}

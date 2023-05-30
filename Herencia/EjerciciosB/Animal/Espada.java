package EjerciciosB.Animal;

public class Espada extends Pez{
    
    private String canto;

    public Espada(String c) {
        super(c);
        this.canto = c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + canto;
    }
}

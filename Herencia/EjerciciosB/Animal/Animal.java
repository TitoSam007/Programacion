package EjerciciosB.Animal;

public class Animal {

    protected String canto;

    public Animal(String c) {
        this.canto = c;
    }

    @Override
    public String toString() {
        return Animal.class.getSimpleName() + canto;
    }
}

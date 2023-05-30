package EjerciciosB.Animal;

import java.util.ArrayList;

public class ProgramaAnimal {
    public static void main(String[] args) {
        
        ArrayList <Animal> animales = new ArrayList<>();
        animales.add(new Pez("glu glu"));
        animales.add(new Payaso("chorprecha"));
        animales.add(new Espada("rindete"));
        animales.add(new Pájaro("piopio"));
        animales.add(new Carpintero("picomadera"));

        for (Animal animal : animales) {
            System.out.println(animales);
        }
    }
}

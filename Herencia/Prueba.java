import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {

        ArrayList <Persona> personas = new ArrayList<>();
        
        Persona a1 = new Persona("Manolo", "Garcia", "14/06/1978");
        Persona a2 = new Alumno("Pedro", "Hernández", "14/06/1978", "1DAM", 8);
        Persona a3 = new  Profesor("Tayo", "Jackson", "14/06/1978", 3000, "Neurocientífico");

        personas.add(0, a1);
        personas.add(1, a2);
        personas.add(2, a3);
        personas.add(3, a1);
        personas.add(4, a2);
        personas.add(5, a3);
        personas.add(6, a1);
        personas.add(6, a2);
        personas.add(7, a3);
        personas.add(8, a1);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
}
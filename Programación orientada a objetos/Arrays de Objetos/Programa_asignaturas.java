import java.util.Scanner;

public class Programa_asignaturas {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Asignaturas miarray = new Asignaturas(null, null, null, null, null);

        int edad;
        String [] materias = new String[5];

        for (int i = 0; i < materias.length; i++) {
            System.out.println("Introduzca la materia " + i);
            materias[i] = lector.nextLine();
        }
        edad = lector.nextInt();
        miarray.Array_asignaturas(materias);
        miarray.years(edad);
    }
}

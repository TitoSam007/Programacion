import java.util.Scanner;

public class MainEstudiante {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Estudiante main = new Estudiante();
        String nombre, apellidos, dni;
        int año;
        double media;

        System.out.println("Introduzca el nombre del alumno: ");
        nombre = lector.nextLine();
        System.out.println("Introduzca el apellido del alumno");
        apellidos = lector.nextLine();
        System.out.println("Introduzca el dni del alumno: ");
        dni = lector.nextLine();
        do {
            System.out.println("Introduzca el año de nacimiento del alumno: ");
        año = lector.nextInt();
        } while (Estudiante.ComprobarEdad(año) != true);
        
        System.out.println("Introduzca la nota media del estudiante: ");
        media = lector.nextDouble();

        Estudiante.Imprimeinfo(nombre, apellidos, dni, año, media);
    }
}

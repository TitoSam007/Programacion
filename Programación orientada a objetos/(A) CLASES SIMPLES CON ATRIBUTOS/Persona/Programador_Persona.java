import java.util.Scanner;

public class Programador_Persona {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Persona Datos1, Datos2;

        Datos1 = new Persona();
        Datos2 = new Persona();

        String dni1, dni2, Nombre1, Nombre2, Apellidos1, Apellido2;
        int edad1, edad2;

        System.out.println("Intorduzca el Nombre:");
        Nombre1 = lector.nextLine();
        System.out.println("Introduzca los apellidos:");
        Apellidos1 = lector.nextLine();
        System.out.println("Introduzca la edad:");
        edad1 = lector.nextInt();
        System.out.println("Introduzca su dni:");
        dni1 = lector.nextLine();

        Datos1.Datos1(dni1, Nombre1, Apellidos1, edad1);

        System.out.println("Intorduzca el Nombre:");
        Nombre2 = lector.nextLine();
        System.out.println("Introduzca los apellidos:");
        Apellido2 = lector.nextLine();
        System.out.println("Introduzca la edad:");
        edad2 = lector.nextInt();
        System.out.println("Introduzca su dni:");
        dni2 = lector.nextLine();

        Datos2.Datos1(dni2, Nombre2, Apellido2, edad2);


    
    }
}

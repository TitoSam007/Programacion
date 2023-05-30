import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime 5 notas:");
        int suma = 0;
        int nota;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Dime la nota " + i + ": ");

            try {
                nota = in.nextInt();
                suma += nota;
            } catch (InputMismatchException e) {
                System.out.println("Aviso, eso no es un numero");
                in.nextLine();
                i--;
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media:  " + (suma / 5.0));
    }

    public static void pideInt(String mensaje) {
        Scanner in = new Scanner(System.in);
        int valor;
        boolean repetir = false;
        do {
            System.out.println(mensaje);
            try {
                valor = in.nextInt();
                repetir = true;
            } catch (Exception e) {
                System.out.println("Aviso, eso no es un numero");
                in.nextLine();
                valor = 0;
            }
        } while (repetir != true);
        System.out.println(valor);
    }
}

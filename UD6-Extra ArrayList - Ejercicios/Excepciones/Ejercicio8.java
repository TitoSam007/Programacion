/*Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”. Se deberá tratar la
excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero
válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    String cadena = "Introduzca un numero entero"; 
    validacionTipoInt(cadena);
    }
    public static void validacionTipoInt(String mensaje) {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        boolean comprobador = false;
        do {
            System.out.println(mensaje);
            try {
                valor = in.nextInt();
                comprobador = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            }
            
        } while (comprobador != true);
        System.out.println("Valor introducido: " + valor);

    }
}

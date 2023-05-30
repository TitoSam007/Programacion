//.Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en
//el primer array todos los valores del 1 al 10. Por último, deberá copiar todos los
//valores del primer array al segundo array en orden inverso, y mostrar ambos por
//pantalla.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introuzca los valores del 1 al 10 en orden");
        int [] orden = new int [10];
        for (int i = 0; i < orden.length; i++) {
            orden [i] = lector.nextInt();
        }
        int [] desc = orden.clone();
        System.out.println(orden);
        
    }
    
}

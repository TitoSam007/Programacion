/*.Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas */

import java.util.Scanner;

public class Ejercicio12 {
    public static double traductor(double x){
        double millas = x / 1.60934;
        System.out.println("Su valor en millas seria: " + millas);
        return x;
    }

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una distancia en kilometros");
        double n = lector.nextDouble();
        double kilometros;
        kilometros = traductor(n);

        System.out.println(kilometros);
      
    }
}

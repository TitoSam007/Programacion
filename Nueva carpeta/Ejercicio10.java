// Crea un programa para realizar cálculos relacionados con la altura (en metros) de
//personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas
//por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas
//personas miden por encima y por debajo de la media.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el valor de N:");
        int N = lector.nextInt();
        double [] alturas = new double [N];
        System.out.println("Introduzca " + N + " medidas de altura");  
        double media;
        double minima;
        double máxima;
        double suma = 0;
              
        for (int i = 0; i < alturas.length; i++ ) {
            alturas [i]= lector.nextDouble();
            suma = suma  + alturas[i];
        }
        media = suma / N;
        System.out.println("La altura media es de: " + media +  " metros");
        minima = alturas[0];
        máxima = alturas[0];
        for (int i = 0; i < alturas.length; i++) {
        if(alturas[i] < minima){
            minima = alturas[i];
         } 
        }  
        System.out.println("La altura minima es de : " + minima + " metros");
         for (int i = 0; i < alturas.length; i++) {
         if (alturas[i] > máxima) {
            máxima = alturas[i];
         }
        }
        System.out.println("La altura maxima es de: " + máxima + " metros");

        
    }
}

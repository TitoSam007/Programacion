///Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
//empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
//teclado la información de N personas distintas (valor también introducido por teclado).
//Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
//información debe guardarse en una única matriz. Luego se mostrará por pantalla el
//sueldo medio de cada género.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero de personas que respondieron la encuesta");
        int N = lector.nextInt();
        double[][] encuesta = new double[N][2];
        double ms = 0;
        double fs = 0;
        int m = 0;
        int f = 0;

        for (int i = 0; i < encuesta.length; i++) {
            System.out.println("Introduzca su genero y su sueldo:");
            for (int j = 0; j < encuesta[i].length; j++) {
                encuesta[i][j] = lector.nextDouble();
            }
        }
        for (int i = 0; i < encuesta.length; i++) {
            for (int j = 0; j < encuesta.length; j++) {
            }
            if (encuesta[i][0] == 0) {
                ms = ms + encuesta[i][1];
                m++;
            }
            if (encuesta[i][0] == 1) {
                fs = fs + encuesta[i][1];
                f++;
            }
        }
        double mm = ms / m;
        double fm = fs / f;

        for (int i = 0; i < encuesta.length; i++) {
            for (int j = 0; j < encuesta[i].length; j++) {
                System.out.print(encuesta[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Media del salario total del salario de mujeres: " + fm);
        System.out.println("Media del salario total del salario de hombres: " + mm);
    }
}
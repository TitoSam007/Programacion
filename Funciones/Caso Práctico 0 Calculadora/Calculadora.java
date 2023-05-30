/*
 * @utor Samuel Stefano Zamora Sanchez
 *
 * Calculadora 
 */
import java.util.Scanner;

public class Calculadora {

    /*
     * Declaración del metodo suma
     * 
     * @param a
     */
    public static void CalculadoraSuma(int [] a) {

        int sumax = 0;

        for (int i = 0; i < a.length; i++) {
            sumax = sumax + a[i];
        }

        /*
         * Imprimimos el resultado de la funcióm sumax
         */
        System.out.println("El resultado de la suma es:" + sumax);
    }

    /*
     * Declaración del metodo resta
     * 
     * @param b
     */
    public static void CalculadoraResta(int [] b){

        int restax = 0; 

        for (int i = 0; i < b.length; i++) {
            
            restax = b[i] - restax;
        }

        /*
         * Imprimimos el resultado de la función restax
         */
        System.out.println("El resultado de la resta de los valores introducidos es: " + restax);
    }

    /*
     * Declaración del metodo multiplicación
     * 
     * @param c
     */
    public static void CalculadoraMult(int [] c) {
    
        int mutlx =  c[0] * c[1];

        /*
         * Imprimimos el resultado de la función mutlx
         */
        System.out.println("El resultado de la multiplicación es: " + mutlx);
    }

    /*
     * Declaracción del metodo división
     * 
     * @param d
     */
    public static void CalculadoraDivision(double [] d) {
        
        double divisionx;
        if (d[0] > d[1] ) {
            divisionx = d[1] / d[0];
        } else {
            divisionx = d[0] / d[1];
        }
        /*
         * Imprimimos el resultado de la función divisionx
         */
        System.out.println("El resultado de la división es: " + divisionx);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion;
        int cantidad1;

        do {
            System.out.println("Introduzca el numero de una de las siguientes opciones:");
            opcion = in.nextInt();

            System.out.println("CALCULADORA:");
            System.out.println("");
            System.out.println("--------------");
            System.out.println("");
            System.out.println("1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicación");
            System.out.println("4.-División");
            System.out.println("9.-Salir");

            switch (opcion) {
                case 1: /*Suma */
                    System.out.println("Introduzca la cantidad de valores que desa sumar:");
                    cantidad1 = in.nextInt();
                    int[] n1 = new int[cantidad1];

                    System.out.println("Ahora introduzca los valores que desea sumar:");
                    for (int i = 0; i < cantidad1; i++) {
                        n1[i] = in.nextInt();
                    }
                    CalculadoraSuma(n1);

                    break;
                case 2:/*Resta */
                    System.out.println("Introduzca la cantidad de valores que desea usar para el calculo de la resta:");
                    cantidad1 = in.nextInt();
                    int [] n2 = new int [cantidad1];

                    System.out.println("Ahora introduzca los valores que desea restar:");
                    for (int i = 0; i < n2.length; i++) {
                        n2[i] = in.nextInt();
                    }
                    CalculadoraResta(n2);

                    break;
                case 3:/*Multipicaión */

                    int [] mult = new int [2];
                    System.out.println("Introduzca los dos valores que desea multiplicar:");
                    for (int i = 0; i < mult.length; i++) {
                        mult[i] = in.nextInt();
                    }
                    CalculadoraMult(mult);

                    break;
                case 4:/*División */

                    double [] division = new double [2];
                    System.out.println("Introduzca los valores que desea usar para la división:");
                    for (int i = 0; i < division.length; i++) {
                        division[i] = in.nextDouble();
                    }
                    CalculadoraDivision(division);

                    break;

                default:
                    break;
            }

        } while (opcion != 9);

        in.close();

    }
}

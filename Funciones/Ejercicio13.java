import java.util.Scanner;

/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento */

public class Ejercicio13 {

    public static double porcentaje(double a, double b){
        double descuento;
        descuento = (a * b) / 100;
        System.out.println("El porcentaje de descuento es: " + descuento + "%");
        return b;
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double conversor;
        System.out.println("Introduzca el valor sin descuento:");
        double entero = lector.nextDouble();
        System.out.println("Introduzca el valor con el descuento aplicado:");
        double deal = lector.nextDouble();

        conversor = porcentaje(entero, deal);
        System.out.println(conversor + "%");
        
    }
}

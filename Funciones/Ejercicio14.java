import java.util.Scanner;

/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá
recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del
triángulo */

public class Ejercicio14 {
    public static int triangulo(int a, int b){

    for (int i = 1; i <= b; i++) {
        for (int j = i - 1; j <= b - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print(a);
        }
        System.out.println("");
    }
    return b;
    }
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int imprimir;
        char caracter;
        int lineas;
        System.out.println("Introduzca el numero que desea imprimir:");
        caracter = lector.next().charAt(0);
        System.out.println("Introduzca el numero de lineas del triángulo:");
        lineas = lector.nextInt();
        imprimir = triangulo(caracter, lineas);
        System.out.println(imprimir);

    }
}

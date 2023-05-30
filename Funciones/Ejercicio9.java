import java.util.Scanner;

/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos
valores (no tres) y nos devuelva el máximo de los dos valores */



public class Ejercicio9 {

    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el primer numero:");
        int n1 = lector.nextInt();
        System.out.println("Introduzca el segundo valor:");
        int n2 = lector.nextInt();
        System.out.println("Introduzca el el tercer valor");
        int n3 = lector.nextInt(); 

        int mx1 = maximo(n1, n2);
        int mx2 =maximo(mx1, n3);

        System.out.println("Valor máximo: " + mx2);



    }

}

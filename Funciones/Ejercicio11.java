import java.util.Scanner;

/*Realiza un programa que escriba la tabla de multiplicar de un número introducido por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número */

public class Ejercicio11 {
    public static int Tabla(int x){

        int []multiplicar = new int [12];
        int cont = 0;
   
        for (int i = 0; i < multiplicar.length; i++) {
            cont = cont + 1;
                multiplicar[i] = cont * x;
                System.out.println(" " + multiplicar[i]);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un numero: entero:");
        int n = lector.nextInt();
        int mult;
        mult = Tabla(n);

        System.out.println(mult);
    }

}

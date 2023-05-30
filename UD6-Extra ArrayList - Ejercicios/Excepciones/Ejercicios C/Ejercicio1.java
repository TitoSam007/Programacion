import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduzca un valor de tipo entero");
            valor = src.nextInt();
            imprimeNegativo(valor);
            imprimeNegativo(valor);
        } while (valor != 1);
    }

    public static void imprimePositivo(int p) throws Exception{

        try {
            if (p > 0) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto");
        }
    }

    public static void imprimeNegativo(int n) throws Exception{

        try {
            if (n < 0) {
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto");
        }
    }
}

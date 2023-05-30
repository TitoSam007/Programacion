import java.util.ArrayList;
import java.util.Scanner;

public class Precios {
    public static void main(String[] args) {
        ArrayList <Double> precios = new ArrayList<>();
        ArrayList <Double> menorp = new ArrayList<>();
        ArrayList <Double> mayorp = new ArrayList<>();
        Scanner src = new Scanner(System.in);
        double nprecio;

        do {
            System.out.println("Introduzca un precio");
            nprecio = src.nextDouble();
            if (nprecio >= 0) {
                precios.add(nprecio);
            }
        } while (nprecio >= 0);

        Imprimir(precios);

        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i) >= 100){
                mayorp.add(precios.get(i));
                precios.remove(i);
            }else {
                menorp.add(precios.get(i));
                precios.remove(i);
            }
        }

        Imprimir(precios);
        Imprimir(menorp);
        Imprimir(mayorp);

    }
    public static void Imprimir(ArrayList <Double> a) {

        System.out.println("---------------");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("---------------");
    }
}

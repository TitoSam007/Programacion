/*
 * @utor Samuel Stefano Zamora Sanchez
 */
import java.util.Scanner;

public class Programa_Punto {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Punto Coor_denadas = new Punto();

        int x1, y1, x2, y2, x3, y3;


        System.out.println("Introduzca los valores de 'x1' y de 'y1'");
        x1 = lector.nextInt();
        y1 = lector.nextInt();
        Coor_denadas.Coordenadas1(x1, y1);

        System.out.println("Introduzca los valores de 'x2' y de 'y'");
        x2 = lector.nextInt();
        y2 = lector.nextInt();
        Coor_denadas.Coordenadas2(x2, y2);

        System.out.println("Introduzca los valores de 'x3' y de 'y3'");
        x3 = lector.nextInt();
        y3 = lector.nextInt();
        Coor_denadas.Coordenadas3(x3, y3);

        
    

    
        

    }

    
}

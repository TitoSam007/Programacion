import java.util.Scanner;

public class Programa_Punto {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Punto Coor_1, Coor_2, Coor_3;
        Coor_1 = new Punto();
        Coor_2 = new Punto();
        Coor_3 = new Punto();
        int x1, y1, x2, y2, x3, y3;


        System.out.println("Introduzca los valores de 'x1' y de 'y1'");
        x1 = lector.nextInt();
        y1 = lector.nextInt();
        Coor_1.Coordenadas1(x1, y1);

        System.out.println("Introduzca los valores de 'x2' y de 'y'");
        x2 = lector.nextInt();
        y2 = lector.nextInt();
        Coor_2.Coordenadas2(x2, y2);

        System.out.println("Introduzca los valores de 'x3' y de 'y3'");
        x3 = lector.nextInt();
        y3 = lector.nextInt();
        Coor_3.Coordenadas3(x3, y3);

        
    

    
        

    }

    
}

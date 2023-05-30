import java.util.Scanner;

public class Programa_Rectangulo {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Rectangulo perimetro1, area1, coordenada1;
        
        perimetro1 = new Rectangulo();
        area1 = new Rectangulo();
        coordenada1 = new Rectangulo();
        int x1 ,y1 ,x2 ,y2;

        System.out.println("Introduzca la coordenada de x1");
        x1 = lector.nextInt();
        System.out.println("Introduzca la coordenada de y1");
        y1 = lector.nextInt();
        System.out.println("Introduzca la coordenada de x2");
        x2 = lector.nextInt();
        System.out.println("Introduzca la coordenada de y2");
        y2 = lector.nextInt();

        perimetro1.Perimetro(x1, y1, x2, y2);
        area1.Area(x1, y1);
        coordenada1.Coordenadas1(x1, y1, x2, y2);

    }
    
}

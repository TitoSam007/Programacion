import java.util.Scanner;

public class Punto {

    private int x;
    private int y;

    Scanner lector = new Scanner(System.in);

    public void Modificados() {

        this.x += 4;
        this.y -= 2;
        System.out.println("Coordenadas modificadas es igual a: " + "(" + this.x + "," + this.y + ")");

        
    }

    public void Coordenadas1(int x1, int y1) {


        this.x = x1;
        this.y = y1;
        
        x1 = lector.nextInt();
        y1 = lector.nextInt();

        System.out.println("Coordenadas1 es igual a: " + "(" + this.x + "," + this.y + ")");
        Modificados();
    }

    public void Coordenadas2(int x2, int y2) {


        this.x = x2;
        this.y = y2;

        x2 = lector.nextInt();
        y2 = lector.nextInt();

        System.out.println("Coordenadas2 es igual a: " + "(" + this.x + "," + this.y + ")");
        Modificados();
    }

    public void Coordenadas3(int x3, int y3) {


        this.x = x3;
        this.y = y3;

        x3 = lector.nextInt();
        y3 = lector.nextInt();
        System.out.println("Coordenadas3 es igual a: " + "(" + this.x + "," + this.y + ")");
        Modificados();
    }
}
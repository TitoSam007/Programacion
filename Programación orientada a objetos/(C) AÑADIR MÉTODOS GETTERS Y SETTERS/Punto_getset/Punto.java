/*
 * @utor Samuel Stefano Zamora Sanchez
 */
public class Punto {

    private int x;
    private int y;
    
    /*
    * Constructor con 2 parametros
    */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y) {
        this.y = y;
    }

    public void Modificados() {

        this.x = x;
        this.y = y;
        x += 4;
        y -= 2;
        System.out.println("Coordenadas modificadas es igual a: " + "(" + this.x + "," + this.y + ")");

    }

    public void Coordenadas1(int x1, int y1) {

        this.x = x1;
        this.y = y1;

        System.out.println("Coordenadas de x: " + Devolverx());
        System.out.println("Coordenadas de y: " + Devolvery());
        Modificados();
    }
    //Devuelve x
    public int Devolverx(){
        return x;
    }
    //Devuelve y
    public int Devolvery() {
        return y;
    }
    public void Coordenadas2(int x2, int y2) {

        this.x = x2;
        this.y = y2;

        System.out.println("Coordenadas de x: " + Devolverx());
        System.out.println("Coordenadas de y: " + Devolvery());
        Modificados();
    }

    public void Coordenadas3(int x3, int y3) {

        x = x3;
        y = y3;

        System.out.println("Coordenadas de x: " + Devolverx());
        System.out.println("Coordenadas de y: " + Devolvery());
        Modificados();

    }
}
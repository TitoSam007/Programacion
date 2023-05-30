public class Rectangulo {

    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public String culo;

    /*
     * Constructor con 5 parametros
     */
    public Rectangulo(String culito, int x1, int y1, int x2, int y2) {
        this.culo = culito;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void Perimetro(int x1, int y1, int x2, int y2) {

        int perimetro;
        int lx1, ly1, lx2, ly2;

        lx1 = x2 - x1;
        ly1 = y2 - y1;
        lx2 = x2 - x1;
        ly2 = y2 - y1;
        perimetro = lx1 + ly1 + lx2 + ly2;

        System.out.println("Perimetro: " + perimetro);
    }

    public void Area(int lx1, int ly1) {

        int area;
        area = lx1 * ly1;
        System.out.println("Area: " + area);

    }

    public void Coordenadas1(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        System.out.println("Coordenadas:");
        System.out.println("------------------");
        System.out.println("x1: " + x1);
        System.out.println("y1: " + y1);
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);

    }

}
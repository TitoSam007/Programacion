public class MainMinMax {
    public static void main(String[] args) {
        
        VectorInt vectores = new VectorInt(10);
        
        vectores.ranDom(9, 20);

        System.out.println("------");
        System.out.println(vectores.getMinimo());
        System.out.println(vectores.getMaximo());
    }
}

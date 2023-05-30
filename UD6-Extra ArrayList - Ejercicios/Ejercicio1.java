import java.util.ArrayList;

public class Ejercicio1{

    public static void main(String[] args) {

        ArrayList <String>  colores= new ArrayList<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Nanranja");
        colores.add("Blanco");

        /*for (String buscArrayList : colores) {
            
        }*/

        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        
        colores.add("Negro");
        colores.add("Cyan");

        System.out.println("--------------");

        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        System.out.println("--------------");

        colores.add(0, "Amarillo");
        colores.add(1, "Magenta");

        colores.remove(2);
        colores.remove(3);

        System.out.println("--------------");

        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
    }
}
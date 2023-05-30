import java.util.Scanner;

public class Tictac {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int [][] Tictac = new int [3][3]; 
        int filaj;
        int columnaj;
        int maquina = 0;
        int jugador = 0;

        do {
            System.out.println("Introduzca la fila:");
            filaj = lector.nextInt();
            System.out.println("Introduzca la columna:");
            columnaj = lector.nextInt();
            
            for (int i = 0; i < Tictac.length; i++) {
                for (int j = 0; j < Tictac.length; j++) {
                    Tictac[filaj][columnaj] = 1;
                    System.out.print(Tictac[filaj][columnaj] + "\t");
                }
                System.out.println("");
            }

        } while (maquina < 3 || jugador < 3);
    }
}

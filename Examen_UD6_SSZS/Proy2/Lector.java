import java.util.Scanner;

public class Lector {
    public static Scanner tcl = new Scanner(System.in);

    public static String PedirString(String txt) {
        System.out.println(txt);
        return tcl.nextLine();
    }

    public static int PideEntero(String txt) {
        System.out.println(txt);
        return tcl.nextInt();
    }


}
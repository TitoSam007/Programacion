 /*
 * @utor Samuel Stefano Zamora Sanchez
 * 
 * Fecha 03/04/23
 */

 import java.util.Scanner;

 public class Lector {
     public static Scanner tcl = new Scanner(System.in);
 
     public static String PedirString(String txt) {
         System.out.println(txt);
         return tcl.nextLine();
     }
 
     public static int PideEntero(String txt) {
         System.out.println(txt);
         int res = tcl.nextInt();
         tcl.nextLine();
         return res;
     }

     public static double PideDecimal(String txt) {
        System.out.println(txt);
        return tcl.nextDouble();
     }
 }
import java.util.Scanner;

/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no */

public class Ejercicio10 {
    
    public static int comprobador(int dia, int mes,int año){

        if (dia >= 1 || dia <= 30) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        if (mes >= 1 || mes <= 12) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        if (año >= 1) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        return dia/mes/año;
        
    }

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el dia:");
        int n1 = lector.nextInt();
        System.out.println("Introduzca el mes:");
        int n2 = lector.nextInt();
        System.out.println("Introduzca el año:");
        int n3 = lector.nextInt();

        int fecha;
        fecha = comprobador(n1, n1, n3);
        
        System.out.println(fecha);
    }
}

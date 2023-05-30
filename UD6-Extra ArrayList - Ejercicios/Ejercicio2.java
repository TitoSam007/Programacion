import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList <Integer> notas = new  ArrayList<>();

        Scanner src = new Scanner(System.in);
        int numero, aprobados, suspendidos, excelente, fatal, media, suma;
        aprobados = 0;
        suspendidos = 0;
        excelente = 0;
        fatal = 0;
        suma = 0;
        

        do {

            System.out.println("Introduzca un numero en el array");
            numero = src.nextInt();
            if (numero >= 0) {
                notas.add(numero);
            }
        } while (numero != -1);

        for (int i = 0; i < notas.size(); i++) {
                System.out.println(notas.get(i));
                suma = suma + notas.get(i);

            if (notas.get(i) < 5) {
                suspendidos++;
            } else {
                aprobados++;
            }

            if (notas.get(i) == 10) {
                excelente++;
            } else if (notas.get(i) == 0) {
                
            }
            
        }
        
        media = suma / notas.size();
        
        System.out.println("El numero de suspendidos es :" + suspendidos  + "\n" + 
                            "El numero de aprobados es :" + aprobados + "\n" +
                            "El numero de notas de 10 que hay es: " + excelente + "\n" +
                            "El numero de notas de 0 es: " + fatal + "\n" +
                            "La nota media es: " + media);
    }
}

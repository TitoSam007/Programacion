import java.util.Scanner;

public class AppCuentasdeBanco {

    /*
     * Metodo menu
     * 
     * @param
     */
    public static void Menu(String Mostrar) {

    }

    public static void opcion1(String[] Nombres1, int[] Cantidad1) {
        if (Nombres1[0] == null) {
            System.out.println("No hay cuentas");
        } else {
            for (int i = 0; i < Nombres1.length; i++) {
                System.out.println(i + "." + Nombres1[i] + "   " + Cantidad1[i] + " $");
            }
        }

    }

    public static void opcion2(int[] Cantidad1, int Ndcuenta1, int Valor1) {
        int suma;
        if (Valor1 > 0) {
            suma = Cantidad1[Ndcuenta1] + Valor1;
            Cantidad1[Ndcuenta1] = suma;
        } else {
            System.out.println("Introduzca de nuevo la cantidad que de sea ingresar");
            return;
        }
    }

    public static void opcion3(int[] Cantidad1, int Ndcuenta1, int Valor1) {
        int resta;
        if (Valor1 > 0) {
            resta = Cantidad1[Ndcuenta1] - Valor1;
        } else {
            System.out.println("Introduzca de nuevo la cantidad que de sea ingresar");
            return;
        }
    }

    public static void opcion4(int Ndcuenta1, String[] Nombres1, int [] Cantidad1) {

        Scanner lector = new Scanner(System.in);
        if (Nombres1[Ndcuenta1] != null) {
            System.out.println("Este numero de cuenta ya se encuentra ocupado, por favor introduca otra vez el numero de cuenta donde desea ingresar su cuentas:");
            return;
        } else {
            System.out.println("Introduzca sus nombres y apellidos:");
            Nombres1[Ndcuenta1] = lector.nextLine();
            System.out.println("Introduzca la cantidad inicial a ingresar en su cuenta:");
            Cantidad1[Ndcuenta1] = lector.nextInt();
        }
    }

    public static void opcion5(int Ndcuenta1, String [] Nombres1, int [] Cantidad1) {
        
        Nombres1[Ndcuenta1] = null;
        Cantidad1[Ndcuenta1] = 0;
    }

    public static void opcion6(String Tx, String [] Nombres1, int [] Cantidad1) {
        
        for (int i = 0; i < Cantidad1.length; i++) {
            
        }

    }



    public static void main(String[] args) {

        /* Declaramos el lector por teclado */
        Scanner in = new Scanner(System.in);
        /* Declaramos la opción que sera introducido por teclado */
        int opcion;
        /* Variable que almacenara los nombres de los usuarios */
        String[] Nombres = new String[100];
        /* Array que almacenara la cantidad de cada usuario en su cuenta */
        int[] Cantidad = new int[100];
        /* Contador que nos ayuda a saber la cuenta que el usuario esta buscando */
        int Ndcuenta, Valor;

        String T;

        do {

            System.out.println(
                    "Bienvenido a nuestra app de cuentas bancarias, por favor introduzca el numero de una de las siguientes opciones:");
            System.out.println("------------------------------------------");
            System.out.println("1 Ver cuentas");
            System.out.println("2 Ingresar dinero");
            System.out.println("3 Retirar dinero");
            System.out.println("4 Agregar cuenta");
            System.out.println("5 Eliminar cuenta");
            System.out.println("6 Buscar cuenta");
            System.out.println("7 Mostrar morosos");
            System.out.println("8 Salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    opcion1(Nombres, Cantidad);

                    break;
                case 2:

                    if (Nombres[0] == null) {
                        opcion1(Nombres, Cantidad);
                    } else {
                        opcion1(Nombres, Cantidad);
                        System.out.println("Introduzca por favor el numero de cuenta en la que desea hacer el ingreso:");
                        Ndcuenta = in.nextInt();
                        System.out.println("Ahora introduzca el valor a ingresar:");
                        Valor = in.nextInt();
                        opcion2(Cantidad, Ndcuenta, Valor);
                    }

                    break;
                case 3:
                if (Nombres[0] == null) {
                    opcion1(Nombres, Cantidad);
                } else {
                    opcion1(Nombres, Cantidad);
                    System.out.println("Introduzca por favor el numero de cuenta en la que desea hacer el retiro:");
                    Ndcuenta = in.nextInt();
                    System.out.println("Ahora introduzca el valor que desea retirar:");
                    Valor = in.nextInt();
                    opcion2(Cantidad, Ndcuenta, Valor);
                }
                    
                    break;
                case 4:
                    System.out.println("Intorduzca el numero de su nueva cuenta:");
                    Ndcuenta = in.nextInt();
                    opcion4(Ndcuenta, Nombres, Cantidad);

                    break;
                case 5:
                    System.out.println("Intorduzca el numero de cuenta que desea eleminar:");
                    Ndcuenta = in.nextInt();
                    opcion5(Ndcuenta, Nombres, Cantidad);

                    break;
                case 6:
                    System.out.println("Introduzca el nombre del usuario de la cuenta que desea buscar:");
                    T = in.nextLine();
                    

                    break;
                case 7:

                    break;

                default:
                    break;
            }

        } while (opcion != 8);
    }
}
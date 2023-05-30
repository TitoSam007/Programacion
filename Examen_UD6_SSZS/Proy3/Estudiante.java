/*
 * @utor Samuel Stefano Zamora Sanchez
 * 
 * Fecha 03/04/23
 */

public class Estudiante {

    // Daclaracion de dos arrays
    public static Estudiante[] datos = new Estudiante[30];
    public static Estudiante[] datos1 = new Estudiante[30];

    // Parametros de la clase encapsulados
    private String Nombre;
    private String Apellidos;
    private String dni;
    private int AñodeNacimiento;
    private double notamedia;

    /*
     * Constructor vacio
     */
    public Estudiante() {
    }

    /*
     * Constructor con cinco parametros
     * 
     * @param
     * 
     * @param
     * 
     * @param
     * 
     * @param
     * 
     * @param
     */
    public Estudiante(String Nombre, String Apellidos, String dni, int AñodeNacimiento, double notamedia) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.dni = dni;
        this.AñodeNacimiento = AñodeNacimiento;
        this.notamedia = notamedia;
    }

    /*
     * Metodo get
     */
    public String getNombre() {
        return Nombre;
    }

    /*
     * Metodo set
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /*
     * Metodo get
     */
    public String getApellidos() {
        return Apellidos;
    }

    /*
     * Metodo set
     */
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    /*
     * Metodo get
     */
    public String getDni() {
        return dni;
    }

    /*
     * Metodo get
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /*
     * Metodo get
     */
    public int getAñodeNacimiento() {
        return AñodeNacimiento;
    }

    /*
     * Metodo set
     */
    public void setAñodeNacimiento(int añodeNacimiento) {
        AñodeNacimiento = añodeNacimiento;
    }

    /*
     * Metodo get
     */
    public double getNotamedia() {
        return notamedia;
    }

    /*
     * Metodo set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /*
     * Seleccionar array
     */
    public static void SeleccionarArray() {

    }

    /*
     * Metodo que impreime las opciones de un menu para modificar los datos de los
     * parametros de la clase Estudiante
     */
    public static void MenuEstudianteDesplegable() {

        System.out.println("Menu de datos del estudiante: " + "\n" +
                "1.Añadir datos de un nuevo estudiante " + "\n" +
                "2.Editar datos de un estudiante " + "\n" +
                "3.Eliminar datos de un estudiante " + "\n" +
                "4.Salir");

    }

    /*
     * Metodo que nos redirecciona a una de los metodos escogidos
     */
    public static void OpcionEscogida(int opcion, Estudiante[] x, Estudiante[] x1) {
        int arrai;
        datos = x;
        datos1 = x1;
        switch (opcion) {
            case 1:// Opcion de ingresar datos
                arrai = Lector.PideEntero("Introduzca el numero de uno de los dos arrays: " + "\n" +
                        "1._1DAM" + "\n" +
                        "2._2DAM");
                if (arrai == 1) {
                    AñadirDatos(x);
                } else {
                    AñadirDatos(x1);
                }
                break;
            case 2:// Opcion de editar datos
                arrai = Lector.PideEntero("Introduzca el numero de uno de los dos arrays: " + "\n" +
                        "1._1DAM" + "\n" +
                        "2._2DAM");
                if (arrai == 1) {
                    EditarDatos(x);
                } else {
                    EditarDatos(x1);
                }
                break;
            case 3:// Opcion de eliminar datos
                arrai = Lector.PideEntero("Introduzca el numero de uno de los dos arrays: " + "\n" +
                        "1._1DAM" + "\n" +
                        "2._2DAM");
                if (arrai == 1) {
                    EliminarDatos(x);
                    ;
                } else {
                    EliminarDatos(x1);
                    ;
                }
                break;
            default:
                break;
        }
    }

    /*
     * Metodo que nos permite introducir datos en los parametros de la clase
     */
    public static void AñadirDatos(Estudiante[] x) {
        x = datos;
        int Nestudiante, AñodeNacimiento;
        String Nombre, Apellidos, dni;
        double notamedia;
        Nestudiante = Lector.PideEntero("Introduzca el numero del estudiante");

        Nombre = Lector.PedirString("Introduzca el nombre del alumno " + Nestudiante);
        x[Nestudiante].setNombre(Nombre);
        Apellidos = Lector.PedirString("Introduzca los apellidos del alumno " + Nestudiante);
        x[Nestudiante].setApellidos(Apellidos);
        dni = Lector.PedirString("Introduzca el dni del alumno " + Nestudiante);
        x[Nestudiante].setDni(dni);
        AñodeNacimiento = Lector.PideEntero("Introduzca el año de nacimiento del alumno: " + Nestudiante);
        x[Nestudiante].setAñodeNacimiento(AñodeNacimiento);
        notamedia = Lector.PideDecimal("Introduzca la nota media del alumno " + Nestudiante);
        x[Nestudiante].setNotamedia(notamedia);

        //for (int i = 0; i < x.length; i++) {
          //  if (Nestudiante == i) {
               /* x[Nestudiante].setNombre(Nombre);
                x[Nestudiante].setApellidos(Apellidos);
                x[Nestudiante].setDni(dni);
                x[Nestudiante].setAñodeNacimiento(AñodeNacimiento);
                x[Nestudiante].setNotamedia(notamedia);*/
          //  }
        //}
        Imprimeinfo(x, Nestudiante);
    }

    /*
     * Metodo que nos permite editar los datos de un alumno de la clase Estudiante
     */
    public static void EditarDatos(Estudiante[] x) {
        int Nestudiante;
        Nestudiante = Lector.PideEntero("Introduzca el numero del alumnno que busca");
        Imprimeinfo(x, Nestudiante);
        x[Nestudiante].Nombre = Lector.PedirString("Introduzca el nombre del alumno" + Nestudiante);
        x[Nestudiante].Apellidos = Lector.PedirString("Introduzca los apellidos del alumno" + Nestudiante);
        x[Nestudiante].dni = Lector.PedirString("Introduzca el dni del alumno" + Nestudiante);
        x[Nestudiante].AñodeNacimiento = Lector.PideEntero("Introduzca el año de nacimiento del alumno:" + Nestudiante);
        x[Nestudiante].notamedia = Lector.PideDecimal("Introduzca la nota media del alumno" + Nestudiante);
    }

    /*
     * Metodo que elimina los parametros de los datos de la clase estudiante
     */
    public static void EliminarDatos(Estudiante[] x) {
        int Nestudiante;
        Nestudiante = Lector.PideEntero("Introduzca el numero del alumno que esta buscando: ");
        Imprimeinfo(x, Nestudiante);
        x[Nestudiante].setNombre(null);
        x[Nestudiante].setApellidos(null);
        x[Nestudiante].setDni(null);
        x[Nestudiante].setAñodeNacimiento(0);
        x[Nestudiante].setNotamedia(0.0);
    }

    /*
     * Metodo que imprime todos los parametros de la clase Estudiante
     */
    public static void Imprimeinfo(Estudiante[] x, int n) {

        System.out.println("Alumno/a: " + x[n].Nombre + " " + x[n].Apellidos + "\n" +
                "DNI: " + x[n].dni + "\n" +
                "Edad: " + ProbarEdad(x[n].AñodeNacimiento) + "\n" +
                "Nota media: " + x[n].notamedia);
    }

    /*
     * Metodo que nos devuelve la edad del estudiante
     */
    public static int ProbarEdad(int año) {

        int edadreal;
        edadreal = 2023 - año;

        return edadreal;
    }

    /*
     * Metodo que comprueba la edad del estudiante
     */
    public static boolean ComprobarEdad(int año) {

        if (año > 1900 || año < 2009) {
            return true;
        } else {
            return false;
        }
    }

}
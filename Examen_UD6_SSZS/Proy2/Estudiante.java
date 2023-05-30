/*
 * @utor Samuel Stefano Zamora Sanchez
 * 
 * Fecha 03/04/23
 */

 public class Estudiante {
    
    //Parametros de la clase encapsulados
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
     * @param
     * @param
     * @param
     * @param
     */
    public  Estudiante(String Nombre, String Apellidos, String dni, int AñodeNacimiento, double notamedia) {
        
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
     * Metodo que imprime todos los parametros de la clase Estudiante
     */
    public static void Imprimeinfo(String nombre, String apellidos, String dni, int añodeNacimiento, double media) {
        
        System.out.println("Alumno/a: " + nombre + " " + apellidos + "\n" +
                            "DNI: " + dni + "\n" + 
                            "Edad: " + ProbarEdad(añodeNacimiento) + "\n" +
                            "Nota media: " + media);
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
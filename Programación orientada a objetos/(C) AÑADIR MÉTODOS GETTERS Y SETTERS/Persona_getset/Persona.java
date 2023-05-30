/*
 * @utor Samuel Stefano Zamora Sanchez
 */
public class Persona{

    //Atributos
    public String dni;
    public String Nombre;
    public String Apellidos;
    public int edad;

    //Constructor
    public Persona(String dni, String Nombre, String Apellidos, int edad) {
        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
    }

    /*
     * Metodo que comprueba si la persona es mayor de edad
     * 
     * @param edad almacena la edad de la persona
     */
    public void Comprobador(int edad) {
        
        this.edad = edad;
        if (edad >= 18) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" es menor de edad");
        }
    }

    /*
     * Metodo que al macena los datos de la persona
     * 
     * @param dni
     * @param Nobre
     * @Apellidos
     * @param edad
     * 
     */
    public void Datos1(String dni, String Nombre, String Apellidos, int edad){

        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;

        System.out.print(Nombre + " " + Apellidos + " cond DNI: " + dni);
        Comprobador(edad);
    }

}
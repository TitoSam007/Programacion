
public class Persona{

    private String dni;
    private String Nombre;
    private String Apellidos;
    private int edad;

    public void Comprobador(int edad) {
        
        this.edad = edad;
        if (edad >= 18) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" es menor de edad");
        }
    }

    public void Datos1(String dni, String Nombre, String Apellidos, int edad){

        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;

        System.out.print(this.Nombre + " " + this.Apellidos + " cond DNI: " + this.dni);
        Comprobador(edad);
    }

}
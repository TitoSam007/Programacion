
public class Persona {

    //ATRIBUTOS 
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    //Contructor con 3 atributos
    public Persona(String n, String a, String f) {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
    }

    //Constructor vacio
    public Persona(){

    }

    //Imprimir
    public String toString(){
        //return "Nombre: " + nombre + ", apellidos: " + apellidos + ", Fecha de nacimiento: " + fechaNacim;
        return this.getClass().getSimpleName();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    
}
import java.util.ArrayList;

public class SistemasSolar {

    //Declaración de un ArrayList
    ArrayList <Planeta> planetas = new ArrayList<>();
    protected String nombre;
    
    //Constructor con 2 parametros
    public SistemasSolar(String n, ArrayList<Planeta> p) {
    this.nombre = n;
    this.planetas = p; 
    }

    //Metodo get
    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }
    //Metodo set
    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }
    //Metodo get
    public String getNombre() {
        return nombre;
    }
    //Metodo set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPlaneta(String n){
        setNombre(n);
    }

    public void eliminarPlaneta(){
        setNombre(null);
    }

    public String toString(){
        return  "Nombre del Sistemas Solar: " + nombre + "\n" +
                "Planetas: " + planetas;
    }
}
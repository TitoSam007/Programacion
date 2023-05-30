public class Profesor  extends Persona{

    //ATRIBUTOS
    private int salario;
    private String especialidad;

    //Constructor
    public Profesor (String n, String a, String f, int s, String e){
        this.nombre = n;
        this.apellidos = a;
        this.fechaNacim = f;
        this.salario = s;
        this.especialidad = e;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString().concat("salario: " + salario + " espcialidad: " + especialidad);
    }
}

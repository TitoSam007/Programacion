
public class Alumno extends Persona{
    
    //ATRIBUTOS
    private String grupo;
    private int notamedia;

    //Constructor
    public Alumno (String n, String a, String f, String g, int nm){
        super(n,a,f);
        this.nombre = n;
        this.apellidos = a;
        this.fechaNacim = f;
        this.grupo = g;
        this.notamedia = nm;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(int notamedia) {
        this.notamedia = notamedia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString().concat("grupo: " + grupo + ", nota media: " + notamedia);
    }
}

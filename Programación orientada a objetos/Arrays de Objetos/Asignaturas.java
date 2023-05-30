public class Asignaturas {
    
    private String asginatura1;
    private String asginatura2;
    private String asginatura3;
    private String asginatura4;
    private String asginatura5;

    /*
     * Constructor con 5 parametros
     */
    public Asignaturas(String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5) {
        this.asginatura1 = asignatura1;
        this.asginatura2 = asignatura2;
        this.asginatura3 = asignatura3;
        this.asginatura4 = asignatura4;
        this.asginatura5 = asignatura5;
    }
    public String getAsignatura1(){
        return asginatura1;
    }
    public void setAsignatura1(String asignatura1) {
        this.asginatura1 = asginatura1;
    }
    public String getAsignatura2(){
        return asginatura2;
    }
    public void setAsignatura2(String asignatura2) {
        this.asginatura2 = asginatura2;
    }
    public String getAsignatura3(){
        return asginatura3;
    }
    public void setAsignatura3() {
        this.asginatura3 = asginatura3;
    }
    public String getAsignatura4(){
        return asginatura4;
    }
    public void setAsignatura4() {
        this.asginatura4 = asginatura4;
    }
    public String asignatura5(){
        return asignatura5();
    }
    public void setAsignatur5() {
        this.asginatura5 = asginatura5;
    }
    public void Array_asignaturas(String [] materias) {
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Asignatura: " + materias[i]);
        }
    }
    public void years(int n) {
        System.out.println("Tienes "+ n + " años");
    }
    
}
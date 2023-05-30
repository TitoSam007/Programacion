package EjerciciosB.Cuenta;

public class CuentaCorriente {
    
    protected String titular;
    protected double saldo;
    protected double comisionOperacion;
    protected double comisionMensual;
    protected double interesesMensual;

    //Constructor con cinco parametros
    public CuentaCorriente(String t, double s)  throws Exception{
        this.titular = t;
        saldo = s;
        comisionOperacion = 1;
        comisionMensual = 1;
        interesesMensual = 5;
    }

    //Metodo get
    public String getTitular() {
        return titular;
    }

    //Metodo set
    public void setTitular(String t) {
        this.titular = t;
    }

    //Metodo get
    public double getSaldo() {
        return saldo;
    }

    //Metodo set
    public void setSaldo(double s){
            if (s > 0) {
                saldo = s;
            } else {
                System.out.println("Error, el saldo ha de ser siempre mayor a cero");
                return;
            }
    }

    public String toString (){
        
        return  "Tipo de cuenta: " + this.getClass().getSimpleName() + "\n" +
                "Nombre del titular: " + titular + "\n" +
                "Saldo de la cuenta : " + saldo + "\n" +
                "---------------------------------------";
    }

    public boolean ingresar(double dinero) throws Exception{
        if (dinero <= 0) {
            //System.out.println("Error, no se puede ingresar una cantidad negativa o igua a cero");
            return false;
        } else {
            try {
                setSaldo(saldo + dinero - comisionOperacion);
            } catch (Exception e) {
                // TODO: handle exception
                throw e = new Exception("No se ha podido realiza el ingreso");
            }
            return true;
        }
    }

    public boolean retirar(double  dinero){
        if (0 < dinero) {
            //System.out.println("Error, la cantidad excede al saldo disponible");
            return  false;
        } else {
            saldo =- dinero;
            setSaldo(saldo);
            return true;
        }
    }

    public void actualizarMensualidad(){
        double nuevosaldo = this.saldo + (this.saldo * interesesMensual / 100) -  comisionMensual;
        setSaldo(nuevosaldo);
    }
}

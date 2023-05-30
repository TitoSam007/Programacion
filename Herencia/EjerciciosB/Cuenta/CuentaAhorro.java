package EjerciciosB.Cuenta;

public class CuentaAhorro  extends CuentaCorriente{

    private static int MAX_OPERACIONES;
    private int contadorOperaciones;

    public CuentaAhorro(String t, double s) throws Exception{
        super(t, s);
        comisionOperacion = 1;
        comisionMensual = 0;
        interesesMensual = 10;
        //TODO Auto-generated constructor stub
    }
    
    public boolean ingresar(double dinero) throws Exception{
        if (contadorOperaciones < MAX_OPERACIONES || super.ingresar(dinero)) {
            contadorOperaciones++;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(double dinero){
        if (dinero > 0) {
            super.retirar(dinero);
            return true;
        } else{
            return false;
        }
    }
}

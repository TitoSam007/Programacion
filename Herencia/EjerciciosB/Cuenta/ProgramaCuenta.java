package EjerciciosB.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaCuenta{

    public static void main(String[] args) throws Exception {
        
        Scanner scr = new Scanner(System.in);
        ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
        CuentaCorriente c1, c2;
        //cuentas.add(new CuentaCorriente("Manolo", 450.0));
        c1 = new CuentaCorriente("Manolo", 450.0);
        c2 = new CuentaCorriente("Juditt", 200);

        //Ingresos
        c1.ingresar(100);
        //c2.ingresar(0);

        //Retiros
        c2.retirar(600);
        //c1.retirar(600);

        //Actualizar
        c1.actualizarMensualidad();
        //c2.actualizarMensualidad();

        //Imprimir
        System.out.println(c1);
        //System.out.println(c2);
        /*for (CuentaCorriente cuentaCorriente : cuentas) {
            System.out.println(cuentas);
        }*/
    }
}
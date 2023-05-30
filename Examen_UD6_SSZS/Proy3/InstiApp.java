/*
 * @utor Samuel Stefano Zamora Sanchez
 * 
 * Fecha 03/04/23
 */

public class InstiApp {
    
    public static void main(String[] args) {

        /*
         * Daclaracion de dos arrays tipo Estudiante
         */
        Estudiante [] _1Dam = new Estudiante [30];
        Estudiante [] _2Dam = new Estudiante [30];
        int opcion;
        
        
        do {
            Estudiante.MenuEstudianteDesplegable();
            opcion = Lector.PideEntero("Introduzca una de las opciones");
            Estudiante.OpcionEscogida(opcion, _1Dam, _2Dam);
        } while (opcion != 4);
    }
}

/*
 * @utor Samuel Stefano Zamora Sanchez
 */
import java.util.Scanner;

public class Programa_articulo {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Articulo Producto_basico,Producto_modificado;
        Producto_basico= new Articulo(null, 0, 0, 0);
        Producto_modificado = new Articulo(null, 0, 0, 0);
        String Nombre;
        double precio;
        int cantidad;

        System.out.println("Introduzca el nombre del producto qaue desea comprar.");
        Nombre = lector.nextLine();
        System.out.println("Introduzca el precio del producto seleccionado.");
        precio = lector.nextDouble();
        System.out.println("Introduzca la cantidad de producto que qauedan en el almacen");
        cantidad = lector.nextInt();

        Producto_basico.Nombre_producto(Nombre);
        Producto_basico.IVA_producto(precio);
        Producto_basico.Cantidad_productos(cantidad);
        Producto_modificado.PrecioModificado_producto(precio);
    }
}
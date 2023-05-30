/*
 * @autor Samuel Stefano Zamora Sanchez 
 */
public class Articulo {

    /*
     * @param Nombre nombre del producto
     * @param Precio precio del producto
     * @param IVA 
     * @param cuantosQuedan cantidad de productos
     */
    public String Nombre;
    public double Precio;
    public double IVA = 1.21;
    public int  cuantosQuedan;

    /*
     * Metodo que imprime el nombre del producto
     * 
     * Atributo Nombre
     */
    public void Nombre_producto(String Nombre) {

        this.Nombre = Nombre;
        System.out.println("Producto: " + Nombre);
    }
    /*
     * Metodo que imprime el precio del producto
     * 
     * Atributo precio
     */
    public void Precio_producto(int precio) {

        this.Precio = precio;
        System.out.println("Precio: " + precio);
    }
    /*
     * Metodo que modifica y imprime el precio del producto
     * 
     * Atributo precio
     */
    public void PrecioModificado_producto(Double precio) {
        
        this.Precio = precio;
        precio += 2.1;
        System.out.println("El precio del producto modificado da igual a: " + precio);
    }
    /*
     * Metodo que imprime el precio del producto más el IVA
     * 
     * Atributo precio
     */
    public void IVA_producto(Double precio) {
       
        this.Precio = precio;
        double iva;
        iva = precio * IVA;
        System.out.println("El precio más el iva es: " + iva);
    }
    /*
     * Metodo que imprime la cantidad de productos que quedan en el almacen
     * 
     * Atributo cantidad
     */
    public void Cantidad_productos(int cantidad) {

        this.cuantosQuedan = cantidad;
        System.out.println("Quedan: " + cantidad + " productos en el almacen.");
    }

}
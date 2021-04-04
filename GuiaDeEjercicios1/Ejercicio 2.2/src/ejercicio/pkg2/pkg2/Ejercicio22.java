/*
2) Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se
trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo
de esta realiza los siguientes controles:
a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se
permiten compras inferiores a 5 productos.
b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un
mensaje que el costo de envío es de $200.
c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje
de que el envío es gratuito.
Realizar el programa necesario para llevar a cabo los 3 controles citados.
 */
package ejercicio.pkg2.pkg2;
import java.util.Scanner;//libreria scanner para obtener balores por consola
/**
 *
 * @author DarioBarboso
 */
public class Ejercicio22 {

    public static void main(String[] args) {
   Scanner dato = new Scanner(System.in);
   int cantProductos;
        System.out.println("Ingrese una cantidad: ");
        cantProductos=dato.nextInt();
        if(cantProductos<5){
            System.out.println("No se permiten compras menores a 5.");
        }else if(cantProductos >= 5 && cantProductos <=15){
            System.out.println("El costo de envio será de 200.");
        }else if(cantProductos > 15){
            System.out.println("El envio es gratuito.");
    }
        
    }
    
}

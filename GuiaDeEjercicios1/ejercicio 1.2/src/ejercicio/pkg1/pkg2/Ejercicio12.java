/*
2) Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo:
Si una variable numero vale 35, y una variable numero2 vale 20, realizar las acciones
necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el
cambio mostrar el resultado por pantalla.
 */
package ejercicio.pkg1.pkg2;

/**
 *
 * @author DarioBarboso
 */
public class Ejercicio12 {

    public static void main(String[] args) {
       int v1=20;
       int v2=30;
       int aux=0;
        System.out.println("Valores actuales: v1= " + v1 + "; v2 = " + v2 + ";" );
       aux=v1;
       v1=v2;
       v2=aux;
       System.out.println("Valor de intercambio: v1= " + v1 + "; v2 = " + v2 + ";");
       
       
    }
    
}

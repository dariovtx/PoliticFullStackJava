/*
Un gerente de una empresa prestadora de servicios de internet necesita un programa que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI
del cliente y el tipo de servicio. Los tipos de servicio son 3:
i.Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
ii.Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
iii.Internet 100 megas (Cuyo valor fijo es de $1600)
El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el
que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar
y el número de servicio con el que cuenta.

 */
package ejercicio2.pkg1;

import java.util.Scanner;

/**
 *
 * @author DarioBarboso 
 */
public class Ejercicio21 {

    public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
       int DNI, Servicio;
       
      for(int i=0;i<5;i++){
           System.out.println("Ingrese su DNI : ");
           DNI=dato.nextInt();
           System.out.println("Ingrese su El servicio: ");
           Servicio=dato.nextInt();
           if(Servicio == 1){
               System.out.println("Su DNI: " + DNI + "El monto a pagar es de $" + (890 - (890*0.1)) );  
           }else if(Servicio==2){
               System.out.println("Su DNI: " + DNI + "El monto a pagar es de $" + (1050 - (1050*0.5)));  
           }else if(Servicio == 3){
               System.out.println("Su DNI: " + DNI + "El monto a pagar es de $" + 1600);  
           }
       }
    }
    
}

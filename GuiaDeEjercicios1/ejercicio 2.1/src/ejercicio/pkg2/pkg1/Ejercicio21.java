/*
 1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los
mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y
muestre en pantalla el correspondiente sueldo.
 */
package ejercicio.pkg2.pkg1;
import java.util.Scanner;//libreria scanner para obtener balores por consola
/**
 * @author DarioBarboso
 */
public class Ejercicio21 {

    public static void main(String[] args) {
      boolean bandera=false;//Variable de condicion del while
      int puesto=0;
      double cobroC= 25630.20;
      double cobroR=15890 + (15890 * 0.1);
      double cobroS=35560.20 - (35560.20 * 0.11);
      
        Scanner dato = new Scanner(System.in);
        do{//Utilizo do while porque al menos una vez se tiene que ejecutar esta operacion
        System.out.println("Ingrese su numero de puesto de trabajo: ");
         System.out.println("Cajero : 1");
         System.out.println("Repositor : 2");
         System.out.println("Supervisor : 3");
         puesto=dato.nextInt();//obtengo el puesto que el usuario 
          switch(puesto){//Busco la informacion del sueldo segun su puesto de trabajo
                  case 1:System.out.println("Su sueldo es: " + cobroC);
                  bandera=true;break;
                  case 2:System.out.println("Su sueldo es: " + cobroR);
                  bandera=true; break;
                  case 3:System.out.println("Su sueldo es: " + cobroS);
                  bandera=true;break;
                  default:System.out.println("ERROR debe colocar solamente 1 o 2 o 3.");
          }
        
        }while(bandera!=true);
    }
    
}

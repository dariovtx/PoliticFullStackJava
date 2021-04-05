/*
 Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto
necesita un programa que, para cada cálculo, permita el ingreso de los dos números por
separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe
poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
Por ejemplo:
Número 1 = 25 Número 2 = 15 Operador = +
 */
package ejercicio2.pkg2;

import java.util.Scanner;

/**
 *
 * @author DarioBarboso
 */
public class Ejercicio22 {

   
    public static void main(String[] args) {
        Scanner datoI = new Scanner(System.in);
        Scanner datoS = new Scanner(System.in);
     double num1=0,num2=0, resultado=0;
     String operador;
        System.out.println("ingrese numero 1");
        num1=datoI.nextInt();
        System.out.println("ingrese numero 2");
       num2=datoI.nextInt();
        System.out.println("ingrese el operador");
        operador=datoS.nextLine();
        if(operador.equals("*")){
            resultado=num1*num2;
        }else if(operador.equals("+")){
            resultado=num1+num2;
        }else if(operador.equals("-")){
            resultado=num1-num2;
        }else if(operador.equals("/")&& num2!=0){
            resultado=num1/num2;
        }
        if(!(!operador.equals("/")&& num2==0)){
            System.out.println("No se puede dividir por cero.");
        }else{
        System.out.println("Su resultado es: " + resultado );
        
        }
    }
    
}

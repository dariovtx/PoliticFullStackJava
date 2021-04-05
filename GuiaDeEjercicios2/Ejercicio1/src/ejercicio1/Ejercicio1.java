/*
 1) Ejercicios introductorios
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DarioBarboso
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*a. Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro).
        Utilizar para esto alguna estructura repetitiva.
        Solucion:
        for(int i=1; i<36;i++){
            System.out.println(i);
        }
      */   
    /*
    b. Realizar un programa que dado por teclado un límite numérico por teclado (por ejemplo
    100) muestre en pantalla todos los números hasta ese límite (empezando por 1).
   
   
     Scanner dato = new Scanner(System.in);  
     int desde=1, hasta; 
    
        System.out.println("Ingrese el numero ");
        hasta= dato.nextInt();
        while(desde<=hasta){
            System.out.println(desde);
            desde++;
        } */
    /*
    c. Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2
    en dos. La secuencia debería ser: 200…202…204…etc.
    
    for(int i=200;i<=250;i+=2){
        System.out.println(i);
    }
    */
    /*
    d. Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta
    debe comenzar en 10 y terminar en 1.
    
    for(int i=10;i>0;i--){
        System.out.println(i);
    }*/
    /*
    e. Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado
     hasta que se ingrese la palabra “salir”.
    */
    Scanner dato = new Scanner(System.in);
    
    String palabra;
    do{
        System.out.println("Ingrese una palabra");
        palabra=dato.nextLine();
    }while(!palabra.equals("salir"));
    
    }
    
}

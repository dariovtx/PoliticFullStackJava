/*
 En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el
marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el
día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede
llegar a haber. Desde la Federación de Colectividades (Organismo que organiza),
manifestaron que se solicitan los siguientes datos para la inscripción de cada participante:
dni, nombre, apellido y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
• Menores A (de 6 a 10 años)
• Menores B (de 11 a 17 años)
• Juveniles (de 18 a 30 años)
• Adultos (de 31 a 50 años)
• Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante,
se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar
el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre
con la palabra “fin”.
 */
package ejercicio2.pkg3;

import java.util.Scanner;

/**
 *
 * @author DarioBarboso
 */
public class Ejercicio23 {

 
    public static void main(String[] args) {
        Scanner dato1= new Scanner(System.in);
        Scanner dato2= new Scanner(System.in);
        int edad=0, dni=0;
        String nombre, apellido;
            
        
        do{
            System.out.println("Ingrese su DNI: ");
            dni=dato1.nextInt();
            System.out.println("Ingrese su edad: ");
            edad=dato1.nextInt();
            System.out.println("Ingrese su nombre: ");
            nombre=dato2.nextLine();
            System.out.println("Ingrese su apellido: ");
            apellido=dato2.nextLine();
            if(edad>=6 && edad<=10){
                System.out.println("Menores A ");
            }else if(edad>=11 && edad<=17){
                System.out.println("Menores B ");
            }else if(edad>=18 && edad<=30){
                System.out.println("Juveniles ");
            }else if(edad>=31 && edad<=50){
                System.out.println("Adultos ");
            }else if(edad>50){
                 System.out.println("Adultos Mayores");
            }
        }while(dni!=0 || !nombre.equals("fin") || !apellido.equals("fin"));
    }
    
}

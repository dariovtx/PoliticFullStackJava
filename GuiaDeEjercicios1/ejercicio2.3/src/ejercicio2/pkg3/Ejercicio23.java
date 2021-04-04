/*
 3) Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases. Para
ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno, le
informe en qué días y horarios los alumnos tienen clases. Como información, la academia
proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD del
alumno, el sistema informe por pantalla los días y horarios de cursada.
 */
package ejercicio2.pkg3;
import java.util.Scanner;
/**
 *
 * @author DarioBarboso
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        int edad=0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad=dato.nextInt();
        if(edad>=4 && edad<=6){
            System.out.println("Lunes y Miércoles de 16 a 17.");
        }else if(edad>=7 && edad<=8){
            System.out.println("Martes y Jueves de 16:30 a 17:30");
        }else if(edad>=9 && edad<=10){
            System.out.println("Martes y Jueves de 17:30 a 19");
        }else if(edad>=11 && edad<=13){
            System.out.println("Lunes y Miércoles de 17 a 18:30");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.pkg1;

/**
 *
 * 
1) Probar realizar las operaciones que se citan a continuación en el IDE Netbeans, registrar
los errores obtenidos y responder a las preguntas citadas.
a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.
b. Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo
double. ¿Existe un error? ¿Se puede hacer esta operación?
c. Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo
entero. ¿Existe un error? ¿Se puede hacer esta operación?
d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se puede hacer esta
operación?
e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la
asignación?
 * @author DarioBarboso
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int v1=1;
        double v2;
        String v3;
        
  //---------------------------------------------------------------------------------------------------------
        v2=v1;
        System.out.println(" Se le asigna V1 a V2: " + v2 );//b)Se puede hacer no hay error.
  //---------------------------------------------------------------------------------------------------------
        v2=3.5;
        v1=(int)v2;
    System.out.println(" Se le asigna V2 a V1: " + v1 );//c)Se puede si lo casteo en int y no hay error.
  //---------------------------------------------------------------------------------------------------------
    v3="35";
    System.out.println(" Se le asigna 35 a V3: " + v3 );//b)Se puede hacer no hay error si uso comillas.
  //---------------------------------------------------------------------------------------------------------
    //Para asignar el numero 48 a un string se le debe colocar comillas al numero
    v3="48";
    System.out.println(" Se le asigna 48 a V3: " + v3 );
    
  //---------------------------------------------------------------------------------------------------------
    }
    
}

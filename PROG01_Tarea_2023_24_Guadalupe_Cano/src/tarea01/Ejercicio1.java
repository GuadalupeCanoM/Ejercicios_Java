
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 * 
 */
public class Ejercicio1 {

    
         public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
 
        // Constantes
        final double PI = 3.1415927;  // La declaro como final para evitar que su valor pueda ser modificado

        // Variables de entrada
        double radio, altura;
        
        // Variables de salida
        double volumenCilindro;

        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 1: Cálculo del volumen de un cilindro ");
        System.out.println("----------------------");
        
        System.out.print("Introduce el radio del cilindro: ");        // Mostramos un mensaje sobre la información que vamos a pedir por teclado
        radio = teclado.nextDouble();                                 // A través del Scanner pedimos al usuario que introduzca un número double
        
        System.out.print("Introduce la altura del cilindro: ");
        altura = teclado.nextDouble();
        
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Aplico la formula dada en la tarea: 
        volumenCilindro = PI * (radio*radio) * altura;
            
  
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        
        //Uso printf para formatear la salida. %.2f se usa para números reales y especifica que se muestren dos decimales.
        System.out.printf("El volumen de un cilindro de radio %.2f y altura %.2f es %.2f %n", radio, altura, volumenCilindro);
            
             
        System.out.println ();
        System.out.println ("Fin del programa.");     
    }

}

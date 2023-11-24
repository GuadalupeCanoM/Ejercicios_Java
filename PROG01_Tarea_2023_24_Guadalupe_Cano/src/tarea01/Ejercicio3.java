
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        String primeraPalabra, segundaPalabra, terceraPalabra;
        
        // Variables de salida
        boolean menos6caracteres, mayorLongitudDe3, palabrasEncadenadas, palabrasCirculares;

        // Variables auxiliares


        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 3: Palabras encadenadas");
        System.out.println("----------------------");
        
        System.out.print("Introduce la PRIMERA palabra: ");
        primeraPalabra = teclado.nextLine(); 
        
        System.out.print("Introduce la SEGUNDA palabra: ");
        segundaPalabra = teclado.nextLine();
        
        System.out.print("Introduce la TERCERA palabra: ");
        terceraPalabra = teclado.nextLine();
        
        /*Una opción para convertir las palabras que ingresa el usuario a minúscula
        es poniendo en cada una de las palabras el método toLowerCase() ej: terceraPalabra = teclado.nextLine().toLowerCase(); 
        No sé si es más correcto ponerlo en la entrada de datos y convertir todo lo que introduzca
        el usuario en minúscula o convertir a minúsculas solo en los apartados que necesitamos ignorar las minúsculas/mayúsculas */
        


        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Si las dos primeras palabras introducidas tienen menos de 6 caracteres o la tercera palabra tiene más de 8 caracteres.
        /* Para determinar si las dos primeras palabras tienen menos de 6 caracteres o la tercera más de 8, utilizo la operación ||
         para evaluar las dos condiciones*/
        menos6caracteres = (primeraPalabra.length() < 6 && segundaPalabra.length() < 6)  || terceraPalabra.length() > 8;
        
        // Si la segunda palabra es la de mayor longitud de las tres.
        /*Para determinar si la segunda palabra es la de mayor longitud, utilizo la operación && para evaluar dos condiciones*/
        mayorLongitudDe3 = segundaPalabra.length() > primeraPalabra.length() && segundaPalabra.length() > terceraPalabra.length();
        
        // Si las tres están encadenadas (la última de una palabra es igual a la primera letra de la siguiente) o no
        /*Para determinar si las tres palabras están encadenadas utilizo el método chartAt() para obtener la última letra
        de cada palabra. chartAt() recibe un índice como parámetro. Utilizo toLowerCase() para pasar la cadena a minúscula.
        El índice 0 representa la primera letra de la palabra y el -1 la última letra*/
       palabrasEncadenadas = primeraPalabra.toLowerCase().charAt(primeraPalabra.length() - 1) == segundaPalabra.toLowerCase().charAt(0) &&
                              segundaPalabra.toLowerCase().charAt(segundaPalabra.length() - 1) == terceraPalabra.toLowerCase().charAt(0);
   
        
        /* Si se trata de palabras circulares (palabras encadenadas en la que la última letra de la última palabra 
        también coincide con la primera letra de la primera palabra) o no. */
        /*Utilizo la última letra de la última palabra para compararla con la primera letra de la primera palabra.
        Utilizo toLowerCase() para pasar la cadena a minúscula.*/
        palabrasCirculares = primeraPalabra.toLowerCase().charAt(primeraPalabra.length() - 1) == segundaPalabra.toLowerCase().charAt(0) &&
                             segundaPalabra.toLowerCase().charAt(segundaPalabra.length() - 1) == terceraPalabra.toLowerCase().charAt(0) &&
                             terceraPalabra.toLowerCase().charAt(terceraPalabra.length() - 1) == primeraPalabra.toLowerCase().charAt(0);
        
       
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        // Utilizo condicional ternario para que si es TRUE imprima "SI" y si false imprima "NO".
        System.out.println("La longitud de las dos primeras palabras es menor de 6 o la longitud de la tercera es mayor de 8 caracteres: " + (menos6caracteres ? "SI" : "NO"));
        System.out.println("La segunda palabra es la de mayor longitud: " + (mayorLongitudDe3 ? "SI" : "NO"));
        System.out.println("Las tres palabras introducidas son palabras encadenadas: " + (palabrasEncadenadas ? "SI" : "NO"));
        System.out.println("Las tres palabras introducidas son palabras circulares: " + (palabrasCirculares ? "SI" : "NO"));


        System.out.println ();
        System.out.println ("Fin del programa.");     
    }

}


package Tarea1;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio6 {

    
         public static void main(String[] args) {

              //----------------------------------------------
        //          Declaraci?n de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        String texto;

        // Variables de salida
        boolean masDeCincoCaracteres, primeraLetraMayuscula, ultimaLetraMinuscula, finalizaPuntosSuspensivos;

        // Variables auxiliares
        char primeraLetra, ultimaLetra;
        int letra;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("AN?LISIS DE UN TEXTO");
        System.out.println("--------------------");
        System.out.println("Introduzca un texto: ");
        texto = teclado.nextLine();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //El texto contiene más de cinco caracteres,
        masDeCincoCaracteres = texto.length() > 5;

        //El texto comienza por una letra mayúscula,
        //Con esta instrucción estraemos el primer caracter. (0).
        primeraLetra = texto.charAt(0);
        //Hago la comparación mediante ASCII. Si el primer caracter se encuentra entre A y Z es verdadero. 
        primeraLetraMayuscula = primeraLetra >= 'A' && primeraLetra <= 'Z';

        //El texto termina con una letra minúscula.
        //Con esta instrucción extraemos el ?ltimo caracter. 
        ultimaLetra = texto.charAt(texto.length() - 1);
        //Al pasar los caracteres a y z a char se puede comparar con la última letra extraida del texto
        ultimaLetraMinuscula = ultimaLetra >= 'a' && ultimaLetra <= 'z';

        //El texto finaliza con unos puntos suspensivos ("...").
        //Uso el condicional por si el usuario escribe una palabra de menos de 2 caracteres. 
        letra = (texto.length() > 2) ? 3 : texto.length();
        finalizaPuntosSuspensivos = texto.substring(texto.length() - letra).equals("...");

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El texto contiene m?s de cinco caracteres: " + masDeCincoCaracteres);
        System.out.println("El texto comienza con una letra mayúscula: " + primeraLetraMayuscula);
        System.out.println("El texto termina con una letra minúscula: " + ultimaLetraMinuscula);
        System.out.println("El texto termina con unos puntos suspensivos: (...) " + finalizaPuntosSuspensivos);

        System.out.println();
        System.out.println("Fin del programa.");
        
    
    }

}

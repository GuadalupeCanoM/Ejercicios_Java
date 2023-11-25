
package Tarea1;

import java.util.Scanner;


/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {
 //----------------------------------------------
        //          Declaraci?n de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int numero;

        // Variables de salida
        boolean distintoACero, esNegativo, entreCeroYDiez, MultiploDeTresPositivoMenorDeVeinte;

        // Variables auxiliares
        // Clase Scanner para petici?n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DE UN NÚMERO");
        System.out.println("---------------------");
        System.out.println("Introduzca un número entero");
        numero = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // C?lculo de los resultados l?gicos
        //si es distinto de cero,
        distintoACero = numero != 0;

        //si es negativo,
        esNegativo = numero < 0;

        //si est? entre cero y diez, ambos incluidos,
        entreCeroYDiez = numero >= 0 && numero <= 10;

        //si es un m?ltiplo de tres, positivo y menor que veinte.
        MultiploDeTresPositivoMenorDeVeinte = (numero % 3 == 0 && numero > 0 && numero < 20);

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("¿El número es distinto a 0? " + distintoACero);
        System.out.println("¿El número es negativo? " + esNegativo);
        System.out.println("¿El número está entre cero y diez (ambos inclusive)? " + entreCeroYDiez);
        System.out.println("¿El número es múltiplo de tres, positivo y menor que veinte? " + MultiploDeTresPositivoMenorDeVeinte);

        System.out.println();
        System.out.println("Fin del programa.");
 
    }

}

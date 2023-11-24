
package Tarea1;

import java.util.Scanner;




/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    
         public static void main(String[] args) {
       //----------------------------------------------
        //          Declaraci?n de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        double primerNumero, segundoNumero;

        // Variables de salida
        double triplePrimerNumero, decimaParteSegundoNumero, cuadradoDobleDelProducto, mitadCuadradoSuma;

        // Variables auxiliares
        double resultado1, resultado2;

        // Clase Scanner para petici?n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("C?LCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        System.out.println("Introduzca dos números reales: ");
        System.out.println("Primer número: ");
        primerNumero = teclado.nextDouble();
        System.out.print("Segundo número: ");
        segundoNumero = teclado.nextDouble();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Primer cálculo: triple del primer n?mero
        triplePrimerNumero = primerNumero * 3.0;

        // Segundo cálculo: d?cima parte del segundo n?mero
        decimaParteSegundoNumero = segundoNumero / 10.0;

        // Tercer cálculo: cuadrado del doble del producto de ambos números
        resultado1 = (primerNumero * primerNumero) * 2;
        resultado2 = (segundoNumero * segundoNumero) * 2;
        cuadradoDobleDelProducto = resultado1 * resultado2;

        // Cuarto c?lculo: mitad del cuadrado de la suma de ambos números
        mitadCuadradoSuma = (primerNumero + segundoNumero) * (primerNumero + segundoNumero) / 2.0;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Triple del primer numero es: " + triplePrimerNumero);
        System.out.println("D?cima parte del segundo n?mero es: " + decimaParteSegundoNumero);
        System.out.println("Cuadrado del doble del producto de ambos n?meros es: " + cuadradoDobleDelProducto);
        System.out.println("Mitad del cuadrado de la suma de ambos n?meros es: " + mitadCuadradoSuma);

        System.out.println();
        System.out.println("Fin del programa.");
  
    }

}

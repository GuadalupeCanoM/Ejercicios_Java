
package Tarea1;

import java.util.Scanner;

/**
 * Ejercicio 2: Operadores aritméticos
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

         public static void main(String[] args) {
             
             // Variables de entrada
             int primerNumero, segundoNumero, tercerNumero;
             
             // Variables de salida
             double sumaDosPrimerosNumeros;
             boolean esPar;
             boolean restoPrimerNumero;
             boolean multiplicacionPrimerNumero;
             boolean cuadradoPrimerNumero;
             // Clase Scanner
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("Ejercicio 2: Operadores Aritméticos");
             System.out.println("----------------------------------");
             
             System.out.print("Introduce el primer número: ");
             primerNumero = teclado.nextInt();
             
             System.out.print("Introduce el segundo número: ");
             segundoNumero = teclado.nextInt();
             
             System.out.print("Introduce el tercer número: ");
             tercerNumero = teclado.nextInt();
             
             
             // Procesamiento
             
             // La suma de los dos primeros números divididos por el tercer número
             sumaDosPrimerosNumeros = (primerNumero + segundoNumero) / tercerNumero;
             
             // Si la suma de los tres número es par
             esPar = (primerNumero + segundoNumero + tercerNumero) % 2 == 0;
             
             // Si el resto del primer número dividido por el segundo número es distinto a 0
             restoPrimerNumero = primerNumero % segundoNumero != 0;
             
             // Si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número
             multiplicacionPrimerNumero = primerNumero * (segundoNumero / 2) > tercerNumero;
             
             // Si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0
             cuadradoPrimerNumero = (primerNumero * primerNumero) - (tercerNumero * 3) < 0;
             
             
             // Resultados
             System.out.println();
             System.out.println("RESULTADOS");
             System.out.println("--------------");
             System.out.println("Comprobamos el valor de la suma de dos primer números dividida por el tercer número: " + sumaDosPrimerosNumeros);
             System.out.println("Comprobamos si la suma de los tres número es par: " + esPar);
             System.out.println("Comprobamos si el resto del primer número dividio por el segundo número es distinto de cero: " +  restoPrimerNumero);
             System.out.println("Comprobamos si la multiplicación del primer número por la mitad del segundo número es mayor que el tercer número: " + multiplicacionPrimerNumero);
             System.out.println("Comprobamos si el resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que cero: " + cuadradoPrimerNumero);
             
             System.out.println();
             System.out.println("Fin del programa");
    }

}

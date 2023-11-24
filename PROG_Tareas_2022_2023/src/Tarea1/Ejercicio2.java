
package Tarea1;

import java.util.Scanner;

/**
 * Ejercicio 2: Operadores aritm�ticos
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
             
             System.out.println("Ejercicio 2: Operadores Aritm�ticos");
             System.out.println("----------------------------------");
             
             System.out.print("Introduce el primer n�mero: ");
             primerNumero = teclado.nextInt();
             
             System.out.print("Introduce el segundo n�mero: ");
             segundoNumero = teclado.nextInt();
             
             System.out.print("Introduce el tercer n�mero: ");
             tercerNumero = teclado.nextInt();
             
             
             // Procesamiento
             
             // La suma de los dos primeros n�meros divididos por el tercer n�mero
             sumaDosPrimerosNumeros = (primerNumero + segundoNumero) / tercerNumero;
             
             // Si la suma de los tres n�mero es par
             esPar = (primerNumero + segundoNumero + tercerNumero) % 2 == 0;
             
             // Si el resto del primer n�mero dividido por el segundo n�mero es distinto a 0
             restoPrimerNumero = primerNumero % segundoNumero != 0;
             
             // Si la multiplicaci�n del primer n�mero por la mitad del segundo n�mero es mayor que el tercer n�mero
             multiplicacionPrimerNumero = primerNumero * (segundoNumero / 2) > tercerNumero;
             
             // Si el resultado del cuadrado del primer n�mero menos el triple del segundo n�mero por el tercer n�mero es menor que 0
             cuadradoPrimerNumero = (primerNumero * primerNumero) - (tercerNumero * 3) < 0;
             
             
             // Resultados
             System.out.println();
             System.out.println("RESULTADOS");
             System.out.println("--------------");
             System.out.println("Comprobamos el valor de la suma de dos primer n�meros dividida por el tercer n�mero: " + sumaDosPrimerosNumeros);
             System.out.println("Comprobamos si la suma de los tres n�mero es par: " + esPar);
             System.out.println("Comprobamos si el resto del primer n�mero dividio por el segundo n�mero es distinto de cero: " +  restoPrimerNumero);
             System.out.println("Comprobamos si la multiplicaci�n del primer n�mero por la mitad del segundo n�mero es mayor que el tercer n�mero: " + multiplicacionPrimerNumero);
             System.out.println("Comprobamos si el resultado del cuadrado del primer n�mero menos el triple del segundo n�mero por el tercer n�mero es menor que cero: " + cuadradoPrimerNumero);
             
             System.out.println();
             System.out.println("Fin del programa");
    }

}

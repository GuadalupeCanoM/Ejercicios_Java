package Ejercicio_Luis_Repaso;

import java.util.Scanner;

/**
 * Ejercicio 5: Crea un programa que acepte un entero y que muestre al usuario
 * todos los n�meros primos que son menores o iguales que el n�mero introducido.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int divisores = 0;
        System.out.print("Introduzca un n�mero entero y te mostrar� los n�meros primos que hay hasta tu n�mero: ");
        int numero = teclado.nextInt();
        System.out.println();
        
        
        // Se inicia la variable desde el n�mero que introduzca el usuario
        // La variabla va a ir del n�mero hasta el 2 (el 1 no es primo)
        // Va a ir decrementando su valor en cada iteraci�n
        for (int i = numero; i >= 2; i--) {
            
            // Se reinicia la variable divisores en cada iteraci�n del bucle
            divisores = 0;
            // Se recorre del 1 hasta el mismo n�mero 
            for (int j = 1; j <= i; j++) {
                // Se verifica los n�meros que tienen divisores enteros
                if (i % j == 0) {
                    divisores++;
                }
            }
            // Los n�meros que tienen dos divisisores son primos
            if (divisores == 2) {
                System.out.println(" El n�mero " + i + " es primo");
            }
        }

    }

}

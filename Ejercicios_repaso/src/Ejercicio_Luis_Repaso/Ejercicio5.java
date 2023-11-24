package Ejercicio_Luis_Repaso;

import java.util.Scanner;

/**
 * Ejercicio 5: Crea un programa que acepte un entero y que muestre al usuario
 * todos los números primos que son menores o iguales que el número introducido.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int divisores = 0;
        System.out.print("Introduzca un número entero y te mostraré los números primos que hay hasta tu número: ");
        int numero = teclado.nextInt();
        System.out.println();
        
        
        // Se inicia la variable desde el número que introduzca el usuario
        // La variabla va a ir del número hasta el 2 (el 1 no es primo)
        // Va a ir decrementando su valor en cada iteración
        for (int i = numero; i >= 2; i--) {
            
            // Se reinicia la variable divisores en cada iteración del bucle
            divisores = 0;
            // Se recorre del 1 hasta el mismo número 
            for (int j = 1; j <= i; j++) {
                // Se verifica los números que tienen divisores enteros
                if (i % j == 0) {
                    divisores++;
                }
            }
            // Los números que tienen dos divisisores son primos
            if (divisores == 2) {
                System.out.println(" El número " + i + " es primo");
            }
        }

    }

}

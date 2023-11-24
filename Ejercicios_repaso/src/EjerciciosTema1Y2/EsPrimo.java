package EjerciciosTema1Y2;

import java.util.Scanner;


/**
 * Escribe un programa, que dado un número, compruebe si es o no un número
 * primo. Un número es primo cuando no se puede dividir por ningun otro número
 * (excepto 1 y si mismo)
 *
 * @author Guadalupe Cano Moyano
 */
public class EsPrimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número y te diré si es primo: ");
        int numero = teclado.nextInt();

        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            // En cada iteración se verifica si el número ingresado es divisible por i
            if (numero % i == 0) {
                // Si es divisible incrementa la variable divisores en 1
                divisores++;

            }

        }
        // Si tiene dos divisores que el resto de 0 es primo
        if (divisores == 2) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }

    }

}

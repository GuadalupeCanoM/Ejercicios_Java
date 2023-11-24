package EjerciciosTema1Y2;

import java.util.Scanner;


/**
 * Escribe un programa, que dado un n�mero, compruebe si es o no un n�mero
 * primo. Un n�mero es primo cuando no se puede dividir por ningun otro n�mero
 * (excepto 1 y si mismo)
 *
 * @author Guadalupe Cano Moyano
 */
public class EsPrimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un n�mero y te dir� si es primo: ");
        int numero = teclado.nextInt();

        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            // En cada iteraci�n se verifica si el n�mero ingresado es divisible por i
            if (numero % i == 0) {
                // Si es divisible incrementa la variable divisores en 1
                divisores++;

            }

        }
        // Si tiene dos divisores que el resto de 0 es primo
        if (divisores == 2) {
            System.out.println("El n�mero " + numero + " es primo");
        } else {
            System.out.println("El n�mero " + numero + " no es primo");
        }

    }

}

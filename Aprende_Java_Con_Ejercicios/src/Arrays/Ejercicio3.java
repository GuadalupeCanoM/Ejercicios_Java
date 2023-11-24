package Arrays;

import java.util.Scanner;

/**
 * 7.1 Arrays
 *
 * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Guadalupe Cano
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca 10 números enteros.");

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los números introducidos al revés son los siguientes: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }

}

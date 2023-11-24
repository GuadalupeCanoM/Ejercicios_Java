package Arrays;

import java.util.Scanner;

/**
 * 7.1 Arrays
 *
 * 5. Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numeros[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }

    }

}

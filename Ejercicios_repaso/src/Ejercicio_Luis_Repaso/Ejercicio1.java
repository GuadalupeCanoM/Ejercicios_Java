

package Ejercicio_Luis_Repaso;

import java.util.Scanner;

/**
 * Ejercicio 1: Utilizando bucles anidados, crea la siguiente salida por consola
 *  $
 *  $$
 *  $$$
 *  $$$$
 *  $$$$$
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio1 {

    
         public static void main(String[] args) {
                System.out.print("Introduce la altura del triángulo: ");
                int altura = new Scanner (System.in).nextInt();
             
             for (int i = 0; i <= altura; i++) {
                 System.out.println();
                 for (int j = 1; j <=i; j++) {
                     System.out.print("$");
                 }
                 
             }
             System.out.println();

      
    }

}

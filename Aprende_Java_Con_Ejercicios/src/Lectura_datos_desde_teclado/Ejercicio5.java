package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 5: Escribe un programa que calcule el área del rectángulo
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL ÁREA DEL RECTÁNGULO DADA UNA BASE Y UNA ALTURA");
             System.out.println("---------------------------------------------------------------------------");
             
             System.out.print("Indícame la base del rectángulo: ");
             int base = teclado.nextInt();
             
             System.out.print("Indícame la altura del rectángulo: ");
             int altura = teclado.nextInt();
             
             
             System.out.println();
             System.out.println("Dada la base " + base + " y la altura " + altura + " el área del rectángulo es " + (base*altura));
      
    }

}

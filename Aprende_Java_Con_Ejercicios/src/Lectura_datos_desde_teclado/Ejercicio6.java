package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio6 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 6: Escribe un programa que calcule el área de un triángulo
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL ÁREA DEL TRIÁNGULO DADA UNA BASE Y UNA ALTURA");
             System.out.println("---------------------------------------------------------------------------");
             
             System.out.print("Indícame la base del triángulo: ");
             int base = teclado.nextInt();
             
             System.out.print("Indícame la altura del triángulo: ");
             int altura = teclado.nextInt();
             
             
             System.out.println();
             System.out.println("Dada la base " + base + " y la altura " + altura + " el área del rectángulo es " + ((base*altura)/2));
      
    }

}

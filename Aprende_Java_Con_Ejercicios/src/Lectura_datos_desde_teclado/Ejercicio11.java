package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio11 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 11: Realiza un conversor de Kb a Mb.
             */
             
             
            Scanner teclado = new Scanner(System.in);
             
             System.out.println("CONVERSOR DE Kb A Mb");
             System.out.println("-------------------------");
             
             // Un kb son 1000 Kb
             double mb= 0.001;
             
             System.out.print("Introduce cuantos kilobytes quieres convertir a megabytes: ");
             int kb = teclado.nextInt();
             
             System.out.println();
             System.out.println("Has introducido " + kb + " kilobytes que equivale a " + kb*mb + " kilobytes");
      
    }

}

package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio10 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 10: Realiza un conversor de Mb a Kb
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("CONVERSOR DE Mb A Kb");
             System.out.println("-------------------------");
             
             // Un Mb son 1000 Kb
             int kb= 1000;
             
             System.out.print("Introduce cuantos megabytes quieres convertir a Kilobytes: ");
             int mb = teclado.nextInt();
             
             System.out.println();
             System.out.println("Has introducido " + mb + " megabytes que equivale a " + kb*mb + " megabytes");
      
    }

}

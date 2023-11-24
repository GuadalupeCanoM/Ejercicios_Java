package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio7 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 7: Calcula un programa que calcule el total de una factura a partir de la base imponible
             */
             
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL IMPORTE CON IVA RESPECTO A UNA BASE IMPONIBLE");
             System.out.println("-------------------------------------------------------------------------");
             
             System.out.print("Introduce la base imponible: ");
             int baseImponible = teclado.nextInt();
             
             System.out.println("Dada la base imponible " + baseImponible + "€, el importe con IVA es " + baseImponible *1.21);
      
    }

}

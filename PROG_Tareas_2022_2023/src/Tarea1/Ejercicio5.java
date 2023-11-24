
package Tarea1;

import java.util.Scanner;



/**
 * Ejercicio 5: Venta de pienso para animales
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    
         public static void main(String[] args) {
            
             
             // Variables de entrada
             int numeroSacos;
             
             // Variables auxiliares
             double precioSaco = 9.75;
             double descuento = 0;
             final double IVA = 10;
             
             // Variables de salida
             double importeDescuentoSinIva = 0;
             double importeTotalConIva = 0;
             int importeTotalEntero;
             // Clase Scanner
             Scanner teclado = new Scanner(System.in);
             
             // Petición de datos \\
             
             System.out.println("Ejercicio 5: Venta de pienso para animales");
             System.out.println("--------------------------------------------");
             
             System.out.print("Introduce el número de sacos que quiere comprar el cliente: ");
             numeroSacos = teclado.nextInt();
             
             if (numeroSacos <= 5){
                 descuento = 0.0;
                 importeDescuentoSinIva = numeroSacos * precioSaco;
                 importeTotalConIva = importeDescuentoSinIva * (1 + IVA / 100);
                 importeTotalEntero = (int) importeTotalConIva;
             } else if (numeroSacos > 5 && numeroSacos <8){
                 descuento = 5.5;
                 importeDescuentoSinIva = (numeroSacos * precioSaco) * 0.945;
                 importeTotalConIva = importeDescuentoSinIva * (1 + IVA / 100);
                 importeTotalEntero = (int) importeTotalConIva;
             } else {
                 descuento = 10.3;
                 importeDescuentoSinIva = (numeroSacos * precioSaco) * 0.897;
                 importeTotalConIva = importeDescuentoSinIva * (1 + IVA / 100);
                 importeTotalEntero = (int) importeTotalConIva;
             }
             
             
             
             System.out.println();
             System.out.println("RESULTADO");
             System.out.println("----------------");
             System.out.println("El cliente va a comprar " + numeroSacos + " sacos");
             System.out.println("Se aplica un descuento del " + descuento + "%");
             System.out.printf("El importe aplicando el descuento (sin IVA) es de %.2f\n", importeDescuentoSinIva);
             System.out.printf("El importe total (IVA incl) asciende a: %.2f\n", importeTotalConIva);
             System.out.println("El importe final a pagar (IVA incl.) asciende a: " + importeTotalEntero);
             
            
      
    }

}

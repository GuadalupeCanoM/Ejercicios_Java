package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    
         public static void main(String[] args) {
             /*
            Ejercicio 2: Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
            convertir debe ser introducida por teclado.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.print("Introduce la cantidad de euros que quieres convertir a pesetas: ");
             int euros = teclado.nextInt();
             
             double pesetas = 166.386;
             double convertirAEuros;
             
             convertirAEuros = euros * pesetas;
             
             System.out.println("Has introducido " + euros + "€ que equivalen a " + convertirAEuros + " pesetas");

      
    }

}

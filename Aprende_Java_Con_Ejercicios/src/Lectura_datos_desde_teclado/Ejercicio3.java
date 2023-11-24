package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 3:Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
            convertir debe ser introducida por teclado. 
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.print("Introduce la cantidad de pesetas que quieres convertir a euros: ");
             int pesetas = teclado.nextInt();
             
             double euros = 0.00601012;
             double convertirAPesetas;
             
             convertirAPesetas = euros * pesetas;
             
             System.out.printf("Has introducido " + pesetas + " que equivalen a %.2f€\n", convertirAPesetas);
      
    }

}


package Tarea1;

import java.util.Scanner;



/**
 * Ejercicio 3: Recluido en casa
 * Diseñar un algoritmo que nos indique si podemos salir a la calle o no. 
 * Existen distintos aspectos que influyen en esta decisión: 
 * si está lloviendo o no, si hemos terminado la tarea online de 
 * programación o si debemos ir al supermercado.
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {
             
             // Variables de entrada
             boolean llueve, terminadoTarea, supermercado;
             
             // Variables de salida
             boolean salirCalle;
             
             // Clase Scanner
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("Ejercicio 3: Recluido en casa");
             System.out.println("--------------------------------");
             
             System.out.print("Indica si está lloviendo (true/false): ");
             llueve = teclado.nextBoolean();
             
             System.out.print("Indica si has terminado la tarea online de Progrmación (true/false): ");
             terminadoTarea = teclado.nextBoolean();
             
             System.out.print("Indica si tienes que ir al supermercado (true/false): ");
             supermercado = teclado.nextBoolean();
             
             // Procesamiento
             
             salirCalle = (!llueve && terminadoTarea) || supermercado;
             
            // Salida de resultados
             System.out.println("RESULTADO");
             System.out.println("----------------------");
             System.out.println("Considerando la información anterior, ¿debo salir a la calle? \n" + (salirCalle ? "SI" : "NO") );
             
             System.out.println();
             System.out.println("Fin del programa");

      
    }

}

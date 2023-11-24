
package Tarea1;

import java.util.Scanner;

/**
 * Ejercicio 1: Cálculo del área de un trapecio regular
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio1 {

    
         public static void main(String[] args) {
                          
             Scanner teclado = new Scanner(System.in);
             
             // Variables de entrada
             double baseMayor, baseMenor, altura;
             
             // Variables de salida
             double areaTrapecio;
             
             System.out.println("Ejercicio 1. Cálculo del área de un trapecio regular");
             System.out.println("-----------------------------------------------------");
             
             System.out.print("Introduce la base mayor del trapecio: ");
             baseMayor = teclado.nextDouble();
             System.out.print("Introduce la base menor del trapecio: ");
             baseMenor = teclado.nextDouble();
             System.out.print("Introduce la altura del trapecio: ");
             altura = teclado.nextDouble();
             
             
             // Procesamiento
             areaTrapecio = altura * ((baseMayor + baseMenor)/2);
             
             // Salida de resultados
             System.out.println();
             System.out.println("RESULTADO");
             System.out.println("-------------------");
             System.out.println("El área del trapecio base menor " + baseMenor + ", base mayor " + baseMayor + " y altura " + altura + " es " + areaTrapecio);
             
             System.out.println();
             System.out.println("Fin del programa");
      
    }

}

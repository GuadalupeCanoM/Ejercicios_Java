

package Tarea1;


import java.util.Scanner;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    
         public static void main(String[] args) {

        //----------------------------------------------
        //          Declaraci?n de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int precioProducto, dineroIntroducido;

        // Variables de salida
        // Variables auxiliares
        // Clase Scanner para petici?n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("M?QUINA EXPENDEDORA DE PRODUCTOS");
        System.out.println("--------------------------------");
        System.out.println("Precio del producto (en c?ntimos): ");
        precioProducto = teclado.nextInt();
        System.out.println("Dinero introducido (en c?ntimos): ");
        dineroIntroducido = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        int cambio = dineroIntroducido - precioProducto; //cambio que da de coste y lo que se introduce

        int monedas = 0;  //contador para sumar monedas

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El cambio es: " + cambio + " c?ntimos.");
        System.out.println();

        System.out.println("Monedas de 20 c?ntimos: " + cambio / 20);
        monedas = monedas + (cambio / 20);
        cambio = cambio % 20;

        System.out.println("Monedas de 10 c?ntimos: " + cambio / 10);
        monedas = monedas + (cambio / 10);
        cambio = cambio % 10;

        System.out.println("Monedas de 5 c?ntimos: " + cambio / 5);
        monedas = monedas + (cambio / 5);
        cambio = cambio % 5;

        System.out.println("Monedas de 2 c?ntimos: " + cambio / 2);
        monedas = monedas + (cambio / 2);
        cambio = cambio % 2;

        System.out.println("Monedas de 1 c?ntimo: " + cambio / 1);
        monedas = monedas + (cambio / 1);

        System.out.println("Total de monedas: " + monedas);

        System.out.println();

        System.out.println("Fin del programa.");
        
        
      
    }

}

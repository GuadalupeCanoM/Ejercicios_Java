
package Tarea2;

import java.util.Scanner;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {

      //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        // Constantes
        //Para evitar magic values asigno cada valor en una constante. Uso constante porque en la baraja española por ej el As siempre va a valer 11 puntos.
        final int VALOR_AS = 11, VALOR_TRES = 10, VALOR_SOTA = 2, VALOR_CABALLO = 3, VALOR_REY = 4, SIN_VALOR = 0;

        // Variables de entrada
        int numeroCarta;
        int valorNaipe;
        int cartaNoValida = -1;

        // Variables de salida
        // Variables auxiliares
        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN NAIPE EN EL TUTE");
        System.out.println("----------------------------");
        System.out.print("Introduzca n�mero (1-7, 10-12):");
        numeroCarta = teclado.nextInt();

        //------------------------------------------------------     
        //                 Procesamiento       
        //------------------------------------------------------
        
        switch (numeroCarta) {
            case 1:
                //Almaceno en la variable valorNaipe el valor que quiero que salga por pantalla en caso que en la entrada de datos escriban 1.
                valorNaipe = VALOR_AS;  
                break;
                //ValorNaipe=10
            case 3:
                valorNaipe = VALOR_TRES;
                break;
            //ValorNaipe=2
            case 10:
                valorNaipe = VALOR_SOTA;
                break;
            //ValorNaipe=3
            case 11:
                valorNaipe = VALOR_CABALLO;
                break;
            //ValorNaipe=4
            case 12:
                valorNaipe = VALOR_REY;
                break;
            ///valorNaipe=0
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                valorNaipe = SIN_VALOR;
                break;
            //Si no se escribe por pantalla ninguno de los cases anteriores, la salida de datos mostrará el valor que le he asignado a cartaNovalida (-1).
            default:
                valorNaipe = cartaNoValida;

        }

        //------------------------------------------------------     
        //                 Salida de resultados      
        //------------------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El valor del  naipe con ese n�mero es: " + valorNaipe);
        
      
    }

}


package Tarea1;

import java.util.Scanner;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    
         public static void main(String[] args) {
    //----------------------------------------------
        //          Declaraci?n de variables 
        //----------------------------------------------
        // Constantes
        final double COEFICIENTE_CONSUMO_PRIMERA_ETAPA = 2;
        final double COEFICIENTE_CONSUMO_SEGUNDA_ETAPA = 4;

        // Variables de entrada
        double litrosIniciales;

        // Variables de salida
        double litrosConsumidosPrimerRecorrido, litrosConsumidosSegundoRecorrido, litrosSobrantes;

        // Variables auxiliares
        // Clase Scanner para petici?n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("TRAYECTO EN DOS ETAPAS");
        System.out.println("----------------------");
        System.out.println("Introduzca la cantidad inicial de litros que se introducen en el dep?sito del veh?culo");
        litrosIniciales = teclado.nextDouble();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //Primer c?lculo: litros consumidos en el primer recorrido. En la primera etapa se consumen la mitad.
        litrosConsumidosPrimerRecorrido = litrosIniciales / COEFICIENTE_CONSUMO_PRIMERA_ETAPA;

        // Segundo c?lculo: litros consumidos en el segundo recorrido. En la segunda etapa se consumen el 25%
        litrosConsumidosSegundoRecorrido = litrosConsumidosPrimerRecorrido / COEFICIENTE_CONSUMO_SEGUNDA_ETAPA;

        // Litros sobrantes en el dep?sito. Son los litros que quedaran al finalizar los dos trayectos.
        litrosSobrantes = litrosIniciales - (litrosConsumidosPrimerRecorrido + litrosConsumidosSegundoRecorrido);

        //----------------------------------------------    
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.println("Litros consumidos en el primer recorrido: " + litrosConsumidosPrimerRecorrido);
        System.out.println("Litros consumidos en el segundo recorrido: " + litrosConsumidosSegundoRecorrido);
        System.out.println("Litros sobrantes en el dep?sito: " + litrosSobrantes);

        System.out.println();
        System.out.println("Fin del programa.");
        
  
    }

}

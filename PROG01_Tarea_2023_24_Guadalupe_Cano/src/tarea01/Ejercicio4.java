package tarea01;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final double CAPACIDAD_EMBALSE = 2000;       // Constante para la capacidad máxima que puede tener el embalse
        final double PORCENTAJE_MINIMO = 95.0;       // Constante para el porcentaje mínimo necesario (95%)
        final double PORCENTAJE_LIBERACION = 0.10;   // Constante para el porcentaje de liberación controlada (10%)
        final double PORCENTAJE_RESTANTE = 0.90;     // Constante para el porcentaje restante tras la liberación

        // Variables de entrada
        double volumenActual;

        // Variables de salida
        String liberacion;

        // Variables auxiliares
        double volumenNecesario, porcentajeActual;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 4: Gestión de recursos hidráulicos");
        System.out.println("----------------------");

        // Pedimos al usuario el volumen actual de agua embalsada
        System.out.print("Introduce el volumen actual de agua almacenada en el embalse (hectómetros cúbicos): ");
        volumenActual = teclado.nextDouble();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Calculamos la cantidad de agua que se necesita para llenar completamente el embalse restando el volumen actual de la capacidad máxima
        volumenNecesario = CAPACIDAD_EMBALSE - volumenActual;
        System.out.printf("%nFaltan %.2f hectómetros cúbicos para llenar completamente el embalse.%n", volumenNecesario);

        // Calculamos el porcentaje de agua actual en el embalse
        porcentajeActual = (volumenActual / CAPACIDAD_EMBALSE) * 100;
        System.out.printf("El embalse está a un %.2f%% de su capacidad máxima.%n", porcentajeActual);

        // Determinamos si realizamos una liberación controlada de agua
        /*Creo la variable liberacion para el operador ternario.
        
          Si el  porcentaje actual de agua es mayor a 95% se ejecuta la primera parte del operador ternario.
          y el agua se vacía un 10%.
          Calculo el volumen que queda en el embalse.
          Calculo el porcentaje que representa a ese volumen restante.
          
          Si el porcentaje de agua es menor al 95% entrará en la segunda parte del operador ternario (después de :) 
          y se muestra que no será necesario liberar agua.
         */
        liberacion = porcentajeActual > PORCENTAJE_MINIMO ? "Se ha realizado una liberación del 10.0% vaciando un total de "
                + volumenActual * PORCENTAJE_LIBERACION + " hectómetros cúbicos. \nEn el embalse quedan ahora "
                + volumenActual * PORCENTAJE_RESTANTE + " hectómetros cúbicos, que representan un " + porcentajeActual * PORCENTAJE_RESTANTE
                + "% de su capacidad máxima." : "No es necesario considerar la liberación controlada de agua en este momento.";

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(liberacion);

        System.out.println();
        System.out.println("Fin del programa.");
    }

}

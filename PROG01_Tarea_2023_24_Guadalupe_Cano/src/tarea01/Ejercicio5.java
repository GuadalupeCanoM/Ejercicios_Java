
package tarea01;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    
         public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes (se definen los datos que tienen siempre un valor fijo)
        final double PRECIO_ENTRADA_INFANTIL = 10.00;       // Constante que almacena el precio de una entrada infantil
        final double PRECIO_ENTRADA_ADULTO = 15.00;         // Constante que almacena el precio de una entrada adulta
        final double UMBRAL_DESCUENTO_1 = 50.00;            // Se aplica el primer descuento si el coste es superior a 50€
        final double UMBRAL_DESCUENTO_2 = 100.00;           // Se aplica el segundo descuento si el coste es superior a 100€
        final double DESCUENTO_1 = 5.0 / 100;               // El descuento1 es del 5%, que es lo mismo que 5/100.
        final double DESCUENTO_2 = 15.0 / 100;              // El descuento1 es del 15%, que es lo mismo que 15/100.
        final double PORCENTAJE_IVA = 21.0 / 100;           // El IVA es del 21% que es lo mismo que 21/100

        // Variables de entrada (variables que reciben valores)
        int entradasAdulto, entradasInfantil;

        // Variables de salida (variables que almacenaran resultados y se mostrarán al usuario)
        double costeTotalSinDescuento, descuentoAplicar, importeTotalSinIva, importeTotalIva;
        int cantidadPagar;

        // Variables auxiliares (variables necesarias para realizar cálculos intermedios)

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 5. ¡Vamos al parque acuático! ");
        System.out.println("----------------------");

        // Pedimos la cantidad de entradas de adulto 
        System.out.print("Introduce la cantidad de entradas DE ADULTO que deseas adquirir: ");
        entradasAdulto = teclado.nextInt();

        // Pedimos la cantidad de entradas infantiles
        System.out.print("Introduce la cantidad de entradas INFANTILES que deseas adquirir: ");
        entradasInfantil = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Calculamos el coste total de las entradas de adultos sin descuentos ni IVA.
        costeTotalSinDescuento = entradasAdulto * PRECIO_ENTRADA_ADULTO + entradasInfantil * PRECIO_ENTRADA_INFANTIL;

        // Calculamos el porcentaje del descuento
        descuentoAplicar = (costeTotalSinDescuento >= UMBRAL_DESCUENTO_2) ?
                DESCUENTO_2 : (costeTotalSinDescuento >= UMBRAL_DESCUENTO_1) ? DESCUENTO_1 : 0;

        // Calculamos el importe total sin IVA
        importeTotalSinIva = costeTotalSinDescuento * (1 - descuentoAplicar);

        // Calculamos el importe total con IVA
        importeTotalIva = importeTotalSinIva * (1 + PORCENTAJE_IVA);

        // Calculamos la cantidad total a pagar con la parte entera
        // Para ello hago un casteo a entero
        cantidadPagar = (int) importeTotalIva;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Se comprarán " + entradasAdulto + " entradas de tipo ADULTO y " + entradasInfantil + " entradas de tipo INFANTIL.");
        System.out.printf("El coste de las entradas antes de aplicar descuentos es de %.2f€ %n", costeTotalSinDescuento); //Mediante printf imprimo el coste de las entradas con dos decimales con %.2f
        System.out.println((descuentoAplicar > 0) ? "Se aplicará un descuento del " + (descuentoAplicar * 100) + "%" : "No procede descuento en esta compra");
        System.out.printf("Tras aplicar posibles descuentos, el importe total de las entradas (sin IVA) es de %.2f€%n", importeTotalSinIva);
        System.out.printf("El importe IVA incluido es de %.2f€%n", importeTotalIva);
        System.out.println("La cantidad final a pagar por el cliente es de " + cantidadPagar + "€");       
       
    }

}

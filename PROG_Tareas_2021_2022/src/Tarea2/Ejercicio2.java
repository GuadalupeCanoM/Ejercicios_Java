
package Tarea2;

import java.util.Scanner;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    
         public static void main(String[] args) {
        //----------------------------------------------
        //          Declaraci�n de variables 
        //----------------------------------------------
        // Constantes
        final int FECHA_ACTUAL = 2021; //La declaro como constante, para que en caso que a�o cambie, por ejemplo 2022, solo haga falta modificar el valor.
        // Variables de entrada
        int anyo;

        // Variables de salida
        String anyoIntroducido = "";
        String calculoFechaTotal = "";
        String siglo = "";

        // Variables auxiliares
        int calculoFechaAnterior;
        int calculoFechaPosterior;

        // Clase Scanner para petici�n de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DEL AÑO");
        System.out.println("----------------");
        System.out.print("Introduzca un año (entre 1801-2100): ");
        anyo = teclado.nextInt();

        //-----------------------------------------------   
        //                 Procesamiento            
        //-----------------------------------------------   
        //Si el a�o es mayor o igual a 1801 y menor o igual a 2100
        if (anyo >= 1801 && anyo <= 2100) {
            //Si el a�o es menor de 2021
            if (anyo < FECHA_ACTUAL) {
                anyoIntroducido = "El año introducido es anterior al actual.";
                calculoFechaAnterior = FECHA_ACTUAL - anyo;
                calculoFechaTotal = " Han pasado " + calculoFechaAnterior + " años.";
            }
            //Si el a�o es 2021
            if (anyo == FECHA_ACTUAL) {
                anyoIntroducido = "El año introducido coincide con el actual";
            //Si el a�o es mayor a 2021
            } else if (anyo > FECHA_ACTUAL) {
                anyoIntroducido = "El año introducido es posterior al actual.";
                calculoFechaPosterior = anyo - FECHA_ACTUAL;
                calculoFechaTotal = " Faltan " + calculoFechaPosterior + " años.";
            }
            //Si a�o es mayor o igual a 1801 y menor o igual a 1900
            if (anyo >= 1801 && anyo <= 1900) {
                siglo = "El año pertenece al siglo XIX";

            }
            //Si el a�o es mayor o igual a 1901 y menor o igual a 2000
            if (anyo >= 1901 && anyo <= 2000) {
                siglo = "El año pertenece al siglo XX.";

            //Si el a�o es mayor o igual a 2021 y menor o igual a 2100
            } else if (anyo>= 2001 && anyo <= 2100) {
                siglo = "El año pertenece al siglo XXI";

            }
        } else {
            // En caso que el usuario meta un a�o que no est� en la condici�n.
            anyoIntroducido = "El año introducido no es v�lido.";

        }
        //-------------------------------------------------------------    
        //                 Salida de resultados            
        //------------------------------------------------------------- 
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(anyoIntroducido + calculoFechaTotal + "\n" + siglo);
      
    }

}

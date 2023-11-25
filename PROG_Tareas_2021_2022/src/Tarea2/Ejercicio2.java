
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
        final int FECHA_ACTUAL = 2021; //La declaro como constante, para que en caso que año cambie, por ejemplo 2022, solo haga falta modificar el valor.
        // Variables de entrada
        int anyo;

        // Variables de salida
        String anyoIntroducido = "";
        String calculoFechaTotal = "";
        String siglo = "";

        // Variables auxiliares
        int calculoFechaAnterior;
        int calculoFechaPosterior;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("AN�LISIS DEL A�O");
        System.out.println("----------------");
        System.out.print("Introduzca un a�o (entre 1801-2100): ");
        anyo = teclado.nextInt();

        //-----------------------------------------------   
        //                 Procesamiento            
        //-----------------------------------------------   
        //Si el año es mayor o igual a 1801 y menor o igual a 2100
        if (anyo >= 1801 && anyo <= 2100) {
            //Si el año es menor de 2021
            if (anyo < FECHA_ACTUAL) {
                anyoIntroducido = "El a�o introducido es anterior al actual.";
                calculoFechaAnterior = FECHA_ACTUAL - anyo;
                calculoFechaTotal = " Han pasado " + calculoFechaAnterior + " a�os.";
            }
            //Si el año es 2021
            if (anyo == FECHA_ACTUAL) {
                anyoIntroducido = "El a�o introducido coincide con el actual";
            //Si el año es mayor a 2021
            } else if (anyo> FECHA_ACTUAL) {
                anyoIntroducido = "El a�o introducido es posterior al actual.";
                calculoFechaPosterior = anyo - FECHA_ACTUAL;
                calculoFechaTotal = " Faltan " + calculoFechaPosterior + " a�os.";
            }
            //Si año es mayor o igual a 1801 y menor o igual a 1900
            if (anyo >= 1801 && anyo <= 1900) {
                siglo = "El a�o pertenece al siglo XIX";

            }
            //Si el año es mayor o igual a 1901 y menor o igual a 2000
            if (anyo >= 1901 && anyo <= 2000) {
                siglo = "El a�o pertenece al siglo XX.";

            //Si el año es mayor o igual a 2021 y menor o igual a 2100
            } else if (anyo >= 2001 && anyo <= 2100) {
                siglo = "El a�o pertenece al siglo XXI";

            }
        } else {
            // En caso que el usuario meta un año que no est� en la condici�n.
            anyoIntroducido = "El a�o introducido no es v�lido.";

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

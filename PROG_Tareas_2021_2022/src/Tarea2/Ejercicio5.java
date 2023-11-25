
package Tarea2;

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
        // Constantes
        //Las declaro como constantes por si en algún momento se decidiera cambiar el minimo y maximo de filas y columnas, poder modificar el código de manera rápida.
        final int MIN_FILAS = 2;
        final int MAX_FILAS = 10;
        final int MIN_COLUMNAS = 2;
        final int MAX_COLUMNAS = 10;

        // Variables de entrada
        int numeroFilas, numeroColumnas, rellenoCaja;
        int vacia = 0;
        int rellena = 1;
        char esquina = '+';
        char lineas = '-';
        char lineaVertical = '|';
        String espacio = " ";

        // Variables de salida
        String cadenaResultado = "";
        String tipoCaja;
        // Variables auxiliares
        // Clase Scanner para petici�n de datos
        Scanner teclado = new Scanner(System.in);

        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONSTRUCCIÓN DE CAJAS");
        System.out.println("---------------------");
        do {
            System.out.print("Introduzca un número de filas (2-10):");
            numeroFilas = teclado.nextInt();
            // Si el n�mero de filas introducido es menor de 2 y mayor de 10 volver� a pedir que se introduzca un n�mero correcto.
        } while (numeroFilas < MIN_FILAS || numeroFilas > MAX_FILAS);

        do {
            System.out.print("Introduzca número de columnas (2-10):");
            numeroColumnas = teclado.nextInt();
            // Si el n�mero de columnas introducido es menor de 2 y mayor de 10 volver� a pedir que se introduzca un n�mero correcto.
        } while (numeroColumnas < MIN_COLUMNAS || numeroColumnas > MAX_COLUMNAS);

        System.out.println("¿Caja rellena? (0:vacía, cualquier otro número rellena):");
        rellenoCaja = teclado.nextInt();

        //-----------------------------------------------------------
        //                 Procesamiento y salida de resultados
        //-----------------------------------------------------------
        //l�nea superior (es la misma que utilizamos para la linea inferior)
        cadenaResultado += esquina;  //Esquina superior izquierda
        //Indico que el bucle comience en dos para que no pise las esquinas (+)
        for (int i = 2; i < numeroColumnas; i++) {
            cadenaResultado += lineas; //Fila superior

        }
        cadenaResultado += esquina + "\n";//Esquina superior derecha 

        //centro de la forma
        for (int i = 0; i < numeroFilas - 2; i++) {
            cadenaResultado += lineaVertical; //Columna izquierda
            //De nuevo empiezo en dos para no pisar las esquinas
            for (int j = 2; j < numeroColumnas; j++) {
                //Si el usuario mete un 0, saldr� por pantalla la caja vac�a.
                if (rellenoCaja == vacia) {
                    cadenaResultado += espacio;
                    //Si usuario mete otro d�gito, saldr� con el relleno de n�meros.
                } else {
                    cadenaResultado += i + rellena;
                }
            }
            cadenaResultado += lineaVertical + "\n"; //Columna derecha
        }

        //Línea inferior
        cadenaResultado += esquina; //esquina inferior derecha 
        //Indico que el bucle comience en dos para que no pise las esquinas (+)
        for (int i = 2; i < numeroColumnas; i++) {
            cadenaResultado += lineas; //Linea inferior

        }
        cadenaResultado += esquina + "\n";//esquina inferior izquierda

        //Utilizo operador ternario para que me devuelva el valor que pida el usuario por pantalla. Si quiere la caja vacía o rellena.
        tipoCaja = (rellenoCaja == 0) ? "vacía" : "rellena";

        //-----------------------------------------------------------
        //                 Salida de resultados
        //-----------------------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Caja de tamaño " + numeroFilas + "X" + numeroColumnas + " " + tipoCaja + ":");
        System.out.println(cadenaResultado);
        
        
    }

}

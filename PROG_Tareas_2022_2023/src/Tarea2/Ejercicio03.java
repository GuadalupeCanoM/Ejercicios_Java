/*
 * Juego de las Siete y Media
 */
package Tarea2;

import java.util.Random;

/**
 *
 * @author Guadalupe Cano
 */
public class Ejercicio03 {

   
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaraci�n de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aqu� se definen las variables que recibir�n valores, si fueran necesarias)
        // Variables de salida (aqu� se definen las variables que almacenar�n resultados y se mostrar�n al usuario, si fueran necesarias)
        // Clase Scanner para petici�n de datos al usuario a trav�s del teclado
        Random r = new Random();
        float banca;
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        // Generamos un número entre 4 y 7.5
        /* La clase Random es una clase de Java que nos sirve para generar elementos aleatorios
            en este caso el objeto "r", consigue a través de su método nextInt(número), generar
            un número aleatorio entero entre 0 y número-1, por ejemplo r.nextInt(4), generará
            un número entero entre 0 y 3, es decir, podrá devolver 0,1,2 o 3 cada vez que se 
            utilice.
            En la siguiente línea generamos un n�mero entre  0 y 3, al que le sumamos 4, de esta
            forma la banca obtendrá siempre un n�mero bastante competivo, entre 4 y 7.
            Posteriormente utilizamos este mismo m�todo sin parámetros, generando un entero entre
            0 y 2 elevado a 32
         */
        System.out.println("Ejercicio 4. Juego Siete y Media");
        System.out.println("----------------------------------------------------");

        banca = 4 + r.nextInt(4) + ((r.nextInt() % 2 == 0) ? 0f : 0.5f);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        
        
        
        
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        
        
    }

}

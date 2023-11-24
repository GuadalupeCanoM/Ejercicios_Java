/*
 * Juego de las Siete y Media
 */
package tarea02;

import java.util.Random;

/**
 *
 * @author Guadalupe Cano
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        // Variables de salida (aquí­ se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        // Clase Scanner para petición de datos al usuario a través del teclado
        Random r = new Random();
        float banca;
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        // Generamos un número entre 4 y 7.5
        /* La clase Random es una clase de Java que nos sirve para generar elementos aleatorios
            en este caso el objeto "r", consigue a través de su mÃ©todo nextInt(número), generar
            un número aleatorio entero entre 0 y número-1, por ejemplo r.nextInt(4), generará
            un número entero entre 0 y 3, es decir, podrá devolver 0,1,2 o 3 cada vez que se 
            utilice.
            En la siguiente lí­nea generamos un número entre  0 y 3, al que le sumamos 4, de esta
            forma la banca obtendrá siempre un número bastante competivo, entre 4 y 7.
            Posteriormente utilizamos este mismo método sin parámetros, generando un entero entre
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

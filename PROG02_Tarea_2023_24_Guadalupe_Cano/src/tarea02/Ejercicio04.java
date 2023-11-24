
package tarea02;

import java.util.Random;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        //----------------------------------------------
        //               Declaración de variables
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        boolean secuenciaEncontrada = false;

        // Variables auxiliares
        String secuencia = "";
        int contador = 0;
        int premio = 0;
        
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        String resultado = "";
        
        
        /* La clase Random es una clase de Java que nos sirve para generar elementos aleatorios
            en este caso el objeto "r", consigue a través de su método nextInt(número), generar
            un número aleatorio entero entre 0 y número-1, por ejemplo r.nextInt(5), generará 
            un número entero entre 0 y 4, es decir, podrá devolver 0,1,2,3 o 4 cada vez que se 
            utilice.
         */
        Random aleatorio = new Random();
        //----------------------------------------------
        //              Entrada de datos
        //----------------------------------------------
        // En este caso no hay entrada de datos. 
        System.out.println("Ejercicio 4. Simulador de Máquina Tragaperras.");
        System.out.println("----------------------------------------------------");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Hemos de generar una secuencia de 3 frutas
        // Las frutas son: Plátano, Fresa, Manzana, Naranja, Cerezas 
        // Representamos cada fruta con un caracter: P,F,M.N,C
        // Para elegir una de las cinco frutas podemos asociar cada una con un número
        // Para ello podemos generar un número aleatorio 
        
        // Se verifica que si no se encuentra la secuencia se vuelva a repetir el bucle hasta que la encuentre
        while (!secuenciaEncontrada) {
            
            // Se genera un número aleatorio entre 0 y 4
            int numAleatorio = aleatorio.nextInt(4);
            
            // Se crea un switch para asociar un número aleatorio a una letra y un premio
            switch (numAleatorio) {
                case 1:
                    secuencia += "P";
                    premio = 1;
                    break;
                case 2:
                    secuencia += "F";
                    premio = 2;
                    break;
                case 3:
                    secuencia += "M";
                    premio = 3;
                    break;
                case 4:
                    secuencia += "N";
                    premio = 4;
                    break;
                case 5:
                    secuencia += "C";
                    premio = 5;
                    break;
            }
            
            // El proceso debe hacerse hasta que se obtengan 3 iguales, cosa que suponemos que se producirá en x intentos. Hemos de llevar la cuenta de los intentos.
            
            // Se verifica si la longitud de la secuencia generada es igual a 3
            if (secuencia.length() == 3) {
                // Se incrementa el contador de intentos (hasta que se consigue una secuencia)
                contador++;
                // Se agrega la información del intento en el resultado
                resultado += contador + "-" + secuencia + "\n";
                // Se comprueba si la secuencia es igual a una de las sencuencias especificadas
                if(secuencia.equals("PPP") || secuencia.equals("FFF") || secuencia.equals("MMM") || secuencia.equals("NNN") || secuencia.equals("CCC")){
                    // Si se consigue una de las secuencias establecidas, muestra un mensaje con el premio obtenido, en que intento se ha conseguido y que secuencia es.
                    resultado+= "Has conseguido el premio " + premio + " en el intento " + contador + " con la secuencia: " + secuencia;
                    // Se establece la variable secuencia como verdadera para que salga del condicional
                    secuenciaEncontrada = true;
                } else {
                    // Si no coincide, se reinicia la secuencia
                    secuencia = "";
                }
            }
        }

        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        //Además de los intentos en los que se ha obtenido el premio, hay que decir qué premio hemos tenido de entre los posibles.
        System.out.println("Voy a generar secuencias de 3 frutas entre Plátano, Fresa, Naranja, Manzana y Cereza hasta conseguir 3 iguales y te diré qué premio has obtenido de los cinco:");
        System.out.println(resultado);
    }
}

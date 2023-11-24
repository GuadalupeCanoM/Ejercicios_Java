package tarea03;

import java.util.Random;
import libtarea3.Dado;

/**
 * Ejercicio 2: Uso de la clase Dado
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        //Constantes
        
        // Variables de entrada (dados y puntuación máxima)
        Dado dado1, dado2, dado3;
        int puntuacionMaxima;

        // Variables de salida
        String lanzamientos = "";
        long sumaPuntuaciones = 0;
        String dadoGanador;
        int tiradaGanadora;
        String lanzamientosDadoGanador;

        // Variables auxiliares
        int lanzamientoDado1 = 0, lanzamientoDado2 = 0, lanzamientoDado3 = 0;
        

        // Clase Scanner para petición de datos de entrada (no es necesario)
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        //En realidad no hay entrada de datos como tal, pero podemos considerar
        //el número máximo como información de entrada ya que variará el
        //comportamiento del programa.
        //1. Cálculo del número aleatorio de puntos (entre 30 y 60)
        // Se crea un nuevo objeto Random
        Random aleatorio = new Random();
        
        // Se especifica que los valores van a oscilar entre 30 y 60
        puntuacionMaxima = aleatorio.nextInt(31) + 30;
        

        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------  
        //2. Creación de 3 dados (jugadores) de 6 caras
        dado1 = new Dado(6);
        dado2 = new Dado(6);
        dado3 = new Dado(6);

        //3. Lanzamiento de los dados y acumulación de las puntuaciones
        //3.1 Lanzamos cada uno de los dados y mostramos las puntuaciones
        //Utilizamos los métodos de la clase para contar los lanzamientos
        
        // Se sigue lanzando hasta que los lanzamientos lleguen a la puntuación máxima permitida
        while (sumaPuntuaciones < puntuacionMaxima) {
            lanzamientoDado1 = dado1.lanzar(); // Se guarda en una variable para poder utilizar ese valor posteriormente
            lanzamientoDado2 = dado2.lanzar();
            lanzamientoDado3 = dado3.lanzar();
            
            // Se acumulan los lanzamientos de cada tirada y se guardan en una cadena String para mostrarlo en salida de resultados
            lanzamientos += "Lanzamiento nº " + dado1.getNumeroLanzamientos() + ":\t" + lanzamientoDado1 + "\t" + lanzamientoDado2 + "\t" + lanzamientoDado3 + "\n";

            //3.2 Utilizando los métodos de la clase, acumulamos las puntuaciones
            //de todos los dados en todos los lanzamientos.
            
            // Se suman las puntuaciones de todos los dados. 
            // Cuando la puntuación sea mayor a la puntuación máxima saldrá del bucle
            sumaPuntuaciones = dado1.getSumaPuntuacionHistorica() + dado2.getSumaPuntuacionHistorica() + dado3.getSumaPuntuacionHistorica();
        }
        
        //4. Comprobación de cuál de los dados ha sido el ganador y consulta de todas sus tiradas
        if (lanzamientoDado1 >= lanzamientoDado2 && lanzamientoDado1 >= lanzamientoDado3) {
            dadoGanador = "dado 1";
            tiradaGanadora = lanzamientoDado1;
            lanzamientosDadoGanador = dado1.getSerieHistoricaLanzamientos();

        } else if (lanzamientoDado2 >= lanzamientoDado1 && lanzamientoDado2 >= lanzamientoDado3) {
            dadoGanador = "dado 2";
            tiradaGanadora = lanzamientoDado2;
            lanzamientosDadoGanador = dado2.getSerieHistoricaLanzamientos();
        } else {
            dadoGanador = "dado 3";
            tiradaGanadora = lanzamientoDado3;
            lanzamientosDadoGanador = dado3.getSerieHistoricaLanzamientos();
        }

        //----------------------------------------------
        //      Salida de resultados
        //----------------------------------------------
        System.out.println("LANZAMIENTO DE DADOS");
        System.out.println("----------------------------------------");
        System.out.printf("Número máximo de puntos: %s\n\n", puntuacionMaxima);
        System.out.printf("\t              DADO1   DADO2   DADO3\n\n");
        System.out.printf("%s \n", lanzamientos);
        System.out.printf("Juego terminado. La suma de los lanzamientos es: %s.\n", sumaPuntuaciones);
        System.out.printf("El ganador es el %s con %s puntos en la última jugada.\n", dadoGanador, tiradaGanadora);
        System.out.printf("El valor %s ha salido %s veces en todo el juego y se han realizado un total de %s lanzamientos.\n",
                tiradaGanadora, Dado.getNumeroVecesCaraGlobal(tiradaGanadora), Dado.getNumeroLanzamientosGlobal());
        System.out.printf("Todos los lanzamientos del %s: %s.\n", dadoGanador, lanzamientosDadoGanador);

    }
}

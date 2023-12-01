package Dado;

import libtarea3.Dado;

/**
 * Ejercicio 1: Ojos de serpiente
 *
 * Necesitas: 2 dados de 6 caras y un jugador
 *
 * Cómo jugar: El objetivo del juego es sacar en los dos dados el valor 1 a la
 * vez (los ojos de serpiente). El juego finaliza cuando se consigue esta tirada
 * y se debe indicar el número de intentos realizados
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);
   

        int lanzamientoDado1;
        int lanzamientoDado2;

        System.out.println("OJOS DE SERPIENTE");
        System.out.println("--------------------");
        System.out.println("El jugador va a lanzar el dado...\n");

        do {
            lanzamientoDado1 = dado1.lanzar();
            lanzamientoDado2 = dado2.lanzar();
            
            System.out.println("Lanzamiento #" + dado1.getNumeroLanzamientos());
            System.out.println("En el dado 1 ha obtenido " + lanzamientoDado1);
            System.out.println("En el dado 2 ha obtenido " + lanzamientoDado2);
            System.out.println();

        } while (lanzamientoDado1 != 1 || lanzamientoDado2 != 1);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("\nJUEGO COMPLETADO!! Has conseguido los ojos de serpiente en el intento: " + dado1.getNumeroLanzamientos());
        System.out.println("---------------------------------------------------------------------------");

    }

}

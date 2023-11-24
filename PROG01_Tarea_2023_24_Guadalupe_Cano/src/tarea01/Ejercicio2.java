package tarea01;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        
        // Variables de entrada
        int primerNumero, segundoNumero, tercerNumero;

        // Variables de salida
        double tercioPrimerNumero, cuadradoMitad, partidoPorSegundo; //Lo declaro como double y se realizará una conversión implícita
        boolean esPar; // Lo declaro como boolean para almacenar un resultado lógico "true o false"

        // Variables auxiliares
        double sumaPrimeroMasSegundo;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2: Operadores aritméticos ");
        System.out.println("----------------------");

        System.out.print("Introduce el valor del primer número: "); // Mostramos un mensaje sobre la información que vamos a pedir por teclado
        primerNumero = teclado.nextInt();                           // A través del Scanner pedimos al usuario que introduzca un número int

        System.out.print("Introduce el valor del segundo número: ");
        segundoNumero = teclado.nextInt();

        System.out.print("Introduce el valor del tercer número: ");
        tercerNumero = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Un tercio del primer número más la mitad del tercer número.
        tercioPrimerNumero = (primerNumero / 3.0) + (tercerNumero / 2.0);

        // El cuadrado de la mitad de la suma del segundo número más el tercero.
        cuadradoMitad = (segundoNumero + tercerNumero) / 2 * (segundoNumero + tercerNumero) / 2;

        // Si el triple de la suma del segundo más el tercer número menos el primero es par.
        /*Para saber si un número es par se debe utilizar el operador módulo. En este caso
        si el resto de dividir por 2 es cero, significa que es par. */
        esPar = ((segundoNumero + tercerNumero) * 3 - primerNumero) % 2 == 0;

        // La suma del primero más el segundo, multiplicado por la diferencia del tercero menos el primero y todo ello partido por el segundo número.
        sumaPrimeroMasSegundo = (primerNumero + segundoNumero) * (tercerNumero - primerNumero);
        partidoPorSegundo = sumaPrimeroMasSegundo / segundoNumero;
        

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Valor del tercio del primer número más la mitad del tercer número: " + tercioPrimerNumero);
        System.out.println("Valor del cuadrado de la mitad de la suma del segundo número más el tercero: " + cuadradoMitad);
        System.out.println("Comprobamos si el triple de la suma del segundo más el tercer número menos el primero es par: " + esPar);
        System.out.println("Valor de la suma del primero más el segundo, multiplicado por la diferencia del tercero menos el primero y todo ello partido por el segundo número: " + partidoPorSegundo);
        
        System.out.println();
        System.out.println("Fin del programa.");
    }

}

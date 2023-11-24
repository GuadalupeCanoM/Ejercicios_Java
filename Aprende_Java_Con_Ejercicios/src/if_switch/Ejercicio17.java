package if_switch;

import java.util.Scanner;

/**
 * Ejercicio 17: Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado
 * 
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio17 {

    
         public static void main(String[] args) {
             
             Scanner teclado = new Scanner(System.in);
             int numero;
             int ultimoDigito;
             
             System.out.print("Introduce un número y te diré cual es el último dígito: ");
             numero = teclado.nextInt();
             
             // Para obtener el último dígito de un número utilizamos el módulo de 10
             // El módulo nos devuelve el resto de la operación. 
             // El resto de dividir un número entre 10 es el último dígito del número
             ultimoDigito = numero % 10;
             
             System.out.println("La última cifra del número " + numero + " es " + ultimoDigito);

      
    }

}

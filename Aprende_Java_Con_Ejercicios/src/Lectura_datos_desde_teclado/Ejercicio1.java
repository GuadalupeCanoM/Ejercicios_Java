package Lectura_datos_desde_teclado;

import java.util.Scanner;


/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio1 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 1: Realiza un programa que pida dos números y que luego muestre el resultado
            de su multiplicación.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.print("Introduce el primer número: ");
             int numero = teclado.nextInt();
             
             System.out.print("Introduce el segundo número: ");
             int numero2 = teclado.nextInt();
             
             int resultado = numero * numero2;
             
             System.out.println("El resultado de multiplicar " + numero + "*" + numero2 + " es igual a " + resultado);
             
      
    }

}

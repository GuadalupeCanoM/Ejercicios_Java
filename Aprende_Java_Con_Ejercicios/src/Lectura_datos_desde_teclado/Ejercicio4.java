package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 4: Escribe un programa que sume, reste, multiplique y divida dos números
            introducidos por teclado.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE SUMA, RESTA, MULTIPLICA Y DIVIDE DOS NÚMEROS");
             System.out.println("------------------------------------------------------------");
             
             System.out.print("Introduce el primer número: ");
             int numero1 = teclado.nextInt();
             
             System.out.print("Introduce el segundo número: ");
             int numero2 = teclado.nextInt();
             
             System.out.println();
             System.out.println("La suma del número " + numero1 + "+" + numero2 + " es igual a " + ((double)numero1+numero2));
             System.out.println("La resta del número " + numero1 + "-" + numero2 + " es igual a " + ((double)numero1-numero2));
             System.out.println("La multiplicación del número " + numero1 + "*" + numero2 + " es igual a " + ((double)numero1*numero2));
             System.out.println("La división del número " + numero1 + "/" + numero2 + " es igual a " + ((double)numero1/numero2));

      
    }

}

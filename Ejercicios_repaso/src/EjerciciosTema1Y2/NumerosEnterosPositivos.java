package EjerciciosTema1Y2;

import java.util.Scanner;



/**
 * 2.- Realiza un programa que lea tres n�meros enteros positivos distintos e imprima el
       mayor y el menor valor de los tres. Intente que el programa realice el menor n�mero de
       comparaciones posible entre los n�meros.
 * @author Guadalupe Cano Moyano
 */
public class NumerosEnterosPositivos {

    
         public static void main(String[] args) {

             Scanner teclado = new Scanner (System.in);
             
             System.out.print("Introduce el primer n�mero: ");
             int numero1 = teclado.nextInt();
             
             System.out.print("Introduce el segundo n�mero:");
             int numero2 = teclado.nextInt();
             
             System.out.print("Introduce el tercer n�mero: ");
             int numero3 = teclado.nextInt();
             
             if ((numero1 > numero2) && (numero1 > numero3)){
                 System.out.println("El n�mero 1 cuyo valor es " + numero1 + " es el mayor de todos");
             }else if ((numero2 > numero1) && (numero2 > numero3)){
                 System.out.println("El n�mero 2 cuyo valor es " +numero2 + " es el mayor de todos");
             } else {
                 System.out.println("El n�mero 3 cuyo valor es " + numero3 + " es el mayor de todos") ;
             }
             
             if ((numero1 < numero2) && (numero1 < numero3)){
                 System.out.println("El n�mero 1 cuyo valor es " + numero1 + " es el menor de todos");
             }else if ((numero2 < numero1) && (numero2 < numero3)){
                 System.out.println("El n�mero 2 cuyo valor es " +numero2 + " es el menor de todos");
             } else {
                 System.out.println("El n�mero 3 cuyo valor es " + numero3 + " es el menor de todos") ;
             }
                 
    }

}

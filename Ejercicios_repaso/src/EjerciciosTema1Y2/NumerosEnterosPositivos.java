package EjerciciosTema1Y2;

import java.util.Scanner;



/**
 * 2.- Realiza un programa que lea tres números enteros positivos distintos e imprima el
       mayor y el menor valor de los tres. Intente que el programa realice el menor número de
       comparaciones posible entre los números.
 * @author Guadalupe Cano Moyano
 */
public class NumerosEnterosPositivos {

    
         public static void main(String[] args) {

             Scanner teclado = new Scanner (System.in);
             
             System.out.print("Introduce el primer número: ");
             int numero1 = teclado.nextInt();
             
             System.out.print("Introduce el segundo número:");
             int numero2 = teclado.nextInt();
             
             System.out.print("Introduce el tercer número: ");
             int numero3 = teclado.nextInt();
             
             if ((numero1 > numero2) && (numero1 > numero3)){
                 System.out.println("El número 1 cuyo valor es " + numero1 + " es el mayor de todos");
             }else if ((numero2 > numero1) && (numero2 > numero3)){
                 System.out.println("El número 2 cuyo valor es " +numero2 + " es el mayor de todos");
             } else {
                 System.out.println("El número 3 cuyo valor es " + numero3 + " es el mayor de todos") ;
             }
             
             if ((numero1 < numero2) && (numero1 < numero3)){
                 System.out.println("El número 1 cuyo valor es " + numero1 + " es el menor de todos");
             }else if ((numero2 < numero1) && (numero2 < numero3)){
                 System.out.println("El número 2 cuyo valor es " +numero2 + " es el menor de todos");
             } else {
                 System.out.println("El número 3 cuyo valor es " + numero3 + " es el menor de todos") ;
             }
                 
    }

}

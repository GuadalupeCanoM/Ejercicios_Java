package if_switch;

import java.util.Scanner;

/**
 * Ejercicio 14: Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio14 {

    
         public static void main(String[] args) {
             
             Scanner teclado = new Scanner(System.in);
             int numero;
             
             
             System.out.print("Dime un número y te diré si es es par y/o divisible entre 5: ");
             numero = teclado.nextInt();
             
             
             if (numero % 2 == 0){
                 System.out.println("El número " + numero + " que has introducido es par");
             }else{
                 System.out.println("El número " + numero + " que has introducido no es par");
             }
             
             if(numero% 5 == 0){
                 System.out.println("El número " +  numero + " es divisible por 5");
             }else{
                 System.out.println("El número " + numero + " no es divisible por 5");
             }
             
             
          
             

      
    }

}


package EjerciciosTema1Y2;

import java.util.Scanner;



/**
 * Realiza un programa que lea de la entrada est�ndar un n�mero entero positivo y
 * escriba en la salida est�ndar si es par o impar.
 * @author Guadalupe Cano Moyano
 */
public class esPar {

    
         public static void main(String[] args) {
             
             Scanner teclado = new Scanner (System.in);
             
             System.out.print("Introduce un n�mero entero: ");
             int numero = teclado.nextInt();
             
             if(numero % 2 == 0){
                 System.out.println("Es par");
             }else{
                 System.out.println("Es impar");
             }
      
    }

}

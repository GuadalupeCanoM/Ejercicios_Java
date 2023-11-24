

package Ejercicio_Luis_Repaso;

import java.util.Scanner;



/**
 * Ejercicio 2:Escribe un programa que imprima una tabla en la que cada l�nea
 * contenga un entero, su cuadrado y su cubo (puedes utilizar la funci�n Math.pow). Deber�s
 * preguntar al usuario los l�mites inferior y superior de la tabla. Realiza este ejercicio
 * usando diferentes bucles (for o while) y controlando los datos de entrada con un do-while. 
 * 
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    
         public static void main(String[] args) {
             
             // Se crea el objeto Scanner para la petici�n de datos por teclado
             Scanner teclado = new Scanner(System.in);
             
             // Se crean las variables de los l�mites
             int limiteInferior, limiteSuperior;
             
            
             System.out.println("Dime dos n�meros dentro de un l�mite y te calcular� el cuadrado y el cubo cubo de los n�meros en ese intervalo");
             System.out.println("----------------------------------------------------------------------------------------------------------------");
             
             do{
                 // Se solicita el l�mite inferior al usuario y se almacena en la variable 'limiteInferior'
                 System.out.print("Introduce el l�mite inferior: ");
                 limiteInferior = teclado.nextInt();
                 
                 // Se solicita el l�mite superior al usuario y se almacena en la variable 'limiteSuperior'
                 System.out.print("Introduce el l�mite inferior: ");
                 limiteSuperior = teclado.nextInt();
                 
                 // Se verifica si el l�mite inferior es mayor que el l�mite superior, en cuyo caso se muestra un mensaje de error.
                 if(limiteInferior > limiteSuperior){
                     System.out.println("Error!! no ha introducido un l�mite correcto");
                     System.out.println("Vuelva a introducir los datos de forma correcta");
                     System.out.println();
                 }
             
             }while (limiteSuperior < limiteInferior); // El bucle se repite hasta que el l�mite superior sea mayor o igual al l�mite inferior.
             
             // Se inicia un bucle para calcular y mostrar el cuadrado y el cubo de los n�meros en el rango especificado.
             for (int i = limiteInferior; i <= limiteSuperior; i++) {
                 System.out.println();
                 System.out.println("-----------------------------------------");
                 System.out.println("N�mero" + "\t\t" + "Cuadrado" + "\t" + "cubo");
                 System.out.println("-----------------------------------------");
                 System.out.println("  " +i + "\t\t" + "  " +(int)Math.pow(i, 2) + "\t\t" + (int)Math.pow(i, 3)); 
                 
             }

      
    }

}

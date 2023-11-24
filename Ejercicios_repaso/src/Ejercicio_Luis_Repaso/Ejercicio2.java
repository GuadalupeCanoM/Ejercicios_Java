

package Ejercicio_Luis_Repaso;

import java.util.Scanner;



/**
 * Ejercicio 2:Escribe un programa que imprima una tabla en la que cada línea
 * contenga un entero, su cuadrado y su cubo (puedes utilizar la función Math.pow). Deberás
 * preguntar al usuario los límites inferior y superior de la tabla. Realiza este ejercicio
 * usando diferentes bucles (for o while) y controlando los datos de entrada con un do-while. 
 * 
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio2 {

    
         public static void main(String[] args) {
             
             // Se crea el objeto Scanner para la petición de datos por teclado
             Scanner teclado = new Scanner(System.in);
             
             // Se crean las variables de los límites
             int limiteInferior, limiteSuperior;
             
            
             System.out.println("Dime dos números dentro de un límite y te calcularé el cuadrado y el cubo cubo de los números en ese intervalo");
             System.out.println("----------------------------------------------------------------------------------------------------------------");
             
             do{
                 // Se solicita el límite inferior al usuario y se almacena en la variable 'limiteInferior'
                 System.out.print("Introduce el límite inferior: ");
                 limiteInferior = teclado.nextInt();
                 
                 // Se solicita el límite superior al usuario y se almacena en la variable 'limiteSuperior'
                 System.out.print("Introduce el límite inferior: ");
                 limiteSuperior = teclado.nextInt();
                 
                 // Se verifica si el límite inferior es mayor que el límite superior, en cuyo caso se muestra un mensaje de error.
                 if(limiteInferior > limiteSuperior){
                     System.out.println("Error!! no ha introducido un límite correcto");
                     System.out.println("Vuelva a introducir los datos de forma correcta");
                     System.out.println();
                 }
             
             }while (limiteSuperior < limiteInferior); // El bucle se repite hasta que el límite superior sea mayor o igual al límite inferior.
             
             // Se inicia un bucle para calcular y mostrar el cuadrado y el cubo de los números en el rango especificado.
             for (int i = limiteInferior; i <= limiteSuperior; i++) {
                 System.out.println();
                 System.out.println("-----------------------------------------");
                 System.out.println("Número" + "\t\t" + "Cuadrado" + "\t" + "cubo");
                 System.out.println("-----------------------------------------");
                 System.out.println("  " +i + "\t\t" + "  " +(int)Math.pow(i, 2) + "\t\t" + (int)Math.pow(i, 3)); 
                 
             }

      
    }

}

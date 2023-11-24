
package EjerciciosTema1Y2;


/**
 * Realiza un programa que imprima la suma de los números pares entre dos y mil.
 * @author Guadalupe Cano Moyano
 */
public class SumaPares {

    
         public static void main(String[] args) {
             int suma = 0;
             for (int i = 2; i <=2000; i+=2) {
                 suma+= i;
             }
             System.out.println("La suma de los números pares entre 2 y 2000 es: " + suma);

}

}
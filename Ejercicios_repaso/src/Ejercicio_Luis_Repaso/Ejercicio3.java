package Ejercicio_Luis_Repaso;

import java.util.Scanner;

/**
 *
 * Ejercicio 3: Escribe un programa que pida al usuario números hasta que
 * introduzca un 0. Después, deberás contabilizar la suma de todos los números,
 * el mínimo, el máximo y el valor medio. Ten cuidado con el 0, puesto que no
 * debes considerarlo para ninguno de los cálculos que pide el ejercicio.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Se crea la variable números para recoger los números que introducirá el usuario por teclado
        int numero = 0, cantidadNumeros = 0, suma = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
      
        do {
            System.out.print("Dime un número o ingresa '0' para finalizar: ");
            numero = teclado.nextInt();

            // Cuento un número
            cantidadNumeros++;

            // Sumo el número
            suma += numero;

            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            if (numero < numeroMenor) {
                // Si el número es diferente a cero actualizame el número menor
                // Con esto se controla que no me contabilice el 0 como número menor
                if(numero !=0){
                    numeroMenor = numero;
                }
                
            }
            
        } while (numero != 0);

        System.out.println();
        System.out.println("Has introducido: " + (cantidadNumeros - 1) + " números");
        System.out.println("La suma es: " + suma);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("El número mayor es: " + numeroMayor);

        // Se resta 1 porque no queremos que se cuente el cero para realizar la media
        System.out.println("La media es: " + (double) suma / (cantidadNumeros - 1));

    }

}

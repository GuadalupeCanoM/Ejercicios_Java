 package ejercicios_repaso;

import java.util.Scanner;

/**
 * implementa una clase en Java que pida al usuario dos números de un intervalo
 * (inicio y fin) y que después muestre los números primos que hay en dicho
 * intervalo. Para calcular si un número es primo tienes que comprobar el número
 * de divisores que tiene con el operador % (resto de la división entera). Si un
 * número sólo es divisible por sí mismo y por 1, entonces es primo. Para usar
 * la estructura do-while, también tendrás que controlar que los datos que
 * introduce el usuario son correctos. Es decir, tanto inicio como fin tendrán
 * que ser positivos y diferentes. También debes controlar que fin es mayor que
 * inicio
 *
 * @author Guadalupe Cano Moyano
 */
public class Numeros_primos_while {

    public static void main(String[] args) {
        int inicio, fin;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de números primos");
        System.out.println("--------------------------------");

        do {
            System.out.println("Introduce el inicio del intervalo: ");
            inicio = teclado.nextInt();

        } while (inicio < 0);

        do {
            System.out.println("Introduce el fin del intervalo: ");
            fin = teclado.nextInt();

            if (fin == inicio) {
                System.out.println("No puedes introducir un número mayor o igual para el inicio");
            }

        } while (fin < 0 || fin == inicio);

        for (int i = inicio; i <= fin; i++) {

            int divisores = 0;
            int j =1;
            
            while (j <= i){
                if(i % j == 0){
                    divisores++;
                }
                j++;
            } 
            if(divisores == 2){
                System.out.println("El número " + i + " es primo");
            }
                
        }

    }

}

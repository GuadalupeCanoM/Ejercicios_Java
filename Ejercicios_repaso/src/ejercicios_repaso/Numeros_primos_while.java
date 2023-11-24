 package ejercicios_repaso;

import java.util.Scanner;

/**
 * implementa una clase en Java que pida al usuario dos n�meros de un intervalo
 * (inicio y fin) y que despu�s muestre los n�meros primos que hay en dicho
 * intervalo. Para calcular si un n�mero es primo tienes que comprobar el n�mero
 * de divisores que tiene con el operador % (resto de la divisi�n entera). Si un
 * n�mero s�lo es divisible por s� mismo y por 1, entonces es primo. Para usar
 * la estructura do-while, tambi�n tendr�s que controlar que los datos que
 * introduce el usuario son correctos. Es decir, tanto inicio como fin tendr�n
 * que ser positivos y diferentes. Tambi�n debes controlar que fin es mayor que
 * inicio
 *
 * @author Guadalupe Cano Moyano
 */
public class Numeros_primos_while {

    public static void main(String[] args) {
        int inicio, fin;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de n�meros primos");
        System.out.println("--------------------------------");

        do {
            System.out.println("Introduce el inicio del intervalo: ");
            inicio = teclado.nextInt();

        } while (inicio < 0);

        do {
            System.out.println("Introduce el fin del intervalo: ");
            fin = teclado.nextInt();

            if (fin == inicio) {
                System.out.println("No puedes introducir un n�mero mayor o igual para el inicio");
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
                System.out.println("El n�mero " + i + " es primo");
            }
                
        }

    }

}

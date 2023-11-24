package Ejercicio_Luis_Repaso;

import java.util.Scanner;

/**
 * Ejercicio 4: Crea un programa que pida al usuario 2 números enteros y que
 * después muestre un menú similar al siguiente (calculadora básica): 1. Sumar
 * 2. Restar 3. Dividir 4. Multiplicar Deberás utilizar la estructura switch y
 * calcular todas las operaciones necesarias. Ten cuidado con el uso de break y
 * con las divisiones por 0.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        // Se muestra un encabezado para la calculadora básica.
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("_____________________");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");

        System.out.println();
        System.out.print("Introduce el número 1: ");
        int numero1 = teclado.nextInt();

        System.out.print("Intoduce el número 2: ");
        int numero2 = teclado.nextInt();

        System.out.print("Introduce la opción que quieres que te calcule: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
                
            case 2:
                System.out.println("La resta es: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
                
            case 3:
                System.out.println("La multiplicación es: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
                
            case 4:
                // Se verifica que el denominador no sea cero y realiza la división.
                if (numero2 != 0) {
                    System.out.println("La división es: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                }else{
                    // Se maneja la división por cero. (Para que en caso que el usuario introduzca el 0 sepa porque finaliza el programa)
                    System.out.println("ERROR! no se puede dividir por cero");
                }
                break;
                
            default:
                // Se contempla que se introduzca una opción incorrecta
                System.out.println("ERROR!! No has introducido una opción correcta");
        }

    }

}


package Tarea2;

import java.util.Scanner;


/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    
         public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes

        // Variables de entrada
        String texto;
        int multiplicador;
        char caracter;
        int valorPalabra = 0;

        // Variables de salida
        int puntuacionFinal;
        // Variables auxiliares
        int extensionTexto = 5;
        // Clase Scanner para petici�n de datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN TEXTO");
        System.out.println("------------------");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //Utilizo do While para que al menos me pida una vez los datos.
        do {

            System.out.print("Introduzca un texto con al menos 5 caracteres:");
            texto = teclado.nextLine();

        //Volver� a repetir el bucle mientras el texto que introduzca el usuario por teclado sea menor que extensionTexto(que es 5)
        } while (texto.length() < extensionTexto);

        do {
            System.out.print("Introduzca el valor del multiplicador (entre 1-3):");
            multiplicador = teclado.nextInt();

        //Volver� a repetir el bucle mientras el valor del multiplicador sea menor a 1 y mayor a 3.
        } while (multiplicador < 1 || multiplicador > 3);

        //En cuanto i valga lo mismo que la longitud del texto introducida por el usuario la condición ya no se cumpliaría.
        for (int i = 0; i < texto.length(); i++) {
            //Obtención del caracter en una posición de la cadena
            caracter = texto.charAt(i);

            //Cada vocal mayuscula o minuscula vale un punto
            switch (caracter) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    //Es lo mismo que valorPalabra=valorPalabra +1;
                    valorPalabra += +1;  
                    break;
                //Las letras x,y,z (minusculas) valdra dos puntos
                case 'x':
                case 'y':
                case 'z':
                    valorPalabra += +2;
                    break;
                //La letra X (mayuscula) valdrá cinco puntos
                case 'X':
                    valorPalabra += +5;
                    break;
                default:
                    //Cualquier otro caracter (tanto si es letra como si es otra cosa), restará un punto
                    valorPalabra += - 1;

            }
        }
        //Multiplicamos el valor de la palabra (según la puntuaci�n del char) por el valor del multiplicador
        puntuacionFinal = valorPalabra * multiplicador;

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El valor del texto es " + puntuacionFinal);
        
        
       
      
    }

}

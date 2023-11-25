
package Tarea2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Programación DAM y DAW IES Trassierra
 */
public class Ejercicio01 {

  
    public static void main(String[] args) {
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        final byte NOTA_MAXIMA = 10;
        final byte NOTA_MINIMA = 0;

        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        float valorIntroducido;

        double suma = 0;
        float notaObtenida;
        double notaFinal;
        int numeroNotas = 0;
        int mediaEntera;
        String calificacionFinal = "";
        System.out.println("Ejercicio 1. Uso del depurador");
        System.out.println("----------------------------------------------------");
        System.out.println("PRUEBA DEL ALUMN@ JUAN MATA LOPEZ");
        System.out.println("----------------------------------------------------");
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // Bloque 1. Solicitud de la calificación  deseada.
        // Validación de entrada
        do {
            System.out.println("Introduce la calificación que te gustaría obtener en Programación (decimal entre 0 y menos que 10)");
            valorIntroducido = teclado.nextFloat();

        } while (valorIntroducido < NOTA_MINIMA || valorIntroducido >= NOTA_MAXIMA);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Bloque 2. Obtención de  notas aleatoriamente
        do {
            notaObtenida = aleatorio.nextFloat() * 10;
            System.out.printf("\nHas obtenido una nota de: %.2f\n", notaObtenida);
            suma += notaObtenida;
            numeroNotas++;
        } while (notaObtenida < valorIntroducido);

        // Bloque 3. Calculo  de notas medias (valor real y valor entero)
        notaFinal = (suma / numeroNotas);

        //Obtención del redondeo de calificación a entero
        if (notaFinal - ((int) (suma / numeroNotas)) < 0.5) {
            mediaEntera = (int) (notaFinal);
        } else {
            mediaEntera = (int) (notaFinal) + 1;
        }

        System.out.printf("\nLa nota media con decimales obtenida es: %.2f\n", notaFinal);
        System.out.printf("\nLa nota media redondeada es obtenida es: %d\n", mediaEntera);

        // Bloque 4. Cálculo de la Calificación del Acta
        switch (mediaEntera) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                calificacionFinal += "Insuciciente";
                break;
            case 5:
                calificacionFinal += "Suficiente";
                break;
            case 6:
                calificacionFinal += "Bien";
                break;
            case 7:
            case 8:
                calificacionFinal += "Notable";
                break;
            case 9:
            case 10:
                calificacionFinal += "Sobresaliente";
                break;
        }
        System.out.println("La calificación final del acta es: " + mediaEntera + " (" + calificacionFinal + ")");
    }
}

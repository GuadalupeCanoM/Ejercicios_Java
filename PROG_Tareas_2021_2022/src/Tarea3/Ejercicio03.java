package Tarea3;

// Incluir los imports que se necesiten
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 3: Horario de clases.
 *
 * @author Guadalupe Cano
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        LocalTime primeraHora;

        // Variables de entrada
        int hora = 0, minuto = 0;

        // Variables de salida
        String resultado;

        // Variables auxiliares
        boolean errorEntrada;
        LocalTime horaTeclado;

        // Objeto Scanner para lectura desde teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("HORARIO DE CLASES");
        System.out.println("-----------------");
        System.out.println("Introducción del horario que desea comprobar: ");

        // 1. Creación de un objeto de la clase LocalTime con la primera hora de clase (08:00)
        primeraHora = LocalTime.of(8, 0);

        // 2. Lectura por teclado y comprobación de hora y minuto
        // 2.1. Leer y comprobar la hora (debe estar entre 0 y 23)
        do {
            System.out.print("Introduzca hora (00-23): ");
            try {
                hora = teclado.nextInt();
                errorEntrada = (hora < 0 || hora > 23);
            } catch (InputMismatchException ex) {
                System.out.println("Error de lectura: no es un número entero válido");
                errorEntrada = true;
                teclado.nextLine(); // "Purgamos" lo que haya en el teclado, que es incorrecto
            }
        } while (errorEntrada);

        // 2.2.  Leer y comprobar el minuto (entre 0 y 59)
        do {
            System.out.print("Introduzca minuto (00-59): ");
            try {
                minuto = teclado.nextInt();
                errorEntrada = (minuto < 0 || minuto > 59);
            } catch (InputMismatchException ex) {
                System.out.println("Error de lectura: no es un número entero válido");
                errorEntrada = true;
                teclado.nextLine(); // "Purgamos" lo que haya en el teclado, que es incorrecto
            }
        } while (errorEntrada);

        // 3. Creación de objeto LocalTime a partir de los datos leídos por teclado
        horaTeclado = LocalTime.of(hora, minuto);
        //----------------------------------------------
        //               Procesamiento 
        //----------------------------------------------
        // 4. Obtener el rango en el que se encuentra la hora a partir de los dos objetos LocalTime
        if (horaTeclado.isBefore(primeraHora)) {
            resultado = String.format("Aún no ha comenzado la jornada. Faltan %s minutos para comenzar",
                    horaTeclado.until(primeraHora, ChronoUnit.MINUTES));
        }else if(horaTeclado.isBefore(primeraHora.plusHours(2))){
            resultado = "Programación.";
        }else if(horaTeclado.isBefore(primeraHora.plusHours(4))){
            resultado = "Sistemas informáticos.";
        }else if(horaTeclado.isBefore(primeraHora.plusHours(6))){
            resultado = "Entornos de desarrollo.";
        }else{
            resultado = String.format("La jornada ya ha finalizado. Han pasado %s minutos desde el fin",
                    primeraHora.plusHours(6).until(horaTeclado, ChronoUnit.MINUTES));
        }
       

        //----------------------------------------------
        //            Salida de resultados 
        //----------------------------------------------
        // 5. Mostrar la hora y introducida y los resultados obtenidos
        System.out.printf("Hora introducida: %s \n", horaTeclado);
        System.out.printf("Clase correspondiente: %s \n ", resultado);
    }

}

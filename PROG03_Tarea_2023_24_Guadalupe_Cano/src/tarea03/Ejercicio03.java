package tarea03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 3: Día de cumpleaños
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final int MIN_ANYO_NACIMIENTO = 1900;
        // Se extrae la fecha completa actual y a partir de la fecha con getYear se extrae el año
        final int ANYO_ACTUAL = LocalDate.now().getYear();
        final int MIN_MES_NACIMIENTO = 1;
        final int MAX_MES_NACIMIENTO = 12;
        final int MIN_DIA_NACIMIENTO = 1;
        final int MAX_DIA_NACIMIENTO = 31;

        // Variables de entrada
        int anyoNacimiento = 0, mesNacimiento = 0, diaNacimiento = 1;

        // Variables de salida
        String nombreDiaSemanaNacimiento;
        int contador = 0;

        // Variables auxiliares
        LocalDate fechaNacimiento;
        boolean fechaIncorrecta;
        int numeroDiasDelMes;
        LocalDate fechaCumpleanyos;
        String nombreDiaCumpleanyos;
        boolean esBisiesto;
        String fechaCumpleanosFormateada;

        // Objeto Scanner para lectura desde teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("DÍA DE CUMPLEAÑOS");
        System.out.println("-----------------");

        // 1. Entrada de datos: lectura de año de nacimiento
        // 1.1.- Leer y comprobar el año de nacimiento (entre 1900 y año actual)
        // Se utiliza un bucle do-while porque al menos quiero que solicite una vez el año de nacimiento
        do {

            try {
                System.out.println("Introduzca año de nacimiento (1900-2023): ");
                anyoNacimiento = teclado.nextInt(); // Se solicita el año de nacimiento

                // Se asigna a la variable booleana la condición
                fechaIncorrecta = (anyoNacimiento < MIN_ANYO_NACIMIENTO || anyoNacimiento > ANYO_ACTUAL);

                // Se controla que no se introduzca una fecha errónea
                // Si la fecha es incorrecta, se ejecuta el if y vuelve a pedir el año
                if (fechaIncorrecta) {
                    System.out.println("Error de lectura: año incorrecto.");
                }
                // Se controola que no se introduzca un número entero
            } catch (InputMismatchException e) {
                System.out.println("Error de lectura: año incorrecto.");
                fechaIncorrecta = true;
                teclado.nextLine(); // Se purga lo que haya en teclado, que es incorrecto
            }
            // Si la fecha es incorrecta (el año de nacimiento es menor a 1900 o el año de nacimiento es mayor a 2023) 
            // se vuelve a pedir que se introduzca un año correcto
        } while (fechaIncorrecta);

        // 1.2.- Leer y comprobar el mes de nacimiento 
        do {
            try {
                System.out.println("Introduzca mes de nacimiento (1-12): ");
                mesNacimiento = teclado.nextInt(); // Se solicita que se introduzca el mes nacimiento

                // Se asigna a la variable booleana la condición
                fechaIncorrecta = (mesNacimiento < MIN_MES_NACIMIENTO || mesNacimiento > MAX_MES_NACIMIENTO);

                // Se controla que no se introduzca una fecha errónea
                if (fechaIncorrecta) {
                    System.out.println("Error de lectura: mes incorrecto");
                }
                // Se controla que no se introduzca un número entero
            } catch (InputMismatchException e) {
                System.out.println("Error de lectura: mes incorrecto.");
                fechaIncorrecta = true;
                teclado.nextLine(); // Se purga lo que haya en teclado, que es incorrecto
            }
            // Si el mes es menor a 1 o mayor a 12 se vuelve a pedir que se introduzca un mes correcto    
        } while (fechaIncorrecta);

        // 1.3.- Averiguamos cuántos días tiene el mes de nacimiento
        // Se utiliza LocalDate.of() para extraer la fecha completa
        // Se utiliza lengthOfMonth() para obtener la duración del mes (28, 29, 30 o 31)
        numeroDiasDelMes = LocalDate.of(anyoNacimiento, mesNacimiento, diaNacimiento).lengthOfMonth();

        // 1.4.- Leer y comprobar el día de nacimiento 
        do {
            try {
                System.out.println("Introduzca dia de nacimiento: ");
                diaNacimiento = teclado.nextInt(); // Se solicita que se introduzca el día de nacimiento

                // Se añade la condición diaNacimiento > numeroDiasDesMes para controlar que no sea un 29 de febrero de un año no bisiesto 
                // Si no se controla saltará la excepción java.time.DateTimeException
                fechaIncorrecta = (diaNacimiento < MIN_DIA_NACIMIENTO || diaNacimiento > MAX_DIA_NACIMIENTO || diaNacimiento > numeroDiasDelMes);
                if (fechaIncorrecta) {
                    System.out.println("Error de lectura: día incorrecto");
                }

                // Se controla que no se introduzca un número entero    
            } catch (InputMismatchException e) {
                System.out.println("Error de lectura: día incorrecto.");
                fechaIncorrecta = true;
                teclado.nextLine(); // Se purga lo que haya en teclado, que es incorrecto
            }
            // Si la fecha no es correcta vuelve a solicitar el día de nacimiento    
        } while (fechaIncorrecta);

        //----------------------------------------------
        //    Procesamiento + Salida de resultados  
        //----------------------------------------------
        //2.- Cálculo del día de la semana en que cayó el nacimiento
        // Se extrae la fecha de nacimiento (con los datos que ha introducido el usuario)
        fechaNacimiento = LocalDate.of(anyoNacimiento, mesNacimiento, diaNacimiento);
        
        // Se obtiene el nombre del día de la semana en español
        nombreDiaSemanaNacimiento = fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        // Se imprime el día de la semana de nacimiento
        System.out.printf("El día que naciste fue %s\n",  nombreDiaSemanaNacimiento);

        System.out.printf("\n¿Cúantas veces tu cumpleaños ha caído en %s?\n", nombreDiaSemanaNacimiento);
        System.out.println("----------------------------------------------------");
        // 3.- Recorremos desde el año posterior al año de nacimiento hasta el año actual (bucle)

        // Se recorren los años desde al año posterior al nacimiento hasta el año actual
        for (int i = anyoNacimiento + 1; i <= ANYO_ACTUAL; i++) {

            // Se extrae si un año es bisiesto
            // Para el mes y el día pongo 1, porque solo me interesa saber el año que es i
            esBisiesto = LocalDate.of(i, 1, 1).isLeapYear();

            // Si es un año bisiesto o no es un 29 de febrero
            if ((esBisiesto) || (diaNacimiento != 29 || mesNacimiento != 2)) {

                // Se extraen las fechas de cumpleaños
                fechaCumpleanyos = LocalDate.of(i, mesNacimiento, diaNacimiento);
                // Se extrae el nombre del día de la semana de cada fecha
                nombreDiaCumpleanyos = fechaCumpleanyos.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

                // Se verifica si el nombre del día de la semana en que cayó el cumpleaños es igual al nombre del día de la semana en que nació la persona
                if (nombreDiaCumpleanyos.equals(nombreDiaSemanaNacimiento)) {
                    contador++; // Se utiliza un contador para enumerar las fechas

                    // Se formatea la fecha y se guarda en una variable
                    fechaCumpleanosFormateada = fechaCumpleanyos.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    // Se muestra por pantalla las fechas correctas
                    System.out.println(contador + ". " + fechaCumpleanosFormateada);

                }
            }

        }
        // 4.- Mostramos por pantalla el número de coincidencias
        System.out.printf("\nNúmero total de coincidencias: %d\n", contador);
    }
}

package tarea03;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 1: Creación y uso de cartones de bingo. <br>
 * En este ejercicio probamos el funcionamiento de la clase CartonBingo tratando
 * de conocer los métodos que tiene y el funcionamiento de cada uno de ellos
 *
 * @author [Guadalupe Cano Moyano]
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        // 1. Presentación del ejercicio
        System.out.println("Ejercicio 1. Creación y uso de cartones de bingo");
        System.out.println("------------------------------------------------");
        /* 
            Debes mostrar la fecha ACTUAL (hoy) usando la API de LocalDate
            (usa también DateTimeFormatter para formatear la fechala correctamente (ej. 08/11/2022)
         */

        System.out.println("Fecha actual de ejecución: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // 2.- Declaración de tres variables referencia a objetos instancia de la clase CartonBingo
        CartonBingo cartonMaria, cartonAda, cartonJuan;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        /* 
            En este ejercicio no habrá entrada de datos como tal ya que los datos que se piden en el enunciado son fijos, 
            y son introducidos por el/la programador/a (no hay que pedir datos por teclado al usuario de la aplicación).
         */
        // 3.- Instanciación de objetos de la clase CartonBingo
        System.out.println("Creación de los cartones para cada uno de los personajes (uso de constructores)");
        System.out.println("-----------------------------------------------------------------------------------");
        // 3.1.- Comprobación del lanzamiento de excepciones (se intentan crear cartones no válidos)
        // 3.1.1.- Intento de creación de un cartón de bingo con fecha de sorteo de la semana pasada (hay gestionar la posible excepción)

        try {
            LocalDate fechaNoValida = LocalDate.now().minusWeeks(1);
            System.out.println("Intentando crear un cartón para el sorteo celebrado hace una semana (" + fechaNoValida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")");
            cartonMaria = new CartonBingo(fechaNoValida);
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();

        // 3.1.2.- Intento de creación de un cartón de bingo con una cantidad de números no válida (30 números)
        try {
            System.out.println("Intentando crear un cartón con 30 números (cantidad no válida)");
            cartonMaria = new CartonBingo(30, "Desconocido", LocalDate.now());
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();

        // 3.2 Creación de cartones válidos
        System.out.println("Creamos ahora cartones válidos para nuestros tres jugadores...");
        // 3.2.1.- Creación de un cartón válido para María siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón de 18 números y fecha de sorteo del 5 de Marzo de 2024 para María:");
        cartonMaria = new CartonBingo(18, "María", LocalDate.of(2024, 3, 5));
        System.out.println();

        // 3.2.2.- Creación de un cartón válido para Ada siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón para Ada, sin indicar nada más: ");
        cartonAda = new CartonBingo("Ada");
        System.out.println();

        // 3.2.3.- Creación de un cartón válido para Juan siguiendo las especificaciones del enunciado
        System.out.println("Creando un cartón para Juan, utilizando los valores por defecto: ");
        cartonJuan = new CartonBingo();
        System.out.println();

        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        /* 
            Dado que se va a ir mostrando información de salida a la vez que se van realizando operaciones, podemos considerar en este caso
            que el procesamiento y la salida de resultado van unidos y "mezclados" 
         */
        // 4.- Obtención de información de los cartones creados
        System.out.println("Obtención de información de los cartones creados");
        System.out.println("----------------------------------------------------");
        System.out.printf("Total de cartones que se han creado: %s\n", CartonBingo.getTotalCartones());
        System.out.printf("Identificador del cartón de María: %s\n", cartonMaria.getIdCarton());
        System.out.printf("Cantidad de números que tiene el cartón de Ada: %s números\n", cartonAda.getTotalNumerosCarton());
        System.out.printf("Fecha del sorteo del cartón de Juan %s y del cartón de María: %s \n", cartonJuan.getFechaSorteo(), cartonMaria.getFechaSorteo());
        System.out.printf("Lista de números del cartón de Ada: %s\n", cartonAda.listadoNumerosPendientes());
        System.out.printf("Número de días que faltan hasta el sorteo en el que participa María: %s\n", cartonMaria.diasHastaSorteo());
        System.out.printf("Cartones que participan en el sorteo de hoy: %s \n", CartonBingo.totalCartonesSorteo(LocalDate.now()));

        // 5.- Realización de algunas operaciones con los cartones creados
        System.out.println("\nRealización de algunas operaciones con los cartones creados");
        System.out.println("----------------------------------------------------------------");

        // 5.1.- Marcar los números del 20 al 35 en los tres cartones
        System.out.println("Marcamos los números desde el 20 hasta el número 35 ambos incluidos en los tres cartones...");
        for (int i = 20; i <= 35; i++) {
            cartonMaria.marcarNumero(i); // Se marcan los números del cartón de María
            cartonAda.marcarNumero(i);   // Se marcan los números del cartón de Ada
            cartonJuan.marcarNumero(i);  // Se marcan los números del cartón de Juan
        }

        // 5.2.- Mostrar los números que han podido marcar correctamente en cada uno de los cartones
        System.out.println("De los números anteriores, mostramos la lista de números que sí se han podido marcar en cada uno de los cartones");
        System.out.printf("- En el cartón de María estaban los números: %s\n", cartonMaria.listadoNumerosMarcados());
        System.out.printf("- En el cartón de Ada estaban los números: %s \n", cartonAda.listadoNumerosMarcados());
        System.out.printf("- En el cartón de Juan estaban los números: %s \n\n", cartonJuan.listadoNumerosMarcados());

        // 5.3.- Indica de los tres cartones, a cuál de ellos le quedan menos números
        System.out.print("Al jugador/a que le quedan menos números pendientes de marcar en su cartón es...");
        if (cartonMaria.getCantidadNumerosPendientes() < cartonAda.getCantidadNumerosPendientes() && cartonMaria.getCantidadNumerosPendientes() < cartonJuan.getCantidadNumerosPendientes()) {
            System.out.printf("María, que le quedan %s números por marcar\n", cartonMaria.getCantidadNumerosPendientes());
        } else if (cartonAda.getCantidadNumerosPendientes() < cartonMaria.getCantidadNumerosPendientes() && cartonAda.getCantidadNumerosPendientes() < cartonJuan.getCantidadNumerosPendientes()) {
            System.out.printf("Ada, que le quedan %s números por marcar\n", cartonAda.getCantidadNumerosPendientes());
        } else {
            System.out.printf("Juan, que le quedan %s números por marcar\n\n", cartonJuan.getCantidadNumerosPendientes());
        }

        // 6.- Muestra el estado final de los cartones
        System.out.println();
        System.out.println("Estado final de todos los cartones");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println(cartonMaria);
        System.out.println(cartonAda);
        System.out.println(cartonJuan);
        System.out.println("El programa ha finalizado!!");
        System.out.println();

    }
}

package tarea03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import libtarea3.Teatro;

/**
 * Ejercicio 1: Trabajo con teatros
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // 1.1. Declaración de tres variables referencia a objetos instancia de la clase Teatro
        Teatro teatro1, teatro2, teatro3;

        // 1.2. Declaración de constante para dar formato de fecha hora 
        // Se obtiene la fecha y hora actual
        final LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Se define un formateador con el formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Se formatea la fecha y hora actual
        String fechaFormateada = fechaHoraActual.format(formato);

        //----------------------------------------------
        //              Presentación
        //----------------------------------------------
        System.out.println("TRABAJO CON TEATROS");
        System.out.println("--------------------");
        System.out.println();

        //----------------------------------------------
        //               Análisis inicial
        //----------------------------------------------        
        // 2. Consulta de valores iniciales
        System.out.println("1.-CONSULTA INICIAL DE VALORES GLOBALES");
        System.out.println("---------------------------------------");
        System.out.println();

        // 2.1. Número de teatros creados hasta el momento
        System.out.printf("Número de teatros creados hasta el momento: %s\n", Teatro.getTeatrosTotales());

        // 2.2. Número de obras que se están represenando en este momento en todos los teatros
        System.out.printf("Número de obras que se están representando en este momento: %s\n", Teatro.getObrasActivas());

        //2.3. Número de entradas vendidas en todos los teatros y para todas las obras que se han representado hasta el momento
        System.out.printf("Número de entradas vendidas hasta el momento: %s\n", Teatro.getEntradasVendidasTotales());

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // En realidad no hay entrada de datos como tal dado que la información 
        // de entrada es fija y siempre la misma
        System.out.println("\n2.-CREACIÓN Y USO DE TEATROS");
        System.out.println("------------------------------\n");

        // 3.- Instanciación de tres objetos Teatro
        System.out.println("Creación de teatros (constructores)");
        System.out.println("-------------------------------------");

        // 3.1.- Intento de crear un teatro con un aforo inferior (hay que gestionar la posible excepción)
        try {
            System.out.println("Intentando crear un teatro con un aforo inferior...");
            teatro1 = new Teatro("Cervantes", 299);
            System.out.println(teatro1.getAforo());
        } catch (IllegalArgumentException e) {
            System.out.printf("Error: %s\n\n", e.getMessage());
        }

        // 3.2.- Intento de crear un teatro con un aforo superior (hay que gestionar la posible excepción)
        try {
            System.out.println("Intentando crear un teatro con un aforo superior...");
            teatro1 = new Teatro("Cervantes", 1001);
            System.out.println(teatro1.getAforo());
        } catch (IllegalArgumentException e) {
            System.out.printf("Error: %s\n\n", e.getMessage());
        }

        // 3.3.- Intento de crear un teatro con un nombre de teatro vacío y aforo por defecto
        try {
            System.out.println("Intentando crear un teatro con un nombre vacío y aforo por defecto...");
            teatro1 = new Teatro("");

        } catch (IllegalArgumentException e) {
            System.out.printf("Error: %s\n\n", e.getMessage());
        }

        // 3.4.- Creación de un primer teatro usando el constructor de dos parámetros
        System.out.println("Creando teatro con aforo válido con un constructor con dos parámetros...");
        teatro1 = new Teatro("Teatro Cervantes", 900);
        System.out.printf(teatro1.toString() + "\n\n");
       

        // 3.5.- Creación de un segundo teatro con un aforo por defecto usando el constructor de un parámetro 
        System.out.println("Creando teatro con aforo por defecto usando un constructor con un parámetro...");
        teatro2 = new Teatro("Teatro Apolo");
        System.out.printf(teatro2.toString()+ "\n\n");
       

        // 3.6.- Creación de un tercer teatro usando el constructor sin parámetros    
        System.out.println("Creando teatro con valores por defecto usando un constructor sin parámetros...");
        teatro3 = new Teatro();
        System.out.printf(teatro3.toString()+ "\n\n");
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        // Dado que se va a ir mostrando información de salida a la vez que 
        // se van realizando operaciones, podemos considerar en este caso
        // que el procesamiento y la salida de resultado van unidos y "mezclados"
        // 4.- Operaciones con teatros
        System.out.println("Manipulación de teatros (métodos)");
        System.out.println("-----------------------------------");

        // 4.1.- Intento de terminar de representar una obra a un teatro que no tiene obra asignada (debemos capturar el error)
        try {
            teatro1.terminarObra();
        } catch (IllegalStateException e) {
            System.out.println("Terminando de representar obra en el primer teatro...");
            System.out.printf("Error: %s\n\n", e.getMessage());
        }

        //4.2.- Asignamos una obra al teatro1 y lo llenamos (debemos comprobar antes si podemos asignarla)
        System.out.println("Asignando una obra de teatro...");
        teatro1.asignarObra("La vida es sueño");
        teatro1.llenarTeatro();
        System.out.printf("Se ha asignado la obra '%s' al teatro '%s'. \nTeatro lleno. Se han vendido %s entradas.\n",
                teatro1.getObra(), teatro1.getNombreTeatro(), teatro1.getEntradasVendidas());

        //4.3.- Devolvemos 50 entradas del teatro1 (puesto que acabamos de llenar el teatro, no es necesario comprobar si podemos devolver entradas)
        teatro1.devolverEntradas(50);

        //4.4.- Intentamos traspasar la representación de la obra del teatro1 al teatro2 (hay que gestionar la posible excepción)
        try {
            teatro1.traspasarObra(teatro2);
        } catch (IllegalStateException e) {
            System.out.println("\nIntentando traspasar una obra de un teatro a otro...");
            System.out.printf("Error: %s\n\n", e.getMessage());
        }
        //4.5.- Devolvemos otras 50 entradas del teatro1 (no es necesario comprobar si podemos devolver entradas)
        teatro1.devolverEntradas(50);

        //4.6.- Volvemos a intentar traspasar la obra del teatro1 al teatro2 (ahora no debe dar excepción)
        try {
            teatro1.traspasarObra(teatro2);    
        } catch (IllegalStateException e) {
            System.out.println("\nIntentando traspasar una obra de un teatro a otro...");
            System.out.printf("Error: %s\n\n", e.getMessage());
        }

        //4.7.- Devolver una entrada del teatro2
        teatro2.devolverEntradas(1);

        //5.- Obtención de información del segundo teatro creado
        System.out.println("\nPrueba de los getters del segundo teatro creado:");
        System.out.println("----------------------------------------------------");

        System.out.printf("Fecha de realización de la prueba: %s\n", fechaFormateada);

        // Código, nombre y aforo del teatro
        System.out.printf("\nTeatro 2\n   Código de teatro: %s \tNombre del teatro: \"%s\"\n   Aforo: %s\n   Estado: \n     Se está representando la obra de teatro: \"%s\"\n"
                + "     Entradas vendidas: %s\n\n",
                teatro2.getCodigoTeatro(), teatro2.getNombreTeatro(), teatro2.getAforo(), teatro2.getObra(), teatro2.getEntradasVendidas());
        

        //----------------------------------------------
        //               Análisis Final
        //----------------------------------------------        
        // 6. Consulta de valores finales
        System.out.println("3.-CONSULTA FINAL DE VALORES GLOBALES");
        System.out.println("-------------------------------------");
        System.out.println();

        // 6.1. Número de teatros creados hasta el momento
        System.out.printf("Número de teatros creados hasta el momento: %s.\n", Teatro.getTeatrosTotales());

        // 6.2. Número de obras que se están represenando en este momento en todos los teatros
        System.out.printf("Número de obras que se están representando en este momento: %s.\n", Teatro.getObrasActivas());

        //6.3. Número de entradas vendidas en todos los teatros y para todas las obras que se han representado hasta el momento
        System.out.printf("Número de entradas vendidas hasta el momento: %s.\n", Teatro.getEntradasVendidasTotales());

    }

}

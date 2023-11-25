package Tarea3;

// Incluir los imports que se necesiten
import libtarea3.Dado;

/**
 * Ejercicio 2: Lanzando los dados.
 *
 * @author Guadalupe Cano
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        Dado dadoPrueba;

        // Variables de salida
        // (no hace falta ninguna)
        // Variables auxiliares
        int numAleatorioCaras;

        System.out.println("LANZANDO LOS DADOS");
        System.out.println("------------------");
        System.out.println();

        //----------------------------------------------
        //               Análisis inicial
        //----------------------------------------------        
        // 1. Consulta de valores iniciales
        System.out.println("1.-CONSULTA INICIAL DE VALORES GLOBALES");
        System.out.println("---------------------------------------");
        System.out.println();

        // 1.1. Número total de dados creados
        System.out.printf("Número total de dados creados hasta el momento: %s \n", Dado.getNumeroDadosCreados());

        // 1.2. Número total de lanzamientos
        System.out.printf("Número total de lanzamientos llevados a cabo hasta el momento: %s \n", Dado.getNumeroLanzamientosGlobal());

        // 1.3. Consulta de los lanzamientos realizados (bucle desde 1 hasta el número de caras que se desea analizar) 
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Número de veces que se ha obtenido %s: %s \n", i, Dado.getNumeroVecesCaraGlobal(i));
        }

        //----------------------------------------------
        //      Creación y lanzamiento de dados
        //----------------------------------------------
        System.out.println();
        System.out.println("2.- CREACIÓN Y LANZAMIENTO DE DADOS");
        System.out.println("-----------------------------------");
        System.out.println();
        // 2.1. Intentos de creación 
        // Se intentan crear 10 dados que tengan aleatoriamente entre 0 y 8 caras (bucle)
        // Sólo algunas llamadas al constructor funcionarán y en esos casos es cuando se podrá lanzar el dado
        // Otras harán que salte una excepción IllegalArgumentException
        // Habrá que recogerla y mostrar el mensaje de error por pantalla
        for (byte intento = 1; intento <= 10; intento++) {
            numAleatorioCaras = (int) (Math.random() * 9);
            System.out.printf("Intento %d: Intentando crear dado aleatorio de %2d caras. ",
                    intento, numAleatorioCaras);
            try {
                dadoPrueba = new Dado(numAleatorioCaras);
                System.out.printf("Correcto. Creado dado de %d caras.\n",
                        dadoPrueba.getNumeroCaras());
                System.out.printf("Lo lanzamos %d veces: ",
                        dadoPrueba.getNumeroCaras());
                //  Lanzamiento del dado tantas veces como caras tenga (otro bucle dentro del bucle de creación)
                for (int i = 1; i <= dadoPrueba.getNumeroCaras(); i++) {
                    dadoPrueba.lanzar();
                }
                // Observamos los resultados obtenidos
                System.out.println(dadoPrueba.getSerieHistoricaLanzamientos());
                System.out.printf("Suma total de los lanzamientos del dado: %d\n",
                        dadoPrueba.getSumaPuntuacionHistorica());
            } catch (IllegalArgumentException e) {
                // Se ha intentado crear un objeto Dado con un paraámetro incorrecto
                System.out.printf("Error. %s\n", e.getMessage());
            }
        }

        //----------------------------------------------
        //         Análisis de resultados finales
        //----------------------------------------------
        // 3. Análisis de resultados una vez realizados todos los lanzamientos
        System.out.println();
        System.out.println("3.-ANÁLISIS DE RESULTADOS FINALES");
        System.out.println("---------------------------------");

        // 3.1. Número total de dados creados
        System.out.printf("Número total de dados creados hasta el momento: %d \n", Dado.getNumeroDadosCreados());

        // 3.2. Número total de lanzamientos
        System.out.printf("Número total de lanzamientos llevados a cabo hasta el momento: %d\n", Dado.getNumeroLanzamientosGlobal());

        // 3.3. Análisis de los lanzamientos realizados (bucle desde 1 hasta el número de caras que se desea analizar)
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Número de veces que se ha obtenido %s entre todos los lanzamientos de todos los dados: %s \n",
                    i, Dado.getNumeroVecesCaraGlobal(i));
        }

    }
}

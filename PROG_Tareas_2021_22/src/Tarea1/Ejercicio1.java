
package tarea1;

/**
 * Provincias de Andaluc?a.
 *
 * @author Guadalupe Cano
 */
public class Ejercicio1 {

    // Definición del enum
    public enum provincias {
        ALMERIA, CADIZ, CORDOBA, GRANADA, HUELVA, JAEN, MALAGA, SEVILLA
    }

    
    // Programa principal
    public static void main(String[] args) {

        System.out.println("PROVINCIAS DE ANDALUC?A");
        System.out.println("-----------------------");

        // Vamos mostrando cada uno de los posibles valores del enum
        // (no hace falta estructurar el programa en entrada/procesamiento/salida)
        System.out.println("Provincia 1: " + provincias.ALMERIA);
        System.out.println("Provincia 2: " + provincias.CADIZ);
        System.out.println("Provincia 3: " + provincias.CORDOBA);
        System.out.println("Provincia 4: " + provincias.GRANADA);
        System.out.println("Provincia 5: " + provincias.HUELVA);
        System.out.println("Provincia 6: " + provincias.JAEN);
        System.out.println("Provincia 7: " + provincias.MALAGA);
        System.out.println("Provincia 8: " + provincias.SEVILLA);

        System.out.println();
        System.out.println("Fin del programa.");

    }

}

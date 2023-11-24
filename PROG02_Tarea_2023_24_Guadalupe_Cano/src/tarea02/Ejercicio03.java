package tarea02;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio03 {

    public static void main(String args[]) {
        //----------------------------------------------
        //               Declaración de variables y constantes
        //----------------------------------------------

        // Variables de entrada 
        int numSoldados = 0;
        String tipoFormacion;

        // Variables auxiliares
        int soldadosRestantes;
        int ladoCuadrado, filas;

        // Variables de salida
        String resultado = "";

        // Clase escanner para solicitar datos al usuario
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio03: Formación romana a partir de un número de soldados.");
        System.out.println("----------------------------------------------------");
        // Bloque 1. Solicitud del número de soldados
        // Validación de entrada: Deberíamos comprobar que es mayor o igual que uno. En caso contrario volvemos solicitar el número de soldados
        // Se supone que nos introducen un número entero. En caso que no sea así saltará una excepción, cuyo tratamiento veremos en uinidades posteriores

        /* 
            Solicitamos al usuario que introduzca un número mayor a 0, si es menor, 
            se vuelve a repetir el bucle y vuelve a solicitar la información
         */
        do {
            System.out.println("Introduce el número de elementos de la formación (debe ser mayor que cero):");
            numSoldados = teclado.nextInt();
        } while (numSoldados < 1);

        // Bloque 2. Solicitud del tipo de formación. 
        // Indicaremos que tiene que ser LINEA, CUADRADO o TRIANGULO
        // Leemos una cadena, puede que no sea una de las anteriores.
        System.out.println("Introduce el tipo de formación (LINEA, CUADRADO o TRIANGULO):");

        // Se utiliza next en lugar de nextLine para evitar que se salte la entrada de usuario
        // Se convierte la cadena de caracteres a mayúscula para que no haya distinción a la hora de la introducción de datos entra mayúsculas y minúsculas
        tipoFormacion = teclado.next().toUpperCase();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Creamos una cadena de texto para ir almacenando el resultado, que sacaremos por pantalla al final
        // Sólo si la entrada ha sido válida simulamos la formación representando cada soldado con un *
        // No olvides que Si al hacer la mayor formación posible del tipo indicado con los soldados introducidos sobran soldados, se debe indicar cuantos."
        // Si el tipo de formación que nos han indicado y que hemos leído como String no coincide con una de las contempladas, indicamos este error almacenando el mensaje oportuno en el String resultado
        if (tipoFormacion.equals("LINEA")) {

            // Se calcula el número de filas
            // Si el tipo de formación es "linea", el código imprime un número de asteriscos igual al número de soldados
            for (int i = 0; i < numSoldados; i++) {
                resultado += "* ";
            }
            resultado += "\n";

            // Si la formación es "cuadrado", el código calcula el lado del cuadrado. 
            // Para ello, se utiliza la raiz cuadrada del número de soldados.
        } else if (tipoFormacion.equals("CUADRADO")) {
            ladoCuadrado = (int) Math.sqrt(numSoldados);

            for (int i = 0; i < ladoCuadrado; i++) {
                resultado += "\n";
                for (int j = 0; j < ladoCuadrado; j++) {
                    resultado += "* ";
                }
            }
            resultado += "\n";
            
            // Se calculan los soldados restantes
            soldadosRestantes = numSoldados - (ladoCuadrado * ladoCuadrado);
            
            // Si hay algún soldado restante se imprime por pantalla los que sobran
            if (soldadosRestantes > 0) {

                resultado += "\nDe los " + numSoldados + " soldados asignados, una vez hecha la mayor formación posible del tipo indicado, sobran " + soldadosRestantes + " soldados.";
            }
        } else if (tipoFormacion.equals("TRIANGULO")) {
            // Calculamos el número de filas del triángulo equilatero con un número de soldados dado por teclado.
            filas = (int) ((Math.sqrt(1 + 8 * numSoldados) - 1) / 2);

            // Imprimimos el triángulo
            // Utilizamos un bucle for para recorrer cada fila del triángulo.
            // En cada fila el código imprime un asterisco por cada soldado.
            for (int i = filas; i > 0; i--) {

                // Imprimimos un espacio
                for (int j = 0; j < filas - i; j++) {
                    System.out.print(" ");
                }

                // Imprimimos asteriscos
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }

                System.out.println();
            }
            // Se calculan los soldados restantes
            soldadosRestantes = numSoldados - (filas * (filas + 1)) / 2;
            
            // Si hay algún soldado restante se imprime por pantalla los que sobran
            if (soldadosRestantes > 0) {

                resultado += "\nDe los " + numSoldados + " soldados asignados, una vez hecha la mayor formación posible del tipo indicado, sobran " + soldadosRestantes + " soldados.";
            }

            // Si se introduce una formación que no sea línea, cuadrado o triángulo se indica que no es correcto.
        } else {
            System.out.println("Opción NO CORRECTA");
        }
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println(resultado);
        //----------------------------------------------
    }
}

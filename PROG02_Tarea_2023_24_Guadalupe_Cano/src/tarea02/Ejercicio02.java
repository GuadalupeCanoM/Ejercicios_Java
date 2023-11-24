package tarea02;

/**
 *
 * @author Guadalupe Cano Moyano
 */
import java.util.Scanner;

public class Ejercicio02 {

    public enum Bebidas {
        COCACOLA, PEPSI, AGUA, ZUMO, OTRO
    }

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        int opcion, cantidadDinero;
        Bebidas miBebida = null;

        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        double precio = 0;
        double cambio;

        // Variables auxiliares
        double precioCocaCola = 1.50;
        double precioPepsi = 1.50;
        double precioAgua = 1.00;
        double precioZumo = 2.00;

        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2: Máquina expendedora de Bebidas");
        System.out.println("----------------------------------------------------");

        // Bloque 1: Sacamos por pantalla el menú de opciones y pedimos que introduzca una.
        //  En caso de introducir una opción inválida, debemos indicarlo y volver a pedirla.
        do {
            // Formateo la salida para que salgan dos decimales
            System.out.println("Bienvenido a la Máquina expendedora de Bebidas");
            System.out.println("Seleccione una bebida:");
            System.out.printf("1. %s - %.2f€%n", Bebidas.COCACOLA, precioCocaCola);
            System.out.printf("2. %s - %.2f€%n", Bebidas.PEPSI, precioPepsi);
            System.out.printf("3. %s - %.2f€%n", Bebidas.AGUA, precioAgua);
            System.out.printf("4. %s de naranja - %.2f€%n", Bebidas.ZUMO, precioZumo);
            System.out.println("0. Salir\n");

            System.out.print("Seleccione una opción: ");

            // Se solicita la opción del usuario
            opcion = teclado.nextInt();

        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 0);
        //----------------------------------------------------------------
        //                 Procesamiento y  Salida de resultados 
        //----------------------------------------------------------------

        // Cuando haya introducido una opción válida, llevamos a cabo la acción oportuna
        //  -Si nos indica 'Salir', nos despedimos y terminamos
        //  -Si nos indica un producto
        //      -Decimos el producto seleccionado y su precio
        //      -Pedimos que introduzca el importe
        //          -Si el importe es suficiente
        //               -Imprimimos el producto obtenido (Equivale a la orden de suministrar el producto
        //               -Decimos el importe que ha sobrado
        //          -Si no, indicamos que el importe es insuficiente 
        //-----------------------------------------------------------------
        switch (opcion) {
            case 1:
                miBebida = Bebidas.COCACOLA;
                precio = precioCocaCola;
                break;

            case 2:
                miBebida = Bebidas.PEPSI;
                precio = precioPepsi;
                break;

            case 3:
                miBebida = Bebidas.AGUA;
                precio = precioAgua;
                break;

            case 4:
                miBebida = Bebidas.ZUMO;
                precio = precioZumo;
                break;

            case 0:
                System.out.println("Gracias por usar la Máquina Expendedora. ¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Seleccione una bebida válida..\n");
        }
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
            System.out.printf("Has seleccionado un %s. El precio es %.2f € \n", miBebida, precio);
            System.out.print("Ingrese la cantidad de dinero en euros: ");

            // Se comprueba que la cantidad de dinero sea suficiente
            // Se pide por teclado la cantidad a introducir (un entero)
            cantidadDinero = teclado.nextInt();
            
            // Si la cantidad que introducimos es inferior al precio no habrá dinero suficiente y se devolverá el cambio
            if (cantidadDinero < precio) {
                System.out.println("Dinero insuficiente. Su dinero será devuelto.");
            
            /*
              Si la cantidad que introducimos es mayor que el precio, se indica que hemos podido comprar el producto
              y nos devuelve el cambio
            */
            }else if (cantidadDinero > precio){
                 // Se calcula el cambio
                cambio = cantidadDinero - precio;
                System.out.printf("Compra exitosa. Su cambio es: %.2f €\n", cambio);
                System.out.println("Disfrute de su " + miBebida);
            
            // Si la cantidad que introducimos es igual, no habrá cambio.
            }else{
                System.out.println("Ha introducido el precio exacto.");
                System.out.println("Disfrute de su " + miBebida);
            }
            
        }

    }
}

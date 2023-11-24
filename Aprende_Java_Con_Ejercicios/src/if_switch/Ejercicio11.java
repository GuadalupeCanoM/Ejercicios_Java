package if_switch;

import java.util.Scanner;

/**
 * Ejercicio 11: Escribe un programa que dada una hora determinada (hora y minutos), 
 * calcule los segundos que faltan para llegar a la media noche
 * 
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio11 {

    
         public static void main(String[] args) {
             
             System.out.println("Deberá introducir una hora del día y te diré cuantos segundos quedan para la media noche");

             Scanner teclado = new Scanner(System.in);
             System.out.print("Introduzca que hora es: ");
             int hora = teclado.nextInt();
             
             System.out.print("Introduzca que minuto es: ");
             int minuto = teclado.nextInt();
             
             // Primero pasamos todo a segundos. 
             // La hora que intdoduce el usuario por 3600 segundos que tiene una hora
             // Los minutos que introduce. 1 minuto tiene 60 segundos
             int segundosTranscurridos = (hora * 3600) + (minuto * 60);
             
             // Pasado todo a segundos, calculamos cuantos segundos hay en un día completo
             // Restamos esos segundos a los que ya han transcurrido
             int segundosMedianoche = (24 * 3600) - segundosTranscurridos;
             
             System.out.println("Desde las " + hora +":"+minuto +" faltan " + segundosMedianoche + " segundos para la media noche.");
              
    }

}

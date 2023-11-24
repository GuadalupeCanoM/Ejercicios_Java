package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio12 {

    
         public static void main(String[] args) {
            /*
            Ejercicio 12: Realiza un programa que calcule la nota que hace falta sacar en el segundo
            examen de la asignatura Programación para obtener la media deseada. Hay
            que tener en cuenta que la nota del primer examen cuenta el 40% y la del
            segundo examen un 60%.
            Ejemplo 1:
            Introduce la nota del primer examen: 7
            ¿Qué nota quieres sacar en el trimestre? 8.5
            Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
            Ejemplo 2:
            Introduce la nota del primer examen: 8
            ¿Qué nota quieres sacar en el trimestre? 7
            Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
            */
            
             Scanner teclado = new Scanner(System.in);
             
             System.out.print("Introduce la nota del primer examen: ");
             int nota1 = teclado.nextInt();
             
             System.out.print("¿Qué nota quieres sacar en el trimestre? ");
             double notaTrimestre = teclado.nextDouble();
             
             double nota2 = ((notaTrimestre * 100) - (nota1 * 40))/60;
             
             System.out.println("Para tener un " + notaTrimestre + " en el trimestre necesitas sacar " + nota2 + " en el segundo examen");
             
             
      
    }

}

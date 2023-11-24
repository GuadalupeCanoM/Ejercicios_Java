package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio8 {

    
         public static void main(String[] args) {
             /*
            Ejercicio 8: Escribe un programa que calcule el salario semanal de un empleado en base a
            las horas trabajadas, a razón de 12 euros la hora.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL SALARIO SEMANAL DADA LAS HORAS TRABAJADAS");
             System.out.println("----------------------------------------------------------------------");
             
             System.out.print("Introduce cuantas horas has trabajado esta semana: ");
             int horas = teclado.nextInt();
             
             int importeHora = 12;
             
             System.out.println("Has trabajado " + horas + " por lo que tu salario es " + horas*importeHora);
      
    }

}

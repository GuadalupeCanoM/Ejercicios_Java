package if_switch;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio4 {

    
         public static void main(String[] args) {
             
             /*
             Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
            las horas extras. Escribe un programa que calcule el salario semanal de un
            trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
            trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
            la hora.
             
            Ejemplo 1:
            Por favor, introduzca el número de horas trabajadas durante la semana: 36
            El sueldo semanal que le corresponde es de 432 euros
             
            Ejemplo 2:
            Por favor, introduzca el número de horas trabajadas durante la semana: 40
            El sueldo semanal que le corresponde es de 480 euros
             
            Ejemplo 3:
            Por favor, introduzca el número de horas trabajadas durante la semana: 55
            El sueldo semanal que le corresponde es de 720 euros
             */
             
             
             Scanner teclado = new Scanner(System.in);
             final int PRECIO_HORA = 12;
             final int PRECIO_HORA_EXTRA = 16;
             int sueldo = 0;
             int horasMinimas;
             int horasExtra;
            
             System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
             int horas = teclado.nextInt();
             
             if (horas <=40){
                 sueldo = horas * PRECIO_HORA;
             }else{
                 horasMinimas = 40 * PRECIO_HORA;
                 
                 horasExtra = horas - 40;
                
                 horasExtra *= PRECIO_HORA_EXTRA;
                 
                 sueldo = horasMinimas + horasExtra;
             }
             
             System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
             
             

      
    }

}

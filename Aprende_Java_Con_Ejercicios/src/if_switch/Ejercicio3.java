package if_switch;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio3 {

    
         public static void main(String[] args) {
             
             /*
             Ejercicio 3: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
             nombre del día de la semana.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.print("Indica el día de la semana en número y te diré el nombre del día de la semana: ");
             int diaSemana = teclado.nextInt();
             
             switch (diaSemana){
                 case 1:
                     System.out.println("Es lunes");
                     break;
                 case 2: 
                     System.out.println("Es martes");
                     break;
                 case 3:
                     System.out.println("Es miércoles");
                     break;
                 case 4:
                     System.out.println("Es jueves");
                     break;
                 case 5:
                     System.out.println("Es viernes");
                     break;
                 case 6:
                     System.out.println("Es sábado");
                     break;
                 case 7:
                     System.out.println("Es domingo");
                     break;
                 default:
                     System.out.println("El día introducido " + diaSemana + " no corresponde con ningun día de la semana");
             }
             

      
    }

}

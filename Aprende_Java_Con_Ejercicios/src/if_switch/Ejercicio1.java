package if_switch;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio1 {

    
         public static void main(String[] args) {
             /*
            Ejercicio 1: Escribe un programa que pida por teclado un día de la semana y que diga qué
            asignatura toca a primera hora ese día.
             */
             
             Scanner teclado = new Scanner(System.in);
             
             String resultado = "";
             
             System.out.print("Introduce un día de la semana y te diré que asignatura tienes a primera hora: ");
             String diaSemana = teclado.nextLine();
             
             switch (diaSemana){
                 case "lunes":
                     resultado += "Tienes programación";
                     break;
                 case "martes":
                     resultado+= "Tienes entornos de desarrollo";
                     break;
                 case "miercoles":
                     resultado += "Tienes base de datos";
                     break;
                 case "jueves":
                     resultado += "Tienes lenguajes de marcas";
                     break;
                 case "viernes":
                     resultado += "Tienes programación";
                     break;
                 default:
                     resultado+="No has introducido un día de la semana correcto";
             }
       
             
             System.out.println(resultado);
             
             
             
      
    }

   
}

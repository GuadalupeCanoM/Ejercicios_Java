package if_switch;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio7_Ejercicio8 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 7: Realiza un programa que calcule la media de tres notas
             */
             
             Scanner teclado = new Scanner(System.in);
             double notaFinal;
             
             System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE TRES NOTAS DADAS");
             System.out.println("-----------------------------------------------------");
             
             System.out.print("Indícame la primera nota: ");
             int nota1 = teclado.nextInt();
             
             System.out.print("Indícame la segunda nota: ");
             int nota2 = teclado.nextInt();
             
             System.out.print("Indícame la tercera nota: ");
             int nota3 = teclado.nextInt();
             
             notaFinal = (nota1 + nota2 + nota3)/3;
             
             System.out.println("Dada la primera nota " + nota1 + " la segunda nota " + nota2 + " y la tercera nota " + nota3 + " tu media es " + notaFinal);
             
             /*
             Ejercicio 8: Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente)
             */
             if (notaFinal <5){
                 System.out.println("Has suspendido. Has obtenido un " + notaFinal + " que equivale a un insuficiente"); 
             } else if (notaFinal == 5){
                 System.out.println("Has aprobado. Has sacado un " + notaFinal + " que equivale a un suficiente");
             } else if(notaFinal == 6){
                 System.out.println("Has aprobado. Has sacado un " + notaFinal + " que equivale a un bien");
             } else if (notaFinal >=7 && notaFinal <=8){
                 System.out.println("Has aprobado. Has sacado un " + notaFinal + " que equivale a un notable");
             }else{
                 System.out.println("Has aprobado. Has sacado un " + notaFinal + " que equivale a un sobresaliente");
             }
          
      
    }

}

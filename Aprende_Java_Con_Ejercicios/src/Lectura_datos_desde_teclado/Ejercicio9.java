package Lectura_datos_desde_teclado;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio9 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 9: Escribe un programa que calcule el volumen de un cono: pi * radio al cuadrado * altura / 3
             */
             
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL VOLUMEN DE UN CONO");
             System.out.println("----------------------------------------------");
             
             System.out.print("Introduce el radio del cuadrado: ");
             int radio = teclado.nextInt();
             
             System.out.print("Introduce la altura del cuadrado: ");
             int altura = teclado.nextInt();
             
             double volumenCono = (Math.PI * (radio*radio) * altura)/3;
             
             System.out.println("Dado el radio " + radio + " y la altura " + altura + " el volumen del cono es " + volumenCono);
      
    }

}

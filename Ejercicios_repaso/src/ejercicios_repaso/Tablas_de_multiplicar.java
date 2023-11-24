/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_repaso;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Tablas_de_multiplicar {

    
         public static void main(String[] args) {
             
             System.out.println("Tablas de multiplicar");
             
             for (int i = 1; i <= 10; i++) {
                 System.out.println("Tabla del " + i + "\n");
                 for (int j = 0; j <=10; j++) {
                     System.out.println(i + "*" + j + " = " + (i*j));
                 }
                 System.out.println();
             }
      
    }

}

package if_switch;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio10 {

    
         public static void main(String[] args) {
            /*
            Ejercicio 10: Escribe un programa que nos diga el horóscopo a partir del día y el mes de
            nacimiento.
             */
            
             Scanner teclado = new Scanner(System.in);
             
             System.out.println("PROGRAMA QUE CALCULA EL HORÓSCOPO EN BASE AL DÍA Y MES DE NACIMIENTO");
             System.out.println("------------------------------------------------------------------------");
             
             System.out.print("¿Qué día naciste? ");
             int dia = teclado.nextInt();
             
             System.out.print("¿En qué mes? ");
             String mes = teclado.next();
             
             if((dia >= 21 && mes.equals("marzo")) || (dia <=19 && mes.equals("abril"))){
                 System.out.println("Eres Aries");
             }else if ((dia >=20 && mes.equals("abril")) || (dia <=20 && mes.equals("mayo"))){
                 System.out.println("Eres Tauro");
             }else if ((dia >=21 && mes.equals("mayo")) || (dia <=20 && mes.equals("junio"))){
                 System.out.println("Eres Géminis");
             }else if ((dia >=21 && mes.equals("junio")) || (dia <=22 && mes.equals("julio"))){
                 System.out.println("Eres Cáncer");
             }else if ((dia >=23 && mes.equals("julio")) || (dia <=22 && mes.equals("agosto"))){
                 System.out.println("Eres Leo");
             }else if ((dia >=23 && mes.equals("agosto")) || (dia <=22 && mes.equals("septiembre"))){
                 System.out.println("Eres Virgo");
             }else if ((dia >=23 && mes.equals("septiembre")) || (dia <=22 && mes.equals("octubre"))){
                 System.out.println("Eres Libra");
             }else if ((dia >=23 && mes.equals("octubre")) || (dia <=21 && mes.equals("noviembre"))){
                 System.out.println("Eres Escorpio");
             }else if ((dia >=22 && mes.equals("noviembre")) || (dia <=21 && mes.equals("diciembre"))){
                 System.out.println("Eres Sagitario");
             }else if ((dia >=22 && mes.equals("diciembre")) || (dia <=19 && mes.equals("enero"))){
                 System.out.println("Eres Capricornio");
             }else if ((dia >=20 && mes.equals("enero")) || (dia <=18 && mes.equals("febrero"))){
                 System.out.println("Eres Acuario");
             }else{
                 System.out.println("Eres Piscis");
             }
      
    }

}

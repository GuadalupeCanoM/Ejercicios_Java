/*
 * Ejercicio 02
 */
package tarea02;

import java.util.Scanner;

/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
       
        // Variables de entrada (aquí­ se definen las variables que recibirán valores, si fueran necesarias)
        int dia, mes;
        // Variables de salida (aquí­ se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        String signo = "";
        boolean diaValido = true;
        boolean mesValido = true;
        
        // Clase Scanner para petición de datos al usuario a tracés del teclado
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2. Signos del Zodíaco");
        System.out.println("----------------------------------------------------");

        System.out.println("Introduce el número del MES");
        mes = teclado.nextInt();

        System.out.println("Introduce el DÍA del mes");
        dia = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //---------------------------------------------- 
        switch (mes) {
            // febrero
            case 2:
                if(dia >29 || dia <=0){
                    diaValido =false;
                }
                break;
            // abril, junio, septiembre, noviembre
            case 4: case 6: case 9: case 11:
                 if(dia > 30 || dia <= 0){
                     diaValido = false;
                 }
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(dia > 31 || dia <=0){
                    diaValido = false;
                }
            default:
                if(mes > 12 || mes <=0){
                    mesValido = false;
                }

        }

        switch (mes) {
            //Enero
            case 1:
                if (dia >= 21) {
                    signo = "Acuario";
                } else {
                    signo = "Capricornio";
                }
                break;
            //Febrero
            case 2:
                if (dia >= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Acuario";
                }
                break;
                //Marzo
            case 3:
                if (dia >= 21) {
                    signo = "Aries";
                } else {
                    signo = "Piscis";
                }
                break;
                //Abril
            case 4:
                if (dia >= 21) {
                    signo = "Tauro";
                } else {
                    signo = "Aries";
                }
                break;
                //Mayo
            case 5:
                if (dia >= 22) {
                    signo = "Géminis";
                } else {
                    signo = "Tauro";
                }
                break;
                //Junio
            case 6:
                if (dia >= 23) {
                    signo = "Cáncer";
                } else {
                    signo = "Géminis";
                }
                break;
                //Julio
            case 7:
                if (dia >= 24) {
                    signo = "Leo";
                } else {
                    signo = "Cáncer";
                }
                break;
                //Agosto
            case 8:
                if (dia >= 24) {
                    signo = "Virgo";
                } else {
                    signo = "Leo";
                }
                break;
                //Septiembre
            case 9:
                if (dia >= 24) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
                //Octubre
            case 10:
                if (dia >= 24) {
                    signo = "Escorpio";
                } else {
                    signo = "Libra";
                }
                break;
                //Noviembre
            case 11:
                if (dia >= 23) {
                    signo = "Sagitario";
                } else {
                    signo = "Escorpio";
                }
                break;
                //Diciembre
            case 12:
                if (dia >= 22) {
                    signo = "Capricornio";
                } else {
                    signo = "Sagitario";
                }
                break;
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------------");
        if(!(diaValido && mesValido)){
            System.out.println("Fecha incorrecta");
        }else{
            System.out.printf("El signo correspondiente a %02d/%02d es: \t%s \n", dia, mes, signo);
                  
                    
        }
        
    }

}

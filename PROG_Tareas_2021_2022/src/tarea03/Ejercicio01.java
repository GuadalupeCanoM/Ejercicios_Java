package tarea03;


import java.time.LocalDate;
import java.time.Month;
import libtarea3.CuentaBancaria;
// Incluir el resto de los imports que se necesiten


/**
 * Ejercicio 1: Uso de cuentas bancarias.
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // 1. Declaración de tres variables referencia a objetos instancia de la clase CuentaBancaria
        CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
      
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // En realidad no hay entrada de datos como tal dado que la información 
        // de entrada es fija y siempre la misma
        System.out.println("USANDO CUENTAS BANCARIAS");
        System.out.println("------------------------");
        System.out.printf ("Fecha actual: %s\n", LocalDate.now());
        System.out.println();

        // 2.- Instanciación de tres objetos CuentaBancaria

        System.out.println("Creación de cuentas (constructores)");
        System.out.println("-----------------------------------");

        // 2.1.- Intento de crear una cuenta con fecha no válida (hay gestionar la posible excepción)
        try{
            System.out.println("Intentando crear una cuenta privada con una fecha no válida: ");
            cuentaPrivada = new CuentaBancaria(1000.00, LocalDate.of(2027, 9, 1));
            
        }catch(IllegalArgumentException ex){
            System.out.printf("Error: %s\n\n", ex.getMessage());
        }
        
        
        // 2.2.- Intento de crear una cuenta con saldo no válido (hay gestionar la posible excepción)
        try{
            System.out.println("Intentando crear cuenta privada con un saldo no válido: ");
            cuentaPrivada = new CuentaBancaria(-200.00);
        }catch(IllegalArgumentException ex){
            System.out.printf("Error: %s\n\n", ex.getMessage());
        }
        

        // 2.3.- Creación de una cuenta válida usando el constructor de tres parámetros
        System.out.println("Creando cuenta privada válida con un constructor con tres parámetros...");
        cuentaPrivada = new CuentaBancaria(1000.00, LocalDate.of(2021, 7, 1), -200.00);
        System.out.printf("Cuenta privada creada %s \n\n", cuentaPrivada);
        

        // 2.4.- Creación de una cuenta válida usando el constructor de dos parámetros   
        System.out.println("Creando cuenta conjunta válida usando un constructor con dos parámetros...");
        cuentaConjunta = new CuentaBancaria(200.00,LocalDate.of(2021, 7, 1));
        System.out.printf("Cuenta conjunta creada: %s \n\n", cuentaConjunta);
        

        // 2.5.- Creación de una cuenta válida usando el constructor sin parámetros   
        System.out.println("Creando cuenta familiar válida usando un constructor sin parámetros");
        cuentaFamiliar = new CuentaBancaria();
        System.out.printf("Cuenta conjunta creada: %s \n\n", cuentaFamiliar);
        
        
        //----------------------------------------------
        //       Procesamiento + Salida de Resultados
        //----------------------------------------------
        // Dado que se va a ir mostrando información de salida a la vez que 
        // se van realizando operaciones, podemos considerar en este caso
        // que el procesamiento y la salida de resultado van unidos y "mezclados"
        
        // 3.- Obtención de información de la cuenta privada
        System.out.println("Prueba de los getters de la cuenta privada: ");
        System.out.println("----------------------------------------------");
        System.out.printf("ID: %s \n" ,cuentaPrivada.getId());
        System.out.printf("Fecha de creación: %s \n", cuentaPrivada.getFechaCreacion());
        System.out.printf("Límite de descubierto: %s \n", cuentaPrivada.getLimiteDescubierto());
        System.out.printf("Está embargada: %s \n", cuentaPrivada.isEmbargada());
        System.out.printf("Está en descubierto: %s \n", cuentaPrivada.isDescubierta());
        System.out.printf("Número de días que lleva la cuenta abierta: %s \n", cuentaPrivada.getDiasCuenta());
       
        // 4.- Realización de operaciones sobre las cuentas
        System.out.println("Realización de operaciones sobre las cuentas");
        System.out.println("----------------------------------------------");
        // Ingresar 100.00 euros en la cuenta familiar
        System.out.println("Ingresamos 100 euros en la cuenta familiar...");
        cuentaFamiliar.ingresar(100.00);
        
        // Extraer 100.00 eruso de la cuenta conjunta
        System.out.println("Extramos 100 euros de la cuenta conjunta...");
        cuentaConjunta.extraer(100.00);
        
        // Transferir 1100.00 euros de la cuenta privada a la familiar
        System.out.println("Transferimos 1100 euros de la cuenta privada a la familiar...");
        cuentaPrivada.transferir(1100.00, cuentaFamiliar);

        // 5.- Estado final de las cuentas
        System.out.println("Estado final de las cuentas: ");
        System.out.println("-----------------------------");
        System.out.printf("Estado final de la cuanta privada: %s \n", cuentaPrivada.toString());
        System.out.printf("Estado final de la cuenta conjunta: %s \n", cuentaConjunta.toString());
        System.out.printf("Estado final de la cuenta familiar: %s \n", cuentaFamiliar.toString());

        
        
        
        
        
        
    }
    
}

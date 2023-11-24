package Variables;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio6 {

    
         public static void main(String[] args) {
             /*
             Ejercicio 6: Escribe un programa que calcule el total de una factura a partir de la base
            imponible (precio sin IVA). La base imponible estará almacenada en una
            variable.
             */
             
             double baseImponible = 100;
             double precioConIva;
             
             precioConIva = baseImponible * 1.21;
             
             System.out.println("Teniendo la base imponible " + baseImponible + "€ el importe con IVA es " + precioConIva + "€");
      
    }

}

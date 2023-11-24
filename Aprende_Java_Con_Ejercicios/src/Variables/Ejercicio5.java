package Variables;



/**
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio5 {

    
         public static void main(String[] args) {
             /*
            Ejercicio 5: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
            convertir deberá estar almacenada en una variable.
             */
             
             double pesetas = 200;
             double euros = 0.00601012;
             double convertirAEuros;
             
             convertirAEuros = pesetas * euros;
             
             System.out.printf("Las pesetas introducidas (" + pesetas + ") son %.2f€\n", convertirAEuros );
             
      
    }

}

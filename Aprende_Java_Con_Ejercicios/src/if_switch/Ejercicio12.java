package if_switch;

import java.util.Scanner;

/**
 * Ejercicio 12: Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * 
 * ----Le añado al ejercicio que cada pregunta mal, reste 0.5 puntos
 * 
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio12 {

    
         public static void main(String[] args) {
             
             Scanner teclado = new Scanner(System.in);
             
             double puntuacion = 0;
             String respuesta;
             
             System.out.println("CUESTIONARIO DE JAVA");
             System.out.println("------------------------");
             
             System.out.println("Realice este pequeño cuestionario. Cada pregunta acertada sumará un punto \n");
             
             System.out.println("Pregunta 1: ¿El operador que utilizamos para invertir el valor de un boolean es: ");
             System.out.println(" a) ~ \n b) ! \n c) != \n d) ^" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if (respuesta.equals("b")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 2: Cuando se oculta la información para poder implementarla de diferentes maneras sin que esto influya en el resto de elementos, decimos que estamos aplicando... ");
             System.out.println(" a) Abstracción \n b) Encapsulación \n c) Corrección \n d) Algoritmos" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("b")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 3: ¿Con qué tipo de bucle podemos simular un for? ");
             System.out.println(" a) Con cualquier bucle controlado por sucesos combinado con variables usadas como contador dentro y fuera de los bucles \n b) Con un bucle while \n "
                     + "c) Con un bucle do-while \n d) Ninguna de las respuestas anteriores es correcta." );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("a")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 4: Los bucles while y do-while iteran según el valor de una variable que se va incrementando o decrementando.");
             System.out.println(" a) Verdadero \n b) Falso \n ");
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("b")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 5: ¿Cuál de las siguientes no es una estructura de selección?");
             System.out.println(" a) switch \n b) if-else \n c) if \n d) for/in" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("d")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 6: ¿Se puede cambiar el valor de una constante?");
             System.out.println(" a) si \n b) solo si está en el método main \n c) no" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("c")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 7: ¿En qué bucle se lleva a cabo la inicialización de una variable en su cabecera? ");
             System.out.println(" a) bucle switch \n b) bucle do-while \n c) bucle for \n d) bucle for/in" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("c")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 8: indica cuál es la estructura de control de flujo repetitiva o cíclica que garantiza que las sentencias del cuerpo"
                     + " del bucle se ejecutarán al menos una primera vez, con independencia del valor de la condición en el momento de comenzar la ejecución del ciclo ");
             System.out.println(" a) do-while \n b) switch \n c) for \n d) while " );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("a")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 9: ¿Qué elemento puede no existir en una sentencia de selección múltiple en java? ");
             System.out.println(" a) los case \n b) la claúsula default \n c) la instrucción switch \n d) la expresión" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("b")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             
             System.out.println("\nPregunta 10: ¿Si sabemos exactamente cuántas iteraciones vamos a realizar en un bucle, ¿qué tipo de bucle debemos utilizar? ");
             System.out.println(" a) un bucle do while, ya que realiza al menos una entrada en el código del bucle \n b) un bucle for \n "
                     + "c) un bucle while con una condición robusta \n d) todas las respuestas anteriores son correctas" );
             System.out.print("Introduzca su respuesta: ");
             respuesta = teclado.nextLine();
             
             if(respuesta.equals("b")){
                 puntuacion++;
             }else{
                 puntuacion-=0.5;
             }
             

           
             
             System.out.println("\nFin de las preguntas");
             System.out.println("Su puntuación es: " + puntuacion + " puntos");
             

      
    }

}

package if_switch;

import java.util.Scanner;

/**
 * Ejercicio 23: Escribe un programa que calcule el precio final de un producto
 * según su base imponible (precio antes de impuestos), el tipo de IVA aplicado
 * (general, reducido o superreducido) y el código promocional. Los tipos de IVA
 * general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los
 * códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author Guadalupe Cano Moyano
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = teclado.nextDouble();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = teclado.next();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codPromocional = teclado.next();

        int tipoIvaNumerico = 0;

        switch (tipoIva) {
            case "general":
                tipoIvaNumerico = 21;
                break;
            case "reducido":
                tipoIvaNumerico = 10;
                break;
            case "superreducido":
                tipoIvaNumerico = 5;
                break;
            default:
                System.out.println("El tipo de IVA introducido no es correcto");
        }

        double iva = (baseImponible * tipoIvaNumerico) / 100;
        double precioSinDescuento = baseImponible + iva;

        double descuento = 0;

        switch (codPromocional) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioSinDescuento / 2;
                break;
            case "meno5":
                descuento = precioSinDescuento - 5;
                break;
            case "5porc":
                descuento = precioSinDescuento * 0.05;
                break;
            default:
                System.out.println("El código promocional introducido no es válido");

        }

        double precioFinal = precioSinDescuento - descuento;

        System.out.printf("Base imponible %6.2f\n", baseImponible);
        System.out.printf("IVA (%2d%%) %6.2f\n", tipoIvaNumerico, iva);
        System.out.printf("Precio con IVA %6.2f\n", precioSinDescuento);
        System.out.printf("Cód. promo. (%5s) -%6.2f\n", codPromocional, descuento);
        System.out.printf("TOTAL %6.2f\n", precioFinal);

    }

}

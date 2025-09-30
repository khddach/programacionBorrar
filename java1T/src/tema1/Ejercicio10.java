package tema1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {


        // Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
        // cuánto deberá pagar finalmente por su compra.

        double precioFinal,precio;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el total de la compra:");
        precio = sc.nextDouble();

        precioFinal = precio - (precio * 0.15);

        System.out.println("El precio final es :" +precioFinal);
















    }
}

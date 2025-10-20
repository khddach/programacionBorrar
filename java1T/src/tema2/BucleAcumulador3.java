package tema2;

import java.util.Scanner;

public class BucleAcumulador3 {

    public static void main(String[] args) {

        //Pide 5 precios de un producto y la cantidad de cada uno de ellos
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad


        //Mostrar el total de la compra
        double precio = 0.0;
        int cantidad = 0;

        double totalPrecio = 0.0;
        int totalCantidad = 0;


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5 ; i++){
            System.out.println("Dime el precio del producto " + i + " : ");
            precio = sc.nextDouble();

            System.out.println("Dime el cantidad del producto " + i + " : ");
            cantidad = sc.nextInt();


            totalPrecio = totalPrecio + (precio * cantidad);
            totalCantidad = totalCantidad + cantidad;

        }

        System.out.println("total Precios : " + totalPrecio);
        System.out.println("total Cantidad : " + totalCantidad);
    }

}

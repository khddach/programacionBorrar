package tema2;

import java.util.Scanner;

public class EjercicioIf1 {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un crédito
        //1. Tienes más de 5 años de antiguedad en el banco e ingresos mensuales de
        //   más de 2500€
        //2. Tienes una antigüedad entre 2 y 5 años, ingresos de más de 2000€ mensuales
        //   y no tienes deudas pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de más de 3000€ mensuales
        //   y no tienes deudas pendientes

        //V.E.: antiguedad, ingresosMensuales, deudadPendentes
        //V.S.: decir si eres elegible para que te den un crédito o no


        int antiguedad ;
        int ingresosMensuales ;
        boolean deudadPendentes ;


        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la duración del empleo en años :");
        antiguedad = sc.nextInt() ;

        System.out.println("Ingrese sus ingresos mensuales :");
        sc = new Scanner(System.in);
        ingresosMensuales = sc.nextInt() ;


        System.out.println("Tienes deudas pendientes :");
        sc = new Scanner(System.in);
        deudadPendentes = sc.nextBoolean() ;



        if (antiguedad > 5 && ingresosMensuales > 2500) {
            System.out.println("Tu eres elegible para que te den un crédito");

        } else if (antiguedad >= 2 && antiguedad <= 5  && ingresosMensuales > 2000 && !deudadPendentes) {
            System.out.println("Tu eres elegible para que te den un crédito");
            
        } else if (antiguedad < 2 && ingresosMensuales > 3000 && !deudadPendentes) {
            System.out.println("Tu eres elegible para que te den un crédito");
        } else {
            System.out.println("No eres elegible para que te den un crédito");
        }


    }
}

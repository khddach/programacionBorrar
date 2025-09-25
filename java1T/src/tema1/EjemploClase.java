package tema1;

import java.util.Scanner;

public class EjemploClase {
    public static void main(String[] args) {
        //EJERCICIO CLASE
        //Tenemos que diseñar un programa que pida por telcado tres temperaturas
        // Tiene que mostrar como salida la temperatura media de esas tres
        // Realizar analisis, diseño y codificacion

        double temperatura1 = 0.0 ;
        double temperatura2 = 0.0 ;
        double temperatura3 = 0.0 ;
        double temperaturaMedia = 0.0;

        System.out.println("dame la temperatura 1 :");
        Scanner sc1 = new Scanner(System.in);
        temperatura1  = sc1.nextDouble() ;

        System.out.println("dame la temperatura 2 :");
        Scanner sc2 = new Scanner(System.in);
        temperatura2  = sc2.nextDouble() ;

        System.out.println("dame la temperatura 3 :");
        Scanner sc3 = new Scanner(System.in);
        temperatura3  = sc3.nextDouble() ;

        temperaturaMedia = (temperatura1 + temperatura2 + temperatura3)/ 3;


        System.out.println("Media de la temperatura es :" + temperaturaMedia);
    }
}

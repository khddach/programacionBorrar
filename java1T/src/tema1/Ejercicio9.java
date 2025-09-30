package tema1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

//        Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
//        horas y minutos corresponde.
//        Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

        long totalMinutos, horas;
        long restoMinutos;


        Scanner sc = new Scanner(System.in);
        totalMinutos = sc.nextLong();



        horas = totalMinutos / 60;
        restoMinutos = totalMinutos % 60;

        System.out.println("Num horas: " + horas + " y num minutos: " + restoMinutos);



    }
}

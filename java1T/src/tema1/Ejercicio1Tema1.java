package tema1;

import java.util.Scanner;

public class Ejercicio1Tema1 {
    public static void main(String[] args) {

        //       ###############//
        //        Proceso CalcularHipotenusa
        //        Definir cateto1, cateto2, hipotenusa Como Real;
        //        Escribir "Introduce el cateto 1:";
        //        Leer cateto1;
        //        Escribir "Introduce la cateto 2:";
        //        Leer cateto2;
        //        hipotenusa <- raiz (cateto1^2 + cateto2 ^ 2);
        //        Escribir "La hipotenusa es ", hipotenusa;
        //        FinProceso
        //        ##############


        double cateto1, cateto2 ;
        double hipotenusa;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introduce el cateto 1: ");
        cateto1 = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Introduce la cateto 2: ");
        cateto2 = sc2.nextDouble();

        // Math.pow(cateto1,2) == cateto1*cateto1
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("La hipotenusa es :" + hipotenusa);



    }
}

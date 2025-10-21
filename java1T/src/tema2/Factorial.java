package tema2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //    ¡Crea una programa que pida un número y calcule su factorial
        //    El factorial de un número es el producto de todos los enteros
        //    entre 1 y el propio número y se representa por el número seguido
        //    de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120

        // Acumulador

        int numero, calcule = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("dime la  número :");
        numero = sc.nextInt();

        for (int i= 2; i <= numero ; i++) {
            calcule *= i ;
        }

        System.out.println("Suma de la multiplicación de un número "+ numero + "! es : " +  calcule);
    }
}

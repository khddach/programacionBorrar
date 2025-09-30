package tema1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

        double num1, num2, suma, resta, division, multiplicacion;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero 1");
        num1 = sc.nextDouble();


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Dime un numero 2");
        num2 = sc.nextDouble();



        suma = num1 + num2 ;
        resta = num1 - num2 ;
        division = num1 / num2 ;
        multiplicacion = num1 * num2 ;

        System.out.println("resta :" + suma);
        System.out.println("resta :" + resta);
        System.out.println("division :" + division);
        System.out.println("multiplicación :" + multiplicacion);






















    }
}

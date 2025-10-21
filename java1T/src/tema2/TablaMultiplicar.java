package tema2;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        // programa que pida un número por teclado y muestre su tabla
        // de multiplicar
        //Ejemplo: 7
        //7 * 1 = 7
        //7 * 2 = 14
        //7 * 3 = 21
        //7 * 4 = 28
        //7 * 5 = 35
        //7 * 6 = 42
        //7 * 7 = 49
        //7 * 8 = 56
        //7 * 9 = 63
        //7 * 10 = 70

        //1. pedir un numero
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero entro:");
        numero = sc.nextInt();

        // 2. bucle de 1 a 10
        for (int i = 1; i <= 10; i++){

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println(".......TODOS LAS TABLAS DE MULIPLICAR.........");

        // TODOS LAS TABLAS DE MULIPLICAR

        for (int j = 1; j <= 10 ; j++) {

            for (int i = 1; i <= 10; i++){

                System.out.println(j + " x " + i + " = " + (j * i));
            }
            System.out.println("................................");

        }

    }
}

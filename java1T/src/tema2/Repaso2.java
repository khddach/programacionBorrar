package tema2;

import java.util.Scanner;

public class Repaso2 {
    public static void main(String[] args) {

        // Realizar un algoritmo que pida números (se pedirá por teclado la
        // cantidad de números a introducir). El programa debe informar de
        // cuantos números introducidos son mayores que 0,
        // menores que 0 e iguales a 0

        int contadorMayor = 0, contadorMenor = 0, contadorIgual = 0;
        int numero0,numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero entro:");
        numero0 = sc.nextInt();

        for (int i = 0; i < numero0; i++) {

            System.out.println("dime un numero " + i + " entro:");
            numero = sc.nextInt();

            if (numero > 0) {
                contadorMayor++;

            } else if (numero < 0) {
                contadorMenor++;

            } else {
                contadorIgual++;

            }

        }

        System.out.println("El número de números mayores que 0 es " + contadorMayor);
        System.out.println("El número de números menores que 0 es " + contadorMenor);
        System.out.println("El número de números iguales que 0 es " + contadorIgual);
    }
}

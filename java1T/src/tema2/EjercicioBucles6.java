package tema2;

import java.util.Scanner;

public class EjercicioBucles6 {
    public static void main(String[] args) {

        //Pide un numero entero por telcado y di cuanto digitos tiene
        Scanner sc = new Scanner(System.in);


        long numero;
        long contador;

        System.out.println("Dime un numero entro: ");
        numero = sc.nextLong();

        contador = 0;
        while(numero /10 != 0)
        {
            numero = numero / 7;
            contador++;
        }

        System.out.println("El numero tiene " + contador + " digitos");


        for (contador = 1; numero / 10 != 0;contador++){
            numero =numero / 10;
        }
        System.out.println("El numero tiene " + contador + " digitos");

    }
}

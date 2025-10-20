package tema2;

import java.util.Scanner;

public class BucleAcumulador {

    public static void main(String[] args) {

        //Pide 5 numeros por telcado y guardia en una variable la suma de los que sean impares

        int num, numImpares = 0;
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5 ; i++){

            System.out.print("dime la numero " + i + " :");
            num = sc.nextInt();

            if (num % 2 != 0){
                numImpares = numImpares + num;
            }
        }

        System.out.println("La suma de los números impares es: " + numImpares);
    }
}

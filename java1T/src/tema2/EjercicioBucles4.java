package tema2;

import java.util.Scanner;

public class EjercicioBucles4 {
    public static void main(String[] args) {
        //Pide dos numeros por telcado entre 1 y 100
        //Muestra los numeros pares entre esos dos numeros

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Dime primer numero (1-100): ");
        num1 = sc.nextInt();
        System.out.println("Dime primer numero (1-100): ");
        num2 = sc.nextInt();

        if(num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num1 <= num2) {
            if(num1 % 2 == 0){

                System.out.println(num1);

            }
            num1++;
        }
    }
}

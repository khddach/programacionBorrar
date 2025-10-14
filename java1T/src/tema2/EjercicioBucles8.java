package tema2;

import java.util.Scanner;

public class EjercicioBucles8 {
    public static void main(String[] args) {
        //Pide 10 palabras por teclado y dime cuantas de ellas
        //tienen longitud mayor de 5 caracteres
        //cadena.length() devuelve la longitud de la cadena


        int cuantas = 0;
        String palabra = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<= 10; i++){
            System.out.println("Dime palabra "+ i + " :");
            palabra = sc.nextLine();
            if (palabra.length() > 5){

                cuantas++;
            }
        }

        System.out.println("Número de palabras que tienen longitud mayor de 5 caracteres :" + cuantas);
    }
}

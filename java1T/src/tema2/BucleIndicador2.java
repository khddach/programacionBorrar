package tema2;

import java.util.Scanner;

public class BucleIndicador2 {
    public static void main(String[] args) {

        //Pide 5 cadenas de texto por teclado y dime si alguna de ellas
        //tiene una longitud mayor de 5 caracteres
        //Pista: cadena.length() devuelve la longitud de la cadena

        String palabra;
        boolean mayorDe5= false;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5 ; i++)
        {
            System.out.println("Dime la palabra " +  i + " :");
            palabra = sc.nextLine();

            if (palabra.length() > 5){
                mayorDe5 = true;
            }
        }


        if (mayorDe5){
            System.out.println("La palabra tiene más de 5 letras ");
        }else {
            System.out.println("Ninguna de las palabras es mayor de 5 caracteres");
        }

    }
}

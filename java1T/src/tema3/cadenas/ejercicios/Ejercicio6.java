package tema3.cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static boolean vocalesCheck(char l) {
        char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};

        for (int j = 0; j < vocales.length; j++) {

            if (l == vocales[j]) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena de
         * caracteres y muestre por pantalla un conteo de cuántas vocales,
         * consonantes y espacios en blanco contiene la cadena introducida.
         */


        Scanner sc = new Scanner(System.in);
        String texto;
        int contadorVocales= 0;
        int contadorEspacios= 0;
        int contadorConsonantes= 0;

        System.out.println("Escribe un texto");
        texto = sc.nextLine();


        for (int i = 0; i < texto.length(); i++) {

            if (vocalesCheck(texto.charAt(i))) {
                contadorVocales++;
            } else {
                contadorConsonantes++;
            }



        }


    }
}

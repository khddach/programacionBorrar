package tema3.cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * Diseña un programa en Java que solicite al usuario una cadena
         * en la que buscará y otra que será la cadena buscada. El programa
         * indicará cuántas veces aparece la segunda cadena en la primera.
         *
         * cadena = "El día de hoy es el más largo de mi vida."
         * subcadena = "de"
         * contador = 2
         *
         * indexOf
         *
         */

        String cadena = "El día de hoy es el más largo de mi hodevede vida.";
        String subcadena = "de";
        int contador = 0;
        int fromIndex = 0;

        String[] cadenaSpilt = cadena.split(" +");

        for (int i = 0; i < cadenaSpilt.length; i++) {

            if (cadenaSpilt[i].contains(subcadena)) {
                contador++;
            }
        }

        System.out.println(contador);
    }
}

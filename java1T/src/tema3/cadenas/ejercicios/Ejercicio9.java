package tema3.cadenas.ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         * Crea un programa en Java que solicite al usuario dos cadenas de caracteres
         * y que devuelva la primera cadena, pero transformando en mayúsculas la parte
         * que coincide con la segunda cadena introducida.
         * Por ejemplo, si se introducen las cadenas "Esta es mi amiga Ana" y
         * "amiga" devolverá "Esta es mi AMIGA Ana".
         *
         * replace o replaceAll
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce una palabra ");
        String palabra = sc.nextLine();


        String[] textoNuevo = cadena.split(" +");

        for (int i = 0; i < textoNuevo.length; i++) {

            if (textoNuevo[i].toLowerCase().equals(palabra.toLowerCase())){
                textoNuevo[i] = textoNuevo[i].toUpperCase();
            }
        }

        String cadenaNuevo = "" ;

        for (int i = 0; i < textoNuevo.length; i++) {
            cadenaNuevo += " " + textoNuevo[i];
        }


        System.out.println(cadenaNuevo);
    }
}

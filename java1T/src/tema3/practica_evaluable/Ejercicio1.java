package tema3.practica_evaluable;

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * invertir el orden de cada palabra
     * @param palabra
     * @return String
     */
    public static String invertirOrden(String palabra) {
        //variables :
        StringBuilder sb = new StringBuilder();

        //convert palabras a lista:
        String[] splitPalabra = palabra.split(" ");

        for (int i = 0; i < splitPalabra.length; i++) {

            for (int j = 0; j < splitPalabra[i].length(); j++) {
                String pal = splitPalabra[i];
                sb.append(pal.charAt(splitPalabra[i].length()-1-j));
            }
            sb.append(" ");

        }

        return sb.toString().trim();
    }

    /**
     *  una función que reciba como parámetro una cadena de texto
     *  y devuelva esa cadena con las vocales cifradas
     * @param palabra
     * @return String
     */
    public static String vocalesCifradas(String palabra){

      //variables :
      StringBuilder sb = new StringBuilder(palabra);
      char[] listaVocalesLowerCase = {'a','e','i','o','u'};
      char[] listaVocalesUpperCase = {'A','E','I','O','U'};
      char[]  listaVocalesCifradas = {'4','3','1','0','9'};

      for (int i = 0; i < palabra.length(); i++) {

          for (int j = 0; j < listaVocalesLowerCase.length ; j++) {
              if (palabra.charAt(i) == listaVocalesLowerCase[j] || palabra.charAt(i) == listaVocalesUpperCase[j]){

                  sb.setCharAt(i,listaVocalesCifradas[j]);
              }

          }


      }

      return sb.toString();
    }


    public static void main(String[] args) {

        /**
         Ejercicio 1: Strings
         Cifrado de Vocales
         Realiza una función que reciba como parámetro una cadena de texto y devuelva esa cadena con
         las vocales cifradas según el siguiente patrón:
         Vocal Sustituto
         a/A 4
         e/E 3
         i/I 1
         o/O 0
         u/U 9
         Además, debe invertir el orden de cada palabra (pero no el orden de las palabras en la frase).
         Ejemplo:
         Entrada: Hola mundo
         Transformación 1: H0l4 m9nd0
         Salida final: 4l0H 0dn9m
         Restricciones:
         No se pueden usar métodos replace , replaceAll de String ni StringBuffer .
         Se recomienda usar una estructura mutable ( StringBuilder o similar) para hacer las
         transformaciones de manera eficiente.
         Ejemplo adicional:
         Entrada: Buenos dias Eva
         Salida esperada: s3n39B s41d 4v3
         */


        // variables:
        String palabra;
        Scanner sc = new Scanner(System.in);


        System.out.println("escribe una letra : (ejemplo --> Hola mundo)");
        palabra = sc.nextLine();

        //resultado :
        System.out.println( invertirOrden(vocalesCifradas(palabra)));


    }
}

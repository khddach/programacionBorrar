package examen;

import java.util.Scanner;
// mohamed khddach
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
     * invertir el orden de cada palabra original
     * @param palabra
     * @return String
     */
    public static String invertirOrdenOriginal(String palabra) {
        //variables :
        StringBuilder sb = new StringBuilder();

        //convert palabras a lista:
        String[] splitPalabra = palabra.split(" ");

        for (int i = 0; i < splitPalabra.length; i++) {

            for (int j = 0; j < splitPalabra[i].length(); j++) {
                String pal = splitPalabra[i];
                sb.append(pal.charAt(j));
            }
            sb.append(" ");

        }

        return sb.toString().trim();
    }

    /**
     *  una función desencriptar palabras
     * @param palabra
     * @return String
     */
    public static String desencriptar(String palabra) {



        //variables :
        StringBuilder sb = new StringBuilder(palabra);
        char[] listaVocalesLowerCase = {'a','e','i','o','u'};
        char[] listaVocalesUpperCase = {'A','E','I','O','U'};

        char[] listaLitra = {'b','c','d','f','g','h','j','k','ñ','l','n','m','p','r','s','t','x','w','y','z'};
        char[] listaLitraX = {'z','y','w','x','t','s','r','p','m','n','l','ñ','k','j','h','g','f','d','c','b'};

        char[] listaLitraUpperCase = {'B','C','D','F','G','H','J','K','Ñ','L','N','M','P','R','S','T','X','W','Y','Z'};
        char[] listaLitraXUpperCase = {'Z','Y','W','X','T','S','R','P','M','N','L','Ñ','K','J','H','G','F','D','C','B'};


        for (int i = 0; i < palabra.length(); i++) {

            for (int j = 0; j < listaVocalesLowerCase.length ; j++) {
                if (palabra.charAt(i) == listaVocalesLowerCase[j] || palabra.charAt(i) == listaVocalesUpperCase[j]){

                    sb.setCharAt(i,listaVocalesUpperCase[j]);
                }
            }

            for (int k = 0; k < listaLitraX.length; k++) {

                if (palabra.charAt(i) == listaLitraX[k]){

                    sb.setCharAt(i,listaLitra[k]);

                } else if (palabra.charAt(i) == listaLitraXUpperCase[k]) {

                    sb.setCharAt(i,listaLitraUpperCase[k]);
                }
            }


        }


        return invertirOrdenOriginal(palabra) ;
    }


    /** una función encriptar palabras
     *
     * @param palabra
     * @return
     */
    public static String encriptar(String palabra) {
        //variables :
        StringBuilder sb = new StringBuilder(palabra);
        char[] listaVocalesLowerCase = {'a','e','i','o','u'};
        char[] listaVocalesUpperCase = {'A','E','I','O','U'};

        char[] listaLitra = {'b','c','d','f','g','h','j','k','ñ','l','n','m','p','r','s','t','x','w','y','z'};
        char[] listaLitraX = {'z','y','w','x','t','s','r','p','m','n','l','ñ','k','j','h','g','f','d','c','b'};

        char[] listaLitraUpperCase = {'B','C','D','F','G','H','J','K','Ñ','L','N','M','P','R','S','T','X','W','Y','Z'};
        char[] listaLitraXUpperCase = {'Z','Y','W','X','T','S','R','P','M','N','L','Ñ','K','J','H','G','F','D','C','B'};


        for (int i = 0; i < palabra.length(); i++) {

            for (int j = 0; j < listaVocalesLowerCase.length ; j++) {
                if (palabra.charAt(i) == listaVocalesLowerCase[j] || palabra.charAt(i) == listaVocalesUpperCase[j]){

                    sb.setCharAt(i,listaVocalesUpperCase[j]);
                }
            }

            for (int k = 0; k < listaLitra.length; k++) {

                if (palabra.charAt(i) == listaLitra[k]){

                    sb.setCharAt(i,listaLitraX[k]);

                } else if (palabra.charAt(i) == listaLitraUpperCase[k]) {

                    sb.setCharAt(i,listaLitraXUpperCase[k]);
                }
            }


        }


        return invertirOrden(sb.toString()) ;
    }

    public static void main(String[] args) {

        /**
         * Ejercicio 1. Transformador de texto (3 puntos)
         * Desarrolla una clase TransformadorTexto con dos métodos estáticos:
         * 1.1 Método encriptar (1.75 puntos)
         * Recibe un texto y lo convierte según estas transformaciones, aplicándose en este orden:
         * Cambia todas las consonantes por su siguiente letra en el abecedario (z pasa a b).
         * Las vocales a, e, i, o, u pasan a mayúsculas.
         * Invierte el orden de las letras en cada palabra individual.
         * Por ejemplo:
         * Entrada: hola mundo
         * Salida: Alpm Ovnpe
         * 1.2 Método desencriptar (1.25 puntos)
         * Recibe un texto encriptado y realiza el proceso inverso para recuperar el texto original:
         * Invierte el orden de las letras en cada palabra.
         * Las vocales mayúsculas A, E, I, O, U pasan a minúsculas.
         * Cambia cada consonante por su letra anterior en el abecedario (b pasa a z).
         * Por ejemplo:
         * Entrada: Alpm Ovnpe
         * Salida: hola mundo
         * Indicaciones:
         * No se pueden usar estructuras dinámicas como ArrayList.
         * Usa preferentemente char[] o StringBuilder .
         * Debes implementar ambos métodos: String encriptar(String texto) y String
         * desencriptar(String texto) .
         * Programa principal debe demostrar que encriptar y luego desencriptar devuelve el texto
         * original.
         */


        // variables:
        String palabra;
        Scanner sc = new Scanner(System.in);


        System.out.println("ejemplo --> Hola mundo");
        System.out.println("escribe una letra :");
        palabra = sc.nextLine();

        //resultado :
        System.out.println("encriptar es :");
        System.out.println(encriptar(palabra));
        System.out.println("desencriptar es :");
        System.out.println(desencriptar(palabra));
    }
}

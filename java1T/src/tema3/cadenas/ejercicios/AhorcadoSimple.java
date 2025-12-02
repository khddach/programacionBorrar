package tema3.cadenas.ejercicios;

import java.util.Scanner;

public class AhorcadoSimple {
    public static void main(String[] args) {
        /**
         * Implementa el juego del ahorcado con una palabra predefinida (ej.: "JAVA").
         * Muestra al inicio una serie de guiones (_) del tamaño de la palabra.
         * El jugador ingresa letras de una en una.
         * Si la letra está en la palabra, revela su posición (o posiciones) reemplazando el guión.
         * Si no, resta una vida (comienza con 6 vidas).
         * Usa un array de char para la palabra oculta y otro para la palabra con pistas.
         * Gana si adivina la palabra antes de quedarse sin vidas.
         */


        String palabra = "amiga";
        Scanner sc = new Scanner(System.in);
        char letra;
        int contador = 0, intentos = 6;


        String palabraX = "_".repeat(palabra.length());
        StringBuffer sb = new StringBuffer(palabraX);


        while (true) {

            System.out.println("palabra es " + sb);


            if (intentos == 0) {
                System.out.println("juego terminado");
                break;
            }

            if (contador == palabra.length()) {
                System.out.println("gana");
                break;
            }

            System.out.println("escribe una letra :");

            letra = sc.nextLine().charAt(0);
            boolean esChar = false;

            for (int i = 0; i < palabra.length(); i++) {

                if (palabra.charAt(i) == letra && sb.charAt(i) != letra) {
                    sb.setCharAt(i, letra);
                    contador++;
                    esChar = true;
                }

            }


            if (!esChar) {
                intentos--;
                System.out.println("intentos es " + intentos);
            }


        }


    }
}

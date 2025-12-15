package tema3.examen;

import java.util.ArrayList;
// mohamed khddach
public class Ejercicio2 {

    /**
     * genera un número aleatorio entre 1 y 8
     * @return
     */
    public static int aleatorio() {
        return (int) (Math.random() * 8) + 1;
    }


    /**
     * fun devuelva un array con
     * las caras del dado que no han salido ninguna vez en las 200 tiradas
     * @param array
     * @return
     */
    public static int[] carasNoSalidas(int[] array) {

        ArrayList lista = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                lista.add(i);
            }

        }

        int[] numCarasNoSalidas = new int[lista.toArray().length];

        for (int i = 0; i < lista.toArray().length; i++) {

            numCarasNoSalidas[i] = (int) lista.toArray()[i] + 1;
        }

        return numCarasNoSalidas;
    }


    /**
     * function porcentaje Parejas Consecutivas
     * @param array
     * @return
     */
    public static double porcentajeParejasConsecutivas(int[] array) {

        // variables
        int contador = 0;

        for (int i = 0; i < array.length - 2; i++) {

            if (array[i] == array[i+1]) {
                contador++;
            }


        }
        return contador / 100.00 ;
    }

    // procedure jugar
    public static void game() {
        // variables
        int numVeces = 200;
        int[] caras = new int[8];
        int dado;
        int max = 0;
        int suma = 0 ;
        double media=0.0 ;
        int[] carasNoSalidas;


        for (int i = 0; i < numVeces; i++) {
            dado = aleatorio();

            switch (dado) {
                case 1: caras[0]++; break;
                case 2: caras[1]++; break;
                case 3: caras[2]++; break;
                case 4: caras[3]++; break;
                case 5: caras[4]++; break;
                case 6: caras[5]++; break;
                case 7: caras[6]++; break;
                case 8: caras[7]++; break;
            }
            suma += dado;
        }

        //Mostrar la cantidad de veces que sale cada cara.
        System.out.println("Mostrar la cantidad de veces que sale cada cara");
        for (int i = 0; i < caras.length; i++) {
            System.out.println("cara "+ (i+1) +" ---> "+ caras[i] + " caras");
        }


        //Indicar cuál(es) es la cara que más veces ha salido.
        max = caras[0] ;
        for (int i = 0; i < caras.length; i++) {
            if (caras[i] > max) {
                max = caras[i] ;
            }
        }

        //
        System.out.println("la cara que más veces ha salido : ");
        for (int i = 0; i < caras.length; i++) {
            if (caras[i] == max) {
                System.out.println("cara "+ (i+1) +" ---> "+ caras[i] + " ha salido veces");
            }
        }

        //Calcular y mostrar la media aritmética de los resultados.
        media = (double) suma / numVeces;
        System.out.println("la media es : " + media);


        //el porcentaje de veces que salen dos tiradas consecutivas iguales en el array.
        System.out.println("el porcentaje de veces que salen dos tiradas consecutivas iguales :");
        System.out.println(porcentajeParejasConsecutivas(caras));


        // las caras del dado que no han salido ninguna vez en las 200 tiradas:
        carasNoSalidas =  carasNoSalidas(caras) ;
        System.out.println("las caras del dado que no han salido ninguna vez en las 200 tiradas: ");
        for (int i = 0; i < carasNoSalidas.length; i++) {
            System.out.println("cara "+ carasNoSalidas[i]);
        }


    }




    public static void main(String[] args) {
        /**
         * Ejercicio 2: Estadísticas avanzadas de dados (2 puntos)
         * Programa un simulador que lance un dado de 8 caras 200 veces y guarde los resultados en un
         * array. Después debe:
         * Mostrar la cantidad de veces que sale cada cara.
         * Indicar cuál(es) es la cara que más veces ha salido.
         * Calcular y mostrar la media aritmética de los resultados.
         * Implementar una función double porcentajeParejasConsecutivas(int[] array) que calcule
         * el porcentaje de veces que salen dos tiradas consecutivas iguales en el array.
         * Implementar una función int[] carasNoSalidas(int[] array) que devuelva un array con
         * las caras del dado que no han salido ninguna vez en las 200 tiradas
         */



        //resultado:
        game();
    }
}

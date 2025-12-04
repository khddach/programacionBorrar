package tema3.practica_evaluable;


public class Ejercicio2 {


    /**
     * function: genera un número aleatorio entre 0 y 36
     * @return int
     */
    public static int aleatorio() {
        return (int) (Math.random() * 36);
    }

    /**
     * buscar colores rojo, verde, negro
     * @param num
     * @return String
     */
    public static String buscarColor(int num) {


        if (((num >= 1 && num <= 10) || (num >= 19 && num <= 28)) && (num % 2 != 0)) {
            return "ROJO";
        } else if (((num >= 11 && num <= 18) || (num >= 29 && num <= 36)) && (num % 2 == 0)) {
            return "ROJO";
        } else if (num == 0) {
            return "VERDE";
        } else {
            return "NEGRO";
        }

    }

    /**
     * simule n tiradas de ruleta y
     * devuelva un array con tres posiciones: [cantidad_rojos, cantidad_negros cantidad_verdes]
     * @param n
     * @return int[]
     */
    public static int[] contarColores(int n) {
        //variables
        int contadorVerde = 0;
        int contadorNegro = 0;
        int contadorRojo = 0;
        int[] posiciones = new int[3];


        for (int i = 0; i < n; i++) {
            int num = aleatorio();

            if (buscarColor(num).equals("ROJO")) {
                contadorRojo++;
                posiciones[0] = contadorRojo;

            } else if (buscarColor(num).equals("VERDE")) {
                contadorVerde++;
                posiciones[2] = contadorVerde;

            } else if (buscarColor(num).equals("NEGRO")) {
                contadorNegro++;
                posiciones[1] = contadorNegro;
            }

        }

        return posiciones;
    }

    /**
     * pintar numeros colores (rojo, verde, negro)
     * @param posiciones
     */
    public static void pintarColores(int[] posiciones) {
        System.out.println("numeros rojo es :" + posiciones[0]);
        System.out.println("numeros verde es :" + posiciones[2]);
        System.out.println("numeros negro es :" + posiciones[1]);
    }

    public static void main(String[] args) {

        /**
         Ejercicio 2: Arrays
         Simulador de Ruleta
         Escriba un programa que simule una ruleta simplificada con números del 0 al 36. El programa debe:
         1. Generar tiradas aleatorias de la ruleta hasta que salga el número 0 (la banca gana).
         2. Mostrar cada número que sale y clasificarlo como:
         ROJO: Números impares del 1 al 10 y del 19 al 28, y números pares del 11 al 18 y del 29 al 36
         NEGRO: El resto de números excepto el 0
         VERDE: El número 0
         3. Contar cuántas tiradas se realizaron hasta que salió el 0.
         4. Mostrar la suma total de todos los números que salieron.
         Después, escribe una función llamada int[] contarColores(int n) que simule n tiradas de ruleta y devuelva un array con tres posiciones: [cantidad_rojos, cantidad_negros cantidad_verdes] .
         Prueba el método con n = 50 y n = 200 .
         */

        //variables
        int numero = -1;
        int numTiradas = 0;
        int sumaTotal = 0;


        while (numero != 0) {
            numero = aleatorio();
            sumaTotal += numero;
            numTiradas++;
            System.out.println("tirada num es "+ numTiradas);
            System.out.println("num color es " + numero);
        }

        System.out.println("numeros tiradas --> :" + numTiradas);
        System.out.println("suma total --> :" + sumaTotal);


        //Prueba el método con n = 50 y n = 200
        System.out.println("Prueba el método con n = 50");
        pintarColores(contarColores(50));

        System.out.println("Prueba el método con n = 200");
        pintarColores(contarColores(200));
    }
}


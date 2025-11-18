package tema3.ejercicios.masejercicios;

public class FincaHumedad {

    public static int numeroAleatorio(int maximo) {
        return (int) (Math.random() * maximo);
    }


    /**
     *
     * @param numeros
     * @param minimo
     * @return
     */
    public static int[] sensoresDebajoMinimo(int[] numeros,int minimo) {
        int contador=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                contador++;
            }
        }

        int[] sensoresUrgente = new int[contador];
        contador=0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < minimo) {
                sensoresUrgente[contador] = numeros[i];
                contador++;
            }

        }

        return sensoresUrgente;
    }

    /**
     *
     * @param numeros
     * @return
     */
    public static double calcularMediaHumedad(int[] numeros) {
        double sumaTotal = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];
        }

        return  sumaTotal / numeros.length;
    }

    public static void pintar(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]+ ", ");

        }
        System.out.println();
    }


    public static boolean zonacritica(int[] numeros) {

        boolean esCritica = false;

        for (int i = 0; i < numeros.length - 2; i++) {

            if (numeros[i] < 30 && numeros[ i+1 ] < 30 && numeros[ i+2 ] < 30)  {
                esCritica = true;
                break;
            }

        }

        return esCritica;
    }

    public static void main(String[] args) {
        /**
         * Una finca agrícola dispone de una serie de sensores de humedad del suelo distribuidos por diferentes zonas
         * del terreno. Cada sensor registra un valor entero entre 0 y 100.
         * Se pide implementar un programa en Java que trabaje con un array de valores de humedad, y que:
         * - Indique cuántos sensores están por debajo del nivel mínimo recomendado,
         * que será un valor dado por el usuario (por ejemplo, 30).
         * - Obtenga un nuevo array con los valores de los sensores que necesitan riego urgente.
         * - Calcule la media de humedad de toda la parcela.
         * - Determine si existe alguna zona crítica, definida como tres sensores consecutivos con
         * humedad menor al mínimo recomendado.
         *
         * Genera un array de ejemplo con 1000 valores aleatorios entre 0 y 100 para simular los sensores.
         */

        int[] sensores = new int[1000];


        for (int i = 0; i < sensores.length; i++) {
            sensores[i] = numeroAleatorio(100);
        }


        System.out.println("****************************");
        // indique cuántos sensores están por debajo del nivel mínimo recomendado,
        // que será un valor dado por el usuario (por ejemplo, 30)
        int[] sensoresUrgente = sensoresDebajoMinimo(sensores,30);
        System.out.println("sensores están por debajo del nivel 30 es: "+ sensoresUrgente.length);
        pintar(sensoresUrgente);


        System.out.println("****************************");
        // Calcule la media de humedad de toda la parcela.
        double media = calcularMediaHumedad(sensores);
        System.out.println("la media es : " + media);


        System.out.println("****************************");
        //zona crítica
        System.out.println("zona crítica : " + zonacritica(sensores));



    }
}

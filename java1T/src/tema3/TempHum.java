package tema3;

public class TempHum {


    public static int aleatorio(int max,int min) {
        return (int) (Math.random() * (max-min+1)) + min;
    }



    public static void main(String[] args) {

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de temperatura entre -20 y 40

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de humedad entre 0 y 100

        //Haz un programa que muestre por pantalla la temperatura y la humedad
        //media conforme vas generando valores aleatorios

        //Si la temperatura media es superior a 30 grados en algún momento debe
        //parar el bucle y mostrar un mensaje indicando que ha superado la temperatura
        //media permitida.


        double[] temperaturas = new double[100];
        double[] humedades = new double[100];

        double sumaTemperaturas = 0, sumaHumedades = 0;
        double mediaTemperaturas= 0,mediaHumedades= 0;



        while (mediaTemperaturas < 30) {

            for (int i = 0; i < temperaturas.length; i++) {

                temperaturas[i] = aleatorio(40,-20);
                sumaTemperaturas += temperaturas[i];

            }


            for (int i = 0; i < humedades.length; i++) {

                humedades[i] = aleatorio(100,0);
                sumaHumedades += humedades[i];
            }


            mediaTemperaturas = sumaTemperaturas / temperaturas.length;
            mediaHumedades = sumaHumedades / humedades.length;

            System.out.println("**********************************");
            System.out.println("media temperaturas es : " + mediaTemperaturas);
            System.out.println("media Humedades es : " + mediaHumedades);
            System.out.println("**********************************");
            System.out.println();

        }

        if (mediaTemperaturas > 30) {
            System.out.println("he superado la temperatura media permitida");
        }

    }
}

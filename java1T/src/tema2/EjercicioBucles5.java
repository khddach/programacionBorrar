package tema2;

public class EjercicioBucles5 {
    public static void main(String[] args) {

        int contador = 0;
        while (contador <= 10){
            System.out.print(contador+ " ");
            contador++;
        }

        System.out.println();

        for (contador = 0; contador <= 10; contador++) {
            System.out.print(contador+ " ");
        }


        System.out.println();

        //Multiplos de 5 del 5 al 500
        for (contador = 5; contador < 500; contador++) {
            System.out.print(contador+ " ");

        }

        System.out.println();


        //Potencias de 2 hasta 10000
        for (contador = 0; contador <= 10000; contador*=2) {
            System.out.print(contador+ " ");
        }

        System.out.println();


        //Potencias de 2 desde 8192 hasta 2
        for (contador = 8192; contador >= 2; contador /= 2) {
            System.out.print(contador+ " ");
        }
    }
}

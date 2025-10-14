package tema2;

import java.util.Scanner;

public class EjercicioBucles7 {
    public static void main(String[] args) {
        // Numeros que sean multiplos de 3 pero no de 5 entre 100 y 200
        // الأعداد التي هي مضاعفات 3 ولكن ليست 5 بين 100 و 200

        int  contador= 0;
        int numero;


        Scanner sc = new Scanner(System.in);

//        System.out.println("Dime un numero entro: ");
//        numero = sc.nextInt();

        for (contador=100; contador <= 200;contador++) {

            if (contador  % 3 == 0  && contador % 5 != 0 ){
                System.out.println(" " + contador);
                contador++;
            }

        }



    }
}

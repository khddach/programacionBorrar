package tema2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // Programa que pida números hasta que se introduzca un cero.
        // Debe imprimir la suma y la media de todos los números introducidos.

        //1. Bucle infinito
        //2. Ir pidiendo por teclado cada iteración un número
        //3. Cuando el número sea igual a 0 -> termina el bucle (break)
        //4. En un acumulador guardar la suma de todos los números
        //5. Un contador (i) para saber cuántos números pido por teclado
        //6. Media = acumulador / contador

        double media = 0.0;
        int suma = 0, numero, contador = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("dime la  número :");
            numero = sc.nextInt();

            if (numero == 0){
                break;
            }

            suma = suma + numero ;

            contador++;
        }

        media = (double) suma / contador ;

        System.out.println("la media es : " + media);
        System.out.println("Número de números ingresados son : " + contador);

    }
}

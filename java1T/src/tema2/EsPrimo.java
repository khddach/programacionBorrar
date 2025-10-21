package tema2;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {

        //Pide un número por teclado y comprueba si es o no primo
        //Un número es primo si SOLO es divisible por 1 y por el mismo
        //Ejemplo: 19

        //Modo de hacerlo:
        //Indicador esPrimo=true
        //Bucle desde el 2 hasta el número - 1
        //Si el número es divisible por alguno de esos, esPrimo=false


        boolean esPrimo = true ;
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero entro:");
        numero = sc.nextInt();

        for (int i = numero - 1; i >= 2 ; i--) {

            if (numero % i == 0){
                esPrimo = false;
                break;
            }

        }

        if (esPrimo){
            System.out.println("El número es divisible por sí mismo");
        } else {
            System.out.println("El número no es divisible por sí mismo.");
        }
    }
}

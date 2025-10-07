package tema2;

import java.util.Scanner;

public class EjercicioBucles3 {
    public static void main(String[] args) {

        //Adivinar un numero generado por el pc entre (1 - 100)
        //Pedir por teclado un numero entre 1 Y 100, y el program
        //nos responde si el numero introducido es igual (final), mayor
        // o menor que el numero generado a acertar
        //Extra : 7 intentos maximo

        int numeroAAdivinar = (int) (Math.random()*100) + 1;
        int numero;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dime un numero :");
            numero = sc.nextInt();



            if (numero > numeroAAdivinar){
                System.out.println("El número "+ numero +" es mayor que " + numeroAAdivinar);
            } else if (numero < numeroAAdivinar) {
                System.out.println("El número "+ numero +" es más pequeño  que " + numeroAAdivinar);
            }else {
                System.out.println("El número "+ numero +" es  igual al número " + numeroAAdivinar);

            }

            //EXTRA
            intentos++;
            if (intentos == 7){
                System.out.println("Lo siento no lo has conseguido :)");
                break; //TERMINA5
            }
        } while (numero != numeroAAdivinar);
    }
}

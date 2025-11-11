package tema3;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        //Crea un array de palabras del tamaño que me diga el usuario
        Scanner sc = new Scanner(System.in);
        int numeroPalabras = 0;
        System.out.println("Dime el numero de palabras que quieres: ");
        numeroPalabras = Integer.parseInt(sc.nextLine());


        String[] palabras = new String[numeroPalabras];

        for (int i = 0; i <palabras.length ; i++) {
            System.out.println("Dime palabra para guardar");
            palabras[i] = sc.nextLine();
        }


        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

    }
}

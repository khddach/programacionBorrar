package tema2;

import java.util.Scanner;

public class MenuSimple {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Primera opción");
            System.out.println("2. Segunda opción");
            System.out.println("3. Tercera opción");
            System.out.println("4. Salir opción");

            System.out.print("Dime una opción : ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1,2,3:
                    System.out.println("Has elegido la opcion");
                    break;
                case 4:
                    System.out.println("--");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }


        } while (opcion != 4);
    }
}

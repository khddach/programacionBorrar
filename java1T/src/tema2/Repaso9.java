package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int option = -1;

        do {

            try {
                option = sc.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("eror");
                sc = new Scanner(System.in);
                option = -1;
            }

            switch (option){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        } while(option != 3);
    }
}

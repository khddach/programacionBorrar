package tema2;

import java.util.Scanner;

public class EjemploIfElseAnidados {
    public static void main(String[] args) {


        int edad ;
        char sexo ; // 'h' , 'm'
        boolean amigoJefe;

        //Puedes entrar a la discoteca si tienes 18 o mas años;
        //Puedes entrar si tienes mas de dieciseis y eres mujer (no deberias)
        //Puedes entrar si tienes mas de dieciseis y hombre y amigo del jefe
        //No puedes entrar en otro caso


        Scanner sc = new Scanner(System.in);



        //Valores entrada
        System.out.print("Dime tu edad : ");
        edad = sc.nextInt();

        System.out.print("Dime tu sexo : ");
        sc = new Scanner(System.in);
        sexo = sc.nextLine().charAt(0);

        System.out.print("Eres amigo del jefe? ");
        sc = new Scanner(System.in);
        amigoJefe = sc.nextBoolean();

        if (edad >= 18) {
            System.out.println("Puedes entrar a la discoteca");
        } else if (edad >= 16 && sexo == 'm') {
            System.out.println("Puedes entrar");
        } else if (edad >= 16 && sexo == 'h' && amigoJefe) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }


        if ((edad >= 18) || (edad >= 16 && sexo == 'm') || (edad >= 16 && sexo == 'h' && amigoJefe)) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

    }
}

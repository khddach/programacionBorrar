package tema1;

import java.util.Scanner;

public class Ejercicio3Tema1 {
    public static void main(String[] args) {



        String variableA, variableB, variableIntercambie;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introduzca una variable de la variable A: ");
        variableA = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Introduzca una variable de la variable B: ");
        variableB = sc2.nextLine();

        variableIntercambie = variableB ; //Grabo variableB antes de machacarlo con el valor de num1
        variableB = variableA;
        variableA = variableIntercambie;

        System.out.println("la valor nueva B :" + variableB);
        System.out.println("la valor nueva A :" + variableA);

    }
}

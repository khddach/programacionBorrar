package tema1;

import java.util.Scanner;

public class Ejercicio2Tema1 {
    public static void main(String[] args) {


        double parcial1, parcial2, parcial3, exam, trabajo, nota;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Dime la nota del parcial 1: ");
        parcial1 = sc1.nextDouble();


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Dime la nota del parcial 2: ");
        parcial2 = sc2.nextDouble();


        Scanner sc3 = new Scanner(System.in);
        System.out.print("Dime la nota del parcial 3: ");
        parcial3 = sc3.nextDouble();


        Scanner sc4 = new Scanner(System.in);
        System.out.print("Dime la nota del examen: ");
        exam = sc4.nextDouble();


        Scanner sc5 = new Scanner(System.in);
        System.out.print("Dime la nota del trabajo: ");
        trabajo = sc5.nextDouble();


        nota = ((parcial1 + parcial2 + parcial3) / 3) * 0.55 + 0.3*exam + 0.15*trabajo;

        System.out.println("Nota final :" + nota);


        nota = ((parcial1 + parcial2 + parcial3) / 3) * 0.55;
        nota +=  0.3*exam;
        nota += 0.15*trabajo;

        System.out.println("Nota final :" + nota);




    }
}

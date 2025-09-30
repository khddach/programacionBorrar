package tema1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
        //    اكتب برنامجًا يطلب من المستخدم اسمك، ثم يحييك.

        String nombre;


        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe un nombre : ");
        nombre= sc.nextLine();

        System.out.println("Hola, "+ nombre);
    }
}

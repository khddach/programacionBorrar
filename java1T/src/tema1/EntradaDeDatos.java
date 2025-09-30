package tema1;

import java.util.Scanner;

public class EntradaDeDatos
{
    public static void main(String[] args) {

        long num ;
        double decimal;
        String cadena;


        Scanner sc = new Scanner(System.in); //System.in hace referencia al teclado

        // Leer entero
        System.out.println("Dime un entero: ");
        num = sc.nextLong();
        System.out.println("Ek numero introducido es: " + num);


        // Leer decimal (la parte decimal con , y la parte elevado a con e)
        //54,55 56e8 = 56 * 10 elevado a 8
        System.out.println("Dime un entero: ");
        decimal = sc.nextDouble();
        System.out.println("Ek numero introducido es: " + decimal);


        // Leer cadenas
        System.out.println("Dime un cadena es: ");
        cadena = sc.nextLine();
        System.out.println("la cadena es: " + cadena);


        //hay pequeño defecto : cuando lees una cadena despues de un entero o un double
        //el enter despues de escribir el numero lo toma como la cadena al leer

        //solucion 1 -> poner un sc.nextLine() antes de leer la csdena, para tragarse el enter
        //solucion 2 -> leer siempre cadenas y transformarlas a numeros cuando seanbecesario

    }
}

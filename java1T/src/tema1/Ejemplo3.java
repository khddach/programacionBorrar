package tema1;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        // Leer el radio de un circulo y calcular e imprimir su area y longitud
        //ANALISIS
        //Datos de entrada: radio de la circunferencia
        //DISEÑO
        //area = PI * radio * radio
        //longgitud PI * 2 * radio

        //1. DECLARACION DE VARIABLES
        double radio ;
        double area, longitud;

        //2. LEER DATOS DE ENTRADA
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble(); // * Leer de telcado un decimal

        System.out.println("El radio es :" + radio);

        // 3. HACER CALCULOS
        area = 3.1415 * radio * radio; // PI * r2
        longitud = 2 * 3.1415 * radio ; // 2 * PI * r

        //4. MOSTRAR RESULTADOS
        System.out.println("El area es : " + area);
        System.out.println("El longitud es : " + longitud);

    }
}

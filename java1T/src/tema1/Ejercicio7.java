package tema1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double a,b;
        double perimetro,area;
        // احسب محيط ومنطقة المستطيل بالنظر إلى قاعدته وارتفاعه.

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextDouble();


        perimetro = 2 * a * 2 * b ;
        area = (a*b) / 2 ;

        System.out.println("Perimetro :" + perimetro);
        System.out.println("Area :" + area);

    }
}

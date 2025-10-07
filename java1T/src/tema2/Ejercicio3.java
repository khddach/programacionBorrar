package tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        long numAlumnos;
        double costeTotal=0,costePorAlumno=0 ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime numero de alumnos: ");
        numAlumnos = sc.nextLong();

        if(numAlumnos >= 100){
            costePorAlumno = 65;

        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costePorAlumno = 70;

        }
        else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costePorAlumno = 90;
        }else {
            costeTotal = 4000;
            costePorAlumno = costeTotal/numAlumnos;
        }

        if (numAlumnos >= 30) {
            costeTotal = costePorAlumno*numAlumnos;
        }


        System.out.println("El Coste por alumno es : " + costePorAlumno + " EURO");
        System.out.println("El Coste total es : " + costeTotal + " EURO");

    }
}

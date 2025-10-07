package tema2;

import java.util.Scanner;

public class EjercicioClaase {
    public static void main(String[] args) {
        //Me dan como datos de entrada dia, mes y año
        //Tengo que determinar si es una fecha
        //No vamos a tener en cuenta años bisiestos

        //DISEÑO
        //Año : 1900-2100 -->fuera de ahi año fuera de rango
        //Meses: 1-12 o Enero-Deciembre
        // Dia :1-28 si es febrero
        //  1-30 si es abril, junio, septiembre, noviembre
        //  1-31 si es enero, marzo,mayo ,julio, agosto, octubre, diciembre

        int day,moth, year;
        boolean correcto = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dia (1-31)");
        day = sc.nextInt();
        System.out.println("Dime mes (1-12)");
        moth = sc.nextInt();
        System.out.println("Dime year (1900-2100)");
        year = sc.nextInt();

        if (year <1900 || year >2100){
            System.out.println("Año fuera de rango");
        } else if (moth <1 ||moth >12) {
            System.out.println("Mes fuera de rango");
        } else {
            switch (moth){
                case 2:
                    if (day <1 || day >28) {
                       correcto = false;
                    }
                    break;
                case 4,6,9,11:
                    if (day < 1 || day >30){
                        correcto = false;
                    }
                    break;
                case 1,3,5,7,8,10,12:
                    if (day < 1 || day >31){
                        correcto = false;
                    }
                    break;
                default:
                    //No necesario, habria entrado en el if de arriba
            }

            if (!correcto) {
                System.out.println("Dia del mes incorrecto");
            } else {
                System.out.println("Fecha correcta");
            }
        }
    }
}

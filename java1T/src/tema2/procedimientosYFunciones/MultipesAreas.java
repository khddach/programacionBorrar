package tema2.procedimientosYFunciones;

import java.util.Scanner;

public class MultipesAreas {

    // https://www.proferecursos.com/areas-y-perimetros/
    public static void pintarMenu(){
        System.out.println("1. Area de un circulo");
        System.out.println("2. Area de un cuadrado");
        System.out.println("3. Area de un rectangulo");
        System.out.println("4. Area de un triangulo");
        System.out.println("5. Area de un rombo");
        System.out.println("6. Area de un hexgono");
        System.out.println("7. salir");
    }

    public static double calcAreaCirculo(double r) {
        return Math.PI * r * r ;
    }

    public static double calcAreaCuadrado(double a) {
        return a * a ;
    }

    public static double calcAreaRectangulo(double a,double b) {
        return a * b ;
    }

    public static double calcAreaTrianguo(double base, double altura){
        return (base * altura) / 2 ;
    }

    public static double calcAreaRombo(double a, double b){
        return (a * a) / 2 ;
    }

    public static double calcAreaHexgono(double a, double b){
        return ((a * a) * b) / 2 ;
    }


    public static double area(double valor1, double valor2, String tipo){
        switch (tipo) {
            case "Circulo":
                return calcAreaCirculo(valor1);
            case "Cuadrado":
                return calcAreaCuadrado(valor1);
            case "Rectangulo":
                return calcAreaRectangulo(valor1,valor2);
            case "Trianguo":
                return calcAreaTrianguo(valor1,valor2);
            case "Rombo":
                return calcAreaRombo(valor1,valor2);
            case "Hexgono":
                return calcAreaHexgono(valor1,valor2);
            default:
                return 0 ;
        }

    }


    public static void main(String[] args) {

        double radio, lado, base, altura;
        Scanner sc = new Scanner(System.in);
        int opcion=-1;


        do {
            try {
                pintarMenu();
                System.out.println("Dime una opción (1-7)");
                opcion = sc.nextInt();

                switch (opcion){

                    case 1:
                        System.out.println("Dime radio: ");
                        radio = sc.nextDouble();
                        System.out.println("El área es " + area(radio,radio,"Circulo"));
                        break;
                    case 2:
                        System.out.println("Dime lado: ");
                        lado = sc.nextDouble();
                        System.out.println("El área es " + area(lado,lado,"Cuadrado"));
                        break;
                    case 3:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es " + area(base, altura, "Rectangulo"));
                        break;
                    case 4:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es " + area(base, altura, "Triangulo"));
                        break;
                    case 6:
                        break;
                    case 7:
                        System.out.println("Opción incorrecta");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }


            }catch (Exception ex){
                System.out.println(ex.toString());
                opcion = -1;
                sc = new Scanner(System.in);
            }

        } while(opcion != 7);

    }
}

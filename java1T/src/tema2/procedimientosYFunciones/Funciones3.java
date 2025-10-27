package tema2.procedimientosYFunciones;

public class Funciones3 {

    public static double areaTriangle(double b, double h) {
        return (1.0/2) * b * h;
    }

    public static void main(String[] args) {

        // Crea una function que el area de un triangle
        // Recibe dos parametros : el valor de la base y el de la altura
        // El programa debe funcionar con este main


        System.out.println("el area de un triangle es :" + areaTriangle(5,3));
    }
}

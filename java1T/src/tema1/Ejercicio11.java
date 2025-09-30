package tema1;


public class Ejercicio11 {
    public static void main(String[] args) {


        //Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su
        //diferencia, de modo que el resultado sea siempre positivo).
        double num1,num2;
        double distancia;

        num1 = 555.55;
        num2 = 745.114;

        distancia = Math.abs(num1-num2);

        System.out.println("distancia = " + distancia);


    }
}

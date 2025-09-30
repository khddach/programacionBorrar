package tema1;

import java.util.Arrays;

public class EjemploOperadoresExtra {
    public static void main(String[] args) {


        long numero = 6 ;

        // num++ -> primero evalua, y al final de la oprecion le suma 1
        // ++num -> primero le suma uno, y luego evalua el valor

        System.out.println(numero++);
        System.out.println(numero);


        System.out.println(++numero);
        System.out.println(numero);


        int turno = 14;
        turno++;

        System.out.println(turno);


        //Ejemplo de aplicacion
        while (turno > 0) {
            System.out.println(turno);
            turno--;
        }
    }
}

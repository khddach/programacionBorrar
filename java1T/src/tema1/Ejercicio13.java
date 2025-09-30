package tema1;

public class Ejercicio13 {
    public static void main(String[] args) {

        // Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
        //invertido. Ejemplo, si se introduce 23 que muestre 32.


        int numero = 19 ;
        int resultado ;


        int dig = numero / 10 ;
        int dig2 = numero % 10 ;

        resultado = (dig2 * 10) + dig;

        System.out.println("introduce 19 que muestre " + resultado);
    }
}

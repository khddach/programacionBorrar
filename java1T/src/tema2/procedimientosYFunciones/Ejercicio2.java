package tema2.procedimientosYFunciones;

public class Ejercicio2 {

    static void pintarAsteriscos(int num){

        String star = "";
        for (int i = 1; i <= num; i++) {
            star += "*";
        }
        System.out.println(star);
    }


    public static void main(String[] args) {

        //Crear un procedimiento que pinte en la misma línea
        //tantos asteriscos como indique un parámetro llamado num
        //Al final que pinte un salto de línea


        pintarAsteriscos(5);
        pintarAsteriscos(4);
        pintarAsteriscos(3);
        pintarAsteriscos(2);
        pintarAsteriscos(1);
    }
}

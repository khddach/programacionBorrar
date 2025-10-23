package tema2.procedimientosYFunciones;

public class Ejercicio1 {

    static int generarAleatorio(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);
    }


    public static void main(String[] args) {
        //Crea una función que genere un número aleatorio entre
        //un número entero mínimo y un máximo
        //generarAleatorio(int min, int max)
        //Pruébala desde el main llamándola con:
        //generarAleatorio(1, 100)
        //generarAleatorio(-100, 100)
        //generarAleatorio(100, 200)

        System.out.println("generarAleatorio(1, 100) --> " + generarAleatorio(1, 100));
        System.out.println("generarAleatorio(-100, 100) --> " + generarAleatorio(-100, 100) );
        System.out.println("generarAleatorio(100, 200) --> " + generarAleatorio(100, 200));


        System.out.println(Math.random() * (5 - 1 + 1));
    }
}

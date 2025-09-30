package tema1;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por
        //cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
        //Imprime el resultado obtenido por el estudiante.

        //V.E respOk(5), respMal(-1), respBlanco(0)
        //V.S: note

        int respOk = 10;
        int respMal = 4;
        int respBlanco = 3;

        int nota = (5 * respOk) + (-1 * respMal) + (0 * respBlanco) ;

        System.out.println(nota);

    }
}

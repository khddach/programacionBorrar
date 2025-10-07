package tema2;

public class EjemploDoWhile2 {
    public static void main(String[] args) {

        int contador = 1;

        do {

            System.out.print(contador++ + ",");

        } while (contador <= 10);

        System.out.println();

        contador = 1;

        do {

            System.out.print(++contador + ",");

        } while (contador <= 10);
    }
}

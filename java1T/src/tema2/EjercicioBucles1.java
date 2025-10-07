package tema2;

public class EjercicioBucles1 {
    public static void main(String[] args) {
        //1. lanza un dado (1-6) de forma aleatoria hasta que salga un 6.
        // Cuenta el numero de veces que hubo que tirar el dado para saliera 6


        // contador = 0
        // do {
        // Lanzar el dado --> int n =(int) (Math.random()*6) + 1;
        // Ver si es 6
        // contador++ --> veces que si tira el dado
        // } while el dado no es 6

        int contador = 0;
        int tirada = 0;
        do {

            System.out.println("Tirada el dado : " + tirada);
            tirada =(int) (Math.random()*6) + 1;
            System.out.println("Tirada : " + tirada);

            contador++;

        } while (tirada != 6);

        System.out.println("Se tiro el dado : " + contador + " veces");

    }
}

package tema2.practica;
import java.util.Scanner;
public class practica_2_1 {

    public static int aleatorio(int max, int min){
        return (int) ((Math.random() * max - min +1)) + min;
    }

    public static int tiradas(){
        int max = 0, min = 0 ;
        int total = 0;

        int totalTiradaCubitus = 0;
        int totalTiradaJulius = 0;


        int tiradaCubitus1 = aleatorio(6,1);
        int tiradaCubitus2 = aleatorio(6,1);
        int tiradaCubitus3 = aleatorio(6,1);
        int tiradaCubitus4 = aleatorio(6,1);
        int tiradaCubitus5 = aleatorio(6,1);


        int tiradaJulius1 = aleatorio(6,1);
        int tiradaJulius2 = aleatorio(6,1);
        int tiradaJulius3 = aleatorio(6,1);
        int tiradaJulius4 = aleatorio(6,1);
        int tiradaJulius5 = aleatorio(6,1);


        boolean esMinoMaxCubitus = tiradaCubitus1 == 1 || tiradaCubitus1 == 6 || tiradaCubitus2 == 1 || tiradaCubitus2 == 6
                || tiradaCubitus3 == 1 || tiradaCubitus3 == 6 || tiradaCubitus4 == 1 || tiradaCubitus4 == 6 || tiradaCubitus5 == 1 || tiradaCubitus5 == 6;

        boolean esMinoMaxJulius = tiradaJulius1 == 1 || tiradaJulius1 == 6 || tiradaJulius2 == 1 || tiradaJulius2 == 6
                || tiradaJulius3 == 1 || tiradaJulius3 == 6 || tiradaJulius4 == 1 || tiradaJulius4 == 6 || tiradaJulius5 == 1 || tiradaJulius5 == 6;



        if (!esMinoMaxCubitus) {
            System.out.println("no suma min or max");
            totalTiradaCubitus = tiradaCubitus1 + tiradaCubitus2+ tiradaCubitus3+ tiradaCubitus4+ tiradaCubitus5;
            System.out.println("este total puntos del jugador Cubitus: " + totalTiradaCubitus);
        }

        if (!esMinoMaxJulius) {
            System.out.println("no suma min or max");
            totalTiradaJulius = tiradaJulius1 + tiradaJulius2+ tiradaJulius3+ tiradaJulius4+ tiradaJulius5;
            System.out.println("este total puntos del jugador Julius: " + totalTiradaJulius);
        }




        return total -max - min;
    }

    public static void resultado1(){

        tiradas();


    }

    public static void main(String[] args) {
        /*
       Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco
        dados. La puntuación es la suma total de puntos, sin contar los valores que coincidan
        con el mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida.
                Escriba un programa que simule varias partidas seguidas de este juego de dados.


                */



        Scanner Sc = new Scanner(System.in);

        int ronda;

        System.out.println("porfa dime tu rondas del juego: ");
        ronda = Sc.nextInt();

        for (int i = 0; i < ronda; i++) {
            tiradas();


        }


    }
}

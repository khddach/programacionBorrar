package tema2.practica;

import java.util.Scanner;

public class practica2 {

    public static int aleatorio(int max, int min){
        return (int) ((Math.random() * max - min +1)) + min;
    }
    public static int teradasJuego(int n){

        int max = 0, min = 0 ;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int terada = aleatorio(6,1);

            if (i == 1) {
                min = terada;
                max = terada;
            }

            if (max < terada) {
                max = terada;
            }

            if (min > terada) {
                min = terada;
            }
            total = total + terada;
        }

        return total - min - max ;
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



        int teradaCubitus, teradaHumerus;
        int ganaCubitus = 0, ganaHumerus = 0;
        int ronds;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intrudoce total de rondas del juego: ");
        ronds = sc.nextInt();


        for (int i = 1; i <= ronds; i++) {

            teradaCubitus = teradasJuego(5);
            teradaHumerus = teradasJuego(5);

            if (teradaCubitus > teradaHumerus) {
                System.out.println(" Marcus Cubitus es gana -->" + teradaCubitus);
                ganaCubitus = ganaCubitus + teradaCubitus;
            } else if (teradaCubitus < teradaHumerus) {
                System.out.println(" Julius Humerus es gana -->" + teradaHumerus);
                ganaHumerus = ganaHumerus + teradaHumerus;
            }

        }


        if (ganaCubitus > ganaHumerus) {
            System.out.println(" Marcus Cubitus es victoria -->" + ganaCubitus);
        } else if (ganaCubitus < ganaHumerus) {
            System.out.println(" Julius Humerus  es victoria -->" + ganaHumerus);
        } else {
            System.out.println(" igual");
        }


    }
}

package examen;

import java.util.Scanner;
// mohamed khddach
public class Ejercicio3 {

    /**
     * genera un número aleatorio entre min y max
     * @return
     */
    public static int aleatorio(int n){
        return (int) (Math.random() * n);
    }

    /**
     * fun generation Tablero Bombas
     * @param tablero
     * @return
     */
    public static int[][] initTableroBombas(char[][] tablero) {

        int[][] listBombas = new int[5][2];

        for (int i = 0; i < listBombas.length; i++) {

            int iniPosX = aleatorio(tablero.length);
            int iniPosY = aleatorio(tablero.length);

            listBombas[i][0]= iniPosX ;
            listBombas[i][1]= iniPosY ;


        }

        return listBombas;
    }

    /**
     * procedure para colocar minas aleatorias
     * @param tablero
     */
    public static void inicializarTablero(char[][] tablero) {

        int[][] posBombas = initTableroBombas(tablero);


        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '_';
            }
        }

        for (int j = 0; j < posBombas.length; j++) {
            int posX = posBombas[j][0];
            int posY = posBombas[j][1];

            tablero[posY][posX] = 'M';

        }





    }

    /**
     * para para mostrar el tablero.
     * @param tablero
     * @param mostrarMinas
     */
    public static void mostrarTablero(char[][] tablero, boolean mostrarMinas) {

        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (!mostrarMinas && tablero[i][j] == 'M') {
                    System.out.print("_ | ");
                } else {
                    System.out.print(tablero[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    /**
     * fun para comprobar victoria
     * @param tablero
     * @return
     */
    public static boolean haGanado(char[][] tablero) {
        boolean esVictoria = false ;
        int contador = 0;

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] != 'M') {
                    contador++;
                }

            }
        }

        if (contador == 0) {
            esVictoria = true ;
        }

        return esVictoria ;
    }

    /**
     * procedure que devuelve el
     * número de minas alrededor de una posición (máximo 8)
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    public static int contarMinasAdyacentes(char[][] tablero, int fila, int columna) {

        // variables
        int contador = 0;

        for (int j = 0; j < tablero[fila].length; j++) {

            if (tablero[fila][j] == 'M') {
                contador++;
            }

            if (tablero[j][columna] == 'M') {
                contador++;
            }

            if (tablero[j][j] == 'M') {
                contador++;
            }

        }

        return contador ;
    }

    public static void main(String[] args) {
        /**
         Ejercicio 3 (opción 1). Juego: Buscaminas (5 puntos)
         Desarrolla el siguiente juego por consola usando una matriz 7x7:
         La matriz contiene 5 minas ocultas (valor 'M') y el resto es vacío ('_').
         El usuario tiene 15 intentos para descubrir todas las casillas libres.
         En cada intento, introduce fila y columna:
         Si acierta una mina: pierde la partida y se muestran todas las minas.
         Si acierta vacío: marca la casilla mostrando un número del 0 al 8 que indica cuántas
         minas hay en las casillas adyacentes (horizontal, vertical y diagonal).
         Si el número es 0 (sin minas alrededor), se muestra '0'.
         Si intenta descubrir una casilla ya descubierta: no consume intento.
         El juego termina cuando el usuario descubre todas las casillas seguras o pisa una mina.
         Muestra el tablero después de cada intento (sin mostrar las minas no reveladas).
         Requisitos:
         void inicializarTablero(char[][] tablero) para colocar minas aleatorias (sin que
         coincidan).
         int contarMinasAdyacentes(char[][] tablero, int fila, int columna) que devuelve el
         número de minas alrededor de una posición (máximo 8).
         void mostrarTablero(char[][] tablero, boolean mostrarMinas) para mostrar el tablero.
         boolean haGanado(char[][] tablero) para comprobar victoria.
         Validar que las coordenadas introducidas sean correctas (rango 0-6).
         Controlar excepciones al leer datos de entrada.
         Al descubrir una casilla, debe mostrar el número de minas adyacentes en lugar de 'D'.
         */


        //variables
        char[][] tablero = new char[7][7];
        Scanner sc = new Scanner(System.in);
        int fila = 0,columna = 0;
        int intentos = 15;



        inicializarTablero(tablero);

        mostrarTablero(tablero,false);



        while(intentos != 0) {
            //variables
            int contador = 0;
            boolean mostrarMinas = false;


            try {
                System.out.println("introduce fila (0-6) :");
                fila = sc.nextInt();
                System.out.println("introduce columna (0-6) :");
                columna = sc.nextInt();

            } catch (Exception e) {
                sc = new Scanner(System.in);
                continue;
            }

            try {
                if (tablero[fila][columna] == 'M') {
                    System.out.println("Game Over");
                    break;
                } else if  (tablero[fila][columna] == '_') {
                    int num = aleatorio(3);
                    tablero[fila][columna] = String.valueOf(num).charAt(0);
                    mostrarMinas = false;

                } else if (tablero[fila][columna] == '0') {
                    int num = contarMinasAdyacentes(tablero,fila,columna);
                    tablero[fila][columna] = String.valueOf(num).charAt(0);

                }


                if (tablero[fila][columna] == '0' && !mostrarMinas) {

                    mostrarMinas = true;

                }

                if (haGanado(tablero)) {
                    System.out.println("ha Ganado");
                    break;
                }

                mostrarTablero(tablero,mostrarMinas);
            } catch (Exception e) {
                System.out.println("fuera de jugar");
                System.out.println("game over");
                break;
            }


            intentos--;
            System.out.println("Intentos restantes: " + intentos);


            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {

                    if (tablero[i][j] == '_') {
                        contador++;
                    }

                }
            }

            System.out.println("Casillas descubiertas: " + contador + " / 44");
        }

        if (intentos == 0) {
            System.out.println("intentos es " + intentos);
            System.out.println("game over");
        }
    }
}

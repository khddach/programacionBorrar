package tema3.practica_evaluable;


import java.util.Arrays;

public class Ejercicio3 {

    public static int aleatorio() {
        return (int) (Math.random() * 8);
    }

    public static void colocarBarco (char[][] tablero, int tamano) {

        boolean buscarBarco = false;

        for (int i = 0; i < tamano; i++) {

            int numAleatorioX = aleatorio();
            int numAleatorioY = aleatorio();

            if (numAleatorioX+1 > 8 || numAleatorioY+1 > 8 ) {
                continue;
            }

            tablero[numAleatorioY][numAleatorioX] = 'B';
            tablero[numAleatorioY][numAleatorioX+1] = 'B';
        }


        for (int i = 0; i < tamano ; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 'B') {
                    buscarBarco = true;
                }
            }
        }

        mostrarBarcos(tablero,buscarBarco);

    }


    public static void mostrarBarcos(char[][] tablero,boolean mostrarBarcos) {

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (!mostrarBarcos && tablero[i][j] == 'B') {
                    System.out.print("~");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        /**
         Ejercicio 3: Matrices
         Batalla Naval Simplificada Crea un juego de batalla naval para consola en un tablero de 8x8. El programa debe realizar lo siguiente:
         Inicialización:
         Crear un tablero de 8x8 (matriz de char ), inicialmente relleno de '~' (agua).
         Colocar aleatoriamente:
         3 barcos pequeños de tamaño 2 (dos casillas consecutivas en horizontal o vertical)
         Los barcos estarán representados con ' B '
         No pueden superponerse ni salirse del tablero
         Juego:
         El jugador tiene 20 disparos para hundir todos los barcos
         En cada turno, el jugador introduce dos coordenadas (fila y columna)
         El programa responde:
         “¡TOCADO!” si hay barco en la celda (marca con ' X ')
         “Agua” si no hay barco (marca con ' O ')
         “Ya disparaste ahí” si esa casilla ya ha sido jugada
         Mostrar el tablero después de cada disparo (sin revelar los barcos no descubiertos)
         Finalización:
         Si se hunden todos los barcos: victoria
         Si se agotan los 20 disparos: derrota
         Requerimientos adicionales:
         Crea un método void colocarBarco (char[][] tablero, int tamano) que coloque un barco
         aleatorio de tamaño dado en el tablero.
         Crea un método void mostrarTablero(char[][] tablero, boolean mostrarBarcos) que
         muestre el tablero. Si mostrarBarcos es true , muestra los barcos con 'B'; si es false ,
         muestra '~' en su lugar.
         Crea un método boolean todosBarcosHundidos(char[][] tablero) que compruebe si
         quedan barcos ('B') en el tablero.
         */


        //variables
        char[][] tablero = new char[8][8];

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = '~';
            }
        }

        // Colocar 3 barcos de tamaño 2
        colocarBarco(tablero,3);




    }
}


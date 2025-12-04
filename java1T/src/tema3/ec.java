package tema3;


import java.util.Random;
import java.util.Scanner;

public class ec {

    public static void main(String[] args) {

        char[][] tablero = new char[8][8];

        // Inicializar tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '~';
            }
        }

        // Colocar barcos
        for (int i = 0; i < 3; i++) {
            colocarBarco(tablero, 2);
        }

        Scanner sc = new Scanner(System.in);
        int disparos = 20;

        System.out.println("¡Bienvenido a Batalla Naval!\n");

        while (disparos > 0) {

            mostrarTablero(tablero, false); // No mostrar barcos

            System.out.println("\nTe quedan " + disparos + " disparos");
            System.out.print("Ingresa fila (0-7): ");
            int fila = sc.nextInt();

            System.out.print("Ingresa columna (0-7): ");
            int col = sc.nextInt();

            // Validación de rango
            if (fila < 0 || fila >= 8 || col < 0 || col >= 8) {
                System.out.println("Coordenadas inválidas, intenta de nuevo.");
                continue;
            }

            // Evaluar disparo
            if (tablero[fila][col] == 'B') {
                System.out.println("¡TOCADO!");
                tablero[fila][col] = 'X';
            }
            else if (tablero[fila][col] == '~') {
                System.out.println("Agua...");
                tablero[fila][col] = 'O';
            }
            else {
                System.out.println("Ya disparaste ahí.");
                continue; // No gastar disparo
            }

            // Verificar victoria
            if (todosBarcosHundidos(tablero)) {
                mostrarTablero(tablero, true);
                System.out.println("\n¡Has hundido todos los barcos! ¡Victoria!");
                return;
            }

            disparos--;
        }

        // Si se terminan los disparos
        mostrarTablero(tablero, true);
        System.out.println("\nSe acabaron los disparos... ¡Derrota!");
    }

    // -------------------------------------------------------------
    // MÉTODO: Coloca un barco en el tablero
    // -------------------------------------------------------------
    public static void colocarBarco(char[][] tablero, int tamano) {
        Random rand = new Random();
        boolean colocado = false;

        while (!colocado) {

            int fila = rand.nextInt(8);
            int col = rand.nextInt(8);

            boolean horizontal = rand.nextBoolean();

            // Comprobar si cabe
            if (horizontal) {
                if (col + tamano > 8) continue;

                // Verificar que no se superpone
                boolean libre = true;
                for (int i = 0; i < tamano; i++) {
                    if (tablero[fila][col + i] != '~') {
                        libre = false;
                        break;
                    }
                }

                if (libre) {
                    for (int i = 0; i < tamano; i++) {
                        tablero[fila][col + i] = 'B';
                    }
                    colocado = true;
                }

            } else { // vertical
                if (fila + tamano > 8) continue;

                boolean libre = true;
                for (int i = 0; i < tamano; i++) {
                    if (tablero[fila + i][col] != '~') {
                        libre = false;
                        break;
                    }
                }

                if (libre) {
                    for (int i = 0; i < tamano; i++) {
                        tablero[fila + i][col] = 'B';
                    }
                    colocado = true;
                }
            }
        }
    }

    // -------------------------------------------------------------
    // MÉTODO: Mostrar el tablero
    // -------------------------------------------------------------
    public static void mostrarTablero(char[][] tablero, boolean mostrarBarcos) {
        System.out.println("\n   0 1 2 3 4 5 6 7");

        for (int i = 0; i < 8; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 8; j++) {

                char c = tablero[i][j];

                if (!mostrarBarcos && c == 'B') {
                    System.out.print("~ ");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }

    // -------------------------------------------------------------
    // MÉTODO: Verificar si quedan barcos sin hundir
    // -------------------------------------------------------------
    public static boolean todosBarcosHundidos(char[][] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 'B') {
                    return false;
                }
            }
        }
        return true;
    }
}

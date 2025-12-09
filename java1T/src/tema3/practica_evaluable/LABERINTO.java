package tema3.practica_evaluable;

import java.util.Scanner;

public class LABERINTO {

    public static int aleatorio(int n) {
        return (int) (Math.random() * n);
    }

    public static String[][] initLista(String[][] lista) {

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {


                lista[i][j] = ".";

                if (i == 0) {
                    lista[0][j] = "-";
                } else if (i == lista.length - 1) {
                    lista[lista.length - 1][j] = "-";
                }


                if (j == 0) {
                    lista[i][0] = "|";
                } else if (j == lista[i].length - 1) {
                    lista[i][j] = "|";
                }


            }

        }

        lista[0][0] = "@";
        lista[lista.length - 1][0] = "#";


        return lista;
    }

    public static void mostrarLista(String[][] lista) {
        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + " ");
            }

            System.out.println();

        }
    }

    public static int keyNum(Scanner sc, String msg) {
        int numero = -1;

        while (true) {
            try {
                System.out.println(msg);
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("solo numero");
                sc = new Scanner(System.in);
                continue;
            }

        }

        return numero;

    };

    public static void bomba(String[][] lista) {
        int posX = 0;
        int posY = 0;

        do {
            posX = aleatorio(lista.length - 1);
            posY = aleatorio(lista.length - 1);

            lista[posY][posX] = "X";

        } while(posY != lista.length - 1 || posX != lista.length - 1
                || posX!=0 || posY!=0);


        mostrarLista(lista);


    }

    public static void listMenu(int menu) {
        switch (menu) {
            case 0:
                String punto = "";
                System.out.print("salir ");
                for (int i = 0; i < 4; i++) {
                    punto += "-";
                    try {
                        Thread.sleep(120);
                    } catch (Exception e) {
                        System.out.println();
                    }
                    System.out.print(punto + " ");
                }
                System.out.println("-----> by by");

                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
        }
    }

    public static void main(String[] args) {

        String[][] board = new String[20][20];
        Scanner sc = new Scanner(System.in);
        int menu = -1;


        //init board
        board = initLista(board);

        // pintar
        bomba(board);
        do {

            System.out.println("******************************");
            System.out.println("Introduce opcion :");
            System.out.println("0. salir");
            System.out.println("1. derecha");
            System.out.println("2. izquierda");
            System.out.println("3. abajo");
            System.out.println("4. derecha");
            System.out.println("******************************");

            menu = keyNum(sc, "Dame el número de menu: ");

            listMenu(menu);



        } while (menu != 0);


    }
}

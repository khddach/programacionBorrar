package tema2;

import java.util.Scanner;

public class BucleIndicador {
    public static void main(String[] args) {
        //Pide 5 numeros por telcadoy dime si "alguno" de ellos
        //es multiplo de 5


        Scanner sc = new Scanner(System.in);

        int numero ;
        boolean esMultiplo = false;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Dime un numero: ");
            numero = sc.nextInt();

            if (numero % 5 == 0){
                esMultiplo = true;
            } else {
                esMultiplo = false;
            }
        }

        if (esMultiplo)
        {
            System.out.println("Alguno de los numeros introducidos es multiplo de 5");
        }else {
            System.out.println("No has introducidos ningun numero multiplo de 5");
        }
    }
}

package tema2;

import java.util.Scanner;

public class EjercicioBucles9 {
    public static void main(String[] args) {
        //lanza un dado de 20 caras 50 veces y dime cuantas sale un critico (20)

        //v.E.: tirada del dado
        //V.S.: numero de veces que salio 20


        //Diseño
        //a) lanzar un dado de 20 caras
        //  Generando un numero aleatorio entre 1 y 20
        //  int dado = (int) (Math.random() * 20 ) + 1
        //b) lanzarlo 50 veces
        //Bucle de 1 a 50
        // for(int i=1; i<= 50; i++)
        //c) comparar que el dado sea == 20 eso es un critico
        // Necesito un contador=0 que sume uno cada vez que dado == 20


        int dado = 0;
        int contador = 0;

       for (int i=1; i <= 50; i++){

           dado =(int) (Math.random()*20) + 1;

//           System.out.println("Tirada : " + dado);

           if (dado == 20){
               contador++;
           }

       }


        System.out.println("Han salido " + contador + " criticos");

    }
}

package tema2;

public class BucleAcumulador4 {

    public static void main(String[] args) {

        //Humerus y Cubitus se aburren el finde y van a jugar a los dados
        //Humerus tira tres dados y su puntuación es la suma de los pares
        //Cubitus tira tres dados y su puntuación es la suma de los impares
        //Si jugan 10 rondas, dime el ganador

        // dado = (int) (Math.random() * 6 + 1);

        //V.E.: tiradaDH1, tiradaDH2, tiradaDH3, tiradaDC1, tiradaDC2, tiradaDC3
        //      sumaDH, sumaDC
        //      contaRondasH, contaRondasC
        // Juegan 10 rondas
        //V.S.: Si contaRondasH > contaRondasC --> Gana Humerus
        //      Si contaRondasC > contaRondasH --> Gana Cubitus
        //      Si son iguales --> Empate

        int tiradaDH1, tiradaDH2, tiradaDH3, tiradaDC1, tiradaDC2, tiradaDC3;
        int sumaDH = 0, sumaDC= 0;
        int contaRondasH = 0, contaRondasC = 0;


        for (int i=1; i <= 10; i++){

            tiradaDH1 =(int) (Math.random()*6) + 1;
            tiradaDH2 =(int) (Math.random()*6) + 1;
            tiradaDH3 =(int) (Math.random()*6) + 1;

            tiradaDC1 =(int) (Math.random()*6) + 1;
            tiradaDC2 =(int) (Math.random()*6) + 1;
            tiradaDC3 =(int) (Math.random()*6) + 1;


            sumaDH = tiradaDH1 + tiradaDH2 + tiradaDH3;
            sumaDC = tiradaDC1 + tiradaDC2 + tiradaDC3;


            if (sumaDH % 2 == 0 && sumaDC % 2 == 0) {

                contaRondasH++;

            } else if (sumaDH % 2 != 0 && sumaDC % 2 != 0) {

                contaRondasC++;

            }else {

                contaRondasH++;
                contaRondasC++;

            }


        }


        if (contaRondasH > contaRondasC){
            System.out.println("contaRondasH > contaRondasC --> Gana Humerus");
        } else if (contaRondasH < contaRondasC) {
            System.out.println("Si contaRondasC > contaRondasH --> Gana Cubitus");
        }else {
            System.out.println("son iguales --> Empate");
        }

    }
}

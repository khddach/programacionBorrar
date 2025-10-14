package tema2;

public class EjercicioBucles10 {
    public static void main(String[] args) {

        //Lanza dos dados de 12 caras 100 veces
        //Di cuantas veces salen los dos dados iguales

        int dado, dado2 ;
        int contador = 0;

        for (int i=1; i <= 100; i++){

            dado =(int) (Math.random()*12) + 1;
            dado2 =(int) (Math.random()*12) + 1;

            if (dado == dado2 && dado == 12){
                System.out.println(dado + " - "+ dado2);
                contador++;
            }

        }


        System.out.println("Han salido " + contador + " criticos");
    }
}

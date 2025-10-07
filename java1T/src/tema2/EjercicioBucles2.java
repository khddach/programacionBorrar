package tema2;

public class EjercicioBucles2 {
    public static void main(String[] args) {
        //Lanza dos dados (1-6) mientras sean diferentes
        // Cuenta las veces que has tenido que tirar los dados


        int contador = 0;
        int tirada1 = 0;
        int tirada2 = 0;

        do {

            tirada1 =(int) (Math.random()*6) + 1;
            tirada2 =(int) (Math.random()*6) + 1;
            System.out.println("Tiradas : " + tirada1 + " - " + tirada2);


            contador++;

//            if (tirada1 == tirada2) {
//                break;
//            }
        } while (tirada1 != tirada2 );

        System.out.println("Se tiro el dado : " + contador + " veces");

    }
}

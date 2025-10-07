package tema2;

public class EjemploSwitch {
    public static void main(String[] args) {

        //Programa que me digasegunlanota si estas suspenso


        int nota= 8;

        if (nota <5)
        {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <7) {
            System.out.println("Aprobado");

        } else if (nota >= 7 && nota <8) {
            System.out.println("Notable");

        } else if (nota >= 8 && nota <9) {
            System.out.println("Sobresaliente");

        } else if (nota >= 9 && nota <10) {
            System.out.println("Sobresaliente");

        }else {
            System.out.println("Aprobado");

        }
    }
}

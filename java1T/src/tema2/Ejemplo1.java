package tema2;

public class Ejemplo1 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 6 ) + 1 ;
        System.out.println("Tirada "+ n);

        // n == 6 es true -->se ejecuta lo que hay dentro
        // n== 6 es false -->no dr ejecuta nada
        if(n == 6){
            System.out.println("Has ganado!");
        } else {
            System.out.println("Lo siento, sigue intentando");
        }
    }
}

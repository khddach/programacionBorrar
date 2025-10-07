package tema2;

public class EjemploBucle2 {
    public static void main(String[] args) {


        //Números impares del 1 al 100, píntalos seguidos separados por comas

        int contador = 1;

        while (contador <= 100){
            System.out.print(contador + ", ");
            contador += 2;
        }

        System.out.println("");
        contador = 1;

        while (contador <= 100){
            if (contador % 2 != 0){
                System.out.print(contador + ", ");
            }
            contador++;
        }

    }
}

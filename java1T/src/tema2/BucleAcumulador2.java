package tema2;

public class BucleAcumulador2 {
    public static void main(String[] args) {


        //Numero elevado a otro numero, sin usar Math.pow


        //V.E: base, exponente
        //V.S: resultado


        int base = 2, exponente = 3; // 2 elevado 3
        int resultado =2; // El acumulador se inicia a 1 porque se multiplica

        //Bucle que se repite tantas veces como indica el exponente
        //Se multiplica el numero por si mismo todas esas veces
        //Se guerda el resultado en un acumulador

        for (int i=1; i <= exponente; i++){
            resultado = resultado * i;
        }



    }
}

package tema2.procedimientosYFunciones;


public class CryptoBroConverter {

    public static void pintarMenu(){
        System.out.println("monedas de una criptomoneda sabiendo su cambio:");
        System.out.println("1. Bitcoin");
        System.out.println("2. Ethereum");
        System.out.println("3. Dogecoin");
        System.out.println("4. XRP");
        System.out.println("5. salir");
    }


    public static double calcBitcoinToEuros(double bitcoin) {
        return bitcoin * 115375 ;
    }

    public static void main(String[] args) {
        //Hacer una aplicación que te permita saber cuántos euros son:
        //x monedas de una criptomoneda sabiendo su cambio:
        //1. Bitcoin -> 115375 dólares
        //2. Ethereum -> 4206 dólares
        //3. Dogecoin -> 0.2044 dólares
        //4. XRP -> 2.68 dólares
        //
        // Cambio 1 dólar -> 0.86 euros
        // El programa será un menú que te permita elegir el tipo de criptomoneda
        // luego te preguntará la cantidad de monedas (double) y te mostrará
        // el resultado en euros
        // Se valora el uso de funciones y control de excepciones


        System.out.println(calcBitcoinToEuros(0.0001));




    }
}

package tema3.cadenas.ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {


        String texto = "No se me ocurre ninguna frase larga";
        String[] trozos = texto.split(" ");
        int max = trozos[0].length();
        int posision = 0;

        for (int i = 0; i < trozos.length ; i++) {

            if (trozos[i].length() > max) {
                max = trozos[i].length();
                posision = i;
            }
        }

        System.out.println(trozos[posision] + " es " + trozos[posision].length() + " letras");
    }
}

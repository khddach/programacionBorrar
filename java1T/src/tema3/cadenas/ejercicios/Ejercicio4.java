package tema3.cadenas.ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {

        /**
         * Elimina los espacios (intermedios tambien) de una cadena de texto
         */

        String texto = "    Esto es    un texto    con espacios,   muchos  ";

        texto = texto.trim();
        // texto = texto.replaceAll(" ","");
        // texto = texto.replace(" ","");
        texto = texto.replaceAll(" +","");

        System.out.println(texto);
    }
}

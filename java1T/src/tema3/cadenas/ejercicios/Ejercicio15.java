package tema3.cadenas.ejercicios;

public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "hola mundo";
        char[] vocales = {'a','e','i','o','u'};
        char[] caracteresEspeciales = {'@','&','$','º','#'};
        StringBuffer sb = new StringBuffer();


        String[] trozos = texto.split(" ");

        for (int i = 0; i < trozos.length; i++) {
            sb.append(trozos[i].substring(trozos[i].length() - 1));
            sb.append(trozos[i].substring(1));
            sb.append(trozos[i].charAt(0));
            sb.append(" ");
        }





        System.out.println(texto);
        System.out.println(sb.toString());

    }
}

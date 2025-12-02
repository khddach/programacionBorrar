package tema3.cadenas.ejercicios;

public class Ejercicio14 {


    public static String encriptar(String frase,int clave) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < frase.length(); i++) {
            char encriptado = (char) ( frase.charAt(i) + clave);
            sb.append(encriptado);
        }

        return sb.toString();
    };

    public static String descifrar(String frase,int clave) {
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = 0; i < frase.length(); i++) {
//            char descifrado = (char) ( frase.charAt(i) - clave);
//            sb.append(descifrado);
//        }
//
//        return sb.toString();

        return encriptar(frase, -clave);
    };


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        int password = 123456789;

       String encriptado = encriptar("simo mm",password);

        String descifrado = descifrar(encriptado,password);

        System.out.println(encriptado);
        System.out.println(descifrado);
    }
}

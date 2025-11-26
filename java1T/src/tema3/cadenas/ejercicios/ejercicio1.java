package tema3.cadenas.ejercicios;

public class ejercicio1 {
    public static void main(String[] args) {

        //Cuenta las vocales del texto "Me gusta programar en java los sabados por la mañana"

        String texto = "Me gusta programar en java los sabados por la mañana";


        String[] vocales = {"a","e","i","o","u"};

        int contador = 0;

        for (int i = 0; i < vocales.length ; i++) {

            if (texto.contains(vocales[i])) {
                System.out.println(vocales[i]);
                contador++;
            }

        }

        System.out.println(contador);
    }
}

package tema3;

public class Arrays1 {
    public static void main(String[] args) {

        //Crea un array de 10 elementos de tipo entero
        int[] numeros = new int[10];


        //modificar un elemento del array
        numeros[0] = 10;
        numeros[1] = 4;

        //Recorrer desde 0 hasta la longitud del array --> nombre.length
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posicion " + i + " es " + numeros[i]);
        }
    }
}

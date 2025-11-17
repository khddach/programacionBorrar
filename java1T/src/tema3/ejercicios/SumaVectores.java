package tema3.ejercicios;

public class SumaVectores {
    public static void main(String[] args) {

        //Genera un programa que dados dos vectores de enteros, calcule su suma.
        //Debes almacenarla en un tercer vector de enteros.


        String[] canciones = {"blackout",
                "no tiene sentido",
                "Tu jardín con enanitos",
                "La Perla",
                "Qué pasaría ...",
                "OHNANA",
                "La Plena",
                "QLOO*",
                "MOTINHA 2.0",
                "mi refe"
        };

        String[] autores = {"Emilia, TINI, Nicki Nicole",
                "Beéle",
                "Roze Oficial, Max Carra",
                "ROSALÍA",
                "Rauw Alejandro, Bad Bunny",
                "Kapo",
                "W Sound, Beéle",
                "Young Cister",
                "DENNIS, Luisa Sonza",
                "Beéle, Ovy On The Dreams"
        };

        int[] duraciones = {182,
                158,
                175,
                195,
                191,
                156,
                150,
                148,
                118,
                159};

        int duracionTotalSegundos = 0;

        for(int i=0; i < canciones.length; i++) {
            System.out.println(canciones[i] + " - " + autores[i] + " - " +
                    (duraciones[i] / 60.0));
        }

        //Calcular duración total (acumulador)
        for(int i=0; i < duraciones.length; i++) {
            duracionTotalSegundos += duraciones[i];
        }
        System.out.println("La duración total de la lista es: " + duracionTotalSegundos);

        System.out.println(canciones[(int) (Math.random() * 10) + 1]);
        System.out.println(canciones[(int) (Math.random() * 10) + 1]);
        System.out.println(canciones[(int) (Math.random() * 10) + 1]);





    }
}

package tema1;

public class EjemploEnumerados {
    public static void main(String[] args) {


        enum Notas {SOBRESALIENTE, NOTABLE, APROBADO, SUPENSO }

        //Declaracion de una variable de tipo Notas
        Notas miNotas = Notas.SOBRESALIENTE;

        System.out.println(miNotas);

        miNotas = Notas.APROBADO ;

        System.out.println(miNotas);
    }
}

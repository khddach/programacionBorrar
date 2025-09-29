package tema1;

public class EjercicioOperadoresLogicos {
    public static void main(String[] args) {

        final int numClasesAnio = 120;
        int numClasesAsiste = 101;
        int praticasEntregadas = 4;
        boolean autorizacionEspecial = false;


        //Condicion para presentarse a exam final
        // Ha asistido al menos al 80% de clases Y ha entregado mas de 3 praticas
        // O tiene una autorizacion especial para presentarse


        //Escribe la expresion logica, piensa el resultado, e imprimelo


//
//
//
//        int numPraticas = 3 ;
//        int entregado = 80 ;
//        boolean resultado ;
//
//
//
//
//        resultado =( (entregado >= 80) && ( praticasEntregadas > numPraticas ) ) || (autorizacionEspecial == true);
//        System.out.println(resultado);

        boolean resultado ;



        resultado = (numClasesAsiste >= (numClasesAnio * 0.8)) && (praticasEntregadas > 3 ) || autorizacionEspecial;
        System.out.println(resultado);

















    }
}

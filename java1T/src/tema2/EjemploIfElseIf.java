package tema2;

public class EjemploIfElseIf {
    public static void main(String[] args) {

        int edad = 62 ;
        if( edad < 4 ){
            System.out.println("Eres un bebe");
        } else if (edad == 5) {
            System.out.println("Vas a primero de primaria");
        }
        else if (edad == 6) {
            System.out.println("Vas a segundo de primaria");
        }
        else if (edad == 7) {
            System.out.println("Vas a tercero de primaria");
        }
        else if (edad == 8) {
            System.out.println("Vas a cuarto de primaria");
        }
        else if (edad == 9) {
            System.out.println("Vas a quinto de primaria");
        }
        else if (edad == 10) {
            System.out.println("Vas a sexto de primaria");
        }else {
            System.out.println("No eres un estudiante de primaria");
        }


        // Determinar si estas en infantil o guardia, en primaria o n otra cosa
        if (edad < 5) {
            System.out.println("Estas en infantil o guardia");
        } else if (edad <11){
            System.out.println("Estas en primaria");
        } else {
            System.out.println("Estas en otra cosa");
        }

    }
}

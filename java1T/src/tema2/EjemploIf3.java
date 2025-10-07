package tema2;

public class EjemploIf3 {
    public static void main(String[] args) {

        int mates = 5, lengua = 5 ;


        if (mates >= 5 && lengua >= 5) {
            System.out.println("Todo aprobado");
        } else if (mates >= 5 && lengua <5){
            System.out.println("Mates aprobado, lengua no");

        } else if (mates <5 && lengua >=5) {
            System.out.println("lengua aprobado, Mates no");

        }
        else {
            System.out.println("Todos sup");
        }
    }
}

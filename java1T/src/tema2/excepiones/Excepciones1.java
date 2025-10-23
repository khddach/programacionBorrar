package tema2.excepiones;

public class Excepciones1 {
    public static void main(String[] args) {

        int x1 = 44, x2=55;

        try {
            if(x1< x2){
                throw new Exception("Division incorrcta");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

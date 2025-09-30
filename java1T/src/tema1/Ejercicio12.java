package tema1;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Pide al usuario dos pares de números (x1,y2) y (x2,y2), que representen dos puntos en el
        //plano. Calcula y muestra la distancia entre ellos.

        double x1,x2,y1,y2;
        double distancia;


        x1 = 45.66;
        y1 = 66.98;

        x2 = 66.98;
        y2 = 45.66;

        distancia = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2) );

        System.out.println(distancia);
    }
}

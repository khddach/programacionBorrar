package tema1;

public class EjemploCasting
{
    public static void main(String[] args) {

        int cantidad = 9999;
        long cantidadlong = (long) cantidad;

        System.out.println(cantidadlong);

        cantidadlong = 99999999999999l;
        cantidad = (int) cantidadlong;

        System.out.println(cantidad);



    }
}

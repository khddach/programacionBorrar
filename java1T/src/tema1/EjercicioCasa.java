package tema1;

public class EjercicioCasa {
    public static void main(String[] args) {
        //Me dicen la distancia a la Tierra de la estrella Próxima Centauri, 4.24 años luz
        //Tengo que mostrar la distancia en km y el tiempo en segundos que tardaría
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de
        //la luz -> 298.000 km/s

        //Pista1 -> distancia en km, es pasar 4.24 años luz a kilometros
        //Pista2 -> tiempo en segundos, una vez se los km, y se la velocidad a la que voy
        //pues despejar los segundos
        //Pista3 -> velocidad de la luz 299.900 km/s


























        final double vluz = 299792.458;
        double distanciaAnios = 4.24;
        double distanciaSegundos ;
        double distanciaKm ;


        distanciaSegundos = distanciaAnios * 365 * 24 * 60 * 60 ;
        distanciaKm = distanciaSegundos * vluz ;

        System.out.println("Distancia en segundos luz a Proxima Centauri " + distanciaSegundos);
        System.out.println("Distancia en km a Proxima Centauri " + distanciaKm);




        //DISEÑO  v = e/t
        //Nave va a    298000 km  -  1 s
        //             distanciaKM -  ? s
        final double velocidadNave = 298000;
        double tiempoNaveProximaSegundos, tiempoNaveProximaAnios;

        tiempoNaveProximaSegundos = distanciaKm / velocidadNave;
        tiempoNaveProximaAnios = tiempoNaveProximaSegundos / 365 / 24 / 60 / 60;

        System.out.println("La nave tardaría " + tiempoNaveProximaSegundos + " segundos en llegar");
        System.out.println("La nave tardaría " + tiempoNaveProximaAnios + " años en llegar");

    }
}

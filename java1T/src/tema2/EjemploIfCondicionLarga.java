package tema2;

public class EjemploIfCondicionLarga {
    public static void main(String[] args) {

        //entrar en un ciudad en zona baja emisiones
        // Si es electrico se puedo entra
        // sino Si es híbrido se puedo enntra
        // sino Si es gasolina de bajas emisiones se puede entrar
        // sino

        boolean esElec = true;
        boolean esHibrido = false;
        boolean esGasBaja = false;


        if (esElec){

            System.out.println("Puedes entrar");
        }
        else if(esHibrido){
            System.out.println("Puedes entrar");
        }
        else  if(esGasBaja) {
            System.out.println("Puedes entrar");
        }
        else {
            System.out.println("No puedes entrar");
        }





        // Recomendable y óptimo
        if (esElec){
            System.out.println("Puedes entrar");
        }
        else if(esHibrido){
            System.out.println("Puedes entrar");
        }
        else  if(esGasBaja) {
            System.out.println("Puedes entrar");
        }
        else {
            System.out.println("No puedes entrar");
        }


        // Soy yo quien tiene que poner todas las condiciones
        //y hacer excluyentes
        if (esElec){
            System.out.println("Puedes entrar");
        }
        if(esHibrido){
            System.out.println("Puedes entrar");
        }
        if(esGasBaja) {
            System.out.println("Puedes entrar");
        }

        if(!esElec && !esHibrido && !esGasBaja) {
            System.out.println("No puedes entrar");
        }

    }
}

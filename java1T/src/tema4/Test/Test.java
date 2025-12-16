package tema4.Test;

public class Test {
    public static void main(String[] args) {
        /**
         * 1. Crea un clase Personaje
         * 2. Debe tener las siguientes propiedades (privadas):
         * - nombre: String
         * - clase: String
         * - salud: int o Integer
         * - mana: int o Integer
         * 3. Crea un constructor que inicialice todas las propiedades
         * 4. Crea los métodos getters y setters para todas las propiedades
         * 5. Crea el toString para que pinte todas las propiedades (StringBuffer)
         * 6. Crea un método void quitarSalud(int vida) que reste esa vida a la del personaje
         * 7. Crea un método void revivir() que ponga la vida a 100.
         * 8. Luego en el main de esta clase crea dos personajes diferentes pers1 y pers2
         * 9. Quítale vida a uno de ellos, dejar uno sin vida, revivirlo
         * 10. Pinta los dos personajes
         *
         * Extra:
         * - Cuando el personaje ataque que quite vida en función del nivel
         * Por ejemplo: damage * (1 + nivel * 0.15)
         * Ojo, hay que pasar double a integer
         * - Cuando la vida de un personaje llegue a 0, mostrar mensaje de muerto
         * - Subir nivel:
         *   a) Cambiamos MAX_SALUD a 200
         *   b) Al crear un personaje le ponemos de vida MAX_SALUD / 4
         *   c) Hacemos un método void subirNivel() que le sume uno al nivel
         *   y sumo 20 de salud al personaje, sin exceder MAX_SALUD
         *
         */

        Personaje pers1 = new Personaje("Gandalf", "Mago", 100, 11, 1);
        Personaje pers2 = new Personaje("Conan", "Guerrero", 0, 8, 1);

        System.out.println("********* info  vida ********* ");
        System.out.println("pers1 es " + pers1.getSalud()  + " salud");
        System.out.println("pers2 es " + pers2.getSalud()  + " salud");
        System.out.println("pers1 es " + pers1.getSalud()  + " salud");

        System.out.println("********* info  damage ********* ");
        System.out.println("pers1 es " + pers1.getDamage()  + " damage");
        System.out.println("pers2 es " + pers2.getDamage()  + " damage");

        System.out.println("****************************** ");

        for (int i = 1; i <= 5; i++) {

            System.out.println("********* round " + i + " *********");

            pers1.atacar(pers2);
            pers2.atacar(pers1);

            pers1.getNivel();
            pers2.getNivel();

            System.out.println("pers1 es " + pers1.getSalud() + " salud");
            System.out.println("pers2 es " + pers2.getSalud() + " salud");

            if (pers1.getSalud() == 0) {
                System.out.println("********* vida pers1 ********* ");
                System.out.println("pers1 es muerto");
            }
            if (pers2.getSalud() == 0) {
                System.out.println("********* vida pers2 ********* ");
                System.out.println("pers2 es muerto");
            }
        }




        //pers2.revivir();
        System.out.println();
        System.out.println("********* Resultado : *********");
        System.out.println(" pers1 ==> " + pers1);
        System.out.println(" pers2 ==> " + pers2);


    }
}

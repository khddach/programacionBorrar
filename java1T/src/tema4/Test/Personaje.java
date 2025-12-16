package tema4.Test;

public class Personaje {
    private static final int MAX_SALUD = 100;

    // parameters
    private String nombre;
    private String clase;
    private int salud;
    private int mana;
    private int damage;
    private int nivel;

    //Constructor ini
    public Personaje(String nombre, String clase, int mana,int damage,int nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = MAX_SALUD;
        this.mana = mana;
        this.damage = damage;
        this.nivel = nivel;
    }

    //getter nombre
    public String getNombre() {
        return nombre;
    }

    //setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter clase
    public String getClase() {
        return clase;
    }

    //setter clase
    public void setClase(String clase) {
        this.clase = clase;
    }

    //getter salud
    public int getSalud() {
        return salud;
    }

    //setter salud
    public void setSalud(int salud) {
        this.salud = salud;
    }

    //getter mana
    public int getMana() {
        return mana;
    }

    //setter mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // methodo pintar todo parameters


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append(", damage=").append(damage);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }


    // methodo resté esa vida a la del personaje
    public void quitarSalud(int vida){
//        if (vida > 100) {
//            vida = 100;
//        }
//
//        if (vida < 0) {
//            this.salud = 0;
//        } else {
//            this.salud = Math.abs(this.salud - vida);
//        }
        this.salud = Math.max(0,this.salud - vida) ;

        if (this.salud > MAX_SALUD) {
            this.salud = MAX_SALUD;
        }

    }

    // methodo ponga la vida a 100.
    public void revivir() {
        this.salud = 100;
    }


    public void atacar(Personaje pers) {
        this.quitarSalud(pers.getDamage());
    }
}

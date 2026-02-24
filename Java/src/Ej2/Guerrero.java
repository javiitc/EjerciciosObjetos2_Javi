package Ej2;

public class Guerrero extends Personaje {

    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int vida, int ataque, int defensa, String tipo, int fuerza, int armadura) {
        super(nombre, vida, ataque, defensa, tipo);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }


    public int getFuerza() {
        return fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

}

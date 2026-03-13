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

    @Override
    public void atacar(Personaje objetivo) {
        int daño = Math.max(getAtaque() + fuerza - objetivo.getDefensa() / 10, 1);
        objetivo.recibirdmg(daño);
        System.out.println(getNombre() + " [Guerrero] golpea a " + objetivo.getNombre() + " con fuerza bruta (+" + fuerza + ") causando " + daño + " de daño. Vida de " + objetivo.getNombre() + ": " + objetivo.getVida());
    }

}

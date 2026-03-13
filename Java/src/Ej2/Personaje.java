package Ej2;

public class Personaje {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private String tipo;

    public Personaje(String nombre, int vida, int ataque, int defensa, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void recibirdmg(int daño) {
        this.vida -= daño;
        if (this.vida < 0) this.vida = 0;
    }

    public void atacar(Personaje objetivo) {
        int daño = Math.max(this.ataque - objetivo.getDefensa() / 10, 1);
        objetivo.recibirdmg(daño);
        System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " causando " + daño + " de daño. Vida de " + objetivo.getNombre() + ": " + objetivo.getVida());
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

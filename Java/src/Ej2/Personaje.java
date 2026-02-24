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

    public void recibirdmg (Personaje personaje1,  Personaje personaje2) {

        int multiplicadorDefensa1 = personaje1.getDefensa() / 100;
        int multiplicadorDefensa2 = personaje2.getDefensa() / 100;
        
    }
}

package Ej3;

public class CocheDeportivo extends Coche {

    private int caballos;
    private boolean modoCarrera;

    public CocheDeportivo(String marca, String modelo, int precio, int velocidadMaxima, Rueda[] ruedas, int caballos, boolean modoCarrera) {
        super(marca, modelo, precio, velocidadMaxima, ruedas);
        this.caballos = caballos;
        this.modoCarrera = modoCarrera;
    }

    public int getCaballos() {
        return caballos;
    }

    public boolean esModoCarrera() {
        return modoCarrera;
    }

    public void activarModoCarrera() {
        this.modoCarrera = true;
        System.out.println("¡Modo carrera activado en " + getMarca() + " " + getModelo() + "!");
    }

    public void desactivarModoCarrera() {
        this.modoCarrera = false;
        System.out.println("Modo carrera desactivado en " + getMarca() + " " + getModelo() + ".");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caballos: " + caballos + " CV");
        if (modoCarrera) {
            System.out.println("Modo carrera: Activado");
        } else {
            System.out.println("Modo carrera: Desactivado");
        }
    }
}
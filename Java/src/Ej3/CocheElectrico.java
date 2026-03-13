package Ej3;

public class CocheElectrico extends Coche {

    private int autonomia;    // km por carga
    private int tiempoCarga; // minutos

    public CocheElectrico(String marca, String modelo, int precio, int velocidadMaxima, Rueda[] ruedas, int autonomia, int tiempoCarga) {
        super(marca, modelo, precio, velocidadMaxima, ruedas);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autonomía: " + autonomia + " km");
        System.out.println("Tiempo de carga: " + tiempoCarga + " min");
    }
}
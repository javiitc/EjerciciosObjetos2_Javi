package Ej3;

public class Coche {

    private String marca;
    private String modelo;
    private int precio;
    private int velocidadMaxima;
    private Rueda[] ruedas;

    public Coche(String marca, String modelo, int precio, int velocidadMaxima, Rueda[] ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Ruedas:");
        for (int i = 0; i < ruedas.length; i++) {
            System.out.print("  Rueda " + (i + 1) + " - ");
            ruedas[i].mostrarInfo();
        }
    }
}
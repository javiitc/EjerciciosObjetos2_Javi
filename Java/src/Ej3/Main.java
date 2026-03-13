package Ej3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CocheElectrico tesla = new CocheElectrico("Tesla", "Model 3", 42000, 225,
                new Rueda[]{new Rueda(10), new Rueda(15), new Rueda(12), new Rueda(8)}, 580, 30);

        CocheElectrico bmwElectrico = new CocheElectrico("BMW", "i4", 58000, 215,
                new Rueda[]{new Rueda(40), new Rueda(45), new Rueda(38), new Rueda(42)}, 590, 35);

        CocheDeportivo ferrari = new CocheDeportivo("Ferrari", "F8 Tributo", 280000, 340,
                new Rueda[]{new Rueda(60), new Rueda(65), new Rueda(55), new Rueda(70)}, 720, false);

        CocheDeportivo lamborghini = new CocheDeportivo("Lamborghini", "Huracán", 260000, 325,
                new Rueda[]{new Rueda(80), new Rueda(85), new Rueda(78), new Rueda(90)}, 640, true);

        ArrayList<Coche> concesionario = new ArrayList<>();
        concesionario.add(tesla);
        concesionario.add(bmwElectrico);
        concesionario.add(ferrari);
        concesionario.add(lamborghini);

        System.out.println("========== CATÁLOGO DEL CONCESIONARIO ==========\n");

        for (Coche coche : concesionario) {
            coche.mostrarInfo();
            System.out.println();
        }

        System.out.println("========== PROBAR MODOS DEL COCHE ==========\n");

        System.out.println("Activando modo carrera en el Ferrari...");
        ferrari.activarModoCarrera();
        System.out.println();

        System.out.println("Desactivando modo carrera en el Lamborghini...");
        lamborghini.desactivarModoCarrera();
        System.out.println();

        System.out.println("Info actualizada del Ferrari:");
        ferrari.mostrarInfo();
    }
}
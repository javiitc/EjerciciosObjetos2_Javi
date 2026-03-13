package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

        Guerrero guerrero1 = new Guerrero("Kratos", 200, 150, 170, "Guerrero", 30, 70);
        Guerrero guerrero2 = new Guerrero("Thor", 250, 170, 200, "Guerrero", 50, 20);
        Hechicero hechicero1 = new Hechicero("Gojo", 200, 170, 180, "Hechicero", 180, "Vacío Infinito");
        Hechicero hechicero2 = new Hechicero("Sukuna", 220, 150, 180, "Hechicero", 250, "Templo Maldito");

        listaPersonajes.add(guerrero1);
        listaPersonajes.add(guerrero2);
        listaPersonajes.add(hechicero1);
        listaPersonajes.add(hechicero2);

        System.out.println("¿Qué personajes quieres que se enfrenten?");

        int i = 1;
        for (Personaje personaje : listaPersonajes) {
            System.out.println(i + ". " + personaje.getNombre() + " - Tipo: " + personaje.getTipo());
            i++;
        }

        int eleccion1 = sc.nextInt();
        Personaje personaje1 = listaPersonajes.get(eleccion1 - 1);

        System.out.println("Selecciona el segundo personaje:");
        int eleccion2 = sc.nextInt();

        while (eleccion1 == eleccion2) {
            System.out.println("Elección no válida, no puedes enfrentar al mismo personaje. Elige otro:");
            eleccion2 = sc.nextInt();
        }

        Personaje personaje2 = listaPersonajes.get(eleccion2 - 1);

        System.out.println("\n--- ¡COMIENZA EL COMBATE! ---");
        System.out.println(personaje1.getNombre() + " vs " + personaje2.getNombre() + "\n");

        int turno = 1;
        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            System.out.println("--- Turno " + turno + " ---");
            personaje1.atacar(personaje2);
            if (personaje2.estaVivo()) {
                personaje2.atacar(personaje1);
            }
            turno++;
            System.out.println();
        }

        String ganador = personaje1.estaVivo() ? personaje1.getNombre() : personaje2.getNombre();
        System.out.println("¡" + ganador + " ha ganado el combate!");

    }
}

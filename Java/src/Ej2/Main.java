package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
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

        System.out.println("Que personajes quieres que se enfrenten entre ellos?");

        int i = 1;
        for (Personaje personaje : listaPersonajes) {
            System.out.println(i + ". " + personaje.getNombre() + "Tipo: " + personaje.getTipo());
            i++;
        }
        int eleccion1 = sc.nextInt();
        Personaje personaje1 = listaPersonajes.get(eleccion1 - 1);

        System.out.println("Selecciona el siguiente personaje");
        int eleccion2 = sc.nextInt();
        int reintento;

        if (eleccion1 == eleccion2) {
            while (true) {
                System.out.println("Elección no válida, no puedes enfrentar al mismo personaje");
                reintento  = sc.nextInt();
                if (reintento != eleccion2) {
                    break;
                }
            }
            Personaje personaje2 = listaPersonajes.get(reintento - 1);
        } else {
            Personaje personaje2 = listaPersonajes.get(eleccion2 - 1);
        }


    }
}

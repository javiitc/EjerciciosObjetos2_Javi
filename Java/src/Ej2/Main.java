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

        int i = 1;
        for (Personaje personaje : listaPersonajes) {
            System.out.println(i + ". " + personaje.getNombre() + "Tipo: " + personaje.getTipo());
            i++;
        }

        
    }
}

package Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Empleados> personasLista = new ArrayList<>();


        Empleados empleado1 = new Empleados("Andrea", 27, 1000, "Enfermería");
        Programador programador1 = new Programador("Javi", 22, 1350, "IT", "Java", 20);
        Gerente gerente = new Gerente("Meddy", 25, 2200, "IT", 200, 5);
        Empleados empleado2 = new Empleados("Nora", 20, 1900, "Asesoría Legal");
        Empleados empleado3 = new Empleados("Keily", 25, 1600, "Marketing");
        Programador programador2 = new Programador("Jordi", 22, 1700, "IT", "Phyton", 12);

        personasLista.add(empleado1);
        personasLista.add(programador1);
        personasLista.add(empleado2);
        personasLista.add(programador2);
        personasLista.add(gerente);

        for (Empleados empleados : personasLista){
            int i = 1;
            System.out.println(i + ". " + empleados.getNombre());
            i++;
        }

        System.out.println("De que tipo de trabajador deseas consultar información?");
        int eleccion = sc.nextInt();


    }
}

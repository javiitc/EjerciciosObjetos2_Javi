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

        int i = 1;

        for (Empleados empleados : personasLista){
            System.out.println(i + ". " + empleados.getNombre());
            i++;
        }

        System.out.println("De que trabajador deseas consultar información?");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println(empleado1.getNombre());
                System.out.println("Edad: " + empleado1.getEdad());
                System.out.println("Salario: " + empleado1.getSalarioBase());
                System.out.println("Departamento: " + empleado1.getDepartamento());
                break;
            case 2:
                System.out.println(programador1.getNombre());
                System.out.println("Edad: " + programador1.getEdad());
                System.out.println("Salario base: " + programador1.getSalarioBase() + "€");
                System.out.println("Departamento: " + programador1.getDepartamento());
                System.out.println("Lenguaje de programación principal: " + programador1.getLenguajePrincipal());
                System.out.println("Horas extras: " + programador1.getHorasExtra());
                programador1.calcularSalario(programador1.getSalarioBase(), programador1.getHorasExtra());
                break;
            case 3:
                System.out.println(empleado2.getNombre());
                System.out.println("Edad: " + empleado2.getEdad());
                System.out.println("Salario: " + empleado2.getSalarioBase());
                System.out.println("Departamento: " + empleado2.getDepartamento());
                break;
            case 4:
                System.out.println(programador2.getNombre());
                System.out.println("Edad: " + programador2.getEdad());
                System.out.println("Salario base: " + programador2.getSalarioBase() + "€");
                System.out.println("Departamento: " + programador2.getDepartamento());
                System.out.println("Lenguaje de programación principal: " + programador2.getLenguajePrincipal());
                System.out.println("Horas extras: " + programador2.getHorasExtra());
                programador2.calcularSalario(programador2.getSalarioBase(), programador2.getHorasExtra());
                break;
            case 5:
                System.out.println(gerente.getNombre());
                System.out.println("Edad: "+ gerente.getEdad());
                System.out.println("Salario base: " + gerente.getSalarioBase());
                System.out.println("Departamento: " + gerente.getDepartamento());
                System.out.println("Empleados a cargo: " + gerente.getEmpleadosCargo());
                gerente.calcularSalario(gerente.getSalarioBase(), gerente.getBonus(), gerente.getEmpleadosCargo());
        }
    }
}

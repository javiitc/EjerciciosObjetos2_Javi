package Ej1;

public class Programador extends Empleados {

    private String lenguajePrincipal;
    private int horasExtra;

    public Programador(String nombre, int edad, int salarioBase, String departamento, String lenguajePrincipal, int horasExtra) {
        super(nombre, edad, salarioBase, departamento);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtra = horasExtra;
    }
}

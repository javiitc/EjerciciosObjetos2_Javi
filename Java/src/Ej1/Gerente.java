package Ej1;

public class Gerente extends Empleados {

    private int bonus;
    private int empleadosCargo;

    public Gerente(String nombre, int edad, int salarioBase, String departamento, int bonus, int empleadosCargo) {
        super(nombre, edad, salarioBase, departamento);
        this.bonus = bonus;
        this.empleadosCargo = empleadosCargo;
    }
}

package Ej1;

public class Programador extends Empleados {

    private String lenguajePrincipal;
    private int horasExtra;

    public Programador(String nombre, int edad, int salarioBase, String departamento, String lenguajePrincipal, int horasExtra) {
        super(nombre, edad, salarioBase, departamento);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtra = horasExtra;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void calcularSalario (int salarioBase, int horasExtra) {
        int salarioHorasExtra = horasExtra * 14;
        int salarioTotal = salarioBase + salarioHorasExtra;
        System.out.println("Salario total:" + salarioTotal);
    }
}

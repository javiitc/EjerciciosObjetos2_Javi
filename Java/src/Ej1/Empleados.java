package Ej1;

public class Empleados {

    private String nombre;
    private int edad;
    private int salarioBase;
    private String departamento;

    public Empleados(String nombre, int edad, int salarioBase, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

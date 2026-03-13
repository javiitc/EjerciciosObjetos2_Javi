package Ej3;

public class Rueda {

    private int desgaste; // 0-100%
    private String estado;

    public Rueda(int desgaste) {
        this.desgaste = desgaste;
        this.estado = calcularEstado(desgaste);
    }

    private String calcularEstado(int desgaste) {
        if (desgaste <= 25) {
            return "Nueva";
        } else if (desgaste <= 50) {
            return "Buena";
        } else if (desgaste <= 75) {
            return "Desgastada";
        } else {
            return "Crítica";
        }
    }

    public int getDesgaste() {
        return desgaste;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarInfo() {
        System.out.println("Desgaste: " + desgaste + "% - Estado: " + estado);
    }
}

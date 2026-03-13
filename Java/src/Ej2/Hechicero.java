package Ej2;

public class Hechicero extends Personaje {

   private int energiaMaldita;
   private String expansionDominio;

   public Hechicero(String nombre, int vida, int ataque, int defensa, String tipo, int energiaMaldita, String expansionDominio) {
      super(nombre, vida, ataque, defensa, tipo);
      this.energiaMaldita = energiaMaldita;
      this.expansionDominio = expansionDominio;
   }

   public int getEnergiaMaldita() {
      return energiaMaldita;
   }

   public String getExpansionDominio() {
      return expansionDominio;
   }

   @Override
   public void atacar(Personaje objetivo) {
      int bonusEnergia = energiaMaldita / 10;
      int daño = Math.max(getAtaque() + bonusEnergia - objetivo.getDefensa() / 10, 1);
      objetivo.recibirdmg(daño);
      System.out.println(getNombre() + " [Hechicero] usa " + expansionDominio + " sobre " + objetivo.getNombre() + " (+" + bonusEnergia + ") causando " + daño + " de daño. Vida de " + objetivo.getNombre() + ": " + objetivo.getVida());
   }

}

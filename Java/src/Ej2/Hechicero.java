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

}
